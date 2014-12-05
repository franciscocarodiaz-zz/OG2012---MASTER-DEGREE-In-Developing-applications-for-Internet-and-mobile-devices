package sysman;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class OgMatch {


    /****CLASS ATTRIBUTES****/
    OgStatMatchPartic statOfMatch;

    /**
     * @attribute
     */
    String enddate;

    /**
     * @attribute
     */
    Integer matchId;

    /**
     * @attribute
     */
    Integer stadium;

    /**
     * @attribute
     */
    Integer team1;

    /**
     * @attribute
     */
    Integer team2;
    
    /**
     * @attribute
     */
    private Set<OgTeam> teams;
    
    /**
     * @attribute
     */
    Integer referee;

    /**
     * @attribute
     */
    Integer phase;

    /**
     * @attribute
     */
    String startdate;
    
    /**
     * @attribute
     */
    private Date endDate;

    /**
     * @attribute
     */
    Integer medal;

    /**
     * @attribute
     */
    Integer status;

    /**
     * @attribute
     */
    String winner;
    

    public OgMatch(Integer matchId, OgStadium stadium, OgTeam team1, OgTeam team2, OgReferee referee, OgPhase phase,
                   Date startdate, OgMedal medal, OgStatus status, OgTeam winner) {
        this.matchId = matchId;
        this.stadium = stadium;
        this.team1 = team1;
        this.team2 = team2;
        this.referee = referee;
        this.phase = phase;
        this.startdate = startdate;
        this.medal = medal;
        this.status = status;
        this.winner = winner;
        this.teams = new HashSet<OgTeam>();
        teams.add(team1);
        teams.add(team2);
    }
    
    public void addOgTeam ( OgTeam t ){
        boolean added = false;
        if(team1==null || team1==t && status.getStatus() == "Schedule"){
            team1 = t;
            added = true;
            }
        else if(team2==null || team2==t && status.getStatus() == "Schedule"){
            team2 = t;
            added = true;
            }
        if(added){
            teams.add (t);
            t.addOgMatch (this);
            }
        }
    public void removeOgTeam (OgTeam t){
        boolean removed = false;
        if(team1==t && status.getStatus() != "Running")
                setTeam1(null);
            else if(team1==t && status.getStatus() != "Running")
                setTeam2(null);
        teams.remove (t);
        t.removeOgMatch(this);
        }

    /****GETTERS****/


    public Integer getMatchId() {
        return matchId;
    }

    public OgStadium getStadium() {
        return stadium;
    }

    public OgTeam getTeam1() {
        return team1;
    }

    public OgReferee getReferee() {
        return referee;
    }

    public OgPhase getPhase() {
        return phase;
    }

    public Date getEndDate() {
        return endDate;
    }

    public OgMedal getMedal() {
        return medal;
    }

    public OgTeam getTeam2() {
        return team2;
    }

    public Date getStartdate() {
        return startdate;
    }

    public OgStatus getStatus() {
        return status;
    }

    public OgTeam getWinner() {
        return winner;
    }







    /****SETTERS****/


    public void setStadium(OgStadium newStadium) {
        if (stadium != newStadium) {
            OgStadium oldStadium = stadium;
            stadium = newStadium;
            if (newStadium != null)
                newStadium.addMatch(this);
            if (oldStadium != null )
                oldStadium.removeMatch(this);
            }
        }

    public void setTeam1(OgTeam team1) {
        this.team1 = team1;
    }

    public void setReferee(OgReferee referee) {
        this.referee = referee;
    }

    public void setPhase(OgPhase phase) {
        this.phase = phase;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setMedal(OgMedal medal) {
        this.medal = medal;
    }

    public void setTeam2(OgTeam team2) {
        this.team2 = team2;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public void setStatus(OgStatus status) {
        this.status = status;
    }

    public void setWinner(OgTeam winner) {
        this.winner = winner;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgMatch)) {
            return false;
        }
        final OgMatch other = (OgMatch)object;
        if (!(matchId == null ? other.matchId == null : matchId.equals(other.matchId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((matchId == null) ? 0 : matchId.hashCode());
        return result;
    }

    public OgStatMatchPartic getStatOfMatch() {
        return statOfMatch;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public void setTeams(Set<OgTeam> teams) {
        this.teams = teams;
    }

    public Set<OgTeam> getTeams() {
        return teams;
    }
}
