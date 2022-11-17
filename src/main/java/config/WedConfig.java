
package config;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class WedConfig implements WedMvcConfigurer{
    
    @Bean
    public SessionLocaleResolver localeresolver() {
    var slr = new SessionLocaleResolver();
    slr.setDefaultLocale(new Locale("es"));
    return slr;
    
    }
    
    @Bean
    public LocaleChangeInterceptor LocaleChangeInterceptor() {
    var lci = new LocaleChangeInterceptor();
    lci.setParamName("lang");
    return lci;
    }
    
    public void addInterceptors(InterceptorRegistry registro) {
    registro.addInterceptor(localeChangeInterceptor());
    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private HandlerInterceptor localeChangeInterceptor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
