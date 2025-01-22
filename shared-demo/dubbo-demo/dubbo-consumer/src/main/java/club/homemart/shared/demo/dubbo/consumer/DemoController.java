package club.homemart.shared.demo.dubbo.consumer;

import club.homemart.shared.demo.dubbo.api.DemoService;
import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
@RefreshScope
public class DemoController {
    // scope="remote" is used to force mock remote service call
    @DubboReference
    private DemoService demoService;

    @RequestMapping("/say-hello")
    public String sayHello() {
        return demoService.sayHello("world");
    }
}
