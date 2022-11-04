
package Service;

import java.util.List;


public interface IPersonaService {
    
    public List<Persona> getAllpersona();
    public Persona getPersonaById (long id);
    public void savePersona (Persona persona);
    public void detele (long id);

    public List<Persona> getAllPersona();

    public static class Persona {

        public Persona() {
        }
    }
    
    
}
