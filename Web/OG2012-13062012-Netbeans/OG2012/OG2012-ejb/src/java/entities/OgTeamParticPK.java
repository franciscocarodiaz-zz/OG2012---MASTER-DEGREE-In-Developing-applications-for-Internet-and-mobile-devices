/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Kurro
 */
@Embeddable
public class OgTeamParticPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "DORSAL")
    private short dorsal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_PARTICIPANT_ID")
    private BigInteger ogParticipantId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_TEAM_ID")
    private BigInteger ogTeamId;

    public OgTeamParticPK() {
    }

    public OgTeamParticPK(short dorsal, BigInteger ogParticipantId, BigInteger ogTeamId) {
        this.dorsal = dorsal;
        this.ogParticipantId = ogParticipantId;
        this.ogTeamId = ogTeamId;
    }

    public short getDorsal() {
        return dorsal;
    }

    public void setDorsal(short dorsal) {
        this.dorsal = dorsal;
    }

    public BigInteger getOgParticipantId() {
        return ogParticipantId;
    }

    public void setOgParticipantId(BigInteger ogParticipantId) {
        this.ogParticipantId = ogParticipantId;
    }

    public BigInteger getOgTeamId() {
        return ogTeamId;
    }

    public void setOgTeamId(BigInteger ogTeamId) {
        this.ogTeamId = ogTeamId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) dorsal;
        hash += (ogParticipantId != null ? ogParticipantId.hashCode() : 0);
        hash += (ogTeamId != null ? ogTeamId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgTeamParticPK)) {
            return false;
        }
        OgTeamParticPK other = (OgTeamParticPK) object;
        if (this.dorsal != other.dorsal) {
            return false;
        }
        if ((this.ogParticipantId == null && other.ogParticipantId != null) || (this.ogParticipantId != null && !this.ogParticipantId.equals(other.ogParticipantId))) {
            return false;
        }
        if ((this.ogTeamId == null && other.ogTeamId != null) || (this.ogTeamId != null && !this.ogTeamId.equals(other.ogTeamId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgTeamParticPK[ dorsal=" + dorsal + ", ogParticipantId=" + ogParticipantId + ", ogTeamId=" + ogTeamId + " ]";
    }
    
}
