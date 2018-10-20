package com.laxmikant.mydaggerapp.mrasAPI;

/**
 * Created by Laxmikant Mahamuni on 10/16/2014.
 */

public class Slots {
    private Time time;

    private String isAlaCarteAvailable;

    private Offers[] offers;

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getIsAlaCarteAvailable() {
        return isAlaCarteAvailable;
    }

    public void setIsAlaCarteAvailable(String isAlaCarteAvailable) {
        this.isAlaCarteAvailable = isAlaCarteAvailable;
    }

    public Offers[] getOffers() {
        return offers;
    }

    public void setOffers(Offers[] offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return "ClassPojo [time = " + time + ", isAlaCarteAvailable = " + isAlaCarteAvailable + ", offers = " + offers + "]";
    }
}
