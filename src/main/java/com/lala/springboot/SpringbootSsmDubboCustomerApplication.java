package com.lala.springboot;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration//开启dubbo配置
public class SpringbootSsmDubboCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSsmDubboCustomerApplication.class, args);
	}

}
