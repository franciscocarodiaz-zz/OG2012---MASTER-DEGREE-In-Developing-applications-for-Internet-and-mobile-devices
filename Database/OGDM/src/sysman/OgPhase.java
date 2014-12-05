package sysman;

public class OgPhase {
    
    
    /****CLASS ATTRIBUTES****/
    
    
    
    /**
     * @attribute
     */
    Integer phaseId;
    
    
    /**
     * @attribute
     */
    String phase;

    public OgPhase(Integer phaseId) {
        super();
        this.phaseId = phaseId;
        this.phase = "";
    }


    /****SETTERS****/

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /****GETTERS****/
    public Integer getPhaseId() {
        return phaseId;
    }

    public String getPhase() {
        return phase;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgPhase)) {
            return false;
        }
        final OgPhase other = (OgPhase)object;
        if (!(phaseId == null ? other.phaseId == null : phaseId.equals(other.phaseId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((phaseId == null) ? 0 : phaseId.hashCode());
        return result;
    }
}
