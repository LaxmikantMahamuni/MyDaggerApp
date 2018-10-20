package com.laxmikant.mydaggerapp.mrasAPI;

/**
 * Created by Laxmikant Mahamuni on 10/16/2014.
 */

public class Sessions
{
    private Slots[] slots;

    private String name;

    public Slots[] getSlots ()
    {
        return slots;
    }

    public void setSlots (Slots[] slots)
    {
        this.slots = slots;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [slots = "+slots+", name = "+name+"]";
    }
}