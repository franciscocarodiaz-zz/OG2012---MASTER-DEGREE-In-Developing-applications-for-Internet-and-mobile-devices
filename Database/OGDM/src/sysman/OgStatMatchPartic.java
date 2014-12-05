package sysman;

public class OgStatMatchPartic {
    
    
    /****CLASS ATTRIBUTES****/
    
    /**
    * @attribute
    */
    private Integer statId;
    
    
    /**
     * @attribute
     */
    private OgParticipant partic;
    

    /**
     * @attribute
     */
    private OgMatch match;

    /**
    
    
    
    
    
    
    

    /**
     * @attribute
     */
    private OgTeam team;

    /**
     * @attribute
     */
    private OgAction action;

    /**
     * @attribute
     */
    private Integer minute;

    public OgStatMatchPartic(OgParticipant partic, OgMatch match, OgTeam team, OgAction action,
                             Integer minute) {
        this.partic = partic;
        this.match = match;
        this.team = team;
        this.action = action;
        this.minute = minute;
        team.statOfMatchPartic.add(this);
        match.statOfMatch = this;
    }


    /****SETTERS****/

    
    public void setPartic(OgParticipant partic) {
        this.partic = partic;
    }

    public void setMatch(OgMatch match) {
        this.match = match;
    }

    public void setTeam(OgTeam team) {
        this.team = team;
    }

    public void setAction(OgAction action) {
        this.action = action;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }


    /****GETTERS****/
    public Integer getStatId() {
        return statId;
    }

    public OgParticipant getPartic() {
        return partic;
    }

    public OgMatch getMatch() {
        return match;
    }

    public OgTeam getTeam() {
        return team;
    }

    public OgAction getAction() {
        return action;
    }

    public Integer getMinute() {
        return minute;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgStatMatchPartic)) {
            return false;
        }
        final OgStatMatchPartic other = (OgStatMatchPartic)object;
        if (!(statId == null ? other.statId == null : statId.equals(other.statId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((statId == null) ? 0 : statId.hashCode());
        return result;
    }
}
