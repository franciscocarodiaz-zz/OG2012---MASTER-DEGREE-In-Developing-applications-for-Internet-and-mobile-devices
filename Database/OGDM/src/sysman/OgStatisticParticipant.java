package sysman;

public class OgStatisticParticipant {
    
    
    /****CLASS ATTRIBUTES****/
    
    
    /**
     * @attribute
     */
    Integer statisticParticipantId;
    
    
    /**
     * @attribute
     */
    Integer partic;

    
    
    
    
    /**
     * @attribute
     */
    String asist;

    /**
     * @attribute
     */
    Integer pj;

    /**
     * @attribute
     */
    Integer mjug;

    /**
     * @attribute
     */
    String fs;

    /**
     * @attribute
     */
    Integer tit;

    /**
     * @attribute
     */
    String fc;

    /**
     * @attribute
     */
    String G;

    public OgStatisticParticipant(OgParticipant partic, Integer asist, Integer pj,
                                  Integer mjug, Integer fs, Integer tit, Integer fc, Integer G) {
        this.partic = partic;
        this.asist = asist;
        this.pj = pj;
        this.mjug = mjug;
        this.fs = fs;
        this.tit = tit;
        this.fc = fc;
        this.G = G;
    }


    /****SETTERS****/

    public void setPartic(OgParticipant partic) {
        this.partic = partic;
    }

    public void setAsist(Integer asist) {
        this.asist = asist;
    }

    public void setPj(Integer pj) {
        this.pj = pj;
    }

    public void setMjug(Integer mjug) {
        this.mjug = mjug;
    }

    public void setFs(Integer fs) {
        this.fs = fs;
    }

    public void setTit(Integer tit) {
        this.tit = tit;
    }

    public void setFc(Integer fc) {
        this.fc = fc;
    }

    public void setG(Integer G) {
        this.G = G;
    }
    
    /****GETTERS****/
    public Integer getStatisticParticipantId() {
        return statisticParticipantId;
    }

    public OgParticipant getPartic() {
        return partic;
    }

    public Integer getAsist() {
        return asist;
    }

    public Integer getPj() {
        return pj;
    }

    public Integer getMjug() {
        return mjug;
    }

    public Integer getFs() {
        return fs;
    }

    public Integer getTit() {
        return tit;
    }

    public Integer getFc() {
        return fc;
    }

    public Integer getG() {
        return G;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OgStatisticParticipant)) {
            return false;
        }
        final OgStatisticParticipant other = (OgStatisticParticipant)object;
        if (!(statisticParticipantId == null ? other.statisticParticipantId == null : statisticParticipantId.equals(other.statisticParticipantId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((statisticParticipantId == null) ? 0 : statisticParticipantId.hashCode());
        return result;
    }
}
