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
@Table(name = "OG_REFEREE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgReferee.findAll", query = "SELECT o FROM OgReferee o"),
    @NamedQuery(name = "OgReferee.findByOgRefereeId", query = "SELECT o FROM OgReferee o WHERE o.ogRefereeId = :ogRefereeId"),
    @NamedQuery(name = "OgReferee.findByName", query = "SELECT o FROM OgReferee o WHERE o.name = :name"),
    @NamedQuery(name = "OgReferee.findBySurname", query = "SELECT o FROM OgReferee o WHERE o.surname = :surname"),
    @NamedQuery(name = "OgReferee.findByBirthdate", query = "SELECT o FROM OgReferee o WHERE o.birthdate = :birthdate")})
public class OgReferee implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_REFEREE_ID")
    private BigDecimal ogRefereeId;
    @Size(max = 20)
    @Column(name = "NAME")
    private String name;
    @Size(max = 20)
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "BIRTHDATE")
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    @JoinColumn(name = "OG_REFEREE_ID", referencedColumnName = "OG_PERSON_ID", insertable = false, updatable = false)
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
    @JoinColumn(name = "OG_CATEGORY_REFEREE_ID", referencedColumnName = "OG_CATEGORY_REFEREE_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgCategoryReferee ogCategoryRefereeId;
    @OneToMany(mappedBy = "referee1", fetch = FetchType.LAZY)
    private List<OgMatch> ogMatchList;

    public OgReferee() {
    }

    public OgReferee(BigDecimal ogRefereeId) {
        this.ogRefereeId = ogRefereeId;
    }

    public BigDecimal getOgRefereeId() {
        return ogRefereeId;
    }

    public void setOgRefereeId(BigDecimal ogRefereeId) {
        this.ogRefereeId = ogRefereeId;
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

    public OgCategoryReferee getOgCategoryRefereeId() {
        return ogCategoryRefereeId;
    }

    public void setOgCategoryRefereeId(OgCategoryReferee ogCategoryRefereeId) {
        this.ogCategoryRefereeId = ogCategoryRefereeId;
    }

    @XmlTransient
    public List<OgMatch> getOgMatchList() {
        return ogMatchList;
    }

    public void setOgMatchList(List<OgMatch> ogMatchList) {
        this.ogMatchList = ogMatchList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogRefereeId != null ? ogRefereeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgReferee)) {
            return false;
        }
        OgReferee other = (OgReferee) object;
        if ((this.ogRefereeId == null && other.ogRefereeId != null) || (this.ogRefereeId != null && !this.ogRefereeId.equals(other.ogRefereeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgReferee[ ogRefereeId=" + ogRefereeId + " ]";
    }
    
}
