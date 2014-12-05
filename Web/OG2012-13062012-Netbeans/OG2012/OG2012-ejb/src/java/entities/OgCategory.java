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
@Table(name = "OG_CATEGORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgCategory.findAll", query = "SELECT o FROM OgCategory o"),
    @NamedQuery(name = "OgCategory.findByOgCategoryId", query = "SELECT o FROM OgCategory o WHERE o.ogCategoryId = :ogCategoryId"),
    @NamedQuery(name = "OgCategory.findByCategory", query = "SELECT o FROM OgCategory o WHERE o.category = :category")})
public class OgCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_CATEGORY_ID")
    private BigDecimal ogCategoryId;
    @Size(max = 20)
    @Column(name = "CATEGORY")
    private String category;

    public OgCategory() {
    }

    public OgCategory(BigDecimal ogCategoryId) {
        this.ogCategoryId = ogCategoryId;
    }

    public BigDecimal getOgCategoryId() {
        return ogCategoryId;
    }

    public void setOgCategoryId(BigDecimal ogCategoryId) {
        this.ogCategoryId = ogCategoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogCategoryId != null ? ogCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgCategory)) {
            return false;
        }
        OgCategory other = (OgCategory) object;
        if ((this.ogCategoryId == null && other.ogCategoryId != null) || (this.ogCategoryId != null && !this.ogCategoryId.equals(other.ogCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgCategory[ ogCategoryId=" + ogCategoryId + " ]";
    }
    
}
