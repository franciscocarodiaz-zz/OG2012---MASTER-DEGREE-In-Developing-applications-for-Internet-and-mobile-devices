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
@Table(name = "OG_ROLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgRole.findAll", query = "SELECT o FROM OgRole o"),
    @NamedQuery(name = "OgRole.findByOgRoleId", query = "SELECT o FROM OgRole o WHERE o.ogRoleId = :ogRoleId"),
    @NamedQuery(name = "OgRole.findByRole", query = "SELECT o FROM OgRole o WHERE o.role = :role")})
public class OgRole implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_ROLE_ID")
    private BigDecimal ogRoleId;
    @Size(max = 20)
    @Column(name = "ROLE")
    private String role;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogRoleId", fetch = FetchType.LAZY)
    private List<OgParticipant> ogParticipantList;

    public OgRole() {
    }

    public OgRole(BigDecimal ogRoleId) {
        this.ogRoleId = ogRoleId;
    }

    public BigDecimal getOgRoleId() {
        return ogRoleId;
    }

    public void setOgRoleId(BigDecimal ogRoleId) {
        this.ogRoleId = ogRoleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @XmlTransient
    public List<OgParticipant> getOgParticipantList() {
        return ogParticipantList;
    }

    public void setOgParticipantList(List<OgParticipant> ogParticipantList) {
        this.ogParticipantList = ogParticipantList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogRoleId != null ? ogRoleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgRole)) {
            return false;
        }
        OgRole other = (OgRole) object;
        if ((this.ogRoleId == null && other.ogRoleId != null) || (this.ogRoleId != null && !this.ogRoleId.equals(other.ogRoleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgRole[ ogRoleId=" + ogRoleId + " ]";
    }
    
}
