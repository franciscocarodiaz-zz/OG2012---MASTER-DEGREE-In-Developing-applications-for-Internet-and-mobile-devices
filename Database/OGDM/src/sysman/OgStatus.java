package sysman;

public class OgStatus {
    
    
    /****CLASS ATTRIBUTES****/
    
    
    
    /**
     * @attribute
     */
    Integer statusId;

    /**
     * @attribute
     */
    String status;

    public OgStatus(Integer statusId) {
        super();
        this.statusId = statusId;
        this.status = "";
    }


    /****SETTERS****/
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    /****GETTERS****/
    public Integer getStatusId() {
        return statusId;
    }

    public String getStatus() {
        return status;
    }

    
}
