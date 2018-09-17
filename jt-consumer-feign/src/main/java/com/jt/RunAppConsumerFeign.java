package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication //Feign使用cloud不呢过使用boot
@EnableFeignClients //Feign的客户端程序
public class RunAppConsumerFeign {

	public static void main(String[] args) {
		SpringApplication.run(RunAppConsumerFeign.class, args);

	}

}
