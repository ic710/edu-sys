package com.buer.edusys.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;

public class MyBatisPlusGeneratorTest {

    @Test
    public void generator() {
        String[] tableName = new String[]{"student_to_course"};
        final String OUT_PUT_DIR = "/src/test/java";

        String URL = "jdbc:mysql://106.53.148.248:13306/edu_sys?useSSL=false&characterEncoding=utf8";
        String USER_NAME = "cx";
        String PASSWORD = "263niubi.";
        FastAutoGenerator.create(URL, USER_NAME, PASSWORD)
                .globalConfig(builder -> {
                    builder.author("CHEN Xi") //
                            .disableOpenDir()
//                            .enableSwagger() // 开启 swagger 模式
//                            .fileOverride() // 覆盖已生成文件
                            .outputDir(System.getProperty("user.dir") + OUT_PUT_DIR); // 指定输出目录

                })
                .packageConfig(builder -> {
                    builder.parent("com.buer.edusys") // 设置父包名
                            .mapper("mapper")
                            .entity("pojo.entity");
//                            .moduleName("system") // 设置父包模块名
//                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tableName)
//                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                            .entityBuilder()
                            .enableLombok()
                            .convertFileName(entityName -> entityName + "DO")
                            .enableTableFieldAnnotation()
                            .naming(NamingStrategy.underline_to_camel)
                            .columnNaming(NamingStrategy.underline_to_camel)
                            .mapperBuilder()
                            .enableBaseColumnList()
                            .enableBaseResultMap()
                            .serviceBuilder();
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}
