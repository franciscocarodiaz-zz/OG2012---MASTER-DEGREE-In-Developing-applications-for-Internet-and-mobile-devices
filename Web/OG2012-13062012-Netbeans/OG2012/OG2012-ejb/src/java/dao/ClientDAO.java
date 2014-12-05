/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.OgClient;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author Kurro
 */
@Stateless
public class ClientDAO extends GenericDAO<OgClient> implements ClientDAOLocal {

    @Override
    public OgClient buscarPorNIF(String nif) {
        Query q = em.createQuery("SELECT object(c) FROM OgClient AS c "
                + "  WHERE c.nif = :nif");
        q.setParameter("nif", nif);
        List<OgClient> resultados = q.getResultList();
        if (resultados == null) {
            // No encontrado
            return null;  
        } else if (resultados.size() != 1) {
            // No encontrado
            return null; 
        } else {
             // Devuelve el encontrado
            return resultados.get(0); 
        }
    }

    @Override
    public List<OgClient> buscarPorNombre(String nombre) {
        Query q = em.createQuery("SELECT object(c) FROM OgClient AS c "
                + "  WHERE (c.nombre LIKE :patron) OR "
                + "        (c.apellidos LIKE :patron)");
        q.setParameter("patron", "%" + nombre + "%");
        return q.getResultList();
    }

    @Override
    public int contador() {
        Query q = em.createQuery("SELECT count(c) FROM OgClient as c");
        return q.getFirstResult();
    }

    @Override
    public OgClient buscarPorLogin(String login) {
        Query q = em.createQuery("SELECT object(c) FROM OgClient AS c "
                + "  WHERE c.usuario.login = :login");
        q.setParameter("login", login);
        List<OgClient> resultados = q.getResultList();

        if (resultados == null) {
            // No encontrado
            return null;  
        } else if (resultados.size() != 1) {
            // No encontrado
            return null; 
        } else {
            // Devuelve el encontrado
            return resultados.get(0);  
        }

    }

    @Override
    public List<OgClient> buscarTodos() {
        Query q = em.createQuery("SELECT object(c) FROM OgClient as c");
        return q.getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
