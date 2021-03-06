package pmserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class PermissionServerApplication extends SpringBootServletInitializer { //외부 톰캣으로 돌릴려면 SpringBootServletInitializer을 상속받는다.
	
	private static final Logger logger = LoggerFactory.getLogger(PermissionServerApplication.class);

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) { //SpringBootServletInitializer의 SpringApplicationBuilder를 오버라이드 한다.

      return builder.sources(PermissionServerApplication.class);

    }
	
	public static void main(String[] args) {
		SpringApplication.run(PermissionServerApplication.class, args);
		
		logger.info("PermissionServerApplication has been started..");
	}
 
}
