package com.gbtech.iaaas.common.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 用于生成JWT Token的工具类
 */
public class JwtTokenUtil {

    private static final Logger logger = LoggerFactory.getLogger(JwtTokenUtil.class);
    private static final String CLAIM_KEY_USERNAME = "sub";
    private static final String CLAIM_KEY_CREATED = "created";

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;

    /**
     * 根据负载生成JWT的token
     *
     * @param claims 声明
     * @return Token字符串
     */
    private String generateToken(Map<String, Object> claims) {
        return Jwts.builder().setClaims(claims).setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.HS512, secret).compact();
    }

    /**
     * 根据用户信息生成JWT的Token
     *
     * @param userDetails 从数据库中查询到的用户信息
     * @return 生成的Token字符串
     */
    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME, userDetails.getUsername());
        claims.put(CLAIM_KEY_CREATED, new Date());
        return generateToken(claims);
    }

    /**
     * 生成Token的过期时间
     *
     * @return 过期时间
     */
    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + expiration * 1000);
    }

    /**
     * 从Token中获取JWT中负载的信息
     *
     * @param token Token字符串
     * @return Claim格式的信息体
     */
    private Claims getClaimsFromToken(String token) {
        Claims claims = null;
        try {
            claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        } catch (Exception e) {
            logger.info("JWT格式校验失败: {}", token);
        }
        return claims;
    }

    /**
     * 从Token中获取登陆用户名
     *
     * @param token Token字符串
     * @return 登陆用户名字符串
     */
    public String getUserNameFromToken(String token) {
        String username;
        try {
            Claims claims = getClaimsFromToken(token);
            username = claims.getSubject();
        } catch (Exception e) {
            username = null;
        }
        return username;
    }

    /**
     * 从Token字符串中获取Token的过期时间
     *
     * @param token Token字符串
     * @return 过期时间
     */
    public Date getExpiredDateFromToken(String token) {
        Claims claims = getClaimsFromToken(token);
        return claims.getExpiration();
    }

    /**
     * 判断Token是否已经过期
     *
     * @param token Token字符串
     * @return 判断结果
     */
    public boolean isTokenExpired(String token) {
        Date expiredDate = getExpiredDateFromToken(token);
        return expiredDate.before(new Date());
    }

    /**
     * 验证Token是否还有效
     *
     * @param token       Token字符串
     * @param userDetails 从数据库中查询到的用户信息
     * @return 判断结果
     */
    public boolean validateToken(String token, UserDetails userDetails) {
        String username = getUserNameFromToken(token);
        return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
    }

    /**
     * 判断Token是否可以被刷新
     *
     * @param token Token字符串
     * @return 判断结果
     */
    public boolean canTokenRefresh(String token) {
        return !isTokenExpired(token);
    }

    /**
     * 刷新token
     *
     * @param token Token字符串
     * @return 更新后的Token字符串
     */
    public String refreshToken(String token) {
        Claims claims = getClaimsFromToken(token);
        claims.put(CLAIM_KEY_CREATED, new Date());
        return generateToken(claims);
    }


}
