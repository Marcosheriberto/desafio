package br.com.brasilprev.desafio.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    // Create 2 users for demo
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("root").password("{noop}password").roles("USER")
                .and()
                .withUser("root2").password("{noop}password").roles("USER", "ADMIN");

    }

    // Secure the endpoins with HTTP Basic authentication
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                //HTTP Basic authentication
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/categorias/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/categorias").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/clientes/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/clientes/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/pedidos/**").hasRole("ADMIN")
                .and()
                .csrf().disable()
                .formLogin().disable();
    }



}

