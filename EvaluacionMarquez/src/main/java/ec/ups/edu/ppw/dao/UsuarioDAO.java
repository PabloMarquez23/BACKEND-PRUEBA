package ec.ups.edu.ppw.dao;

import ec.ups.edu.ppw.EvaluacionMarquez.Usuario;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class UsuarioDAO {

    private static final List<Usuario> usuarios = new ArrayList<>();

    static {
        usuarios.add(new Usuario("1234567890", "Pablo ppppppp", 450.75, 120.50));
        usuarios.add(new Usuario("0987654321", "María López", 320.30, 75.00));
        usuarios.add(new Usuario("1122334455", "Carlos Gómez", 600.00, 200.90));
    }

    public Usuario obtenerUsuarioPorCedula(String cedula) {
        return usuarios.stream()
                .filter(usuario -> usuario.getCedula().equals(cedula))
                .findFirst()
                .orElse(null);
    }
}
