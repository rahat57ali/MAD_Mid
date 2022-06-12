package com.riphah.edu.pk.mid;

public class News {
    String id;
    String url;
    String description;
    String heading;

    public News(String id, String url, String description, String heading) {
        this.id = id;
        this.url = url;
        this.description = description;
        this.heading = heading;
    }

    public News() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }
}
