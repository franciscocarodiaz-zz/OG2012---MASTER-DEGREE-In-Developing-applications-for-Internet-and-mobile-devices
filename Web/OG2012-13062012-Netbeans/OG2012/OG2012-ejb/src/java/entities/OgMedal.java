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
@Table(name = "OG_MEDAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgMedal.findAll", query = "SELECT o FROM OgMedal o"),
    @NamedQuery(name = "OgMedal.findByOgMedalId", query = "SELECT o FROM OgMedal o WHERE o.ogMedalId = :ogMedalId"),
    @NamedQuery(name = "OgMedal.findByMedal", query = "SELECT o FROM OgMedal o WHERE o.medal = :medal")})
public class OgMedal implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_MEDAL_ID")
    private BigDecimal ogMedalId;
    @Size(max = 20)
    @Column(name = "MEDAL")
    private String medal;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ogMedalId", fetch = FetchType.LAZY)
    private OgMatch ogMatch;

    public OgMedal() {
    }

    public OgMedal(BigDecimal ogMedalId) {
        this.ogMedalId = ogMedalId;
    }

    public BigDecimal getOgMedalId() {
        return ogMedalId;
    }

    public void setOgMedalId(BigDecimal ogMedalId) {
        this.ogMedalId = ogMedalId;
    }

    public String getMedal() {
        return medal;
    }

    public void setMedal(String medal) {
        this.medal = medal;
    }

    public OgMatch getOgMatch() {
        return ogMatch;
    }

    public void setOgMatch(OgMatch ogMatch) {
        this.ogMatch = ogMatch;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogMedalId != null ? ogMedalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgMedal)) {
            return false;
        }
        OgMedal other = (OgMedal) object;
        if ((this.ogMedalId == null && other.ogMedalId != null) || (this.ogMedalId != null && !this.ogMedalId.equals(other.ogMedalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgMedal[ ogMedalId=" + ogMedalId + " ]";
    }
    
}
