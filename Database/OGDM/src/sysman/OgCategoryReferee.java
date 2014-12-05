package sysman;

public class OgCategoryReferee {
    
    
    /****CLASS ATTRIBUTES****/
    
    
    
    /**
     * @attribute
     */
    Integer categoryRefereeId;

    /**
     * @attribute
     */
    String categoryReferee;

    public OgCategoryReferee(Integer categoryRefereeId) {
        this.categoryRefereeId = categoryRefereeId;
        this.categoryReferee = "";
    }


    /****SETTERS****/

    public void setCategoryReferee(String categoryReferee) {
        this.categoryReferee = categoryReferee;
    }

    /****GETTERS****/
    
    public Integer getCategoryRefereeId() {
        return categoryRefereeId;
    }

    public String getCategoryReferee() {
        return categoryReferee;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgCategoryReferee)) {
            return false;
        }
        final OgCategoryReferee other = (OgCategoryReferee)object;
        if (!(categoryRefereeId == null ? other.categoryRefereeId == null : categoryRefereeId.equals(other.categoryRefereeId))) {
            return false;
        }
        if (!(categoryReferee == null ? other.categoryReferee == null : categoryReferee.equals(other.categoryReferee))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((categoryRefereeId == null) ? 0 : categoryRefereeId.hashCode());
        result = PRIME * result + ((categoryReferee == null) ? 0 : categoryReferee.hashCode());
        return result;
    }
}
