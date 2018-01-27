import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@RestController
@EnableAutoConfiguration
public class BootDemo {

    @RequestMapping("/")
    String home() {
        return "Home!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BootDemo.class, args);
    }

}
