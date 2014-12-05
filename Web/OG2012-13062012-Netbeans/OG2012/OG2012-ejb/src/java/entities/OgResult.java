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
@Table(name = "OG_RESULT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgResult.findAll", query = "SELECT o FROM OgResult o"),
    @NamedQuery(name = "OgResult.findByOgResultId", query = "SELECT o FROM OgResult o WHERE o.ogResultId = :ogResultId"),
    @NamedQuery(name = "OgResult.findByHomeTeam", query = "SELECT o FROM OgResult o WHERE o.homeTeam = :homeTeam"),
    @NamedQuery(name = "OgResult.findByAwayTeam", query = "SELECT o FROM OgResult o WHERE o.awayTeam = :awayTeam"),
    @NamedQuery(name = "OgResult.findByRes1Home", query = "SELECT o FROM OgResult o WHERE o.res1Home = :res1Home"),
    @NamedQuery(name = "OgResult.findByRes1Away", query = "SELECT o FROM OgResult o WHERE o.res1Away = :res1Away"),
    @NamedQuery(name = "OgResult.findByRes2Home", query = "SELECT o FROM OgResult o WHERE o.res2Home = :res2Home"),
    @NamedQuery(name = "OgResult.findByRes2Away", query = "SELECT o FROM OgResult o WHERE o.res2Away = :res2Away"),
    @NamedQuery(name = "OgResult.findByResEt1Home", query = "SELECT o FROM OgResult o WHERE o.resEt1Home = :resEt1Home"),
    @NamedQuery(name = "OgResult.findByResEt1Away", query = "SELECT o FROM OgResult o WHERE o.resEt1Away = :resEt1Away"),
    @NamedQuery(name = "OgResult.findByResEt2Home", query = "SELECT o FROM OgResult o WHERE o.resEt2Home = :resEt2Home"),
    @NamedQuery(name = "OgResult.findByResEt2Away", query = "SELECT o FROM OgResult o WHERE o.resEt2Away = :resEt2Away"),
    @NamedQuery(name = "OgResult.findByResTotalHome", query = "SELECT o FROM OgResult o WHERE o.resTotalHome = :resTotalHome"),
    @NamedQuery(name = "OgResult.findByResTotalAway", query = "SELECT o FROM OgResult o WHERE o.resTotalAway = :resTotalAway"),
    @NamedQuery(name = "OgResult.findByResPenHome", query = "SELECT o FROM OgResult o WHERE o.resPenHome = :resPenHome"),
    @NamedQuery(name = "OgResult.findByResPenAway", query = "SELECT o FROM OgResult o WHERE o.resPenAway = :resPenAway")})
public class OgResult implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_RESULT_ID")
    private BigDecimal ogResultId;
    @Size(max = 20)
    @Column(name = "HOME_TEAM")
    private String homeTeam;
    @Size(max = 20)
    @Column(name = "AWAY_TEAM")
    private String awayTeam;
    @Size(max = 20)
    @Column(name = "RES1_HOME")
    private String res1Home;
    @Size(max = 20)
    @Column(name = "RES1_AWAY")
    private String res1Away;
    @Size(max = 20)
    @Column(name = "RES2_HOME")
    private String res2Home;
    @Size(max = 20)
    @Column(name = "RES2_AWAY")
    private String res2Away;
    @Size(max = 20)
    @Column(name = "RES_ET1_HOME")
    private String resEt1Home;
    @Size(max = 20)
    @Column(name = "RES_ET1_AWAY")
    private String resEt1Away;
    @Size(max = 20)
    @Column(name = "RES_ET2_HOME")
    private String resEt2Home;
    @Size(max = 20)
    @Column(name = "RES_ET2_AWAY")
    private String resEt2Away;
    @Size(max = 20)
    @Column(name = "RES_TOTAL_HOME")
    private String resTotalHome;
    @Size(max = 20)
    @Column(name = "RES_TOTAL_AWAY")
    private String resTotalAway;
    @Size(max = 20)
    @Column(name = "RES_PEN_HOME")
    private String resPenHome;
    @Size(max = 20)
    @Column(name = "RES_PEN_AWAY")
    private String resPenAway;
    @JoinColumn(name = "OG_MATCH_ID", referencedColumnName = "OG_MATCH_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private OgMatch ogMatchId;

    public OgResult() {
    }

    public OgResult(BigDecimal ogResultId) {
        this.ogResultId = ogResultId;
    }

    public BigDecimal getOgResultId() {
        return ogResultId;
    }

    public void setOgResultId(BigDecimal ogResultId) {
        this.ogResultId = ogResultId;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getRes1Home() {
        return res1Home;
    }

    public void setRes1Home(String res1Home) {
        this.res1Home = res1Home;
    }

    public String getRes1Away() {
        return res1Away;
    }

    public void setRes1Away(String res1Away) {
        this.res1Away = res1Away;
    }

    public String getRes2Home() {
        return res2Home;
    }

    public void setRes2Home(String res2Home) {
        this.res2Home = res2Home;
    }

    public String getRes2Away() {
        return res2Away;
    }

    public void setRes2Away(String res2Away) {
        this.res2Away = res2Away;
    }

    public String getResEt1Home() {
        return resEt1Home;
    }

    public void setResEt1Home(String resEt1Home) {
        this.resEt1Home = resEt1Home;
    }

    public String getResEt1Away() {
        return resEt1Away;
    }

    public void setResEt1Away(String resEt1Away) {
        this.resEt1Away = resEt1Away;
    }

    public String getResEt2Home() {
        return resEt2Home;
    }

    public void setResEt2Home(String resEt2Home) {
        this.resEt2Home = resEt2Home;
    }

    public String getResEt2Away() {
        return resEt2Away;
    }

    public void setResEt2Away(String resEt2Away) {
        this.resEt2Away = resEt2Away;
    }

    public String getResTotalHome() {
        return resTotalHome;
    }

    public void setResTotalHome(String resTotalHome) {
        this.resTotalHome = resTotalHome;
    }

    public String getResTotalAway() {
        return resTotalAway;
    }

    public void setResTotalAway(String resTotalAway) {
        this.resTotalAway = resTotalAway;
    }

    public String getResPenHome() {
        return resPenHome;
    }

    public void setResPenHome(String resPenHome) {
        this.resPenHome = resPenHome;
    }

    public String getResPenAway() {
        return resPenAway;
    }

    public void setResPenAway(String resPenAway) {
        this.resPenAway = resPenAway;
    }

    public OgMatch getOgMatchId() {
        return ogMatchId;
    }

    public void setOgMatchId(OgMatch ogMatchId) {
        this.ogMatchId = ogMatchId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogResultId != null ? ogResultId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgResult)) {
            return false;
        }
        OgResult other = (OgResult) object;
        if ((this.ogResultId == null && other.ogResultId != null) || (this.ogResultId != null && !this.ogResultId.equals(other.ogResultId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgResult[ ogResultId=" + ogResultId + " ]";
    }
    
}
