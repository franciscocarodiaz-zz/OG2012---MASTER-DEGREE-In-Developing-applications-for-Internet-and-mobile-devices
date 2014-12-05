package sysman;

import java.util.Set;

public class OgMedalStanding {
    
    
    /****CLASS ATTRIBUTES****/
    
    
    
    /**
     * @attribute
     */
    private Integer medalStandingId;
    
    
    
    /**
     * @attribute
     */
    private OgNationality nationality;

    /**
     * @attribute
     */
    private OgMedal gold;


    /**
     * @attribute
     */
    private OgMedal silver;


    /**
     * @attribute
     */
    private OgMedal bronze;

    public OgMedalStanding(Integer medalStandingId, OgNationality nationality, OgMedal gold, OgMedal silver,
                           OgMedal bronze) {
        this.medalStandingId = medalStandingId;
        this.nationality = nationality;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }


    /****SETTERS****/
    public void setIdNationality(OgNationality nationality) {
        this.nationality = nationality;
    }

    public void setGold(OgMedal gold) {
        this.gold = gold;
    }

    public void setSilver(OgMedal silver) {
        this.silver = silver;
    }

    public void setBronze(OgMedal bronze) {
        this.bronze = bronze;
    }
    /****GETTERS****/
    
     public Integer getMedalStandingId() {
         return medalStandingId;
     }

     public OgNationality getNationality() {
         return nationality;
     }

     public OgMedal getGold() {
         return gold;
     }

     public OgMedal getSilver() {
         return silver;
     }

     public OgMedal getBronze() {
         return bronze;
     }
    
    
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgMedalStanding)) {
            return false;
        }
        final OgMedalStanding other = (OgMedalStanding)object;
        if (!(medalStandingId == null ? other.medalStandingId == null : medalStandingId.equals(other.medalStandingId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((medalStandingId == null) ? 0 : medalStandingId.hashCode());
        return result;
    }

    
}
