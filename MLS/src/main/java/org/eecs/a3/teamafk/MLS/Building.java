package org.eecs.a3.teamafk.MLS;

public abstract class Building {
   private String type = null;
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
        return enddate;
    }


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
     * Set the address of the property
     * @param address of the property
     */
  protected void settype(String address) {
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
     * @param setexpenses of the property
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
     * Set the totalrooms  of the property
     * @param totalrooms of the property
     */
  protected void settotalrooms (int builtdate) {
        this.builtdate =  builtdate;
    }



  /**
     *Get the builtdate of the property
     * @return builtdate of the property
     */ 
  protected int getbuiltdate() {
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
}
