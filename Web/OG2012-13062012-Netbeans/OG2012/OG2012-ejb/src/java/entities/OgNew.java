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
@Table(name = "OG_NEW")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OgNew.findAll", query = "SELECT o FROM OgNew o"),
    @NamedQuery(name = "OgNew.findByOgNewId", query = "SELECT o FROM OgNew o WHERE o.ogNewId = :ogNewId"),
    @NamedQuery(name = "OgNew.findByTitle", query = "SELECT o FROM OgNew o WHERE o.title = :title"),
    @NamedQuery(name = "OgNew.findByHeader", query = "SELECT o FROM OgNew o WHERE o.header = :header"),
    @NamedQuery(name = "OgNew.findByContent", query = "SELECT o FROM OgNew o WHERE o.content = :content"),
    @NamedQuery(name = "OgNew.findByDateHour", query = "SELECT o FROM OgNew o WHERE o.dateHour = :dateHour"),
    @NamedQuery(name = "OgNew.findByImg", query = "SELECT o FROM OgNew o WHERE o.img = :img")})
public class OgNew implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OG_NEW_ID")
    private BigDecimal ogNewId;
    @Size(max = 20)
    @Column(name = "TITLE")
    private String title;
    @Size(max = 20)
    @Column(name = "HEADER")
    private String header;
    @Size(max = 20)
    @Column(name = "CONTENT")
    private String content;
    @Size(max = 20)
    @Column(name = "DATE_HOUR")
    private String dateHour;
    @Size(max = 20)
    @Column(name = "IMG")
    private String img;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ogNewId", fetch = FetchType.LAZY)
    private List<OgNewNoc> ogNewNocList;

    public OgNew() {
    }

    public OgNew(BigDecimal ogNewId) {
        this.ogNewId = ogNewId;
    }

    public BigDecimal getOgNewId() {
        return ogNewId;
    }

    public void setOgNewId(BigDecimal ogNewId) {
        this.ogNewId = ogNewId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateHour() {
        return dateHour;
    }

    public void setDateHour(String dateHour) {
        this.dateHour = dateHour;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @XmlTransient
    public List<OgNewNoc> getOgNewNocList() {
        return ogNewNocList;
    }

    public void setOgNewNocList(List<OgNewNoc> ogNewNocList) {
        this.ogNewNocList = ogNewNocList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ogNewId != null ? ogNewId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OgNew)) {
            return false;
        }
        OgNew other = (OgNew) object;
        if ((this.ogNewId == null && other.ogNewId != null) || (this.ogNewId != null && !this.ogNewId.equals(other.ogNewId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.OgNew[ ogNewId=" + ogNewId + " ]";
    }
    
}
