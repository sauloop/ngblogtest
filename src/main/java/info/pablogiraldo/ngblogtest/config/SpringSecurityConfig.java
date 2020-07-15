package info.pablogiraldo.ngblogtest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	String[] resources = new String[] { "/", "/assets/**", "/resources/**", "/static/**", "/include/**", "/css/**",
			"/icons/**", "/img/**", "/js/**", "/layer/**", "/pdf/**" };

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers(resources).permitAll()
				.antMatchers("/*.js", "/*.css", "/index.html", "/api/**", "/login", "/logout", "/trueknic").permitAll()
				.anyRequest().authenticated();
	}

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable().authorizeRequests()
//				.antMatchers(HttpMethod.OPTIONS, "/", "/*.js", "/*.css", "/index.html", "/api/**", "/assets/**",
//						"/login", "/logout", "/trueknic")
//				.permitAll().anyRequest().authenticated().and()
//				// .formLogin().and()
//				.httpBasic();
//	}
}
