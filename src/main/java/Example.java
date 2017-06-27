
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/7.
 */

@RestController
@EnableAutoConfiguration
public class Example {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/{p}")
    String home(@PathVariable("p") String p) {
        logger.info("我自行添加一条info日志记录");
        return "Hello World! i am "+p;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }
}
