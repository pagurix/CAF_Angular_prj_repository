package it.appdevolution.caf.ms.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration
public class CAFWebMvcConfig extends WebMvcConfigurationSupport {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");

        if (!registry.hasMappingForPattern("/**")) {
			registry.addResourceHandler("/**").addResourceLocations("/");
		}
        
    }
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        CorsRegistration corsRegistration = registry.addMapping("/**");
        corsRegistration.allowedHeaders("cache-control","pragma","Content-Type", "Accept", "X-Requested-With", "remember-me");
        corsRegistration.allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS");
        corsRegistration.allowCredentials(true);
        corsRegistration.allowedOrigins("*");
        corsRegistration.exposedHeaders("X-Requested-With", "remember-me");
        corsRegistration.maxAge(3600L);
    }
}