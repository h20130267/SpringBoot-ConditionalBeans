package com.edufool.RegBeansByProfile;

import com.edufool.RegBeansByProfile.Repository.MyDataSource;
import com.edufool.RegBeansByProfile.Repository.OracleDataSource;
import com.edufool.RegBeansByProfile.Repository.SqlDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class RegBeansByProfileApplication {
	@Bean
	@Profile("dev")
	public MyDataSource getSqlDataSrc(){
		return new SqlDataSource();
	}

	@Bean
	@Profile("!dev")
	public MyDataSource getOracleDataSrc(){
		return new OracleDataSource();
	}

	public static void main(String[] args) {
		SpringApplication.run(RegBeansByProfileApplication.class, args);
	}
	
}
