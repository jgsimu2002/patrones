
package Service;

import Service.IPersonaService.Persona;
import java.util.ArrayList;
import java.util.List;


public class Userprincipal implements UserDetails{
    
    private Persona persona;
    
    public Userprincipal(Persona persona) {
    this.persona = persona;
    }
    
    @Override
    public Collection<? exteds GrantedAuthority> getAuthorities() {
    List<GrantedAuthority> authorities = new ArrayList<>();
    }
    this.Persona.getPermissionList().forEach(p -> {
    GrantedAuthority authority  = new SimpleGrantedAuthority(p);
    authorities.add(authority);
    } 
    
    this.Persona.getRoleList().forEach (r -> {
    GrantedAuthority authority  = new SimpleGrantedAuthority("Role_" + r);
    authorities.add(authority);
    {);
    return authorities;
    }
    
    
    }
    
    @Override

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public <any> getGrantedAuthority() {
        return GrantedAuthority;
    }

    public void setGrantedAuthority(<any> GrantedAuthority) {
        this.GrantedAuthority = GrantedAuthority;
    }
    
    
}
