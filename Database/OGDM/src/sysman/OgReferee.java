package sysman;

import java.util.Date;

public class OgReferee extends OgPerson {
    
    
    /****CLASS ATTRIBUTES****/
    
    
   

    /**
     * @attribute
     */
    private Integer personaId;

    
    /**
     * @attribute
     */
    private OgCategoryReferee categoryReferee;

    public OgReferee(Integer personaId, String name, String surname, OgGender gender, OgNationality nationality,
                    OgNoc noc, Date birthdate, OgCategoryReferee categoryReferee) {
        super();
        this.categoryReferee = categoryReferee;
        super.setPersonaId(personaId);
        super.setName(name);
        super.setSurname(surname);
        super.setGender(gender);
        super.setNationality(nationality);
        super.setNoc(noc);
        super.setBirthdate(birthdate);
    }
/*
    @Override
    public void toString() {
        super.toString();
        System.out.println("-> Referee: \n");
        System.out.println("---> Id_person: " + personaId + "\n");
        System.out.println("---> Category: " + categoryReferee.getCategoryReferee() + "\n");
    }
  */  
    /****GETTERS****/

    
    public Integer getPersonaId() {
        return personaId;
    }

    public OgCategoryReferee getCategoryReferee() {
        return categoryReferee;
    }


    /****SETTERS****/
    
    public void setCategoryReferee(OgCategoryReferee categoryReferee) {
        this.categoryReferee = categoryReferee;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgReferee)) {
            return false;
        }
        final OgReferee other = (OgReferee)object;
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
}
