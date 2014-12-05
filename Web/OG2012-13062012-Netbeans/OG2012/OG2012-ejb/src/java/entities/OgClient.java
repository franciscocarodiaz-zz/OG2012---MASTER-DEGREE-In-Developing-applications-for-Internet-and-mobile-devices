/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kurro
 */
@Entity
@Table(name = "OG_CLIENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgClient.findAll", query = "SELECT o FROM OgClient o"),
    @NamedQuery(name = "OgClient.findById", query = "SELECT o FROM OgClient o WHERE o.id = :id"),
    @NamedQuery(name = "OgClient.findByCodpostal", query = "SELECT o FROM OgClient o WHERE o.codpostal = :codpostal"),
    @NamedQuery(name = "OgClient.findByNombre", query = "SELECT o FROM OgClient o WHERE o.nombre = :nombre"),
    @NamedQuery(name = "OgClient.findByLocalidad", query = "SELECT o FROM OgClient o WHERE o.localidad = :localidad"),
    @NamedQuery(name = "OgClient.findByNif", query = "SELECT o FROM OgClient o WHERE o.nif = :nif"),
    @NamedQuery(name = "OgClient.findByEmail", query = "SELECT o FROM OgClient o WHERE o.email = :email"),
    @NamedQuery(name = "OgClient.findByDomicilio", query = "SELECT o FROM OgClient o WHERE o.domicilio = :domicilio"),
    @NamedQuery(name = "OgClient.findByApellidos", query = "SELECT o FROM OgClient o WHERE o.apellidos = :apellidos"),
    @NamedQuery(name = "OgClient.findByTelefono", query = "SELECT o FROM OgClient o WHERE o.telefono = :telefono"),
    @NamedQuery(name = "OgClient.findByProvincia", query = "SELECT o FROM OgClient o WHERE o.provincia = :provincia")})
public class OgClient implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 255)
    @Column(name = "CODPOSTAL")
    private String codpostal;
    @Size(max = 255)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 255)
    @Column(name = "LOCALIDAD")
    private String localidad;
    @Size(max = 255)
    @Column(name = "NIF")
    private String nif;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 255)
    @Column(name = "DOMICILIO")
    private String domicilio;
    @Size(max = 255)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Size(max = 255)
    @Column(name = "TELEFONO")
    private String telefono;
    @Size(max = 255)
    @Column(name = "PROVINCIA")
    private String provincia;
    @OneToOne
    private OgUser user;

    public OgClient() {
    }

    public OgClient(BigDecimal id) {
        this.id = id;
    }
    
    public OgClient(String nombre, String apellidos, String nif, String domicilio, String localidad, String codPostal, String provincia, String email, String telefono, OgUser usuario) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.nif = nif;
            this.domicilio = domicilio;
            this.localidad = localidad;
            this.codpostal = codPostal;
            this.provincia = provincia;
            this.email = email;
            this.telefono = telefono;
            this.user = usuario;
    }
    
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public OgUser getUser() {
        return user;
    }

    public void setUser(OgUser user) {
        this.user = user;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgClient)) {
            return false;
        }
        OgClient other = (OgClient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "entities.OgClient[id="+this.id+",nombre:"+this.nombre+",apellidos:"+this.apellidos+",nif:"+this.nif+"]";
    }
    
}
