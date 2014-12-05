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
@Table(name = "OG_STADIUM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgStadium.findAll", query = "SELECT o FROM OgStadium o"),
    @NamedQuery(name = "OgStadium.findByOgStadiumId", query = "SELECT o FROM OgStadium o WHERE o.ogStadiumId = :ogStadiumId"),
    @NamedQuery(name = "OgStadium.findByName", query = "SELECT o FROM OgStadium o WHERE o.name = :name"),
    @NamedQuery(name = "OgStadium.findByCapacity", query = "SELECT o FROM OgStadium o WHERE o.capacity = :capacity")})
public class OgStadium implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_STADIUM_ID")
    private BigDecimal ogStadiumId;
    @Size(max = 20)
    @Column(name = "NAME")
    private String name;
    @Size(max = 20)
    @Column(name = "CAPACITY")
    private String capacity;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogStadiumId", fetch = FetchType.LAZY)
    private List<OgMatch> ogMatchList;

    public OgStadium() {
    }

    public OgStadium(BigDecimal ogStadiumId) {
        this.ogStadiumId = ogStadiumId;
    }

    public BigDecimal getOgStadiumId() {
        return ogStadiumId;
    }

    public void setOgStadiumId(BigDecimal ogStadiumId) {
        this.ogStadiumId = ogStadiumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
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
        hash += (ogStadiumId != null ? ogStadiumId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgStadium)) {
            return false;
        }
        OgStadium other = (OgStadium) object;
        if ((this.ogStadiumId == null && other.ogStadiumId != null) || (this.ogStadiumId != null && !this.ogStadiumId.equals(other.ogStadiumId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgStadium[ ogStadiumId=" + ogStadiumId + " ]";
    }
    
}
