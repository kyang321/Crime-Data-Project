package finalproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * File: ImportData.java Author: Kenny Yang Date: 11/5/16 Purpose: Import CSV
 * file and turn into instances of USCrime objects
 *
 */
public class ImportData {
    public static USCrime[] process() {
        // TODO: change file input to ask the user for the filename
        String csvFile = "crime.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        USCrime[] crimeData = new USCrime[20];
        int count = 0;

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use commas as separator
                String[] year = line.split(cvsSplitBy);
                try {
                    crimeData[count] = new USCrime(
                            Integer.parseInt(year[0]), // int year
                            Integer.parseInt(year[1]), // int population
                            Integer.parseInt(year[2]), // int violent
                            Double.parseDouble(year[3]), // double violent rate
                            Integer.parseInt(year[4]), // int murder
                            Double.parseDouble(year[5]), // double murder rate
                            Integer.parseInt(year[6]), // int rape
                            Double.parseDouble(year[7]), // double rape rate
                            Integer.parseInt(year[8]), // int robbery
                            Double.parseDouble(year[9]), // double robbery rate
                            Integer.parseInt(year[10]), // int assault
                            Double.parseDouble(year[11]), // double assault rate
                            Integer.parseInt(year[12]), // int property
                            Double.parseDouble(year[13]), // double property rate
                            Integer.parseInt(year[14]), // int burglary
                            Double.parseDouble(year[15]), // double burglary rate
                            Integer.parseInt(year[16]), // int theft
                            Double.parseDouble(year[17]), // double theft rate
                            Integer.parseInt(year[18]), // int vehicle
                            Double.parseDouble(year[19])); // double vehicle rate
                    count++;
                } catch (NumberFormatException ex) {}
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("IO Exception:" + e.getMessage());
                }
            }
        }
        return crimeData;
    }
    public static void main(String[] args) {
        USCrime[] crimeData = process();
        for (USCrime data : crimeData) {
            System.out.println("Year: " + data.getYear() + " Population: " + data.getPopulation());
        }
    }
}