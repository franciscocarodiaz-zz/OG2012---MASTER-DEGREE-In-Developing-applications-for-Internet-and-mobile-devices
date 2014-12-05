/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "OG_ACTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgAction.findAll", query = "SELECT o FROM OgAction o"),
    @NamedQuery(name = "OgAction.findByOgActionId", query = "SELECT o FROM OgAction o WHERE o.ogActionId = :ogActionId"),
    @NamedQuery(name = "OgAction.findByAction", query = "SELECT o FROM OgAction o WHERE o.action = :action")})
public class OgAction implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_ACTION_ID")
    private BigDecimal ogActionId;
    @Size(max = 20)
    @Column(name = "ACTION")
    private String action;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogActionId", fetch = FetchType.LAZY)
    private List<OgStatMatchPartic> ogStatMatchParticList;

    public OgAction() {
    }

    public OgAction(BigDecimal ogActionId) {
        this.ogActionId = ogActionId;
    }

    public BigDecimal getOgActionId() {
        return ogActionId;
    }

    public void setOgActionId(BigDecimal ogActionId) {
        this.ogActionId = ogActionId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @XmlTransient
    public List<OgStatMatchPartic> getOgStatMatchParticList() {
        return ogStatMatchParticList;
    }

    public void setOgStatMatchParticList(List<OgStatMatchPartic> ogStatMatchParticList) {
        this.ogStatMatchParticList = ogStatMatchParticList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogActionId != null ? ogActionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgAction)) {
            return false;
        }
        OgAction other = (OgAction) object;
        if ((this.ogActionId == null && other.ogActionId != null) || (this.ogActionId != null && !this.ogActionId.equals(other.ogActionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgAction[ ogActionId=" + ogActionId + " ]";
    }
    
}
