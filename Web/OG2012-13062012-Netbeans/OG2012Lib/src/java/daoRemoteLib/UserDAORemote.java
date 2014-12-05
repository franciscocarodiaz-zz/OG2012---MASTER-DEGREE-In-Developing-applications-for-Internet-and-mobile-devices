/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package daoRemoteLib;

import javax.ejb.Remote;
import java.util.List;

/**
 *
 * @author Kurro
 */

@Remote
public interface UserDAORemote extends GenericDAOInterfaceRemote<OgUser> {

    OgUser buscarPorLogin(String login);

    List<OgUser> buscarPorTipo(UserType tipo);

    List<OgUser> buscarTodos();

    int contador();
    
}
