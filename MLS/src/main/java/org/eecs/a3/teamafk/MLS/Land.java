package org.eecs.a3.teamafk.MLS;

public class Land extends Building implements MLSInterface{
    private String type = "Land";
    private int size = 0;
    private String address = null;
    private String country = null;
    private String schooldistrict = null;
    private int bedrooms = 0;
    private int livingroom = 0;
    private int totalrooms = 0;
    private String expenses = null;
    private String builtdate = "";
    private int floorlevel = 0;
    private boolean pool = false;
    private boolean cableready = false;
    private boolean furnished = false;
    private boolean hassecurity = false;
    private boolean hasgarden = false;
    private int gardensize = 0;
    private String description = null;

    BuildCondo(int size, String address, String country, String schooldistrict, int bedrooms, int livingroom, int totalrooms, String expenses, String builtdate, int floorlevel, boolean pool, boolean cableready, boolean furnished, boolean hassecurity, boolean hasgarden, int gardensize, String description) {
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
		String s="General information：<br/>";
		s=s+"Property Type: Land<br/>";
		s=s+"Property Address: "+address+"<br/>";
		s=s+"Property Country: "+country+"<br/>";
		s=s+"Property School District: "+schooldistrict+"<br/><br/>";
		s=s+"Property Detail:<br/>";
		s=s+"Total Area: "+size+"sq.ft<br/>";
		s=s+"Bedrooms: "+bedrooms+"<br/>";
		s=s+"Livingrooms: "+livingroom+"<br/>";
		s=s+"Totalrooms: "+totalrooms+"<br/>";
		s=s+"Major Expenses for holding: "+expenses+"<br/>";
		s=s+"Built Date: "+builtdate+"<br/>";
		s=s+"Unit Level: "+floorlevel+"<br/>";
		s=s+"Pool: "+stringhelper(pool)+"<br/>";
		s=s+"Cable: "+stringhelper(cableready)+"<br/>";
		s=s+"Furnished: "+stringhelper(furnished)+"<br/>";
		s=s+"Description:<br/>"+description;
		return s;
	}

}
