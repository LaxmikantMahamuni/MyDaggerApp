package com.laxmikant.mydaggerapp.mrasAPI;

/**
 * Created by Laxmikant Mahamuni on 10/16/2014.
 */

public class Areas {
    private String id;

    private Sessions[] sessions;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Sessions[] getSessions() {
        return sessions;
    }

    public void setSessions(Sessions[] sessions) {
        this.sessions = sessions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassPojo [id = " + id + ", sessions = " + sessions + ", name = " + name + "]";
    }
}