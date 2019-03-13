package com.mellivora.pundit;

import com.mellivora.pundit.core.Version;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.mellivora.pundit.mapper")
@ComponentScan(basePackages = {"com.mellivora.pundit.*"})
public class MellivoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(MellivoraApplication.class, args);
		System.out.println ( "------------------------------------------------------------------------" );
		System.out.println ( "========================================================================" );
		System.out.println ( "---------------------mellivora platform " + Version.getVersionString () + " started-------------------" );
		System.out.println ( "========================================================================" );
		System.out.println ( "------------------------------------------------------------------------" );
	}

}
