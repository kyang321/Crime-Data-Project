/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kenny
 */
public class USCrimeTest {
    
    public USCrimeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getYear method, of class USCrime.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        USCrime instance = new USCrime();
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPopulation method, of class USCrime.
     */
    @Test
    public void testGetPopulation() {
        System.out.println("getPopulation");
        USCrime instance = new USCrime();
        int expResult = 0;
        int result = instance.getPopulation();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getViolent method, of class USCrime.
     */
    @Test
    public void testGetViolent() {
        System.out.println("getViolent");
        USCrime instance = new USCrime();
        int expResult = 0;
        int result = instance.getViolent();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getViolentRate method, of class USCrime.
     */
    @Test
    public void testGetViolentRate() {
        System.out.println("getViolentRate");
        USCrime instance = new USCrime();
        double expResult = 0.0;
        double result = instance.getViolentRate();
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of getMurder method, of class USCrime.
     */
    @Test
    public void testGetMurder() {
        System.out.println("getMurder");
        USCrime instance = new USCrime();
        int expResult = 0;
        int result = instance.getMurder();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getMurderRate method, of class USCrime.
     */
    @Test
    public void testGetMurderRate() {
        System.out.println("getMurderRate");
        USCrime instance = new USCrime();
        double expResult = 0.0;
        double result = instance.getMurderRate();
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of getRape method, of class USCrime.
     */
    @Test
    public void testGetRape() {
        System.out.println("getRape");
        USCrime instance = new USCrime();
        int expResult = 0;
        int result = instance.getRape();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getRapeRate method, of class USCrime.
     */
    @Test
    public void testGetRapeRate() {
        System.out.println("getRapeRate");
        USCrime instance = new USCrime();
        double expResult = 0.0;
        double result = instance.getRapeRate();
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of getRobbery method, of class USCrime.
     */
    @Test
    public void testGetRobbery() {
        System.out.println("getRobbery");
        USCrime instance = new USCrime();
        int expResult = 0;
        int result = instance.getRobbery();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getRobberyRate method, of class USCrime.
     */
    @Test
    public void testGetRobberyRate() {
        System.out.println("getRobberyRate");
        USCrime instance = new USCrime();
        double expResult = 0.0;
        double result = instance.getRobberyRate();
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of getAssault method, of class USCrime.
     */
    @Test
    public void testGetAssault() {
        System.out.println("getAssault");
        USCrime instance = new USCrime();
        int expResult = 0;
        int result = instance.getAssault();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getAssaultRate method, of class USCrime.
     */
    @Test
    public void testGetAssaultRate() {
        System.out.println("getAssaultRate");
        USCrime instance = new USCrime();
        double expResult = 0.0;
        double result = instance.getAssaultRate();
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of getProperty method, of class USCrime.
     */
    @Test
    public void testGetProperty() {
        System.out.println("getProperty");
        USCrime instance = new USCrime();
        int expResult = 0;
        int result = instance.getProperty();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getPropertyRate method, of class USCrime.
     */
    @Test
    public void testGetPropertyRate() {
        System.out.println("getPropertyRate");
        USCrime instance = new USCrime();
        double expResult = 0.0;
        double result = instance.getPropertyRate();
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of getBurglary method, of class USCrime.
     */
    @Test
    public void testGetBurglary() {
        System.out.println("getBurglary");
        USCrime instance = new USCrime();
        int expResult = 0;
        int result = instance.getBurglary();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getBurglaryRate method, of class USCrime.
     */
    @Test
    public void testGetBurglaryRate() {
        System.out.println("getBurglaryRate");
        USCrime instance = new USCrime();
        double expResult = 0.0;
        double result = instance.getBurglaryRate();
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of getTheft method, of class USCrime.
     */
    @Test
    public void testGetTheft() {
        System.out.println("getTheft");
        USCrime instance = new USCrime();
        int expResult = 0;
        int result = instance.getTheft();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getTheftRate method, of class USCrime.
     */
    @Test
    public void testGetTheftRate() {
        System.out.println("getTheftRate");
        USCrime instance = new USCrime();
        double expResult = 0.0;
        double result = instance.getTheftRate();
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of getVehicle method, of class USCrime.
     */
    @Test
    public void testGetVehicle() {
        System.out.println("getVehicle");
        USCrime instance = new USCrime();
        int expResult = 0;
        int result = instance.getVehicle();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getVehicleRate method, of class USCrime.
     */
    @Test
    public void testGetVehicleRate() {
        System.out.println("getVehicleRate");
        USCrime instance = new USCrime();
        double expResult = 0.0;
        double result = instance.getVehicleRate();
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of setYear method, of class USCrime.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 0;
        USCrime instance = new USCrime();
        instance.setYear(year);        
    }

    /**
     * Test of setPopulation method, of class USCrime.
     */
    @Test
    public void testSetPopulation() {
        System.out.println("setPopulation");
        int population = 0;
        USCrime instance = new USCrime();
        instance.setPopulation(population);        
    }

    /**
     * Test of setViolent method, of class USCrime.
     */
    @Test
    public void testSetViolent() {
        System.out.println("setViolent");
        int violent = 0;
        USCrime instance = new USCrime();
        instance.setViolent(violent);        
    }

    /**
     * Test of setViolentRate method, of class USCrime.
     */
    @Test
    public void testSetViolentRate() {
        System.out.println("setViolentRate");
        double violentRate = 0.0;
        USCrime instance = new USCrime();
        instance.setViolentRate(violentRate);        
    }

    /**
     * Test of setMurder method, of class USCrime.
     */
    @Test
    public void testSetMurder() {
        System.out.println("setMurder");
        int murder = 0;
        USCrime instance = new USCrime();
        instance.setMurder(murder);        
    }

    /**
     * Test of setMurderRate method, of class USCrime.
     */
    @Test
    public void testSetMurderRate() {
        System.out.println("setMurderRate");
        double murderRate = 0.0;
        USCrime instance = new USCrime();
        instance.setMurderRate(murderRate);        
    }

    /**
     * Test of setRape method, of class USCrime.
     */
    @Test
    public void testSetRape() {
        System.out.println("setRape");
        int rape = 0;
        USCrime instance = new USCrime();
        instance.setRape(rape);        
    }

    /**
     * Test of setRapeRate method, of class USCrime.
     */
    @Test
    public void testSetRapeRate() {
        System.out.println("setRapeRate");
        double rapeRate = 0.0;
        USCrime instance = new USCrime();
        instance.setRapeRate(rapeRate);        
    }

    /**
     * Test of setRobbery method, of class USCrime.
     */
    @Test
    public void testSetRobbery() {
        System.out.println("setRobbery");
        int robbery = 0;
        USCrime instance = new USCrime();
        instance.setRobbery(robbery);        
    }

    /**
     * Test of setRobberyRate method, of class USCrime.
     */
    @Test
    public void testSetRobberyRate() {
        System.out.println("setRobberyRate");
        double robberyRate = 0.0;
        USCrime instance = new USCrime();
        instance.setRobberyRate(robberyRate);        
    }

    /**
     * Test of setAssault method, of class USCrime.
     */
    @Test
    public void testSetAssault() {
        System.out.println("setAssault");
        int assault = 0;
        USCrime instance = new USCrime();
        instance.setAssault(assault);        
    }

    /**
     * Test of setAssaultRate method, of class USCrime.
     */
    @Test
    public void testSetAssaultRate() {
        System.out.println("setAssaultRate");
        double assaultRate = 0.0;
        USCrime instance = new USCrime();
        instance.setAssaultRate(assaultRate);        
    }

    /**
     * Test of setProperty method, of class USCrime.
     */
    @Test
    public void testSetProperty() {
        System.out.println("setProperty");
        int property = 0;
        USCrime instance = new USCrime();
        instance.setProperty(property);        
    }

    /**
     * Test of setPropertyRate method, of class USCrime.
     */
    @Test
    public void testSetPropertyRate() {
        System.out.println("setPropertyRate");
        double propertyRate = 0.0;
        USCrime instance = new USCrime();
        instance.setPropertyRate(propertyRate);        
    }

    /**
     * Test of setBurglary method, of class USCrime.
     */
    @Test
    public void testSetBurglary() {
        System.out.println("setBurglary");
        int burglary = 0;
        USCrime instance = new USCrime();
        instance.setBurglary(burglary);        
    }

    /**
     * Test of setBurglaryRate method, of class USCrime.
     */
    @Test
    public void testSetBurglaryRate() {
        System.out.println("setBurglaryRate");
        double burglaryRate = 0.0;
        USCrime instance = new USCrime();
        instance.setBurglaryRate(burglaryRate);        
    }

    /**
     * Test of setTheft method, of class USCrime.
     */
    @Test
    public void testSetTheft() {
        System.out.println("setTheft");
        int theft = 0;
        USCrime instance = new USCrime();
        instance.setTheft(theft);        
    }

    /**
     * Test of setTheftRate method, of class USCrime.
     */
    @Test
    public void testSetTheftRate() {
        System.out.println("setTheftRate");
        double theftRate = 0.0;
        USCrime instance = new USCrime();
        instance.setTheftRate(theftRate);        
    }

    /**
     * Test of setVehicle method, of class USCrime.
     */
    @Test
    public void testSetVehicle() {
        System.out.println("setVehicle");
        int vehicle = 0;
        USCrime instance = new USCrime();
        instance.setVehicle(vehicle);        
    }

    /**
     * Test of setVehicleRate method, of class USCrime.
     */
    @Test
    public void testSetVehicleRate() {
        System.out.println("setVehicleRate");
        double vehicleRate = 0.0;
        USCrime instance = new USCrime();
        instance.setVehicleRate(vehicleRate);        
    }
    
}
