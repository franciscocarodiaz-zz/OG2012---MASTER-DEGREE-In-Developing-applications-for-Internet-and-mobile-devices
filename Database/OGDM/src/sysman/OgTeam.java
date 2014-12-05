package sysman;

import java.util.HashSet;
import java.util.Set;

public class OgTeam {


    /****CLASS ATTRIBUTES****/
    public Set<OgTeamPartic> dorsalOfParticipant;

    /**
     * @attribute
     */
    private Integer teamId;

    /**
     * @attribute
     */
    private Integer nationality;

    /**
     * @attribute
     */
    private Integer noc;

    /**
     * @attribute
     */
    private OgColour homeColour;

    /**
     * @attribute
     */
    private OgColour awayColour;

    /**
     * @attribute
     */
    private OgGender gender;

    /**
     * @attribute
     */
    private Set<OgMatch> matchs;
    
    /**
     * @attribute
     */
    private OgGroup group;
    
    /**
     * @attribute
     */
    public OgStatisticTeam statisticTeam;
    
    /**
     * @attribute
     */
    public Set<OgStatMatchPartic> statOfMatchPartic;

    public OgTeam(Integer teamId, Integer nationality, Integer noc, OgColour homeColour,
                  OgColour awayColour, OgGender gender, OgGroup group) {
        this.teamId = teamId;
        this.nationality = nationality;
        this.noc = noc;
        this.homeColour = homeColour;
        this.awayColour = awayColour;
        this.gender = gender;
        this.group = group;
        this.matchs = new HashSet<OgMatch>();
        dorsalOfParticipant = new HashSet<OgTeamPartic>();
        statisticTeam = new OgStatisticTeam(this,0,0,0,0,0);
        statOfMatchPartic = new HashSet<OgStatMatchPartic>();
    }


    /****SETTERS****/

    public void setNationality(Integer nationality) {
        this.nationality = nationality;
    }

    public void setNoc(Integer noc) {
        this.noc = noc;
    }

    public void setHomeColour(OgColour homeColour) {
        this.homeColour = homeColour;
    }

    public void setAwayColour(OgColour awayColour) {
        this.awayColour = awayColour;
    }

    public void setGender(OgGender gender) {
        this.gender = gender;
    }
    
    /****GETTERS****/
    public Integer getTeamId() {
        return teamId;
    }

    public Integer getNationality() {
        return nationality;
    }

    public Integer getNoc() {
        return noc;
    }

    public OgColour getHomeColour() {
        return homeColour;
    }

    public OgColour getAwayColour() {
        return awayColour;
    }

    public OgGender getGender() {
        return gender;
    }


    void setOgGroup(OgGroup newGroup) {
        if (group.equals(newGroup)) {
                           OgGroup old = group;
                           group = newGroup;
                           if (newGroup != null)
                              newGroup.addOgTeam(this);
                           if (old != null )
                              old.removeOgTeam(this);
             }

    }

    void addOgMatch(OgMatch ogMatch) {
        matchs.add(ogMatch);
    }

    void removeOgMatch(OgMatch ogMatch) {
        matchs.remove(ogMatch);
    }

    public void setMatchs(Set<OgMatch> matchs) {
        this.matchs = matchs;
    }

    public Set<OgMatch> getMatchs() {
        return matchs;
    }

    public void setDorsalOfParticipant(Set<OgTeamPartic> dorsalOfParticipant) {
        this.dorsalOfParticipant = dorsalOfParticipant;
    }

    public Set<OgTeamPartic> getDorsalOfParticipant() {
        return dorsalOfParticipant;
    }

    public void setGroup(OgGroup group) {
        this.group = group;
    }

    public OgGroup getGroup() {
        return group;
    }

    public void setStatisticTeam(OgStatisticTeam statisticTeam) {
        this.statisticTeam = statisticTeam;
    }

    public OgStatisticTeam getStatisticTeam() {
        return statisticTeam;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }


    public Set<OgStatMatchPartic> getStatOfMatchPartic() {
        return statOfMatchPartic;
    }
}
