package sysman;

import java.util.HashSet;
import java.util.Set;

public class OgGroup {
    
    
    /****CLASS ATTRIBUTES****/
    
  
  
    /**
     * @attribute
     */
    private String groupname;

    

    /**
     * @attribute
     */
    private Integer groupId;
  
  

    /**
     * @attribute
     */
    private OgTeam idTeam1;  
    
    
    /**
     * @attribute
     */
    private OgTeam idTeam2;

    
    
    /**
     * @attribute
     */
    private OgTeam idTeam3;
    
    
    /**
     * @attribute
     */
    private OgTeam idTeam4;
    
    /**
     * @attribute
     */
    private Set<OgTeam> teams;
    
    public OgGroup(String groupname, Integer groupId, OgTeam idTeam1, OgTeam idTeam2, OgTeam idTeam3, OgTeam idTeam4) {
        this.groupname = groupname;
        this.groupId = groupId;
        this.idTeam1 = idTeam1;
        this.idTeam2 = idTeam2;
        this.idTeam3 = idTeam3;
        this.idTeam4 = idTeam4;
        teams = new HashSet<OgTeam>( );
        teams.add(idTeam1);
        teams.add(idTeam2);
        teams.add(idTeam3);
        teams.add(idTeam4);
    }
    
    public void addOgTeam ( OgTeam t ){
        boolean added = false;
        if(teams.size()<4){
            if(idTeam1==null){idTeam1=t;added = true;}
            else if(idTeam2==null){idTeam2=t;added = true;}
            else if(idTeam3==null){idTeam3=t;added = true;}
            else if(idTeam4==null){idTeam4=t;added = true;}
            if(!added){
                teams.add (t);
                t.setOgGroup (this);
                }
            }
        }
    public void removeOgTeam (OgTeam t){
        boolean removed = false;
        if(teams.contains(t)){
            teams.remove (t);
            t.setOgGroup (null);
            removed = true;
            }
        }

    
    /****SETTERS****/
    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
    public void setIdTeam1(OgTeam idTeam1) {
        this.idTeam1 = idTeam1;
    }

    public void setIdTeam2(OgTeam idTeam2) {
        this.idTeam2 = idTeam2;
    }

    public void setIdTeam3(OgTeam idTeam3) {
        this.idTeam3 = idTeam3;
    }

    public void setIdTeam4(OgTeam idTeam4) {
        this.idTeam4 = idTeam4;
    }
    
    /****GETTERS****/
    

    public String getGroupname() {
        return groupname;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public OgTeam getIdTeam1() {
        return idTeam1;
    }

    public OgTeam getIdTeam2() {
        return idTeam2;
    }

    public OgTeam getIdTeam3() {
        return idTeam3;
    }

    public OgTeam getIdTeam4() {
        return idTeam4;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgGroup)) {
            return false;
        }
        final OgGroup other = (OgGroup)object;
        if (!(groupname == null ? other.groupname == null : groupname.equals(other.groupname))) {
            return false;
        }
        if (!(groupId == null ? other.groupId == null : groupId.equals(other.groupId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((groupname == null) ? 0 : groupname.hashCode());
        result = PRIME * result + ((groupId == null) ? 0 : groupId.hashCode());
        return result;
    }

    public void setTeams(Set teams) {
        this.teams = teams;
    }

    public Set getTeams() {
        return teams;
    }
}
