package sysman;

public class OgResult {
    
    
    /****CLASS ATTRIBUTES****/
    
    
    
    /**
     * @attribute
     */
    Integer resultId;
    

    /**
     * @attribute
     */
    Integer homeTeam;

    /**
     * @attribute
     */
    Integer awayTeam;


    /**
     * @attribute
     */
    Integer match;

    /**
     * @attribute
     */
    Integer resEt1Home;


    /**
     * @attribute
     */
    Integer resEt2Away;

    /**
     * @attribute
     */
    Integer res1Away;


    /**
     * @attribute
     */
    Integer resPenHome;

    /**
     * @attribute
     */
    Integer res2Home;

    /**
     * @attribute
     */
    Integer resEt1Away;

    

    /**
     * @attribute
     */
    Integer res2Away;

    /**
     * @attribute
     */
    Integer res1Home;

    /**
     * @attribute
     */
    Integer resTotalAway;

    /**
     * @attribute
     */
    Integer resTotalHome;

    /**
     * @attribute
     */
    Integer resEt2Home;

    /**
     * @attribute
     */
    Integer resPenAway;

    public OgResult(Integer resultId, OgTeam homeTeam, OgTeam awayTeam, OgMatch match, Integer resEt1Home,
                    Integer resEt2Away, Integer res1Away, Integer resPenHome, Integer res2Home, Integer resEt1Away,
                    Integer res2Away, Integer res1Home, Integer resTotalAway, Integer resTotalHome, Integer resEt2Home,
                    Integer resPenAway) {
        this.resultId = resultId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.match = match;
        this.resEt1Home = resEt1Home;
        this.resEt2Away = resEt2Away;
        this.res1Away = res1Away;
        this.resPenHome = resPenHome;
        this.res2Home = res2Home;
        this.resEt1Away = resEt1Away;
        this.res2Away = res2Away;
        this.res1Home = res1Home;
        this.resTotalAway = resTotalAway;
        this.resTotalHome = resTotalHome;
        this.resEt2Home = resEt2Home;
        this.resPenAway = resPenAway;
    }


    /****GETTERS****/
    
    

    public Integer getResultId() {
        return resultId;
    }

    public OgTeam getHomeTeam() {
        return homeTeam;
    }

    public OgTeam getAwayTeam() {
        return awayTeam;
    }

    public OgMatch getMatch() {
        return match;
    }

    public Integer getResEt1Home() {
        return resEt1Home;
    }

    public Integer getResEt2Away() {
        return resEt2Away;
    }

    public Integer getRes1Away() {
        return res1Away;
    }

    public Integer getResPenHome() {
        return resPenHome;
    }

    public Integer getRes2Home() {
        return res2Home;
    }

    public Integer getResEt1Away() {
        return resEt1Away;
    }

    public Integer getRes2Away() {
        return res2Away;
    }

    public Integer getRes1Home() {
        return res1Home;
    }

    public Integer getResTotalAway() {
        return resTotalAway;
    }

    public Integer getResTotalHome() {
        return resTotalHome;
    }

    public Integer getResEt2Home() {
        return resEt2Home;
    }

    public Integer getResPenAway() {
        return resPenAway;
    }





    /****SETTERS****/



    public void setHomeTeam(OgTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(OgTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setMatch(OgMatch match) {
        this.match = match;
    }

    public void setResEt1Home(Integer resEt1Home) {
        this.resEt1Home = resEt1Home;
    }

    public void setResEt2Away(Integer resEt2Away) {
        this.resEt2Away = resEt2Away;
    }

    public void setRes1Away(Integer res1Away) {
        this.res1Away = res1Away;
    }

    public void setResPenHome(Integer resPenHome) {
        this.resPenHome = resPenHome;
    }

    public void setRes2Home(Integer res2Home) {
        this.res2Home = res2Home;
    }

    public void setResEt1Away(Integer resEt1Away) {
        this.resEt1Away = resEt1Away;
    }

    public void setRes2Away(Integer res2Away) {
        this.res2Away = res2Away;
    }

    public void setRes1Home(Integer res1Home) {
        this.res1Home = res1Home;
    }

    public void setResTotalAway(Integer resTotalAway) {
        this.resTotalAway = resTotalAway;
    }

    public void setResTotalHome(Integer resTotalHome) {
        this.resTotalHome = resTotalHome;
    }

    public void setResEt2Home(Integer resEt2Home) {
        this.resEt2Home = resEt2Home;
    }

    public void setResPenAway(Integer resPenAway) {
        this.resPenAway = resPenAway;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgResult)) {
            return false;
        }
        final OgResult other = (OgResult)object;
        if (!(resultId == null ? other.resultId == null : resultId.equals(other.resultId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((resultId == null) ? 0 : resultId.hashCode());
        return result;
    }
}
