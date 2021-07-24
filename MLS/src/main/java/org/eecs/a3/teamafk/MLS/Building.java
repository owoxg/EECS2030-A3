package org.eecs.a3.teamafk.MLS;

public abstract class Building implements MLSInterface {
    private String type = null;
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


    /**
     * Set the type of the property
     * @param type of the property
     */
    protected void settype(String type) {
        this.type =  type;
    }

    /**
     * Get the type of the property
     * @return the type of the property
     */
    protected String gettype() {
        return type;
    }

    /**
     * Set the size of the property
     * @param size of the property
     */
    protected void setsize(int size) {
        this.size =  size;
    }

    /**
     * Get the size of the property
     * @return the size of the property
     */
    protected int getsize() {
        return size;
    }

    /**
     * Set the address of the property
     * @param address of the property
     */
    protected void setaddress(String address) {
        this.address =  address;
    }

    /**
     * Get the address of the property
     * @return the address of the property
     */
    protected String getaddress() {
        return address;
    }


    /**
     * Set the country of the property
     * @param country of the property
     */
    protected void setcountry(String country) {
        this.country =  country;
    }



    /**
     * Get the country of the property
     * @return the country of the property
     */
    protected String getcountry() {
        return country;
    }


    /**
     * Set the schooldistrict of the property
     * @param schooldistrict of the property
     */
    protected void setschooldistrict(String schooldistrict) {
        this.schooldistrict =  schooldistrict;
    }


    /**
     * Get the schooldistrict of the property
     * @return the schooldistrict of the property
     */
    protected String getschooldistrict() {
        return schooldistrict;
    }


    /**
     * Set the bedrooms of the property
     * @param bedrooms of the property
     */
    protected void setbedrooms(int bedrooms) {
        this.bedrooms =  bedrooms;
    }


    /**
     * Get the bedrooms of the property
     * @return bedrooms of the property
     */
    protected int getbedrooms() {
        return bedrooms;
    }



    /**
     * Set the livingroom  of the property
     * @param livingroom  of the property
     */
    protected void setlivingroom (int livingroom) {
        this.livingroom =  livingroom;
    }


    /**
     * Get the livingroom of the property
     * @return livingroom of the property
     */
    protected int getlivingroom() {
        return livingroom;
    }


    /**
     * Set the totalrooms  of the property
     * @param totalrooms of the property
     */
    protected void settotalrooms (int totalrooms) {
        this.totalrooms =  totalrooms;
    }


    /**
     * Get the totalrooms of the property
     * @return totalrooms of the property
     */
    protected int gettotalrooms() {
        return totalrooms;
    }


    /**
     * Set the setexpenses  of the property
     * @param expenses  of the property
     */
    protected void setexpenses (String expenses) {
        this.expenses =  expenses;
    }


    /**
     * Get the expenses of the property
     * @return expenses of the property
     */
    protected String getexpenses() {
        return expenses;
    }



    /**
     * Set the builtdate  of the property
     * @param builtdate of the property
     */
    protected void setbuiltdate (String builtdate) {
        this.builtdate =  builtdate;
    }



    /**
     *Get the builtdate of the property
     * @return builtdate of the property
     */
    protected String getbuiltdate() {
        return builtdate;
    }



    /**
     * Set the floorlevel  of the property
     * @param floorlevel of the property
     */
    protected void setfloorlevel (int floorlevel) {
        this.floorlevel =  floorlevel;
    }


    /**
     * Get the floorlevel of the property
     * @return floorlevel of the property
     */
    protected int getfloorlevel() {
        return floorlevel;
    }


    /**
     * Set the pool  of the property
     * @param pool of the property
     */
    protected void setpool  (boolean pool) {
        this.pool  =  pool;
    }

    /**
     * Get the pool of the property
     * @return pool of the property
     */
    protected boolean getpool () {
        return pool;
    }

    /**
     * Set the cableready  of the property
     * @param cableready of the property
     */
    protected void cableready  (boolean cableready) {
        this.cableready  =  cableready;
    }


    /**
     * Get the cableready of the property
     * @return cablereadyl of the property
     */
    protected boolean getcableready() {
        return cableready;
    }


    /**
     * Set the furnished  of the property
     * @param furnished of the property
     */
    protected void furnished  (boolean furnished) {
        this.furnished  =  furnished;
    }



