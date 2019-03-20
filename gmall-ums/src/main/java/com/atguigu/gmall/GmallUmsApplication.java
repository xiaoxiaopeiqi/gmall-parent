package com.atguigu.gmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.atguigu.gmall.ums.mapper")
@SpringBootApplication
public class GmallUmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallUmsApplication.class, args);
	}

}
