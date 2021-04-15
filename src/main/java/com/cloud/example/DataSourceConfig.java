package com.cloud.example;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

//    @Bean
//    public DataSource getDataSource() {
//        String dbName = System.getenv("APP_DATABASE");
//        String dbUsername = System.getenv("APP_DATABASE_USER");
//        String dbPassword = System.getenv("APP_DATABASE_PASSWORD");
//        System.out.println("Using DATABASE: " + dbName);
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.url("jdbc:mysql://hdmdemo.cluster-cwaf6q1jfqoy.eu-west-1.rds.amazonaws.com:3306/" + dbName);
//        dataSourceBuilder.username(dbUsername);
//        dataSourceBuilder.password(dbPassword);
//        return dataSourceBuilder.build();
//    }

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:mem:test");
        dataSourceBuilder.username("SA");
        dataSourceBuilder.password("");
        return dataSourceBuilder.build();
    }
}
