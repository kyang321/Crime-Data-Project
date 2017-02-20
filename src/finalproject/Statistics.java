package finalproject;

/**
 * File: Statistics.java Author: Kenny Yang Date: 11/6/16 Purpose: Takes in an
 * Array of USCrime data and has methods that will return statistics about the
 * crime data across the years
 */
public class Statistics {

    private int maxMurderRateYear = 0;
    private int maxRobberyRateYear = 0;
    private int minRobberyRateYear = 0;
    private int minMurderRateYear = 0;
    private double[] everyPopulationGrowth = new double[19];
    private double vehicleTheftPercentageChange = 0.0;
    private int maxViolentYear = 0;
    private int minLarcenyTheftYear = 0;

    public Statistics(USCrime[] array) {
        this.maxMurderRateYear = 0;
        this.minMurderRateYear = 0;
        this.maxRobberyRateYear = 0;
        this.minRobberyRateYear = 0;
        this.vehicleTheftPercentageChange = 0.0;
        this.maxViolentYear = 0;
        this.minLarcenyTheftYear = 0;

        double maxMurderRate = 0.0;
        double minMurderRate = 99999.9;
        double maxRobberyRate = 0.0;
        double minRobberyRate = 99999.9;
        int maxViolent = 0;
        int minLarcenyTheft = 999999999;

        // Caluclate min/max of murder rate and robbery rate
        // loops through the array to find lowest or highest of each rate
        for (USCrime data : array) {
            // Murder Rates
            if (data.getMurderRate() > maxMurderRate) {
                maxMurderRate = data.getMurderRate();
                this.maxMurderRateYear = data.getYear();
            } else if (data.getMurderRate() < minMurderRate) {
                minMurderRate = data.getMurderRate();
                this.minMurderRateYear = data.getYear();
            }

            // Robbery Rates
            if (data.getRobberyRate() > maxRobberyRate) {
                maxRobberyRate = data.getRobberyRate();
                this.maxRobberyRateYear = data.getYear();
            } else if (data.getRobberyRate() < minRobberyRate) {
                minRobberyRate = data.getRobberyRate();
                this.minRobberyRateYear = data.getYear();
            }

            // Violence
            if (data.getViolent() > maxViolent) {
                maxViolent = data.getViolent();
                this.maxViolentYear = data.getYear();
            }
            // Larceny
            if (data.getTheft() < minLarcenyTheft) {
                minLarcenyTheft = data.getTheft();
                this.minLarcenyTheftYear = data.getYear();
            }
        }
        // Calculate the population growth for each subsquent year
        for (int i = 0; i < 19; i++) {
            int firstYearPopulation = array[i].getPopulation();
            int secondYearPopulation = array[i + 1].getPopulation();
            double populationGrowth = ((double) (secondYearPopulation - firstYearPopulation) / firstYearPopulation) * 100;
            this.everyPopulationGrowth[i] = populationGrowth;
        }

        // Calculate the Total percentage change in Motor Vehicle Theft between the years 1998 and 2012.
        int year98theft = 0;
        int year12theft = 0;

        for (USCrime data : array) {
            if (data.getYear() == 1998) {
                year98theft = data.getVehicle();
            }
            if (data.getYear() == 2012) {
                year12theft = data.getVehicle();
            }
        }

        this.vehicleTheftPercentageChange = ((double) (year12theft - year98theft) / year98theft) * 100;

    }

    // GETTER METHODS
    /**
     * @return the maxMurderRateYear
     */
    public int getMaxMurderRateYear() {
        return this.maxMurderRateYear;
    }

    /**
     * @return the maxRobberyRateYear
     */
    public int getMaxRobberyRateYear() {
        return this.maxRobberyRateYear;
    }

    /**
     * @return the minRobberyRateYear
     */
    public int getMinRobberyRateYear() {
        return this.minRobberyRateYear;
    }

    /**
     * @return the minMurderRateYear
     */
    public int getMinMurderRateYear() {
        return this.minMurderRateYear;
    }

    public double[] getEveryPopulationGrowth() {
        return this.everyPopulationGrowth;
    }

    /**
     * @return the vehicleTheftPercentageChange
     */
    public double getVehicleTheftPercentageChange() {
        return vehicleTheftPercentageChange;
    }

    /**
     * @return the maxViolentYear
     */
    public int getMaxViolentYear() {
        return maxViolentYear;
    }

    /**
     * @return the minLarcenyTheftYear
     */
    public int getMinLarcenyTheftYear() {
        return minLarcenyTheftYear;
    }

    // SETTER METHODS
    /**
     * @param maxMurderRateYear the maxMurderRateYear to set
     */
    public void setMaxMurderRateYear(int maxMurderRateYear) {
        this.maxMurderRateYear = maxMurderRateYear;
    }

    /**
     * @param maxRobberyRateYear the maxRobberyRateYear to set
     */
    public void setMaxRobberyRateYear(int maxRobberyRateYear) {
        this.maxRobberyRateYear = maxRobberyRateYear;
    }

    /**
     * @param minRobberyRateYear the minRobberyRateYear to set
     */
    public void setMinRobberyRateYear(int minRobberyRateYear) {
        this.minRobberyRateYear = minRobberyRateYear;
    }

    /**
     * @param minMurderRateYear the minMurderRateYear to set
     */
    public void setMinMurderRateYear(int minMurderRateYear) {
        this.minMurderRateYear = minMurderRateYear;
    }

    /**
     * @param everyPopulationGrowth the everyPopulationGrowth to set
     */
    public void setEveryPopulationGrowth(double[] everyPopulationGrowth) {
        this.setEveryPopulationGrowth(everyPopulationGrowth);
    }

    /**
     * @param vehicleTheftPercentageChange the vehicleTheftPercentageChange to
     * set
     */
    public void setVehicleTheftPercentageChange(double vehicleTheftPercentageChange) {
        this.vehicleTheftPercentageChange = vehicleTheftPercentageChange;
    }

    /**
     * @param maxViolentYear the maxViolentYear to set
     */
    public void setMaxViolentYear(int maxViolentYear) {
        this.maxViolentYear = maxViolentYear;
    }

    /**
     * @param minLarcenyTheftYear the minLarcenyTheftYear to set
     */
    public void setMinLarcenyTheftYear(int minLarcenyTheftYear) {
        this.minLarcenyTheftYear = minLarcenyTheftYear;
    }
}
