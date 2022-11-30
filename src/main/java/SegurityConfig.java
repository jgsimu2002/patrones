
import Service.Userservices;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.support.DaoSupport;


public class SegurityConfig implements WedSegurityConfigurerAdapter{
    @Autowited
    private Userservices userDetailsService;
    
    @Bean
    public BCryptPasswordEncorder passwordEncorder() {
    return new  BCryptPasswordEncorder();
    }
    
    @Bean
    public Userservices getUserServices () {
    return new Userservices();
    }
    
    @Bean
    DaoAuthenticationProvider authenticationProvider () {
    DaoAuthenticationProvider.daoAuthenticationProvider = new DaoAuthenticationProvider();
    daoAuthenticationProvider.setPasswordEncorder(passwordEncorder());
    daoAuthenticationProvider.setUserDetailsService(getUserservices());
    return daoAuthenticationProvider;
    }
    
    @Bean
    public AuthenticationSuccessHandler appAuthenticationSuccessHandler () {
    return new AppAuthenticationSuccessHandler;
    }
    
    public SecurityConfig(Userservices userPrincipalDetailsService) {
    this.userDetailsService = userPrincipalDetailsService;
    }
    
    @Override
    protected void configure(AuthenticationManagerBuilder auch) {
    auch.authenticationProvider(authenticationProvider());
    
    }
    
    @Override
    
    protected void configure(HttpSegurity http) throws Exception {
    
    }
}
