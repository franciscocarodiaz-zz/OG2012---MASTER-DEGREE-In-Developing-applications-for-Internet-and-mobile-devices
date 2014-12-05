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
@Table(name = "OG_NOC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgNoc.findAll", query = "SELECT o FROM OgNoc o"),
    @NamedQuery(name = "OgNoc.findByOgNocId", query = "SELECT o FROM OgNoc o WHERE o.ogNocId = :ogNocId"),
    @NamedQuery(name = "OgNoc.findByNoc", query = "SELECT o FROM OgNoc o WHERE o.noc = :noc")})
public class OgNoc implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_NOC_ID")
    private BigDecimal ogNocId;
    @Size(max = 20)
    @Column(name = "NOC")
    private String noc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogNocId", fetch = FetchType.LAZY)
    private List<OgReferee> ogRefereeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogNocId", fetch = FetchType.LAZY)
    private List<OgTeam> ogTeamList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogNocId", fetch = FetchType.LAZY)
    private List<OgParticipant> ogParticipantList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogNocId", fetch = FetchType.LAZY)
    private List<OgNewNoc> ogNewNocList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogNocId", fetch = FetchType.LAZY)
    private List<OgPerson> ogPersonList;

    public OgNoc() {
    }

    public OgNoc(BigDecimal ogNocId) {
        this.ogNocId = ogNocId;
    }

    public BigDecimal getOgNocId() {
        return ogNocId;
    }

    public void setOgNocId(BigDecimal ogNocId) {
        this.ogNocId = ogNocId;
    }

    public String getNoc() {
        return noc;
    }

    public void setNoc(String noc) {
        this.noc = noc;
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
    public List<OgNewNoc> getOgNewNocList() {
        return ogNewNocList;
    }

    public void setOgNewNocList(List<OgNewNoc> ogNewNocList) {
        this.ogNewNocList = ogNewNocList;
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
        hash += (ogNocId != null ? ogNocId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgNoc)) {
            return false;
        }
        OgNoc other = (OgNoc) object;
        if ((this.ogNocId == null && other.ogNocId != null) || (this.ogNocId != null && !this.ogNocId.equals(other.ogNocId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgNoc[ ogNocId=" + ogNocId + " ]";
    }
    
}
