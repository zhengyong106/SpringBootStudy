package store.wecloud.springboot.service.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import store.wecloud.springboot.service.Service;


@Controller
@SpringBootApplication
public class Application {
    @Autowired
    Service service;

    @RequestMapping("/")
    public @ResponseBody String index(){
        return service.sayHello();
    }

    public static void main(String args[]){
        SpringApplication.run(Application.class, args);
    }
}
