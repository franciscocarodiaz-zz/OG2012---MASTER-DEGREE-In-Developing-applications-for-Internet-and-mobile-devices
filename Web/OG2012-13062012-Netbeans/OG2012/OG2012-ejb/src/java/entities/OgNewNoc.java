/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kurro
 */
@Entity
@Table(name = "OG_NEW_NOC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgNewNoc.findAll", query = "SELECT o FROM OgNewNoc o"),
    @NamedQuery(name = "OgNewNoc.findByOgNewNocId", query = "SELECT o FROM OgNewNoc o WHERE o.ogNewNocId = :ogNewNocId")})
public class OgNewNoc implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_NEW_NOC_ID")
    private BigDecimal ogNewNocId;
    @JoinColumn(name = "OG_NOC_ID", referencedColumnName = "OG_NOC_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgNoc ogNocId;
    @JoinColumn(name = "OG_NEW_ID", referencedColumnName = "OG_NEW_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgNew ogNewId;

    public OgNewNoc() {
    }

    public OgNewNoc(BigDecimal ogNewNocId) {
        this.ogNewNocId = ogNewNocId;
    }

    public BigDecimal getOgNewNocId() {
        return ogNewNocId;
    }

    public void setOgNewNocId(BigDecimal ogNewNocId) {
        this.ogNewNocId = ogNewNocId;
    }

    public OgNoc getOgNocId() {
        return ogNocId;
    }

    public void setOgNocId(OgNoc ogNocId) {
        this.ogNocId = ogNocId;
    }

    public OgNew getOgNewId() {
        return ogNewId;
    }

    public void setOgNewId(OgNew ogNewId) {
        this.ogNewId = ogNewId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogNewNocId != null ? ogNewNocId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgNewNoc)) {
            return false;
        }
        OgNewNoc other = (OgNewNoc) object;
        if ((this.ogNewNocId == null && other.ogNewNocId != null) || (this.ogNewNocId != null && !this.ogNewNocId.equals(other.ogNewNocId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgNewNoc[ ogNewNocId=" + ogNewNocId + " ]";
    }
    
}
