
package controller;

import Service.IPaisService;
import Service.IPaisService.Pais;
import Service.IPersonaService;
import Service.IPersonaService.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
    
     @GetMapping("/persona")
    public String CrearPersona(Model model) {
    List<Pais> listaPaises = paisService.listCountry();
    model.addAttribute("persona", new Persona());
    model.addAttribute("paises", listaPaises);
    return "crear";
    }
    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Persona persona) {
    personaService.savePersona(persona);
    return "/redirect:/persona";
    
    }
    
    @GetMapping("/editpersona/{id}")
    public String editarPersona(@PathVariable("id")long idpersona, Model model) {
    Persona persona = personaService.getPersonaById(idpersona);
    List<Pais> listaPaises = paisService.listCountry();
    model.addAttribute("persona", persona);
    model.addAttribute("paises", listaPaises);
    return "crear";
    }
    
    @GetMapping("/detele/{id}")
    public String eliminarPersona(@PathVariable("id") Long idPersona) {
    personaService.detele(idPersona);
    return "/redirect:/persona";
    
    
    }
    
}
