package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuaio {
    public static void main(String[] args) {
        
       UsuarioDAO usuarioDao = new UsuarioDAO();
       
       // INSERTAMOS UN NUEVO USUARIO
//       Usuario nuevoUsuario = new Usuario("victor", "victor123");
//       usuarioDao.insert(nuevoUsuario);

        // MODIFICAMOS EL USUARIO
//        Usuario modificarUsuario = new Usuario(2, "jose", "jose123");
//        usuarioDao.update(modificarUsuario);

        // ELIMINAMOS EL USUARIO
        Usuario eliminarUsuario = new Usuario(3);
        usuarioDao.delete(eliminarUsuario);

        // LISTAMOS LOS USUARIOS
        List<Usuario> usuarios = usuarioDao.select();
        
        usuarios.forEach(usuario -> {
            System.out.println("usuario = " + usuario);
        });

    }
}