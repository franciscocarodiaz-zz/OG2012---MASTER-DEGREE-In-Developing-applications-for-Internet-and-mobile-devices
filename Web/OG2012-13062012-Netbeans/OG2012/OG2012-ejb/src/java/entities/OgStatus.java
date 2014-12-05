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
@Table(name = "OG_STATUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgStatus.findAll", query = "SELECT o FROM OgStatus o"),
    @NamedQuery(name = "OgStatus.findByOgStatusId", query = "SELECT o FROM OgStatus o WHERE o.ogStatusId = :ogStatusId"),
    @NamedQuery(name = "OgStatus.findByStatus", query = "SELECT o FROM OgStatus o WHERE o.status = :status")})
public class OgStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_STATUS_ID")
    private BigDecimal ogStatusId;
    @Size(max = 20)
    @Column(name = "STATUS")
    private String status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogStatusId", fetch = FetchType.LAZY)
    private List<OgMatch> ogMatchList;

    public OgStatus() {
    }

    public OgStatus(BigDecimal ogStatusId) {
        this.ogStatusId = ogStatusId;
    }

    public BigDecimal getOgStatusId() {
        return ogStatusId;
    }

    public void setOgStatusId(BigDecimal ogStatusId) {
        this.ogStatusId = ogStatusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        hash += (ogStatusId != null ? ogStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgStatus)) {
            return false;
        }
        OgStatus other = (OgStatus) object;
        if ((this.ogStatusId == null && other.ogStatusId != null) || (this.ogStatusId != null && !this.ogStatusId.equals(other.ogStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgStatus[ ogStatusId=" + ogStatusId + " ]";
    }
    
}
