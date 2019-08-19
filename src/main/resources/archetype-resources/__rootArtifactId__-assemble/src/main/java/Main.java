#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * www.xzq.com Inc.
 * Copyright (c) 2018 All Rights Reserved
 */
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;


/**
 * @author maxupeng@9ffenqigo.com
 */
@Configuration  
@EnableApolloConfig
@ComponentScan(basePackages = "${package}")
@SpringBootApplication
public class Main extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(this.getClass());
        return super.configure(builder);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}