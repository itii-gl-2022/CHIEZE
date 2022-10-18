package fr.lixtec.form10.j3.demo.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("v1")
public class MeteoService
{
    @Path("/meteo/{localisation}")
    @GET
    @Produces("text/plain")
    public String getMeteo(@PathParam("localisation") String localisation)
    {
        return "IL FAIT BEAU A "+localisation.toUpperCase()+"!";
    }
}