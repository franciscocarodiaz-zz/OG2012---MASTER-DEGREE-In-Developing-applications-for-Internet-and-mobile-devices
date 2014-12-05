package sysman;

public class OgTeamPartic {
    
    
    /****CLASS ATTRIBUTES****/
    
    
    
    /**
     * @attribute
     */
    private OgTeam team;

    /**
     * @attribute
     */
    private OgParticipant partic;

    /**
     * @attribute
     */
    private Integer dorsal;

    public OgTeamPartic(OgTeam team, OgParticipant partic, Integer dorsal) {
        this.team = team;
        this.partic = partic;
        this.dorsal = dorsal;
        team.dorsalOfParticipant.add(this);
        partic.dorsalOfTeam = this;
    }


    /****SETTERS****/

    public void setTeam(OgTeam team) {
        this.team = team;
    }

    public void setPartic(OgParticipant partic) {
        this.partic = partic;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }
    
    /****GETTERS****/
    
    public OgTeam getTeam() {
        return team;
    }

    public OgParticipant getPartic() {
        return partic;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    
}
