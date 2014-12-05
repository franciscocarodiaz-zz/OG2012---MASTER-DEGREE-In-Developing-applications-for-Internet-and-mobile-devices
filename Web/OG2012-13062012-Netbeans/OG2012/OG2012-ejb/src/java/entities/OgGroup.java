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
@Table(name = "OG_GROUP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgGroup.findAll", query = "SELECT o FROM OgGroup o"),
    @NamedQuery(name = "OgGroup.findByOgGroupId", query = "SELECT o FROM OgGroup o WHERE o.ogGroupId = :ogGroupId"),
    @NamedQuery(name = "OgGroup.findByGroupname", query = "SELECT o FROM OgGroup o WHERE o.groupname = :groupname"),
    @NamedQuery(name = "OgGroup.findByOgTeamId", query = "SELECT o FROM OgGroup o WHERE o.ogTeamId = :ogTeamId"),
    @NamedQuery(name = "OgGroup.findByOgTeamId1", query = "SELECT o FROM OgGroup o WHERE o.ogTeamId1 = :ogTeamId1"),
    @NamedQuery(name = "OgGroup.findByOgTeamId2", query = "SELECT o FROM OgGroup o WHERE o.ogTeamId2 = :ogTeamId2"),
    @NamedQuery(name = "OgGroup.findByOgTeamId3", query = "SELECT o FROM OgGroup o WHERE o.ogTeamId3 = :ogTeamId3")})
public class OgGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_GROUP_ID")
    private BigDecimal ogGroupId;
    @Size(max = 20)
    @Column(name = "GROUPNAME")
    private String groupname;
    @Size(max = 20)
    @Column(name = "OG_TEAM_ID")
    private String ogTeamId;
    @Size(max = 20)
    @Column(name = "OG_TEAM_ID1")
    private String ogTeamId1;
    @Size(max = 20)
    @Column(name = "OG_TEAM_ID2")
    private String ogTeamId2;
    @Size(max = 20)
    @Column(name = "OG_TEAM_ID3")
    private String ogTeamId3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGroup", fetch = FetchType.LAZY)
    private List<OgTeam> ogTeamList;

    public OgGroup() {
    }

    public OgGroup(BigDecimal ogGroupId) {
        this.ogGroupId = ogGroupId;
    }

    public BigDecimal getOgGroupId() {
        return ogGroupId;
    }

    public void setOgGroupId(BigDecimal ogGroupId) {
        this.ogGroupId = ogGroupId;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getOgTeamId() {
        return ogTeamId;
    }

    public void setOgTeamId(String ogTeamId) {
        this.ogTeamId = ogTeamId;
    }

    public String getOgTeamId1() {
        return ogTeamId1;
    }

    public void setOgTeamId1(String ogTeamId1) {
        this.ogTeamId1 = ogTeamId1;
    }

    public String getOgTeamId2() {
        return ogTeamId2;
    }

    public void setOgTeamId2(String ogTeamId2) {
        this.ogTeamId2 = ogTeamId2;
    }

    public String getOgTeamId3() {
        return ogTeamId3;
    }

    public void setOgTeamId3(String ogTeamId3) {
        this.ogTeamId3 = ogTeamId3;
    }

    @XmlTransient
    public List<OgTeam> getOgTeamList() {
        return ogTeamList;
    }

    public void setOgTeamList(List<OgTeam> ogTeamList) {
        this.ogTeamList = ogTeamList;
        for (OgTeam o: ogTeamList){
            if(!ogTeamId.equals(null))
                ogTeamId = o.getOgNationalityId().getNationality();
            else if(!ogTeamId1.equals(null)){
                ogTeamId1 = o.getOgNationalityId().getNationality();
            }
            else if(!ogTeamId2.equals(null)){
                ogTeamId2 = o.getOgNationalityId().getNationality();
            }
            else if(!ogTeamId3.equals(null)){
                ogTeamId3 = o.getOgNationalityId().getNationality();
            } 
        }
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogGroupId != null ? ogGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgGroup)) {
            return false;
        }
        OgGroup other = (OgGroup) object;
        if ((this.ogGroupId == null && other.ogGroupId != null) || (this.ogGroupId != null && !this.ogGroupId.equals(other.ogGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgGroup[ ogGroupId=" + ogGroupId + " ]";
    }
    
}
