package finalproject;

/**
 * File: USCrime.java
 * Author: Kenny Yang
 * Date: 11/5/16
 * Purpose: Class that structures data about crime per year
 * 
 */
public class USCrime {
    private int year = 0;
    private int population = 0;
    private int violent = 0;
    private double violentRate = 0.0;
    private int murder = 0;
    private double murderRate = 0.0;
    private int rape = 0;
    private double rapeRate = 0.0;
    private int robbery = 0;
    private double robberyRate = 0.0;
    private int assault = 0;
    private double assaultRate = 0.0;
    private int property = 0;
    private double propertyRate = 0.0;
    private int burglary = 0;
    private double burglaryRate = 0.0;
    private int theft = 0;
    private double theftRate = 0.0;
    private int vehicle = 0;
    private double vehicleRate = 0.0;
    
    // Constructor
    USCrime () {
    }
    
    USCrime (int year,
            int population,
            int violent,
            double violentRate,
            int murder,
            double murderRate,
            int rape,
            double rapeRate,
            int robbery,
            double robberyRate,
            int assault,
            double assaultRate,
            int property,
            double propertyRate,
            int burglary,
            double burglaryRate,
            int theft,
            double theftRate,
            int vehicle,
            double vehicleRate) {
        this.year = year;
        this.population = population;
        this.violent = violent;
        this.violentRate = violentRate;
        this.murder = murder;
        this.murderRate = murderRate;
        this.rape = rape;
        this.rapeRate = rapeRate;
        this.robbery = robbery;
        this.robberyRate = robberyRate;
        this.assault = assault;
        this.assaultRate = assaultRate;
        this.property = property;
        this.propertyRate = propertyRate;
        this.burglary = burglary;
        this.burglaryRate = burglaryRate;
        this.theft = theft;
        this.theftRate = theftRate;
        this.vehicle = vehicle;
        this.vehicleRate = vehicleRate;
    }
    
    @Override
    public String toString() {
        return Integer.toString(this.year);
    }
    
    // Getter Methods
    public int getYear() {
        return this.year;
    }
    public int getPopulation() {
        return this.population;
    }
    public int getViolent() {
        return this.violent;
    }
    public double getViolentRate() {
        return violentRate;
    }
    public int getMurder() {
        return this.murder;
    }

    /**
     * @return the murderRate
     */
    public double getMurderRate() {
        return murderRate;
    }

    /**
     * @return the rape
     */
    public int getRape() {
        return rape;
    }

    /**
     * @return the rapeRate
     */
    public double getRapeRate() {
        return rapeRate;
    }

    /**
     * @return the robbery
     */
    public int getRobbery() {
        return robbery;
    }

    /**
     * @return the robberyRate
     */
    public double getRobberyRate() {
        return robberyRate;
    }

    /**
     * @return the assault
     */
    public int getAssault() {
        return assault;
    }

    /**
     * @return the assaultRate
     */
    public double getAssaultRate() {
        return assaultRate;
    }

    /**
     * @return the property
     */
    public int getProperty() {
        return property;
    }

    /**
     * @return the propertyRate
     */
    public double getPropertyRate() {
        return propertyRate;
    }

    /**
     * @return the burglary
     */
    public int getBurglary() {
        return burglary;
    }

    /**
     * @return the burglaryRate
     */
    public double getBurglaryRate() {
        return burglaryRate;
    }

    /**
     * @return the theft
     */
    public int getTheft() {
        return theft;
    }

    /**
     * @return the theftRate
     */
    public double getTheftRate() {
        return theftRate;
    }

    /**
     * @return the vehicle
     */
    public int getVehicle() {
        return vehicle;
    }

    /**
     * @return the vehicleRate
     */
    public double getVehicleRate() {
        return vehicleRate;
    }
    
    
    // Setter Methods

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @param population the population to set
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     * @param violent the violent to set
     */
    public void setViolent(int violent) {
        this.violent = violent;
    }

    /**
     * @param violentRate the violentRate to set
     */
    public void setViolentRate(double violentRate) {
        this.violentRate = violentRate;
    }

    /**
     * @param murder the murder to set
     */
    public void setMurder(int murder) {
        this.murder = murder;
    }

    /**
     * @param murderRate the murderRate to set
     */
    public void setMurderRate(double murderRate) {
        this.murderRate = murderRate;
    }

    /**
     * @param rape the rape to set
     */
    public void setRape(int rape) {
        this.rape = rape;
    }

    /**
     * @param rapeRate the rapeRate to set
     */
    public void setRapeRate(double rapeRate) {
        this.rapeRate = rapeRate;
    }

    /**
     * @param robbery the robbery to set
     */
    public void setRobbery(int robbery) {
        this.robbery = robbery;
    }

    /**
     * @param robberyRate the robberyRate to set
     */
    public void setRobberyRate(double robberyRate) {
        this.robberyRate = robberyRate;
    }

    /**
     * @param assault the assault to set
     */
    public void setAssault(int assault) {
        this.assault = assault;
    }

    /**
     * @param assaultRate the assaultRate to set
     */
    public void setAssaultRate(double assaultRate) {
        this.assaultRate = assaultRate;
    }

    /**
     * @param property the property to set
     */
    public void setProperty(int property) {
        this.property = property;
    }

    /**
     * @param propertyRate the propertyRate to set
     */
    public void setPropertyRate(double propertyRate) {
        this.propertyRate = propertyRate;
    }

    /**
     * @param burglary the burglary to set
     */
    public void setBurglary(int burglary) {
        this.burglary = burglary;
    }

    /**
     * @param burglaryRate the burglaryRate to set
     */
    public void setBurglaryRate(double burglaryRate) {
        this.burglaryRate = burglaryRate;
    }

    /**
     * @param theft the theft to set
     */
    public void setTheft(int theft) {
        this.theft = theft;
    }

    /**
     * @param theftRate the theftRate to set
     */
    public void setTheftRate(double theftRate) {
        this.theftRate = theftRate;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(int vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * @param vehicleRate the vehicleRate to set
     */
    public void setVehicleRate(double vehicleRate) {
        this.vehicleRate = vehicleRate;
    }
    
}
