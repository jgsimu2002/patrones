
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class AppAuthenticationSuccessHandler extends SimpleUrAuthenticationSuccessHandler{
    protected void handle(HttpServletRequest request, httpServletResponse response,
            Authentication authentication) throws IOException, ServletException {
    
    }
    
}