    /**
     * Get the furnished of the property
     * @return furnished of the property
     */
    protected boolean getfurnished() {
        return furnished;
    }



    /**
     * Set the hassecurity of the property
     * @param hassecurity of the property
     */
    protected void hassecurity  (boolean hassecurity) {
        this.hassecurity  =  hassecurity;
    }


    /**
     * Get the hassecurity of the property
     * @return hassecurity of the property
     */
    protected boolean gethassecurity() {
        return hassecurity;
    }


    /**
     * Set the hasgarden of the property
     * @param hasgarden of the property
     */
    protected void hasgarden  (boolean hasgarden) {
        this.hasgarden  =  hasgarden;
    }



    /**
     * Get the hasgarden of the property
     * @return hasgarden of the property
     */
    protected boolean gethasgarden() {
        return hasgarden;
    }


    /**
     * Set the gardensize of the property
     * @param gardensize of the property
     */
    protected void setgardensize(int gardensize) {
        this.gardensize =  gardensize;
    }


    /**
     * Get the gardensize of the property
     * @return gardensize of the property
     */
    protected int getgardensize() {
        return gardensize;
    }



    /**
     * Set the description of the property
     * @param description of the property
     */
    protected void setdescription(String description) {
        this.description =  description;
    }


    /**
     * Get the description of the property
     * @return description of the property
     */
    protected String getdescription() {
        return description;
    }

    /**
     * Help to convert Boolean to string
     * @param something
     * @return A string of yes or no
     */
    protected String stringhelper(boolean something){
        if (something == true){
            return "YES";
        }
        return "NO";
    }

    /**
     * a function to collect useful info and construct a chart
     * @return info in a chart of the building
     */
    public abstract String Display();


    public static class BuildingBuilder {
        private String type;
        private int size;
        private String address;
        private String country;
        private String schooldistrict;
        private int bedrooms;
        private int livingroom;
        private int totalrooms;
        private String expenses;
        private String builtdate;
        private int floorlevel;
        private boolean pool;
        private boolean cableready;
        private boolean furnished;
        private boolean hassecurity;
        private boolean hasgarden;
        private int gardensize;
        private String description;

        BuildingBuilder() {
        }

        public BuildingBuilder type(String type) {
            this.type = type;
            return this;
        }

        public BuildingBuilder size(int size) {
            this.size = size;
            return this;
        }

        public BuildingBuilder address(String address) {
            this.address = address;
            return this;
        }

        public BuildingBuilder country(String country) {
            this.country = country;
            return this;
        }

        public BuildingBuilder schooldistrict(String schooldistrict) {
            this.schooldistrict = schooldistrict;
            return this;
        }

        public BuildingBuilder bedrooms(int bedrooms) {
            this.bedrooms = bedrooms;
            return this;
        }

        public BuildingBuilder livingroom(int livingroom) {
            this.livingroom = livingroom;
            return this;
        }

        public BuildingBuilder totalrooms(int totalrooms) {
            this.totalrooms = totalrooms;
            return this;
        }

        public BuildingBuilder expenses(String expenses) {
            this.expenses = expenses;
            return this;
        }

        public BuildingBuilder builtdate(String builtdate) {
            this.builtdate = builtdate;
            return this;
        }

        public BuildingBuilder floorlevel(int floorlevel) {
            this.floorlevel = floorlevel;
            return this;
        }

        public BuildingBuilder pool(boolean pool) {
            this.pool = pool;
            return this;
        }

        public BuildingBuilder cableready(boolean cableready) {
            this.cableready = cableready;
            return this;
        }

        public BuildingBuilder furnished(boolean furnished) {
            this.furnished = furnished;
            return this;
        }

        public BuildingBuilder hassecurity(boolean hassecurity) {
            this.hassecurity = hassecurity;
            return this;
        }

        public BuildingBuilder hasgarden(boolean hasgarden) {
            this.hasgarden = hasgarden;
            return this;
        }

        public BuildingBuilder gardensize(int gardensize) {
            this.gardensize = gardensize;
            return this;
        }

        public BuildingBuilder description(String description) {
            this.description = description;
            return this;
        }

        public BuildCondo buildcondo() {
            return new BuildCondo(size, address, country, schooldistrict, bedrooms, livingroom, totalrooms, expenses, builtdate, floorlevel, pool, cableready, furnished, hassecurity, hasgarden, gardensize, description);
        }
        
       
    }
}
