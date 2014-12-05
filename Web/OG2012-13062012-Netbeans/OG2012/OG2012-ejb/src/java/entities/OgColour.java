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
@Table(name = "OG_COLOUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgColour.findAll", query = "SELECT o FROM OgColour o"),
    @NamedQuery(name = "OgColour.findByOgColourId", query = "SELECT o FROM OgColour o WHERE o.ogColourId = :ogColourId"),
    @NamedQuery(name = "OgColour.findByColour", query = "SELECT o FROM OgColour o WHERE o.colour = :colour")})
public class OgColour implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_COLOUR_ID")
    private BigDecimal ogColourId;
    @Size(max = 20)
    @Column(name = "COLOUR")
    private String colour;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogColourIdHome", fetch = FetchType.LAZY)
    private List<OgTeam> ogTeamList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogColourIdAway", fetch = FetchType.LAZY)
    private List<OgTeam> ogTeamList1;

    public OgColour() {
    }

    public OgColour(BigDecimal ogColourId) {
        this.ogColourId = ogColourId;
    }

    public BigDecimal getOgColourId() {
        return ogColourId;
    }

    public void setOgColourId(BigDecimal ogColourId) {
        this.ogColourId = ogColourId;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @XmlTransient
    public List<OgTeam> getOgTeamList() {
        return ogTeamList;
    }

    public void setOgTeamList(List<OgTeam> ogTeamList) {
        this.ogTeamList = ogTeamList;
    }

    @XmlTransient
    public List<OgTeam> getOgTeamList1() {
        return ogTeamList1;
    }

    public void setOgTeamList1(List<OgTeam> ogTeamList1) {
        this.ogTeamList1 = ogTeamList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogColourId != null ? ogColourId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgColour)) {
            return false;
        }
        OgColour other = (OgColour) object;
        if ((this.ogColourId == null && other.ogColourId != null) || (this.ogColourId != null && !this.ogColourId.equals(other.ogColourId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgColour[ ogColourId=" + ogColourId + " ]";
    }
    
}
