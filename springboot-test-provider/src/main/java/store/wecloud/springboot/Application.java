package store.wecloud.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("store.wecloud.springboot")
public class Application {
    public static void main(String args[]){
        new SpringApplication()
                .run(Application.class, args);
    }
}
