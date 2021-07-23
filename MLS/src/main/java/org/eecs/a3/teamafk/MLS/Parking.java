package org.eecs.a3.teamafk.MLS;

public class Parking {
  
  
    private UUID id;
    private int size;
    private String type;
    private boolean isRVok;

    /**
     * Set the ID of the property
     * @param id the UUID of the property
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Set the ID of the property
     * @param size of the property
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Set the ID of the property
     * @param type of the property
     */
    public void setType(String type) throws Exception {
        if(type.length()>30){
            throw new Exception("It needs to be less than 30 characters!");
        }
        this.type = type;
    }

    /**
     * Set the ID of the property
     * @param risRVok of the property
     */
    public void setIsRVok(boolean risRVok) {
        this.isRVok = isRVok;
    }

    /**
     * Get the id of the property
     * @return the id of the property
     */
    public UUID getId() {
        return id;
    }

    /**
     * Get the size of the property
     * @return the size of the property
     */
    public int getSize() {
        return size;
    }

    /**
     * Get the type of the property
     * @return the type of the property
     */
    public String getType() {
        return type;
    }

    /**
     * Get the IsRVok of the property
     * @return the IsRVok of the property
     */
    public boolean getIsRVok() {
        return isRVok;
    }

    /**
     * Builder design pattern to facilitate construction of an
     * MLS record.
     */
    public static class Builder {

        private int size;
        private String type;
        private boolean isRVok;

        /**
         * Set the size of the property
         * @param size of the property
         * @return the Builder object
         */
        public Builder sizeofParking(int size) {
            this.size = size;
            return this;
        }

        /**
         * Set the type of the property
         * @param type of the property
         * @return the Builder object
         */
        public Builder typeofParking(String type) {
            this.type = type;
            return this;
        }

        /**
         * Set the isRVok of the property
         * @param isRVok of the property
         * @return the Builder object
         */
        public Builder RVofParking(boolean isRVok) {
            this.isRVok = isRVok;
            return this;
        }

        /**
         * Finalize the construction of an MLS record using Builder design pattern.
         * @return the MLS record using the previously collected information
         * provided to the Builder object.
         */
        public Parking build() {
            Parking pk = new Parking();
            pk.size = this.size;
            pk.type = this.type;
            pk.isRVok = this.isRVok;
            return pk;
        }

    }
}
