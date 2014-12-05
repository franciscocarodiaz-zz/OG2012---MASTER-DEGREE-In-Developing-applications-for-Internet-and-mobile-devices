package sysman;

public class OgNewNoc {
    
    
    /****CLASS ATTRIBUTES****/
    
    
    /**
     * @attribute
     */
    private OgNoc noc;

    /**
     * @attribute
     */
    private OgNew news;

    public OgNewNoc(OgNoc noc, OgNew news) {
        super();
        this.noc = noc;
        this.news = news;
        news.nocs.add(this);
        noc.idOfNews.add(this);
    }


    /****SETTERS****/

    public void setNoc(OgNoc noc) {
        this.noc = noc;
    }

    public void setNews(OgNew news) {
        this.news = news;
    }

    /****GETTERS****/
    public OgNoc getNoc() {
        return noc;
    }

    public OgNew getNews() {
        return news;
    }
}
