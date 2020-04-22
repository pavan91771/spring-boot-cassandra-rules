package in.olaelectric.dp.spring.rules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "in.olaelectric.dp.spring.alerts")
@SpringBootApplication
public class SpringBootCassandraApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCassandraApplication.class, args);
    }
}
