package com.edufool.RegBeansOnConditionBySystemProperty;

import com.edufool.RegBeansOnConditionBySystemProperty.Condition.MongoDatabaseTypeCondition;
import com.edufool.RegBeansOnConditionBySystemProperty.Condition.MySQLDatabaseTypeCondition;
import com.edufool.RegBeansOnConditionBySystemProperty.model.IUserDAO;
import com.edufool.RegBeansOnConditionBySystemProperty.model.JdbcUserDAO;
import com.edufool.RegBeansOnConditionBySystemProperty.model.MongoUserDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@SpringBootApplication
public class RegBeansOnConditionBySystemPropertyApplication {

	@Bean
	@Conditional(MySQLDatabaseTypeCondition.class)
	public IUserDAO jdbcUserDao(){
		return new JdbcUserDAO();
	}

	@Bean
	@Conditional(MongoDatabaseTypeCondition.class)
	public IUserDAO mongoUserdao(){
		return new MongoUserDAO();
	}

	public static void main(String[] args) {
		SpringApplication.run(RegBeansOnConditionBySystemPropertyApplication.class, args);
	}

}
