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
@Table(name = "OG_CATEGORY_REFEREE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgCategoryReferee.findAll", query = "SELECT o FROM OgCategoryReferee o"),
    @NamedQuery(name = "OgCategoryReferee.findByOgCategoryRefereeId", query = "SELECT o FROM OgCategoryReferee o WHERE o.ogCategoryRefereeId = :ogCategoryRefereeId"),
    @NamedQuery(name = "OgCategoryReferee.findByCategoryReferee", query = "SELECT o FROM OgCategoryReferee o WHERE o.categoryReferee = :categoryReferee")})
public class OgCategoryReferee implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_CATEGORY_REFEREE_ID")
    private BigDecimal ogCategoryRefereeId;
    @Size(max = 20)
    @Column(name = "CATEGORY_REFEREE")
    private String categoryReferee;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogCategoryRefereeId", fetch = FetchType.LAZY)
    private List<OgReferee> ogRefereeList;

    public OgCategoryReferee() {
    }

    public OgCategoryReferee(BigDecimal ogCategoryRefereeId) {
        this.ogCategoryRefereeId = ogCategoryRefereeId;
    }

    public BigDecimal getOgCategoryRefereeId() {
        return ogCategoryRefereeId;
    }

    public void setOgCategoryRefereeId(BigDecimal ogCategoryRefereeId) {
        this.ogCategoryRefereeId = ogCategoryRefereeId;
    }

    public String getCategoryReferee() {
        return categoryReferee;
    }

    public void setCategoryReferee(String categoryReferee) {
        this.categoryReferee = categoryReferee;
    }

    @XmlTransient
    public List<OgReferee> getOgRefereeList() {
        return ogRefereeList;
    }

    public void setOgRefereeList(List<OgReferee> ogRefereeList) {
        this.ogRefereeList = ogRefereeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogCategoryRefereeId != null ? ogCategoryRefereeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgCategoryReferee)) {
            return false;
        }
        OgCategoryReferee other = (OgCategoryReferee) object;
        if ((this.ogCategoryRefereeId == null && other.ogCategoryRefereeId != null) || (this.ogCategoryRefereeId != null && !this.ogCategoryRefereeId.equals(other.ogCategoryRefereeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgCategoryReferee[ ogCategoryRefereeId=" + ogCategoryRefereeId + " ]";
    }
    
}
