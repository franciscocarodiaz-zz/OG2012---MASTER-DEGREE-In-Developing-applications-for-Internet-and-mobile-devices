package sysman;

public class OgAction {
    
    
    
    /****CLASS ATTRIBUTES****/
    
    
    
    
    /**
     * @attribute
     *     @Id
     *     @Column(name="ACTION_ID", nullable = false)
     */
    private Integer actionId;
    
    
    
    /**
     * @attribute
     */
    private String action;

    /****CONSTRUCTOR****/
     
    public OgAction(Integer actionId) {
        this.actionId = actionId;
        this.action = "";
    }


    /****SETTERS****/

    public void setAction(String action) {
        this.action = action;
    }
    
    /****GETTERS****/
    
     public Integer getActionId() {
         return actionId;
     }


     public String getAction() {
         return action;
     }
    
    
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgAction)) {
            return false;
        }
        final OgAction other = (OgAction)object;
        if (!(actionId == null ? other.actionId == null : actionId.equals(other.actionId))) {
            return false;
        }
        if (!(action == null ? other.action == null : action.equals(other.action))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((actionId == null) ? 0 : actionId.hashCode());
        result = PRIME * result + ((action == null) ? 0 : action.hashCode());
        return result;
    }

}
