package sysman;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class OgParticipant extends OgPerson {


    /****CLASS ATTRIBUTES****/
    public OgTeamPartic dorsalOfTeam;
    //public int dorsal = dorsalOfTeam.getDorsal();

    /**
     * @attribute
     */
    private Integer personaId;
    
    
    
    /**
     * @attribute
     */
    private Integer height;

   

    /**
     * @attribute
     */
    private Integer weight;

    

    /**
     * @attribute
     */
    private OgRole role;
    
    /**
     * @attribute
     */
    private OgStatisticParticipant statisticParticipant;
    
    /**
     * @attribute
     */
    public Set<OgStatMatchPartic> statOfMatchPartic;


    public OgParticipant(Integer personaId, String name, String surname, OgGender gender, OgNationality nationality,
                    OgNoc noc, Date birthdate, Integer height, Integer weight, OgRole role) {
        super();
        this.height = height;
        this.weight = weight;
        this.role = role;
        super.setPersonaId(personaId);
        super.setName(name);
        super.setSurname(surname);
        super.setGender(gender);
        super.setNationality(nationality);
        super.setNoc(noc);
        super.setBirthdate(birthdate);
        statisticParticipant = new OgStatisticParticipant(this,0,0,0,0,0,0,0);
        statOfMatchPartic = new HashSet<OgStatMatchPartic>();
    }


    /****GETTERS****/
    public Integer getPersonaId() {
        return personaId;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }

    public OgRole getRole() {
        return role;
    }


    /****SETTERS****/
    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setRole(OgRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgParticipant)) {
            return false;
        }
        final OgParticipant other = (OgParticipant)object;
        if (!(personaId == null ? other.personaId == null : personaId.equals(other.personaId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = super.hashCode();
        result = PRIME * result + ((personaId == null) ? 0 : personaId.hashCode());
        return result;
    }
/*
    @Override
    public void toString() {
        super.imprimir();
        System.out.println("-> Participant: \n");
        System.out.println("---> Role: " + role + "\n");
    }
*/
    public void setDorsalOfTeam(OgTeamPartic dorsalOfTeam) {
        this.dorsalOfTeam = dorsalOfTeam;
    }

    public OgTeamPartic getDorsalOfTeam() {
        return dorsalOfTeam;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public void setStatisticParticipant(OgStatisticParticipant statisticParticipant) {
        this.statisticParticipant = statisticParticipant;
    }

    public OgStatisticParticipant getStatisticParticipant() {
        return statisticParticipant;
    }

    public void setStatOfMatchPartic(Set<OgStatMatchPartic> statOfMatchPartic) {
        this.statOfMatchPartic = statOfMatchPartic;
    }

    public Set<OgStatMatchPartic> getStatOfMatchPartic() {
        return statOfMatchPartic;
    }
}
