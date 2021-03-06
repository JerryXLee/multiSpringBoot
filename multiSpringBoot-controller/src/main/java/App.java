import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.lick"})
@MapperScan(basePackages = "com.lick")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class App 
{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
