/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author User
 */
public class WatjaiNormal {

    private String PatId;
    private String MeasureId;

    private List<Double> MeaureData = new ArrayList<>();

    public String getPatId() {
        return PatId;
    }

    public void setPatId(String PatId) {
        this.PatId = PatId;
    }

    public String getMeasureId() {
        return MeasureId;
    }

    public void setMeasureId(String MeasureId) {
        this.MeasureId = MeasureId;
    }

}

class CalECGGraph {

    public static void main(String[] args) {

        

        JSONParser parser = new JSONParser();

        try {

            URL oracle = new URL("http://watjai.me:3000/patients/PA1709001/watjainormal/latest"); // URL to Parse
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                JSONArray a = (JSONArray) parser.parse(inputLine);
                // Loop through each item
                for (Object o : a) {
                    JSONObject tutorials = (JSONObject) o;

                    JSONArray arrays = (JSONArray) tutorials.get("measureData");
                    System.out.println("measureData{ ");
                    for (Object object : arrays) {
                        
                        double[] array2 = (double[])object;
                        System.out.print(object);
                    }
                }
            }
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(CalECGGraph.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CalECGGraph.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
