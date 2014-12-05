package sysman;

public class OgColour {
    
    
    /****CLASS ATTRIBUTES****/
    
    
    
    
    /**
     * @attribute
     */
    Integer colourId;
    
    
    
    /**
     * @attribute
     */
    String colour;

    public OgColour(Integer colourId) {
        this.colourId = colourId;
        this.colour = "";
    }


    /****SETTERS****/

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    /****GETTERS****/
    public Integer getColourId() {
        return colourId;
    }


    public String getColour() {
        return colour;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgColour)) {
            return false;
        }
        final OgColour other = (OgColour)object;
        if (!(colourId == null ? other.colourId == null : colourId.equals(other.colourId))) {
            return false;
        }
        if (!(colour == null ? other.colour == null : colour.equals(other.colour))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((colourId == null) ? 0 : colourId.hashCode());
        result = PRIME * result + ((colour == null) ? 0 : colour.hashCode());
        return result;
    }
}
