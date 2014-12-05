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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kurro
 */
@Entity
@Table(name = "OG_TEAM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgTeam.findAll", query = "SELECT o FROM OgTeam o"),
    @NamedQuery(name = "OgTeam.findByOgTeamId", query = "SELECT o FROM OgTeam o WHERE o.ogTeamId = :ogTeamId")})
public class OgTeam implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_TEAM_ID")
    private BigDecimal ogTeamId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogTeamId", fetch = FetchType.LAZY)
    private List<OgStatMatchPartic> ogStatMatchParticList;
    @JoinColumn(name = "OG_NOC_ID", referencedColumnName = "OG_NOC_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgNoc ogNocId;
    @JoinColumn(name = "OG_NATIONALITY_ID", referencedColumnName = "OG_NATIONALITY_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgNationality ogNationalityId;
    @JoinColumn(name = "ID_GROUP", referencedColumnName = "OG_GROUP_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgGroup idGroup;
    @JoinColumn(name = "OG_GENDER_ID", referencedColumnName = "OG_GENDER_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgGender ogGenderId;
    @JoinColumn(name = "OG_COLOUR_ID_HOME", referencedColumnName = "OG_COLOUR_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgColour ogColourIdHome;
    @JoinColumn(name = "OG_COLOUR_ID_AWAY", referencedColumnName = "OG_COLOUR_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OgColour ogColourIdAway;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ogTeamId", fetch = FetchType.LAZY)
    private OgStatisticTeam ogStatisticTeam;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogTeamId1", fetch = FetchType.LAZY)
    private List<OgMatch> ogMatchList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogTeamId", fetch = FetchType.LAZY)
    private List<OgMatch> ogMatchList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogTeam", fetch = FetchType.LAZY)
    private List<OgTeamPartic> ogTeamParticList;

    public OgTeam() {
    }

    public OgTeam(BigDecimal ogTeamId) {
        this.ogTeamId = ogTeamId;
    }

    public BigDecimal getOgTeamId() {
        return ogTeamId;
    }

    public void setOgTeamId(BigDecimal ogTeamId) {
        this.ogTeamId = ogTeamId;
    }

    @XmlTransient
    public List<OgStatMatchPartic> getOgStatMatchParticList() {
        return ogStatMatchParticList;
    }

    public void setOgStatMatchParticList(List<OgStatMatchPartic> ogStatMatchParticList) {
        this.ogStatMatchParticList = ogStatMatchParticList;
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

    public OgGroup getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(OgGroup idGroup) {
        this.idGroup = idGroup;
    }

    public OgGender getOgGenderId() {
        return ogGenderId;
    }

    public void setOgGenderId(OgGender ogGenderId) {
        this.ogGenderId = ogGenderId;
    }

    public OgColour getOgColourIdHome() {
        return ogColourIdHome;
    }

    public void setOgColourIdHome(OgColour ogColourIdHome) {
        this.ogColourIdHome = ogColourIdHome;
    }

    public OgColour getOgColourIdAway() {
        return ogColourIdAway;
    }

    public void setOgColourIdAway(OgColour ogColourIdAway) {
        this.ogColourIdAway = ogColourIdAway;
    }

    public OgStatisticTeam getOgStatisticTeam() {
        return ogStatisticTeam;
    }

    public void setOgStatisticTeam(OgStatisticTeam ogStatisticTeam) {
        this.ogStatisticTeam = ogStatisticTeam;
    }

    @XmlTransient
    public List<OgMatch> getOgMatchList() {
        return ogMatchList;
    }

    public void setOgMatchList(List<OgMatch> ogMatchList) {
        this.ogMatchList = ogMatchList;
    }

    @XmlTransient
    public List<OgMatch> getOgMatchList1() {
        return ogMatchList1;
    }

    public void setOgMatchList1(List<OgMatch> ogMatchList1) {
        this.ogMatchList1 = ogMatchList1;
    }

    @XmlTransient
    public List<OgTeamPartic> getOgTeamParticList() {
        return ogTeamParticList;
    }

    public void setOgTeamParticList(List<OgTeamPartic> ogTeamParticList) {
        this.ogTeamParticList = ogTeamParticList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogTeamId != null ? ogTeamId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgTeam)) {
            return false;
        }
        OgTeam other = (OgTeam) object;
        if ((this.ogTeamId == null && other.ogTeamId != null) || (this.ogTeamId != null && !this.ogTeamId.equals(other.ogTeamId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgTeam[ ogTeamId=" + ogTeamId + " ]";
    }
    
}
