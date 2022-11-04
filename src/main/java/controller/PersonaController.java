
package controller;

import Service.IPaisService;
import Service.IPersonaService;
import Service.IPersonaService.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {
    
    @Autowired
    private IPersonaService personaService;
    
    @Autowired
    private IPaisService paisService;
    
    @GetMapping("/persona")
    public String index(Model model) {
    List<Persona> listaPersona = personaService.getAllPersona();
    model.addAttribute("titulo", "Tabla Persona");
    model.addAttribute("personas", listaPersona);
    return "personas";
    }
    
    
}
