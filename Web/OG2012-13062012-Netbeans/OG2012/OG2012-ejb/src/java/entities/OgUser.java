/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kurro
 */
@Entity
@Table(name = "OG_USER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgUser.findAll", query = "SELECT o FROM OgUser o"),
    @NamedQuery(name = "OgUser.findById", query = "SELECT o FROM OgUser o WHERE o.id = :id"),
    @NamedQuery(name = "OgUser.findByLogin", query = "SELECT o FROM OgUser o WHERE o.login = :login"),
    @NamedQuery(name = "OgUser.findByFechaalta", query = "SELECT o FROM OgUser o WHERE o.fechaalta = :fechaalta"),
    @NamedQuery(name = "OgUser.findByUltimoacceso", query = "SELECT o FROM OgUser o WHERE o.ultimoacceso = :ultimoacceso"),
    @NamedQuery(name = "OgUser.findByTipo", query = "SELECT o FROM OgUser o WHERE o.tipo = :tipo"),
    @NamedQuery(name = "OgUser.findByPassword", query = "SELECT o FROM OgUser o WHERE o.password = :password")})
public class OgUser implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 20)
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "FECHAALTA")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date   fechaalta;
    @Column(name = "ULTIMOACCESO")
    @Temporal(TemporalType.DATE)
    private Date ultimoacceso;
    @Enumerated(EnumType.STRING)
    private UserType tipo;
    @Size(max = 255)
    @Column(name = "PASSWORD")
    private String password;

    public OgUser() {
    }

    public OgUser(BigDecimal id) {
        this.id = id;
    }
    
    public OgUser(String login, String password, UserType tipo, Date fechaAlta) {
        this.login = login;
        this.password = password;
        this.tipo = tipo;
        this.fechaalta = fechaAlta;
        this.ultimoacceso = fechaAlta;

    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    public Date getUltimoacceso() {
        return ultimoacceso;
    }

    public void setUltimoacceso(Date ultimoacceso) {
        this.ultimoacceso = ultimoacceso;
    }

    
    public UserType getTipo() {
        return tipo;
    }

    public void setTipo(UserType tipo) {
        this.tipo = tipo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        if (!(object instanceof OgUser)) {
            return false;
        }
        OgUser other = (OgUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "entities.OgUser[id="+this.id+",login:"+this.login+",tipo:"+this.tipo+"]";
    }
    
}
