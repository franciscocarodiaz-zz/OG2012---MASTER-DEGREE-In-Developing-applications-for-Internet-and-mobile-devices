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
@Table(name = "OG_PHASE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgPhase.findAll", query = "SELECT o FROM OgPhase o"),
    @NamedQuery(name = "OgPhase.findByOgPhaseId", query = "SELECT o FROM OgPhase o WHERE o.ogPhaseId = :ogPhaseId"),
    @NamedQuery(name = "OgPhase.findByPhase", query = "SELECT o FROM OgPhase o WHERE o.phase = :phase")})
public class OgPhase implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_PHASE_ID")
    private BigDecimal ogPhaseId;
    @Size(max = 20)
    @Column(name = "PHASE")
    private String phase;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogPhaseId", fetch = FetchType.LAZY)
    private List<OgMatch> ogMatchList;

    public OgPhase() {
    }

    public OgPhase(BigDecimal ogPhaseId) {
        this.ogPhaseId = ogPhaseId;
    }

    public BigDecimal getOgPhaseId() {
        return ogPhaseId;
    }

    public void setOgPhaseId(BigDecimal ogPhaseId) {
        this.ogPhaseId = ogPhaseId;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @XmlTransient
    public List<OgMatch> getOgMatchList() {
        return ogMatchList;
    }

    public void setOgMatchList(List<OgMatch> ogMatchList) {
        this.ogMatchList = ogMatchList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogPhaseId != null ? ogPhaseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgPhase)) {
            return false;
        }
        OgPhase other = (OgPhase) object;
        if ((this.ogPhaseId == null && other.ogPhaseId != null) || (this.ogPhaseId != null && !this.ogPhaseId.equals(other.ogPhaseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgPhase[ ogPhaseId=" + ogPhaseId + " ]";
    }
    
}
