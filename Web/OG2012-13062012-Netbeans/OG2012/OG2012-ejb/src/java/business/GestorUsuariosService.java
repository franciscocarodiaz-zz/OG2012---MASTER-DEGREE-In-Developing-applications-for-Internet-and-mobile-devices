/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.ClientDAOLocal;
import dao.UserDAOLocal;
import entities.OgClient;
import entities.OgUser;
import entities.UserType;
import java.util.Calendar;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kurro
 */
@Stateless
public class GestorUsuariosService implements GestorUsuariosServiceLocal {
    
    @EJB
    UserDAOLocal userDAO;
    @EJB
    ClientDAOLocal clientDAO;
    
    @Override
    public boolean autenticarUsuario(String login, String passwordPlano) {
        OgUser usuario;
        boolean resultado = false;

        usuario = userDAO.buscarPorLogin(login);
        if (usuario != null) {
            if (usuario.getPassword().equals(passwordPlano)) {
                resultado = true;
            }
        }

        return resultado;
    }

    @Override
    public OgClient recuperarDatosCliente(String login) {
        return clientDAO.buscarPorLogin(login);
    }

    @Override
    public OgClient crearNuevoCliente(String login, String pwd, OgClient dataClient) {
        // Crear el usuario (de tipo CLIENTE)
        OgUser nuevoUsuario = userDAO.crear(new OgUser(login, pwd, UserType.CLIENT, Calendar.getInstance().getTime()));
        // Enlazarlo al cliente
        dataClient.setUser(nuevoUsuario);
        // Crear el cliente
        return clientDAO.crear(dataClient);
    }

    @Override
    public OgClient actualizarDatosCliente(OgClient dataClient) {
        return clientDAO.actualizar(dataClient);
    }

    @Override
    public OgUser actualizarPassword(long idUser, String pwd) {
        OgUser usuario = userDAO.buscarPorId(idUser);
        usuario.setPassword(pwd);
        return userDAO.actualizar(usuario);
    
    }

    @Override
    public boolean existeUsuario(String login) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public OgUser actualizarUltimoAcceso(long idUser) {
        OgUser user = userDAO.buscarPorId(idUser);
        // Hora actual
        user.setUltimoacceso(Calendar.getInstance().getTime());  
        return userDAO.actualizar(user);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
