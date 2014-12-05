package sysman;

public class OgCategory {
    
    
    /****CLASS ATTRIBUTES****/
    
    
    /**
     * @attribute
     */
    Integer categoryId;

    /**
     * @attribute
     */
    String category;

    /****CONSTRUCTOR****/
    
    public OgCategory(Integer categoryId) {
        this.categoryId = categoryId;
        this.category = "";
    }

    

    /****SETTERS****/
    public void setCategory(String category) {
        this.category = category;
    }

    /****GETTERS****/
    
     public Integer getCategoryId() {
         return categoryId;
     }

     public String getCategory() {
         return category;
     }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgCategory)) {
            return false;
        }
        final OgCategory other = (OgCategory)object;
        if (!(categoryId == null ? other.categoryId == null : categoryId.equals(other.categoryId))) {
            return false;
        }
        if (!(category == null ? other.category == null : category.equals(other.category))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((categoryId == null) ? 0 : categoryId.hashCode());
        result = PRIME * result + ((category == null) ? 0 : category.hashCode());
        return result;
    }


    
}
