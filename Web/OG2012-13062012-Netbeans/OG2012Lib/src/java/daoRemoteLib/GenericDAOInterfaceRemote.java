/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package daoRemoteLib;

/**
 *
 * @author Kurro
 */
public interface GenericDAOInterfaceRemote<OGObject> {
    OGObject crear(OGObject entidad);
    OGObject actualizar(OGObject entidad);
    void eliminar(OGObject entidad);
    OGObject buscarPorId(Object id);
}
