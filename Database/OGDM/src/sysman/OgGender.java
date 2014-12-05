package sysman;

public class OgGender {
    
    
    /****CLASS ATTRIBUTES****/
    
    
    
    /**
     * @attribute
     */
    Integer genderId;

    /**
     * @attribute
     */
    String gender;

    public OgGender(Integer genderId) {
        this.genderId = genderId;
        this.gender = "";
    }


    /****SETTERS****/

    public void setGender(String gender) {
        this.gender = gender;
    }

    /****GETTERS****/
    public Integer getGenderId() {
        return genderId;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgGender)) {
            return false;
        }
        final OgGender other = (OgGender)object;
        if (!(genderId == null ? other.genderId == null : genderId.equals(other.genderId))) {
            return false;
        }
        if (!(gender == null ? other.gender == null : gender.equals(other.gender))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((genderId == null) ? 0 : genderId.hashCode());
        result = PRIME * result + ((gender == null) ? 0 : gender.hashCode());
        return result;
    }
}
