package com.api.javastoreback;

import java.util.Arrays;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class DataConfiguration {

	  @Bean
	    public DataSource dataSource(){
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/dbportfolio");
	        dataSource.setUsername("root");
	        dataSource.setPassword("odavi240175");
	        return dataSource;
	    }

	    @Bean
	    public JpaVendorAdapter jpaVendorAdapter(){
	        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
	        adapter.setDatabase(Database.MYSQL);
	        adapter.setShowSql(true);
	        adapter.setGenerateDdl(true);
	        adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
	        adapter.setPrepareConnection(true);
	        return adapter;
	    }
	    
	    //.allowedOrigins("http://localhost:3000")
	    @Bean
	    CorsConfigurationSource corsConfigurationSource() {
	            CorsConfiguration configuration = new CorsConfiguration();
	            configuration.setAllowedOrigins(Arrays.asList("*"));
	            configuration.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS", "DELETE", "PUT", "PATCH"));
	            configuration.setAllowedHeaders(Arrays.asList("X-Requested-With", "Origin", "Content-Type", "Accept", "Authorization"));
	            configuration.setAllowCredentials(true);
	            UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	            source.registerCorsConfiguration("/**", configuration);
	            return source;
	        }
	    
	    
	    
}