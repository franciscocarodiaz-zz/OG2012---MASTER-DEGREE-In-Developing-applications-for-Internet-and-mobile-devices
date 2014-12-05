/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * EJB generico que implementa las opciones de altas, bajas, modificaciones y acceso por clave
 * para cualquier tipo de Entidad
 * @author Kurro
 * @param <OgObject>
 */

public class GenericDAO<OGObject> implements GenericDAOInterface<OGObject> {
    @PersistenceContext(unitName = "OG2012-ejbPU")
    protected EntityManager em;
    //  Nuevo em de tipo protected, si fuera private no podriamos acceder a el desde las clases que lo extienden
    public void persist(Object object) {
        em.persist(object);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    /**
    * Crea una nueva tupla en la BD con los datos de "ogentity"
    * ademas genera su ID
    */
    @Override
    public OGObject crear(OGObject ogentity) {
        em.persist(ogentity);
        return ogentity;
    }

    /**
    * Actualiza los datos de "ogentity" en su correspondiente tupla BD
    */
    @Override
    public OGObject actualizar(OGObject ogentity) {
        return em.merge(ogentity);
    }
    
    /**
    * Actualiza y elimina
    */
    @Override
    public void eliminar(OGObject ogentity) {
        em.remove(em.merge(ogentity));
    }

    @Override
    public OGObject buscarPorId(Object id) {
        // Identifica la clase real de las entidades gestionada por este objeto (OGObject.class)
        Class<OGObject> entityClass = (Class<OGObject>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return em.find(entityClass, id);
    }
    
}
