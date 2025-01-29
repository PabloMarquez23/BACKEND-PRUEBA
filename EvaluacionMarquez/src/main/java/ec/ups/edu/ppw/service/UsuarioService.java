package ec.ups.edu.ppw.service;

import ec.ups.edu.ppw.EvaluacionMarquez.Usuario;
import ec.ups.edu.ppw.dao.UsuarioDAO;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/energia")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioService {

    @Inject
    private UsuarioDAO usuarioDAO;

    @GET
    @Path("/consulta/{cedula}")
    public Response consultarDatos(@PathParam("cedula") String cedula) {
        Usuario usuario = usuarioDAO.obtenerUsuarioPorCedula(cedula);

        if (usuario != null) {
            return Response.ok(usuario).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                           .entity("{\"mensaje\": \"Usuario no encontrado\"}")
                           .build();
        }
    }
}
