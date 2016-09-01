package io.spring.cloud.samples.fortuneteller.turbine;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.cloud.netflix.turbine.stream.TurbineApplication;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
@EnableTurbineStream
@EnableDiscoveryClient
public class Application {

	public static void main(String[] args) {
		boolean cloudEnvironment = new StandardEnvironment().acceptsProfiles("cloud");
		new SpringApplicationBuilder(TurbineApplication.class).web(!cloudEnvironment).run(args);
	}
}
