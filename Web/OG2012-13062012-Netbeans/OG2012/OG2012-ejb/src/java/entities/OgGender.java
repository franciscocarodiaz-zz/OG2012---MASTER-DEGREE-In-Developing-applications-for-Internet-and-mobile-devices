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
@Table(name = "OG_GENDER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgGender.findAll", query = "SELECT o FROM OgGender o"),
    @NamedQuery(name = "OgGender.findByOgGenderId", query = "SELECT o FROM OgGender o WHERE o.ogGenderId = :ogGenderId"),
    @NamedQuery(name = "OgGender.findByGender", query = "SELECT o FROM OgGender o WHERE o.gender = :gender")})
public class OgGender implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_GENDER_ID")
    private BigDecimal ogGenderId;
    @Size(max = 20)
    @Column(name = "GENDER")
    private String gender;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogGenderId", fetch = FetchType.LAZY)
    private List<OgReferee> ogRefereeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogGenderId", fetch = FetchType.LAZY)
    private List<OgTeam> ogTeamList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogGenderId", fetch = FetchType.LAZY)
    private List<OgParticipant> ogParticipantList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogGenderId", fetch = FetchType.LAZY)
    private List<OgPerson> ogPersonList;

    public OgGender() {
    }

    public OgGender(BigDecimal ogGenderId) {
        this.ogGenderId = ogGenderId;
    }

    public BigDecimal getOgGenderId() {
        return ogGenderId;
    }

    public void setOgGenderId(BigDecimal ogGenderId) {
        this.ogGenderId = ogGenderId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogGenderId != null ? ogGenderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgGender)) {
            return false;
        }
        OgGender other = (OgGender) object;
        if ((this.ogGenderId == null && other.ogGenderId != null) || (this.ogGenderId != null && !this.ogGenderId.equals(other.ogGenderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgGender[ ogGenderId=" + ogGenderId + " ]";
    }
    
}
