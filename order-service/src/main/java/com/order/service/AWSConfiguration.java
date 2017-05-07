package com.order.service;

import org.springframework.cloud.aws.jdbc.config.annotation.EnableRdsInstance;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"local","cloud"})
@ImportResource("classpath:/aws-configuration.xml")
@EnableRdsInstance(databaseName = "${spring.database-name}", 
                   dbInstanceIdentifier = "${spring.db-instance-identifier}", 
                   password = "${spring.rdsPassword}")
public class AWSConfiguration {

}
