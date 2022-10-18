package fr.lixtec.form10.j3.demo;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Cette classe assure le démarrage de l'application JAX-RS
 * des Services Demo.
 * 
 * @author ludovic.terral
 */
@ApplicationPath("/demo/api")
public class DemoApp extends Application 
{
    // ----------- Attribut(s) -----------
    private Set<Object> singletons = new HashSet<>();
    
    
    
    // ----------- Methode(s) -----------
    @Override
    public Set<Object> getSingletons() 
    {
        return singletons;
    }
}