
package Service;

import Service.IPersonaService.Persona;
import com.sun.source.doctree.ReturnTree;
import org.springframework.beans.factory.annotation.Autowired;


public class Userservices implements UserDetailsServices{
    
    @Autowired
    public IPersonaService personaService;
    
    @Override
    
    public UserDetails loadUserByUsername (String username) thows UsernameNotFoundException {
    Persona persona = this.personaService.findByNombre(username);
    Userprincipal userPrincipal = new Userprincipal(persona);
    return userprincipal; 
    
    
    }
    
}
