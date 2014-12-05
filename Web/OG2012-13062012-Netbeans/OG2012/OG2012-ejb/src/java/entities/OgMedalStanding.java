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
@Table(name = "OG_MEDAL_STANDING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgMedalStanding.findAll", query = "SELECT o FROM OgMedalStanding o"),
    @NamedQuery(name = "OgMedalStanding.findByOgMedalStandingId", query = "SELECT o FROM OgMedalStanding o WHERE o.ogMedalStandingId = :ogMedalStandingId"),
    @NamedQuery(name = "OgMedalStanding.findByIdNationality", query = "SELECT o FROM OgMedalStanding o WHERE o.idNationality = :idNationality"),
    @NamedQuery(name = "OgMedalStanding.findByGold", query = "SELECT o FROM OgMedalStanding o WHERE o.gold = :gold"),
    @NamedQuery(name = "OgMedalStanding.findBySilver", query = "SELECT o FROM OgMedalStanding o WHERE o.silver = :silver"),
    @NamedQuery(name = "OgMedalStanding.findByBronze", query = "SELECT o FROM OgMedalStanding o WHERE o.bronze = :bronze")})
public class OgMedalStanding implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_MEDAL_STANDING_ID")
    private BigDecimal ogMedalStandingId;
    @Size(max = 20)
    @Column(name = "ID_NATIONALITY")
    private String idNationality;
    @Size(max = 20)
    @Column(name = "GOLD")
    private String gold;
    @Size(max = 20)
    @Column(name = "SILVER")
    private String silver;
    @Size(max = 20)
    @Column(name = "BRONZE")
    private String bronze;
    @JoinColumn(name = "OG_NATIONALITY_ID", referencedColumnName = "OG_NATIONALITY_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private OgNationality ogNationalityId;

    public OgMedalStanding() {
    }

    public OgMedalStanding(BigDecimal ogMedalStandingId) {
        this.ogMedalStandingId = ogMedalStandingId;
    }

    public BigDecimal getOgMedalStandingId() {
        return ogMedalStandingId;
    }

    public void setOgMedalStandingId(BigDecimal ogMedalStandingId) {
        this.ogMedalStandingId = ogMedalStandingId;
    }

    public String getIdNationality() {
        return idNationality;
    }

    public void setIdNationality(String idNationality) {
        this.idNationality = idNationality;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getSilver() {
        return silver;
    }

    public void setSilver(String silver) {
        this.silver = silver;
    }

    public String getBronze() {
        return bronze;
    }

    public void setBronze(String bronze) {
        this.bronze = bronze;
    }

    public OgNationality getOgNationalityId() {
        return ogNationalityId;
    }

    public void setOgNationalityId(OgNationality ogNationalityId) {
        this.ogNationalityId = ogNationalityId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogMedalStandingId != null ? ogMedalStandingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgMedalStanding)) {
            return false;
        }
        OgMedalStanding other = (OgMedalStanding) object;
        if ((this.ogMedalStandingId == null && other.ogMedalStandingId != null) || (this.ogMedalStandingId != null && !this.ogMedalStandingId.equals(other.ogMedalStandingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgMedalStanding[ ogMedalStandingId=" + ogMedalStandingId + " ]";
    }
    
}
