package sysman;

import java.util.Date;

public class OgPerson {
    
    
    
    /****CLASS ATTRIBUTES****/
    
    
    /**
     * @attribute
     */
    private Integer personaId;
    
    
    /**
     * @attribute
     */
    private String name;

    /**
     * @attribute
     */
    private String surname;
    
    
    /**
     * @attribute
     */
    private OgGender gender;

    /**
     * @attribute
     */
    private OgNationality nationality;

    
    /**
     * @attribute
     */
    private OgNoc noc;
    

    /**
     * @attribute
     */
    private Date birthdate;

    private TypePerson type;

    public OgPerson() {
        super();
    }
    
    public OgPerson(Integer personaId, TypePerson type, String name, String surname, OgGender gender, OgNationality nationality,
                    OgNoc noc, Date birthdate) {
        this.personaId = personaId;
        this.type = type;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.nationality = nationality;
        this.noc = noc;
        this.birthdate = birthdate;
    }
/*
    public void toString() {
        System.out.println("\nId: " + this.getPersonaId());
        System.out.println("\nName: " + this.getName());
        System.out.println("\nSurname: " + this.getSurname());
        System.out.println("\nGender: " + this.getGender());
        System.out.println("\nNationality: " + this.getNationality());
        System.out.println("\nNoc: " + this.getNoc());
        System.out.println("\nBirthdate: " + this.getBirthdate());
    }
  */
    /****GETTERS****/


    public Integer getPersonaId() {
        return personaId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OgGender getGender() {
        return gender;
    }

    public OgNationality getNationality() {
        return nationality;
    }

    public OgNoc getNoc() {
        return noc;
    }

    public Date getBirthdate() {
        return birthdate;
    }





    /****SETTERS****/



    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(OgGender gender) {
        this.gender = gender;
    }

    public void setNationality(OgNationality nationality) {
        this.nationality = nationality;
    }

    public void setNoc(OgNoc noc) {
        this.noc = noc;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgPerson)) {
            return false;
        }
        final OgPerson other = (OgPerson)object;
        if (!(personaId == null ? other.personaId == null : personaId.equals(other.personaId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((personaId == null) ? 0 : personaId.hashCode());
        return result;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public void setType(TypePerson type) {
        this.type = type;
    }

    public TypePerson getType() {
        return type;
    }
}
