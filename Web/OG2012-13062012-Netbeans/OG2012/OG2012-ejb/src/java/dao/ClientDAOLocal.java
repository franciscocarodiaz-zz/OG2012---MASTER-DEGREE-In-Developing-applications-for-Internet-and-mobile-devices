/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.OgClient;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kurro
 */
@Local
public interface ClientDAOLocal extends GenericDAOInterface<OgClient>{

    OgClient buscarPorNIF(String nif);

    List<OgClient> buscarPorNombre(String nombre);

    int contador();

    OgClient buscarPorLogin(String login);

    List<OgClient> buscarTodos();
    
}
