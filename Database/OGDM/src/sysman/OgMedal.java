package sysman;

public class OgMedal {
    
    
    /****CLASS ATTRIBUTES****/
    
    
    
    /**
     * @attribute
     */
    private Integer medalId;

    /**
     * @attribute
     */
    private String medal;

    public OgMedal(Integer medalId) {
        super();
        this.medalId = medalId;
        this.medal = "";
    }


    /****SETTERS****/

    public void setMedal(String medal) {
        this.medal = medal;
    }

    /****GETTERS****/
    
    public Integer getMedalId() {
        return medalId;
    }

    public String getMedal() {
        return medal;
    }
}
