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
@Table(name = "OG_STAT_MATCH_PARTIC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgStatMatchPartic.findAll", query = "SELECT o FROM OgStatMatchPartic o"),
    @NamedQuery(name = "OgStatMatchPartic.findByOgStatMatchParticId", query = "SELECT o FROM OgStatMatchPartic o WHERE o.ogStatMatchParticId = :ogStatMatchParticId"),
    @NamedQuery(name = "OgStatMatchPartic.findByMatch", query = "SELECT o FROM OgStatMatchPartic o WHERE o.match = :match"),
    @NamedQuery(name = "OgStatMatchPartic.findByMinute", query = "SELECT o FROM OgStatMatchPartic o WHERE o.minute = :minute")})
public class OgStatMatchPartic implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_STAT_MATCH_PARTIC_ID")
    private BigDecimal ogStatMatchParticId;
    @Size(max = 20)
    @Column(name = "MATCH")
    private String match;
    @Size(max = 20)
    @Column(name = "MINUTE")
    private String minute;
    @JoinColumn(name = "OG_TEAM_ID", referencedColumnName = "OG_TEAM_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgTeam ogTeamId;
    @JoinColumn(name = "OG_PARTICIPANT_ID", referencedColumnName = "OG_PARTICIPANT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgParticipant ogParticipantId;
    @JoinColumn(name = "OG_MATCH_ID", referencedColumnName = "OG_MATCH_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgMatch ogMatchId;
    @JoinColumn(name = "OG_ACTION_ID", referencedColumnName = "OG_ACTION_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgAction ogActionId;

    public OgStatMatchPartic() {
    }

    public OgStatMatchPartic(BigDecimal ogStatMatchParticId) {
        this.ogStatMatchParticId = ogStatMatchParticId;
    }

    public BigDecimal getOgStatMatchParticId() {
        return ogStatMatchParticId;
    }

    public void setOgStatMatchParticId(BigDecimal ogStatMatchParticId) {
        this.ogStatMatchParticId = ogStatMatchParticId;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public OgTeam getOgTeamId() {
        return ogTeamId;
    }

    public void setOgTeamId(OgTeam ogTeamId) {
        this.ogTeamId = ogTeamId;
    }

    public OgParticipant getOgParticipantId() {
        return ogParticipantId;
    }

    public void setOgParticipantId(OgParticipant ogParticipantId) {
        this.ogParticipantId = ogParticipantId;
    }

    public OgMatch getOgMatchId() {
        return ogMatchId;
    }

    public void setOgMatchId(OgMatch ogMatchId) {
        this.ogMatchId = ogMatchId;
    }

    public OgAction getOgActionId() {
        return ogActionId;
    }

    public void setOgActionId(OgAction ogActionId) {
        this.ogActionId = ogActionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogStatMatchParticId != null ? ogStatMatchParticId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgStatMatchPartic)) {
            return false;
        }
        OgStatMatchPartic other = (OgStatMatchPartic) object;
        if ((this.ogStatMatchParticId == null && other.ogStatMatchParticId != null) || (this.ogStatMatchParticId != null && !this.ogStatMatchParticId.equals(other.ogStatMatchParticId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgStatMatchPartic[ ogStatMatchParticId=" + ogStatMatchParticId + " ]";
    }
    
}
