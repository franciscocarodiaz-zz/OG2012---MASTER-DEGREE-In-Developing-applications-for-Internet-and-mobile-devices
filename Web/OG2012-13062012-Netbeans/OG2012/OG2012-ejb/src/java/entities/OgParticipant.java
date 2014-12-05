/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
@Table(name = "OG_PARTICIPANT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgParticipant.findAll", query = "SELECT o FROM OgParticipant o"),
    @NamedQuery(name = "OgParticipant.findByOgParticipantId", query = "SELECT o FROM OgParticipant o WHERE o.ogParticipantId = :ogParticipantId"),
    @NamedQuery(name = "OgParticipant.findByName", query = "SELECT o FROM OgParticipant o WHERE o.name = :name"),
    @NamedQuery(name = "OgParticipant.findBySurname", query = "SELECT o FROM OgParticipant o WHERE o.surname = :surname"),
    @NamedQuery(name = "OgParticipant.findByBirthdate", query = "SELECT o FROM OgParticipant o WHERE o.birthdate = :birthdate"),
    @NamedQuery(name = "OgParticipant.findByWeight", query = "SELECT o FROM OgParticipant o WHERE o.weight = :weight"),
    @NamedQuery(name = "OgParticipant.findByHeight", query = "SELECT o FROM OgParticipant o WHERE o.height = :height")})
public class OgParticipant implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_PARTICIPANT_ID")
    private BigDecimal ogParticipantId;
    @Size(max = 20)
    @Column(name = "NAME")
    private String name;
    @Size(max = 20)
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "BIRTHDATE")
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    @Size(max = 20)
    @Column(name = "WEIGHT")
    private String weight;
    @Size(max = 20)
    @Column(name = "HEIGHT")
    private String height;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogParticipantId", fetch = FetchType.LAZY)
    private List<OgStatMatchPartic> ogStatMatchParticList;
    @JoinColumn(name = "OG_ROLE_ID", referencedColumnName = "OG_ROLE_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgRole ogRoleId;
    @JoinColumn(name = "OG_PARTICIPANT_ID", referencedColumnName = "OG_PERSON_ID", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private OgPerson ogPerson;
    @JoinColumn(name = "OG_NOC_ID", referencedColumnName = "OG_NOC_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgNoc ogNocId;
    @JoinColumn(name = "OG_NATIONALITY_ID", referencedColumnName = "OG_NATIONALITY_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgNationality ogNationalityId;
    @JoinColumn(name = "OG_GENDER_ID", referencedColumnName = "OG_GENDER_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgGender ogGenderId;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ogParticipantId", fetch = FetchType.LAZY)
    private OgStatisticParticipant ogStatisticParticipant;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ogParticipant", fetch = FetchType.LAZY)
    private OgTeamPartic ogTeamPartic;

    public OgParticipant() {
    }

    public OgParticipant(BigDecimal ogParticipantId) {
        this.ogParticipantId = ogParticipantId;
    }

    public BigDecimal getOgParticipantId() {
        return ogParticipantId;
    }

    public void setOgParticipantId(BigDecimal ogParticipantId) {
        this.ogParticipantId = ogParticipantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @XmlTransient
    public List<OgStatMatchPartic> getOgStatMatchParticList() {
        return ogStatMatchParticList;
    }

    public void setOgStatMatchParticList(List<OgStatMatchPartic> ogStatMatchParticList) {
        this.ogStatMatchParticList = ogStatMatchParticList;
    }

    public OgRole getOgRoleId() {
        return ogRoleId;
    }

    public void setOgRoleId(OgRole ogRoleId) {
        this.ogRoleId = ogRoleId;
    }

    public OgPerson getOgPerson() {
        return ogPerson;
    }

    public void setOgPerson(OgPerson ogPerson) {
        this.ogPerson = ogPerson;
    }

    public OgNoc getOgNocId() {
        return ogNocId;
    }

    public void setOgNocId(OgNoc ogNocId) {
        this.ogNocId = ogNocId;
    }

    public OgNationality getOgNationalityId() {
        return ogNationalityId;
    }

    public void setOgNationalityId(OgNationality ogNationalityId) {
        this.ogNationalityId = ogNationalityId;
    }

    public OgGender getOgGenderId() {
        return ogGenderId;
    }

    public void setOgGenderId(OgGender ogGenderId) {
        this.ogGenderId = ogGenderId;
    }

    public OgStatisticParticipant getOgStatisticParticipant() {
        return ogStatisticParticipant;
    }

    public void setOgStatisticParticipant(OgStatisticParticipant ogStatisticParticipant) {
        this.ogStatisticParticipant = ogStatisticParticipant;
    }

    public OgTeamPartic getOgTeamPartic() {
        return ogTeamPartic;
    }

    public void setOgTeamPartic(OgTeamPartic ogTeamPartic) {
        this.ogTeamPartic = ogTeamPartic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogParticipantId != null ? ogParticipantId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgParticipant)) {
            return false;
        }
        OgParticipant other = (OgParticipant) object;
        if ((this.ogParticipantId == null && other.ogParticipantId != null) || (this.ogParticipantId != null && !this.ogParticipantId.equals(other.ogParticipantId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgParticipant[ ogParticipantId=" + ogParticipantId + " ]";
    }
    
}
