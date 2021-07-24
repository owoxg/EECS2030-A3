package org.eecs.a3.teamafk.MLS;
import java.util.UUID;


/**
 * Simplified Multiple Listing Service Record
 * @author Ken Ren
 * @version 1.0
 */
public class MLS implements MLSInterface{
    private UUID uuid = null;
    private Owner owner = null;
    private Building building = null;
    private Parking parking = null;
    private String mlsname = null;
    private String listtype = null;
    private int price = 0;
    private String listdate = "";
    private String enddate = null;
    private boolean sold = false;
    private String brokerage = null;
    private String listingurl = null;

    /**
     * Set the ID of the property
     * @param id the UUID of the property
     */
    protected void setId(UUID id) {
        this.uuid = id;
    }

    /**
     * Get the ID of the property
     * @return the UUID of the property
     */
    protected UUID getId() {
        return uuid;
    }

    /**
     * Set the Owner of the property
     * @param owner of the property
     */
    protected void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Get the Owner of the property
     * @return the owner of the property
     */
    protected Owner getOwner() {
        return owner;
    }

    /**
     * Set the mlsname of the property
     * @param mlsname of the property
     */
    protected void setmlsname(String mlsname) {
        this.mlsname = mlsname;
    }

    /**
     * Get the mlsname of the property
     * @return the mlsname of the property
     */
    protected String getmlsname() {
        return mlsname;
    }

    /**
     * Set the price of the property
     * @param price of the property
     */
    protected void setPrice(int price) {
        this.price = price;
    }

    /**
     * Get the price of the property
     * @return the price of the property
     */
    protected int getPrice() {
        return price;
    }

    /**
     * Set the enddate of the property
     * @param enddate of the property
     */
    protected void setenddate(String enddate) {
        this.enddate = enddate;
    }

    /**
     * Get the enddate of the property
     * @return the enddate of the property
     */
    protected String getenddate() {
        return enddate;
    }

    /**
     * Set the sold of the property
     * @param sold of the property
     */
    protected void setsold(Boolean sold) {
        this.sold = sold;
    }

    /**
     * Get the sold of the property
     * @return the sold of the property
     */
    protected Boolean getsold() {
        return sold;
    }

    /**
     * Set the brokerage of the property
     * @param brokerage of the property
     */
    protected void setbrokerage(String brokerage) {
        this.brokerage = brokerage;
    }

    /**
     * Get the brokerage of the property
     * @return the brokerage of the property
     */
    protected String getbrokerage() {
        return brokerage;
    }

    /**
     * Set the listingurl of the property
     * @param listingurl of the property
     */
    protected void setlistingurl(String listingurl) {
        this.listingurl = listingurl;
    }

    /**
     * Get the listingurl of the property
     * @return the listingurl of the property
     */
    protected String getlistingurl() {
        return listingurl;
    }

    /**
     * Create MLS based on string
     * @return a String of MLS
     */
    @Override
    public String Display() {
        MlsApplication M = new MlsApplication();
        String s = "";
        s = s + "Listing UUID: "+uuid+"<br/><br/>";
        s = s + mlsname+"<br/>";
        s = s + "Listing Type: "+listtype+"<br/>";
        s = s + "Listing Date: "+listdate+"<br/>";
        if (enddate!=null){
            s = s + "End Date: "+enddate+"<br/>";
            if (sold!=false){
                s = s + "Sold: Yes<br/>";
            }
            else {
                s = s + "Sold: No<br/>";
            }
        }
        s = s + "Brokerage: "+brokerage+"<br/>";
        s = s + "Listing URL: "+listingurl+"<br/>";
        s = s + "<br/><br/>"+owner.Display();
        s = s + "<br/><br/>"+building.Display();
        s = s + "<br/><br/>"+parking.Display();

        return s;
    }


    /**
     * Builder design pattern to facilitate construction of an
     * MLS record.
     */
    public static class Builder{
        private UUID uuid = null;
        private Owner owner = null;
        private Building building = null;
        private Parking parking = null;
        private String mlsname = null;
        private String listtype = null;
        private int price = 0;
        private String listdate = "";
        private String enddate = null;
        private boolean sold = false;
        private String brokerage = null;
        private String listingurl = null;

        public Builder(UUID id) {
            this.uuid = id;
        }

        public Builder Owneris1(Owner owner) {
            this.owner = owner;
            return this;
        }

        public Builder Buildingis2(Building building) {
            this.building = building;
            return this;
        }

        public Builder Parkingis3(Parking parking) {
            this.parking = parking;
            return this;
        }

        public Builder Listingnameis4(String mlsname) {
            this.mlsname = mlsname;
            return this;
        }

        public Builder Listtypeis5(String listtype) {
            this.listtype = listtype;
            return this;
        }

        public Builder Priceis6(int price) {
            this.price = price;
            return this;
        }

        public Builder Listdateis7(String listdate) {
            this.listdate = listdate;
            return this;
        }

        public Builder enddateis7a(String enddate){
            this.enddate = enddate;
            return this;
        }

        public Builder soldis7b(Boolean sold){
            this.sold = sold;
            return this;
        }

        public Builder Brokerageis8(String brokerage) {
            this.brokerage = brokerage;
            return this;
        }

        public Builder listingurlis9(String listingurl) {
            this.listingurl = listingurl;
            return this;
        }

        public MLS build() {
            MLS mls = new MLS();
            mls.uuid = this.uuid;
            mls.owner = this.owner;
            mls.building = this.building;
            mls.parking = this.parking;
            mls.mlsname = this.mlsname;
            mls.listtype = this.listtype;
            mls.price = this.price;
            mls.listdate = this.listdate;
            mls.enddate = this.enddate;
            mls.sold = this.sold;
            mls.brokerage = this.brokerage;
            mls.listingurl = this.listingurl;
            return mls;
        }

        public MLS buildnew() {
            MLS mls = new MLS();
            mls.uuid = this.uuid;
            mls.owner = this.owner;
            mls.building = this.building;
            mls.parking = this.parking;
            mls.mlsname = this.mlsname;
            mls.listtype = this.listtype;
            mls.price = this.price;
            mls.listdate = this.listdate;
            mls.enddate = "";
            mls.sold = false;
            mls.brokerage = this.brokerage;
            mls.listingurl = this.listingurl;
            return mls;
        }

    }
}

