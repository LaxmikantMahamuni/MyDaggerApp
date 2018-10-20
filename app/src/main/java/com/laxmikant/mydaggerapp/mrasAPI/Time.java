package com.laxmikant.mydaggerapp.mrasAPI;

/**
 * Created by Laxmikant Mahamuni on 10/16/2014.
 */

public class Time
{
    private String local;

    public String getLocal ()
    {
        return local;
    }

    public void setLocal (String local)
    {
        this.local = local;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [local = "+local+"]";
    }
}