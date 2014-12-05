package sysman;

public class OgStatisticTeam {
    
    
    /****CLASS ATTRIBUTES****/
    
    
    
    /**
     * @attribute
     */
    Integer statisticTeamId;
    
    
    /**
     * @attribute
     */
    Integer team;
    

    /**
     * @attribute
     */
    Integer nmatchEq;

    /**
     * @attribute
     */
    Integer gc;

    

    /**
     * @attribute
     */
    Integer nmatch;

    /**
     * @attribute
     */
    Integer nmatchWins;

    

    /**
     * @attribute
     */
    Integer gf;

    public OgStatisticTeam(OgTeam team, Integer nmatchEq, Integer gc, Integer nmatch,
                           Integer nmatchWins, Integer gf) {
        this.team = team;
        this.nmatchEq = nmatchEq;
        this.gc = gc;
        this.nmatch = nmatch;
        this.nmatchWins = nmatchWins;
        this.gf = gf;
    }


    /****SETTERS****/

    public void setTeam(OgTeam team) {
        this.team = team;
    }

    public void setNmatchEq(Integer nmatchEq) {
        this.nmatchEq = nmatchEq;
    }

    public void setGc(Integer gc) {
        this.gc = gc;
    }

    public void setNmatch(Integer nmatch) {
        this.nmatch = nmatch;
    }

    public void setNmatchWins(Integer nmatchWins) {
        this.nmatchWins = nmatchWins;
    }

    public void setGf(Integer gf) {
        this.gf = gf;
    }
    
    /****GETTERS****/
    
    public Integer getStatisticTeamId() {
        return statisticTeamId;
    }

    public OgTeam getTeam() {
        return team;
    }

    public Integer getNmatchEq() {
        return nmatchEq;
    }

    public Integer getGc() {
        return gc;
    }

    public Integer getNmatch() {
        return nmatch;
    }

    public Integer getNmatchWins() {
        return nmatchWins;
    }

    public Integer getGf() {
        return gf;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgStatisticTeam)) {
            return false;
        }
        final OgStatisticTeam other = (OgStatisticTeam)object;
        if (!(statisticTeamId == null ? other.statisticTeamId == null : statisticTeamId.equals(other.statisticTeamId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((statisticTeamId == null) ? 0 : statisticTeamId.hashCode());
        return result;
    }
}
