package sysman;

import java.util.HashSet;
import java.util.Set;

public class OgStadium {
    
    
    
    /****CLASS ATTRIBUTES****/
    
    
    
    /**
     * @attribute
     */
    Integer stadiumId;

    /**
     * @attribute
     */
    String name;

    /**
     * @attribute
     */
    String capacity;
    
    /**
     * @attribute
     */
    private Set<OgMatch> matchs;

    public OgStadium(Integer stadiumId, String name, Integer capacity) {
        super();
        this.stadiumId = stadiumId;
        this.name = name;
        this.capacity = capacity;
        matchs = new HashSet<OgMatch>();
    }

    public void addMatch ( OgMatch match ){
               matchs.add (match);
               match.setStadium(this);
         }
    public void removeMatch (OgMatch match){
               matchs.remove (match);
               match.setStadium(null);
         }

    /****SETTERS****/

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /****GETTERS****/
    public Integer getStadiumId() {
        return stadiumId;
    }

    public String getName() {
        return name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgStadium)) {
            return false;
        }
        final OgStadium other = (OgStadium)object;
        if (!(stadiumId == null ? other.stadiumId == null : stadiumId.equals(other.stadiumId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((stadiumId == null) ? 0 : stadiumId.hashCode());
        return result;
    }
}
