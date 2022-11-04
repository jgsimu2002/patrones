
package Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepository personaRepository;
    

    public List<Persona> getAllPersona(long id) {
        return(List<Persona>)personaRepository.findAll();
    }
    
    @Override
    public Persona getPersonaById(long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void savePersona(Persona persona) {
         personaRepository.save(persona);
    }

    @Override
    public void detele(long id) {
        personaRepository.deteleById(id);
    }

    
    
    
    
    
    
    
    
    
    private static class PersonaRepository {

        public PersonaRepository() {
        }

        private void save(Persona persona) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void deteleById(long id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private Object findById(long id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
