package io.swagger;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("**/v2/api-docs", "/v2/api-docs");
        registry.addRedirectViewController("**/swagger-resources/configuration/ui", "/configuration/ui");
        registry.addRedirectViewController("**/swagger-resources/configuration/security", "/configuration/security");
        registry.addRedirectViewController("**/swagger-resources", "/swagger-resources");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        if (!registry.hasMappingForPattern("/assets/**")) {
            registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
        }

        registry.addResourceHandler("/swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
