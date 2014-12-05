package sysman;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class OgNew {
    
    
    
    /****CLASS ATTRIBUTES****/
    
    
    
    /**
     * @attribute
     */
    Integer newId;
    
    
    /**
     * @attribute
     */
    String title;
    
    
    
    /**
     * @attribute
     */
    String header;

    /**
     * @attribute
     */
    String content;

    /**
     * @attribute
     */
    String img;


    /**
     * @attribute
     */
    String dateHour;
    
    /**
     * @attribute
     */
    public Set<OgNewNoc> nocs;
    
    public OgNew(Integer newId, String title, String header, String content, String img, Date dateHour) {
        super();
        this.newId = newId;
        this.title = title;
        this.header = header;
        this.content = content;
        this.img = img;
        this.dateHour = dateHour;
        nocs = new HashSet<OgNewNoc>();
    }
    
    
    
    /****SETTERS****/


    public void setTitle(String title) {
        this.title = title;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setDateHour(Date dateHour) {
        this.dateHour = dateHour;
    }


    /****GETTERS****/
    
     public Integer getNewId() {
         return newId;
     }

     public String getTitle() {
         return title;
     }

     public String getHeader() {
         return header;
     }

     public String getContent() {
         return content;
     }

     public String getImg() {
         return img;
     }

     public Date getDateHour() {
         return dateHour;
     }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgNew)) {
            return false;
        }
        final OgNew other = (OgNew)object;
        if (!(newId == null ? other.newId == null : newId.equals(other.newId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((newId == null) ? 0 : newId.hashCode());
        return result;
    }

    public void setNocs(Set<OgNewNoc> nocs) {
        this.nocs = nocs;
    }

    public Set<OgNewNoc> getNocs() {
        return nocs;
    }
/*
    public void addNoc(OgNoc noc) {
        this.nocs.add(noc);
    }
    public void removeNoc(OgNoc noc) {
        this.nocs.remove(noc);
    }
    */
}
