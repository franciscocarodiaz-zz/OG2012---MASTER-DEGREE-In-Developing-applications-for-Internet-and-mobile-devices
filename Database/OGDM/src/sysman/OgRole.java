package sysman;

public class OgRole {
    
    
    /****CLASS ATTRIBUTES****/
    
    
    
    /**
     * @attribute
     */
    Integer roleId;

    /**
     * @attribute
     */
    String role;

    public OgRole(Integer roleId) {
        super();
        this.roleId = roleId;
        this.role = "";
    }


    /****SETTERS****/

    public void setRole(String role) {
        this.role = role;
    }

    /****GETTERS****/
    public Integer getRoleId() {
        return roleId;
    }

    public String getRole() {
        return role;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgRole)) {
            return false;
        }
        final OgRole other = (OgRole)object;
        if (!(roleId == null ? other.roleId == null : roleId.equals(other.roleId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((roleId == null) ? 0 : roleId.hashCode());
        return result;
    }
}
