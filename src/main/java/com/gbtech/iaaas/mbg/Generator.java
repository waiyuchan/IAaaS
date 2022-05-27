package com.gbtech.iaaas.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>(); // MBG 执行过程中的警告信息
        boolean overwrite = true; // 当生成的代码重复时，覆盖原代码
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml"); // 读取 MyBatisGenerator 配置文件
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(is);
        is.close();
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings); //创建 MBG
        myBatisGenerator.generate(null); //执行生成代码
        for (String warning : warnings)
            System.out.println(warning); //输出警告信息
    }
}
