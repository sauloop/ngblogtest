package info.pablogiraldo.ngblogtest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.httpBasic().and().authorizeRequests()
//				.antMatchers("/index.html", "/", "/home", "/login", "/api/articles").permitAll().anyRequest()
//				.authenticated();
//	}

	String[] resources = new String[] { "/**", "/include/**", "/css/**", "/icons/**", "/img/**", "/js/**",
			"/layer/**", "/pdf/**" };

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers(resources).permitAll()
				.antMatchers("/index.html", "/", "/home", "/login", "/api/articles").permitAll().anyRequest()
				.authenticated();
	}
}
