package club.homemart.shared.demo.dubbo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * spring boot web, application main class
 */
@Slf4j
@EnableDubbo
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"club.homemart.*"})
public class DubboConsumerDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerDemoApplication.class, args);
    }
}
