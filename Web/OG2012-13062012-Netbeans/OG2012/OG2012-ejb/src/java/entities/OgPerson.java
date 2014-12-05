/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kurro
 */
@Entity
@Table(name = "OG_PERSON")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgPerson.findAll", query = "SELECT o FROM OgPerson o"),
    @NamedQuery(name = "OgPerson.findByOgPersonId", query = "SELECT o FROM OgPerson o WHERE o.ogPersonId = :ogPersonId"),
    @NamedQuery(name = "OgPerson.findByName", query = "SELECT o FROM OgPerson o WHERE o.name = :name"),
    @NamedQuery(name = "OgPerson.findBySurname", query = "SELECT o FROM OgPerson o WHERE o.surname = :surname"),
    @NamedQuery(name = "OgPerson.findByBirthdate", query = "SELECT o FROM OgPerson o WHERE o.birthdate = :birthdate")})
public class OgPerson implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_PERSON_ID")
    private BigDecimal ogPersonId;
    @Size(max = 20)
    @Column(name = "NAME")
    private String name;
    @Size(max = 20)
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "BIRTHDATE")
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ogPerson", fetch = FetchType.LAZY)
    private OgReferee ogReferee;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ogPerson", fetch = FetchType.LAZY)
    private OgParticipant ogParticipant;
    @JoinColumn(name = "OG_NOC_ID", referencedColumnName = "OG_NOC_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgNoc ogNocId;
    @JoinColumn(name = "OG_NATIONALITY_ID", referencedColumnName = "OG_NATIONALITY_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgNationality ogNationalityId;
    @JoinColumn(name = "OG_GENDER_ID", referencedColumnName = "OG_GENDER_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgGender ogGenderId;

    public OgPerson() {
    }

    public OgPerson(BigDecimal ogPersonId) {
        this.ogPersonId = ogPersonId;
    }

    public BigDecimal getOgPersonId() {
        return ogPersonId;
    }

    public void setOgPersonId(BigDecimal ogPersonId) {
        this.ogPersonId = ogPersonId;
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

    public OgReferee getOgReferee() {
        return ogReferee;
    }

    public void setOgReferee(OgReferee ogReferee) {
        this.ogReferee = ogReferee;
    }

    public OgParticipant getOgParticipant() {
        return ogParticipant;
    }

    public void setOgParticipant(OgParticipant ogParticipant) {
        this.ogParticipant = ogParticipant;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogPersonId != null ? ogPersonId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgPerson)) {
            return false;
        }
        OgPerson other = (OgPerson) object;
        if ((this.ogPersonId == null && other.ogPersonId != null) || (this.ogPersonId != null && !this.ogPersonId.equals(other.ogPersonId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgPerson[ ogPersonId=" + ogPersonId + " ]";
    }
    
}
