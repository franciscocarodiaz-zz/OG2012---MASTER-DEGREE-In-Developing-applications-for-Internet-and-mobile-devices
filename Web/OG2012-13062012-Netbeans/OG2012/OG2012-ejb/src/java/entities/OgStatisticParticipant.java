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
@Table(name = "OG_STATISTIC_PARTICIPANT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgStatisticParticipant.findAll", query = "SELECT o FROM OgStatisticParticipant o"),
    @NamedQuery(name = "OgStatisticParticipant.findByOgStatisticParticipantId", query = "SELECT o FROM OgStatisticParticipant o WHERE o.ogStatisticParticipantId = :ogStatisticParticipantId"),
    @NamedQuery(name = "OgStatisticParticipant.findByPj", query = "SELECT o FROM OgStatisticParticipant o WHERE o.pj = :pj"),
    @NamedQuery(name = "OgStatisticParticipant.findByTit", query = "SELECT o FROM OgStatisticParticipant o WHERE o.tit = :tit"),
    @NamedQuery(name = "OgStatisticParticipant.findByMjug", query = "SELECT o FROM OgStatisticParticipant o WHERE o.mjug = :mjug"),
    @NamedQuery(name = "OgStatisticParticipant.findByG", query = "SELECT o FROM OgStatisticParticipant o WHERE o.g = :g"),
    @NamedQuery(name = "OgStatisticParticipant.findByAsist", query = "SELECT o FROM OgStatisticParticipant o WHERE o.asist = :asist"),
    @NamedQuery(name = "OgStatisticParticipant.findByFc", query = "SELECT o FROM OgStatisticParticipant o WHERE o.fc = :fc"),
    @NamedQuery(name = "OgStatisticParticipant.findByFs", query = "SELECT o FROM OgStatisticParticipant o WHERE o.fs = :fs")})
public class OgStatisticParticipant implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_STATISTIC_PARTICIPANT_ID")
    private BigDecimal ogStatisticParticipantId;
    @Size(max = 20)
    @Column(name = "PJ")
    private String pj;
    @Size(max = 20)
    @Column(name = "TIT")
    private String tit;
    @Size(max = 20)
    @Column(name = "MJUG")
    private String mjug;
    @Size(max = 20)
    @Column(name = "G")
    private String g;
    @Size(max = 20)
    @Column(name = "ASIST")
    private String asist;
    @Size(max = 20)
    @Column(name = "FC")
    private String fc;
    @Size(max = 20)
    @Column(name = "FS")
    private String fs;
    @JoinColumn(name = "OG_PARTICIPANT_ID", referencedColumnName = "OG_PARTICIPANT_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private OgParticipant ogParticipantId;

    public OgStatisticParticipant() {
    }

    public OgStatisticParticipant(BigDecimal ogStatisticParticipantId) {
        this.ogStatisticParticipantId = ogStatisticParticipantId;
    }

    public BigDecimal getOgStatisticParticipantId() {
        return ogStatisticParticipantId;
    }

    public void setOgStatisticParticipantId(BigDecimal ogStatisticParticipantId) {
        this.ogStatisticParticipantId = ogStatisticParticipantId;
    }

    public String getPj() {
        return pj;
    }

    public void setPj(String pj) {
        this.pj = pj;
    }

    public String getTit() {
        return tit;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }

    public String getMjug() {
        return mjug;
    }

    public void setMjug(String mjug) {
        this.mjug = mjug;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    public String getAsist() {
        return asist;
    }

    public void setAsist(String asist) {
        this.asist = asist;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public String getFs() {
        return fs;
    }

    public void setFs(String fs) {
        this.fs = fs;
    }

    public OgParticipant getOgParticipantId() {
        return ogParticipantId;
    }

    public void setOgParticipantId(OgParticipant ogParticipantId) {
        this.ogParticipantId = ogParticipantId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogStatisticParticipantId != null ? ogStatisticParticipantId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgStatisticParticipant)) {
            return false;
        }
        OgStatisticParticipant other = (OgStatisticParticipant) object;
        if ((this.ogStatisticParticipantId == null && other.ogStatisticParticipantId != null) || (this.ogStatisticParticipantId != null && !this.ogStatisticParticipantId.equals(other.ogStatisticParticipantId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgStatisticParticipant[ ogStatisticParticipantId=" + ogStatisticParticipantId + " ]";
    }
    
}
