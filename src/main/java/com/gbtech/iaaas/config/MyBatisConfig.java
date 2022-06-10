package com.gbtech.iaaas.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类 Created by will on 2022/05/25.
 */
@Configuration
@MapperScan({"com.gbtech.iaaas.mbg.mapper", "com.gbtech.iaaas.dao"})
public class MyBatisConfig {

}