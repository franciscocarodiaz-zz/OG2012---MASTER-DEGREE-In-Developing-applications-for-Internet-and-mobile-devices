package sysman;

import java.util.HashSet;
import java.util.Set;

public class OgNoc {


    /****CLASS ATTRIBUTES****/
    public Set<OgNewNoc> idOfNews;

    /**
     * @attribute
     */
    Integer nocId;
    
    
    
    
    /**
     * @attribute
     */
    String noc;

    public OgNoc(Integer nocId) {
        super();
        this.nocId = nocId;
        this.noc = "";
        idOfNews = new HashSet<OgNewNoc>();
    }


    /****SETTERS****/
    
    public void setNoc(String noc) {
        this.noc = noc;
    }
    
    /****GETTERS****/
    public Integer getNocId() {
        return nocId;
    }

    public String getNoc() {
        return noc;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgNoc)) {
            return false;
        }
        final OgNoc other = (OgNoc)object;
        if (!(nocId == null ? other.nocId == null : nocId.equals(other.nocId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((nocId == null) ? 0 : nocId.hashCode());
        return result;
    }

    public void setIdOfNews(Set<OgNewNoc> idOfNews) {
        this.idOfNews = idOfNews;
    }

    public Set<OgNewNoc> getIdOfNews() {
        return idOfNews;
    }
    
}
