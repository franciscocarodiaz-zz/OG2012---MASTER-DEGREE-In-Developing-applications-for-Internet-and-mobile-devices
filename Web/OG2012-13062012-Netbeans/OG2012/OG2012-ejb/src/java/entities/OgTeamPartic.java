/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kurro
 */
@Entity
@Table(name = "OG_TEAM_PARTIC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgTeamPartic.findAll", query = "SELECT o FROM OgTeamPartic o"),
    @NamedQuery(name = "OgTeamPartic.findByDorsal", query = "SELECT o FROM OgTeamPartic o WHERE o.ogTeamParticPK.dorsal = :dorsal"),
    @NamedQuery(name = "OgTeamPartic.findByOgParticipantId", query = "SELECT o FROM OgTeamPartic o WHERE o.ogTeamParticPK.ogParticipantId = :ogParticipantId"),
    @NamedQuery(name = "OgTeamPartic.findByOgTeamId", query = "SELECT o FROM OgTeamPartic o WHERE o.ogTeamParticPK.ogTeamId = :ogTeamId")})
public class OgTeamPartic implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OgTeamParticPK ogTeamParticPK;
    @JoinColumn(name = "OG_TEAM_ID", referencedColumnName = "OG_TEAM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgTeam ogTeam;
    @JoinColumn(name = "OG_PARTICIPANT_ID", referencedColumnName = "OG_PARTICIPANT_ID", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private OgParticipant ogParticipant;

    public OgTeamPartic() {
    }

    public OgTeamPartic(OgTeamParticPK ogTeamParticPK) {
        this.ogTeamParticPK = ogTeamParticPK;
    }

    public OgTeamPartic(short dorsal, BigInteger ogParticipantId, BigInteger ogTeamId) {
        this.ogTeamParticPK = new OgTeamParticPK(dorsal, ogParticipantId, ogTeamId);
    }

    public OgTeamParticPK getOgTeamParticPK() {
        return ogTeamParticPK;
    }

    public void setOgTeamParticPK(OgTeamParticPK ogTeamParticPK) {
        this.ogTeamParticPK = ogTeamParticPK;
    }

    public OgTeam getOgTeam() {
        return ogTeam;
    }

    public void setOgTeam(OgTeam ogTeam) {
        this.ogTeam = ogTeam;
    }

    public OgParticipant getOgParticipant() {
        return ogParticipant;
    }

    public void setOgParticipant(OgParticipant ogParticipant) {
        this.ogParticipant = ogParticipant;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogTeamParticPK != null ? ogTeamParticPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgTeamPartic)) {
            return false;
        }
        OgTeamPartic other = (OgTeamPartic) object;
        if ((this.ogTeamParticPK == null && other.ogTeamParticPK != null) || (this.ogTeamParticPK != null && !this.ogTeamParticPK.equals(other.ogTeamParticPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgTeamPartic[ ogTeamParticPK=" + ogTeamParticPK + " ]";
    }
    
}
