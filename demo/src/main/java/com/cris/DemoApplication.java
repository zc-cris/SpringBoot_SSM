package com.cris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author zc-cris
 */
@SpringBootApplication
//@MapperScan(basePackages = "com.cris.dao")
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.cris.dao")
public class DemoApplication extends WebMvcConfigurerAdapter {

    /**
     * 设置路径匹配规则
     *
     * @param configurer 路径配置类
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
//      setUseSuffixPatternMatch : 设置是否是后缀模式匹配，如“/user”是否匹配/user.*，默认真即匹配；
        configurer.setUseSuffixPatternMatch(false);

//      setUseTrailingSlashMatch : 设置是否自动后缀路径模式匹配，如“/user”是否匹配“/user/”，默认真即匹配；
        configurer.setUseTrailingSlashMatch(false);
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
