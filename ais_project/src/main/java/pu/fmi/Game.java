package pu.fmi;


import java.util.*;

/**
 * 
 */
public class Game {

    /**
     * Default constructor
     */
    public Game() {
    }

    /**
     * 
     */
    private int id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Date dateAdded;

    /**
     * 
     */
    private float price;




    /**
     * @return
     */
    public int getID() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return "";
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
       this.name = name;
    }

    /**
     * @return
     */
    public Date getDateAdded() {
        // TODO implement here
        return null;
    }

    /**
     * @param dateAdded 
     * @return
     */
    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    /**
     * @return
     */
    public float getPrice() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @param price 
     * @return
     */
    public void setPrice(float price) {
        this.price = price;
    }

}