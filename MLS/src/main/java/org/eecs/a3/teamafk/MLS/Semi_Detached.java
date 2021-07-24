package org.eecs.a3.teamafk.MLS;

public class Semi_Detached extends Building implements MLSInterface{
    private String type = "Semi_Detached";
    private int size = 0;
    private String address = null;
    private String country = null;
    private String schooldistrict = null;
    private int bedrooms = 0;
    private int livingroom = 0;
    private int totalrooms = 0;
    private String expenses = null;
    private int builtdate = 0;
    private int floorlevel = 0;
    private boolean pool = false;
    private boolean cableready = false;
    private boolean furnished = false;
    private boolean hassecurity = false;
    private boolean hasgarden = false;
    private int gardensize = 0;
    private String description = null;

    BuildCondo(int size, String address, String country, String schooldistrict, int bedrooms, int livingroom, int totalrooms, String expenses, int builtdate, int floorlevel, boolean pool, boolean cableready, boolean furnished, boolean hassecurity, boolean hasgarden, int gardensize, String description) {
        this.size = size;
        this.address = address;
        this.country = country;
        this.schooldistrict = schooldistrict;
        this.bedrooms = bedrooms;
        this.livingroom = livingroom;
        this.totalrooms = totalrooms;
        this.expenses = expenses;
        this.builtdate = builtdate;
        this.floorlevel = floorlevel;
        this.pool = pool;
        this.cableready = cableready;
        this.furnished = furnished;
        this.hassecurity = hassecurity;
        this.hasgarden = hasgarden;
        this.gardensize = gardensize;
        this.description = description;
    }

    @Override
    public String Display(){
        String s="The MLS Building information：\n";
        s=s+"Property Type: Semi_Detached\n";
        s=s+"Property Address: "+address+"\n";
        s=s+"Property Country: "+country+"\n";
        s=s+"Property School District: "+schooldistrict+"\n\n";
        s=s+"Property Country Detail:\n";
        s=s+"Total Area: "+size+"sq.ft\n";
        s=s+bedrooms+"Bedrooms\n";
        s=s+livingroom+"Livingrooms\n";
        s=s+totalrooms+"Total\n";
        s=s+"Major Expenses for holding"+expenses+"\n";
        s=s+"Built Date: "+builtdate+"\n";
        s=s+"Unit Level: "+floorlevel+"\n";
        s=s+"Pool: "+stringhelper(pool)+"\n";
        s=s+"Cable: "+stringhelper(cableready)+"\n";
        s=s+"Furnished: "+stringhelper(furnished)+"\n";
        s=s+"Security: "+stringhelper(hassecurity)+"\n";
        s=s+"Garden: "+stringhelper(hasgarden)+"\n\n";
        s=s+"Description:\n"+description;
        return s;
    }

}

