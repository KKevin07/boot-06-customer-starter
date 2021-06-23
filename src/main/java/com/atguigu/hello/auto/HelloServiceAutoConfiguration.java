package com.atguigu.hello.auto;

import com.atguigu.hello.bean.HelloProperties;
import com.atguigu.hello.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(HelloService.class)
@EnableConfigurationProperties(HelloProperties.class)  //mo ren fang ru rong qi zhong
public class HelloServiceAutoConfiguration {

    @Bean
    public HelloService helloService(){

        HelloService helloService = new HelloService();
        return helloService;

    }
}
