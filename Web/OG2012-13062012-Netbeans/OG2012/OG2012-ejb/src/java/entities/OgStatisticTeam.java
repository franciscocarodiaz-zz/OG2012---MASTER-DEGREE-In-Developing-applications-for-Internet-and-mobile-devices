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
@Table(name = "OG_STATISTIC_TEAM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgStatisticTeam.findAll", query = "SELECT o FROM OgStatisticTeam o"),
    @NamedQuery(name = "OgStatisticTeam.findByOgStatisticTeamId", query = "SELECT o FROM OgStatisticTeam o WHERE o.ogStatisticTeamId = :ogStatisticTeamId"),
    @NamedQuery(name = "OgStatisticTeam.findByNmatch", query = "SELECT o FROM OgStatisticTeam o WHERE o.nmatch = :nmatch"),
    @NamedQuery(name = "OgStatisticTeam.findByNmatchWins", query = "SELECT o FROM OgStatisticTeam o WHERE o.nmatchWins = :nmatchWins"),
    @NamedQuery(name = "OgStatisticTeam.findByNmatchEq", query = "SELECT o FROM OgStatisticTeam o WHERE o.nmatchEq = :nmatchEq"),
    @NamedQuery(name = "OgStatisticTeam.findByGf", query = "SELECT o FROM OgStatisticTeam o WHERE o.gf = :gf"),
    @NamedQuery(name = "OgStatisticTeam.findByGc", query = "SELECT o FROM OgStatisticTeam o WHERE o.gc = :gc")})
public class OgStatisticTeam implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_STATISTIC_TEAM_ID")
    private BigDecimal ogStatisticTeamId;
    @Size(max = 20)
    @Column(name = "NMATCH")
    private String nmatch;
    @Size(max = 20)
    @Column(name = "NMATCH_WINS")
    private String nmatchWins;
    @Size(max = 20)
    @Column(name = "NMATCH_EQ")
    private String nmatchEq;
    @Size(max = 20)
    @Column(name = "GF")
    private String gf;
    @Size(max = 20)
    @Column(name = "GC")
    private String gc;
    @JoinColumn(name = "OG_TEAM_ID", referencedColumnName = "OG_TEAM_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private OgTeam ogTeamId;

    public OgStatisticTeam() {
    }

    public OgStatisticTeam(BigDecimal ogStatisticTeamId) {
        this.ogStatisticTeamId = ogStatisticTeamId;
    }

    public BigDecimal getOgStatisticTeamId() {
        return ogStatisticTeamId;
    }

    public void setOgStatisticTeamId(BigDecimal ogStatisticTeamId) {
        this.ogStatisticTeamId = ogStatisticTeamId;
    }

    public String getNmatch() {
        return nmatch;
    }

    public void setNmatch(String nmatch) {
        this.nmatch = nmatch;
    }

    public String getNmatchWins() {
        return nmatchWins;
    }

    public void setNmatchWins(String nmatchWins) {
        this.nmatchWins = nmatchWins;
    }

    public String getNmatchEq() {
        return nmatchEq;
    }

    public void setNmatchEq(String nmatchEq) {
        this.nmatchEq = nmatchEq;
    }

    public String getGf() {
        return gf;
    }

    public void setGf(String gf) {
        this.gf = gf;
    }

    public String getGc() {
        return gc;
    }

    public void setGc(String gc) {
        this.gc = gc;
    }

    public OgTeam getOgTeamId() {
        return ogTeamId;
    }

    public void setOgTeamId(OgTeam ogTeamId) {
        this.ogTeamId = ogTeamId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogStatisticTeamId != null ? ogStatisticTeamId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgStatisticTeam)) {
            return false;
        }
        OgStatisticTeam other = (OgStatisticTeam) object;
        if ((this.ogStatisticTeamId == null && other.ogStatisticTeamId != null) || (this.ogStatisticTeamId != null && !this.ogStatisticTeamId.equals(other.ogStatisticTeamId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgStatisticTeam[ ogStatisticTeamId=" + ogStatisticTeamId + " ]";
    }
    
}
