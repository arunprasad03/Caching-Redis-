package com.example.redis;

import com.example.redis.repository.CacheDemoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
/*@EnableJpaRepositories(excludeFilters =
@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = CacheDemoRepository.class))*/
//@EnableRedisRepositories(basePackageClasses = CacheDemoRepository.class)
public class RedisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisDemoApplication.class, args);
	}

}
