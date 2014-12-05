/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import entities.OgClient;
import entities.OgUser;
import javax.ejb.Local;

/**
 *
 * @author Kurro
 */
@Local
public interface GestorUsuariosServiceLocal {

    boolean autenticarUsuario(String login, String pwd);

    OgClient recuperarDatosCliente(String login);

    OgClient crearNuevoCliente(String login, String password, OgClient dataClient);

    OgClient actualizarDatosCliente(OgClient dataClient);

    OgUser actualizarPassword(long idUser, String pwd);

    boolean existeUsuario(String login);

    OgUser actualizarUltimoAcceso(long idUser);
    
}
