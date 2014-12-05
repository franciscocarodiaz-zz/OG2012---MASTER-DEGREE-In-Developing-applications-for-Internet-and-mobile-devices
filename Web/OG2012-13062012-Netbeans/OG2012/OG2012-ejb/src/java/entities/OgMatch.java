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
@Table(name = "OG_MATCH")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgMatch.findAll", query = "SELECT o FROM OgMatch o"),
    @NamedQuery(name = "OgMatch.findByOgMatchId", query = "SELECT o FROM OgMatch o WHERE o.ogMatchId = :ogMatchId"),
    @NamedQuery(name = "OgMatch.findByStartdate", query = "SELECT o FROM OgMatch o WHERE o.startdate = :startdate"),
    @NamedQuery(name = "OgMatch.findByEnddate", query = "SELECT o FROM OgMatch o WHERE o.enddate = :enddate"),
    @NamedQuery(name = "OgMatch.findByWinner", query = "SELECT o FROM OgMatch o WHERE o.winner = :winner")})
public class OgMatch implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_MATCH_ID")
    private BigDecimal ogMatchId;
    @Size(max = 20)
    @Column(name = "STARTDATE")
    private String startdate;
    @Size(max = 20)
    @Column(name = "ENDDATE")
    private String enddate;
    @Size(max = 20)
    @Column(name = "WINNER")
    private String winner;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ogMatchId", fetch = FetchType.LAZY)
    private OgResult ogResult;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogMatchId", fetch = FetchType.LAZY)
    private List<OgStatMatchPartic> ogStatMatchParticList;
    @JoinColumn(name = "OG_TEAM_ID1", referencedColumnName = "OG_TEAM_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgTeam ogTeamId1;
    @JoinColumn(name = "OG_TEAM_ID", referencedColumnName = "OG_TEAM_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgTeam ogTeamId;
    @JoinColumn(name = "OG_STATUS_ID", referencedColumnName = "OG_STATUS_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgStatus ogStatusId;
    @JoinColumn(name = "OG_STADIUM_ID", referencedColumnName = "OG_STADIUM_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgStadium ogStadiumId;
    @JoinColumn(name = "REFEREE1", referencedColumnName = "OG_REFEREE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private OgReferee referee1;
    @JoinColumn(name = "OG_PHASE_ID", referencedColumnName = "OG_PHASE_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgPhase ogPhaseId;
    @JoinColumn(name = "OG_MEDAL_ID", referencedColumnName = "OG_MEDAL_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private OgMedal ogMedalId;

    public OgMatch() {
    }

    public OgMatch(BigDecimal ogMatchId) {
        this.ogMatchId = ogMatchId;
    }

    public BigDecimal getOgMatchId() {
        return ogMatchId;
    }

    public void setOgMatchId(BigDecimal ogMatchId) {
        this.ogMatchId = ogMatchId;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public OgResult getOgResult() {
        return ogResult;
    }

    public void setOgResult(OgResult ogResult) {
        this.ogResult = ogResult;
    }

    @XmlTransient
    public List<OgStatMatchPartic> getOgStatMatchParticList() {
        return ogStatMatchParticList;
    }

    public void setOgStatMatchParticList(List<OgStatMatchPartic> ogStatMatchParticList) {
        this.ogStatMatchParticList = ogStatMatchParticList;
    }

    public OgTeam getOgTeamId1() {
        return ogTeamId1;
    }

    public void setOgTeamId1(OgTeam ogTeamId1) {
        this.ogTeamId1 = ogTeamId1;
    }

    public OgTeam getOgTeamId() {
        return ogTeamId;
    }

    public void setOgTeamId(OgTeam ogTeamId) {
        this.ogTeamId = ogTeamId;
    }

    public OgStatus getOgStatusId() {
        return ogStatusId;
    }

    public void setOgStatusId(OgStatus ogStatusId) {
        this.ogStatusId = ogStatusId;
    }

    public OgStadium getOgStadiumId() {
        return ogStadiumId;
    }

    public void setOgStadiumId(OgStadium ogStadiumId) {
        this.ogStadiumId = ogStadiumId;
    }

    public OgReferee getReferee1() {
        return referee1;
    }

    public void setReferee1(OgReferee referee1) {
        this.referee1 = referee1;
    }

    public OgPhase getOgPhaseId() {
        return ogPhaseId;
    }

    public void setOgPhaseId(OgPhase ogPhaseId) {
        this.ogPhaseId = ogPhaseId;
    }

    public OgMedal getOgMedalId() {
        return ogMedalId;
    }

    public void setOgMedalId(OgMedal ogMedalId) {
        this.ogMedalId = ogMedalId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogMatchId != null ? ogMatchId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgMatch)) {
            return false;
        }
        OgMatch other = (OgMatch) object;
        if ((this.ogMatchId == null && other.ogMatchId != null) || (this.ogMatchId != null && !this.ogMatchId.equals(other.ogMatchId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgMatch[ ogMatchId=" + ogMatchId + " ]";
    }
    
}
