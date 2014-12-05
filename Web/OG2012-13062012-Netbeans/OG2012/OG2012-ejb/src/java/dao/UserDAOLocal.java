/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.ejb.Local;
import entities.OgUser;
import entities.UserType;
import java.util.List;

/**
 *
 * @author Kurro
 */

@Local
public interface UserDAOLocal extends GenericDAOInterface<OgUser> {

    OgUser buscarPorLogin(String login);

    List<OgUser> buscarPorTipo(UserType tipo);

    List<OgUser> buscarTodos();

    int contador();
    
}
