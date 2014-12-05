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
@Table(name = "OG_NATIONALITY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgNationality.findAll", query = "SELECT o FROM OgNationality o"),
    @NamedQuery(name = "OgNationality.findByOgNationalityId", query = "SELECT o FROM OgNationality o WHERE o.ogNationalityId = :ogNationalityId"),
    @NamedQuery(name = "OgNationality.findByNationality", query = "SELECT o FROM OgNationality o WHERE o.nationality = :nationality")})
public class OgNationality implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_NATIONALITY_ID")
    private BigDecimal ogNationalityId;
    @Size(max = 20)
    @Column(name = "NATIONALITY")
    private String nationality;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogNationalityId", fetch = FetchType.LAZY)
    private List<OgReferee> ogRefereeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogNationalityId", fetch = FetchType.LAZY)
    private List<OgTeam> ogTeamList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogNationalityId", fetch = FetchType.LAZY)
    private List<OgParticipant> ogParticipantList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogNationalityId", fetch = FetchType.LAZY)
    private List<OgPerson> ogPersonList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ogNationalityId", fetch = FetchType.LAZY)
    private OgMedalStanding ogMedalStanding;

    public OgNationality() {
    }

    public OgNationality(BigDecimal ogNationalityId) {
        this.ogNationalityId = ogNationalityId;
    }

    public BigDecimal getOgNationalityId() {
        return ogNationalityId;
    }

    public void setOgNationalityId(BigDecimal ogNationalityId) {
        this.ogNationalityId = ogNationalityId;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @XmlTransient
    public List<OgReferee> getOgRefereeList() {
        return ogRefereeList;
    }

    public void setOgRefereeList(List<OgReferee> ogRefereeList) {
        this.ogRefereeList = ogRefereeList;
    }

    @XmlTransient
    public List<OgTeam> getOgTeamList() {
        return ogTeamList;
    }

    public void setOgTeamList(List<OgTeam> ogTeamList) {
        this.ogTeamList = ogTeamList;
    }

    @XmlTransient
    public List<OgParticipant> getOgParticipantList() {
        return ogParticipantList;
    }

    public void setOgParticipantList(List<OgParticipant> ogParticipantList) {
        this.ogParticipantList = ogParticipantList;
    }

    @XmlTransient
    public List<OgPerson> getOgPersonList() {
        return ogPersonList;
    }

    public void setOgPersonList(List<OgPerson> ogPersonList) {
        this.ogPersonList = ogPersonList;
    }

    public OgMedalStanding getOgMedalStanding() {
        return ogMedalStanding;
    }

    public void setOgMedalStanding(OgMedalStanding ogMedalStanding) {
        this.ogMedalStanding = ogMedalStanding;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogNationalityId != null ? ogNationalityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgNationality)) {
            return false;
        }
        OgNationality other = (OgNationality) object;
        if ((this.ogNationalityId == null && other.ogNationalityId != null) || (this.ogNationalityId != null && !this.ogNationalityId.equals(other.ogNationalityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgNationality[ ogNationalityId=" + ogNationalityId + " ]";
    }
    
}
