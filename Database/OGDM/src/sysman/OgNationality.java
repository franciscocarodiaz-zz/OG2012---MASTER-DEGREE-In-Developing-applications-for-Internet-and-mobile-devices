package sysman;

public class OgNationality {
    
    
    /****CLASS ATTRIBUTES****/
    
    
    
    
    /**
     * @attribute
     */
    Integer nationalityId;
    
    
    
    
    /**
     * @attribute
     */
    String nationality;

    public OgNationality(Integer nationalityId) {
        super();
        this.nationalityId = nationalityId;
        this.nationality = "";
    }


    /****SETTERS****/

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /****GETTERS****/
    public Integer getNationalityId() {
        return nationalityId;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgNationality)) {
            return false;
        }
        final OgNationality other = (OgNationality)object;
        if (!(nationalityId == null ? other.nationalityId == null : nationalityId.equals(other.nationalityId))) {
            return false;
        }
        if (!(nationality == null ? other.nationality == null : nationality.equals(other.nationality))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((nationalityId == null) ? 0 : nationalityId.hashCode());
        result = PRIME * result + ((nationality == null) ? 0 : nationality.hashCode());
        return result;
    }
}
