/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.OgUser;
import entities.UserType;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author Kurro
 */
@Stateless
public class UserDAO extends GenericDAO<OgUser> implements UserDAOLocal {

    @Override
    public OgUser buscarPorLogin(String login) {
        Query q = em.createQuery("SELECT object(u) FROM OgUser AS u " +
                                 "  WHERE u.login = :login");
        q.setParameter("login", login);

        List<OgUser> resultados = q.getResultList();
        // No encontrado
        if (resultados ==null) {
            return null;  
        }
        else if (resultados.size() != 1){
            // No encontrado
            return null; 
        }
        else {
            // Devuelve el encontrado
            return resultados.get(0);  
        }
    }

    @Override
    public List<OgUser> buscarPorTipo(UserType tipo) {
        Query q = em.createQuery("SELECT object(u) FROM OgUser as u "+
                                 "  WHERE u.tipo = :tipo");
        q.setParameter("tipo", tipo);
        return q.getResultList();      
    }

    @Override
    public List<OgUser> buscarTodos() {
        Query q = em.createQuery("SELECT object(u) FROM OgUser as u");
        return q.getResultList();
    }

    @Override
    public int contador() {
        Query q = em.createQuery("SELECT count(u) FROM OgUser as u");
        return q.getFirstResult();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
