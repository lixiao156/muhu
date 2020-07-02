package com.lixwucs.muhu;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@MapperScan("com.lixwucs.muhu.dao")
@SpringBootApplication
public class MuhuApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuhuApplication.class, args);
    }

}
