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
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author User
 */
public class DataHealth {

    private String measureId;
    private String measureTime;
    private String patId;
    private ArrayList<Double> measureData;

    public DataHealth() {
    }

    public DataHealth(String measureId, String measureTime, String patId, ArrayList<Double> measureData) {
        this.measureId = measureId;
        this.measureTime = measureTime;
        this.patId = patId;
        this.measureData = measureData;
    }

    public String getMeasureId() {
        return measureId;
    }

    public void setMeasureId(String measureId) {
        this.measureId = measureId;
    }

    public String getMeasureTime() {
        return measureTime;
    }

    public void setMeasureTime(String measureTime) {
        this.measureTime = measureTime;
    }

    public String getPatId() {
        return patId;
    }

    public void setPatId(String patId) {
        this.patId = patId;
    }

    public ArrayList<Double> getMeasureData() {
        return measureData;
    }

    public void setMeasureData(ArrayList<Double> measureData) {
        this.measureData = measureData;
    }

    static public List<DataHealth> doReadListData(String patId) { //show List data each patient
        List<DataHealth> dhlist = null;
        JSONParser parser = new JSONParser();
        DataHealth dh = null;

        try {
            URL oracle = new URL("http://watjai.me:3000/patients/" + patId + "/watjainormal/latest"); // URL to Parse
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream(), "UTF-8"));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                JSONArray a = (JSONArray) parser.parse(inputLine);
                if (dhlist == null) {
                    dhlist = new ArrayList<>();
                }
                // Loop through each item
                for (Object o : a) {
                    JSONObject tut = (JSONObject) o;
                    dh = new DataHealth();

                    String meaId = (String) tut.get("measureId");
                    dh.setMeasureId(meaId);

                    String meaTime = (String) tut.get("measureTime");
                    String newdt = dh.subStringDate(meaTime);
                    dh.setMeasureTime(newdt);
                    System.out.println("TIME : " + newdt);

                    dhlist.add(dh);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dhlist;
    }

    static public DataHealth showData(String idmea) {//showGraph
        DataHealth dh = new DataHealth();
        JSONParser parser = new JSONParser();
        try {
            URL oracle = new URL("http://watjai.me:3000/watjainormal/" + idmea); // URL to Parse
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                JSONArray a = (JSONArray) parser.parse(inputLine);

                // Loop through each item
                for (Object o : a) {
                    JSONObject tutorials = (JSONObject) o;

                    String id = (String) tutorials.get("measureId");
                    dh.setMeasureId(id);
                    System.out.println("ID : " + id);

                    String time = (String) tutorials.get("measureTime");
                    String newdt = dh.subStringDate(time);
                    dh.setMeasureTime(newdt);
                    System.out.println("TIME : " + newdt);

                    ArrayList<Double> list = new ArrayList<Double>();
                    list.toArray();
                    JSONArray jsonArray = (JSONArray) tutorials.get("measureData");
                    if (jsonArray != null) {
                        int len = jsonArray.size();
                        for (int i = 0; i < len; i++) {
                            //list.add((Double) jsonArray.get(i));
                            list.add((Double) Double.parseDouble(jsonArray.get(i) + ""));

                            System.out.print(list);
                        }
                    }
                    dh.setMeasureData(list);

                }
                in.close();
            }
        } catch (Exception e) {

        }

        return dh;
    }
    
    static public DataHealth showDataAbnormal(String idmea) {//showGraph
        DataHealth dh = new DataHealth();
        JSONParser parser = new JSONParser();
        try {
            URL oracle = new URL("http://watjai.me:3000/watjaimeasure/" + idmea); // URL to Parse
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                JSONArray a = (JSONArray) parser.parse(inputLine);

                // Loop through each item
                for (Object o : a) {
                    JSONObject tutorials = (JSONObject) o;

                    String id = (String) tutorials.get("measuringId");
                    dh.setMeasureId(id);
                    System.out.println("ID : " + id);

                    String time = (String) tutorials.get("alertTime");
                    String newdt = dh.subStringDate(time);
                    dh.setMeasureTime(newdt);
                    System.out.println("TIME : " + newdt);

                    ArrayList<Double> list = new ArrayList<Double>();
                    list.toArray();
                    JSONArray jsonArray = (JSONArray) tutorials.get("measuringData");
                    if (jsonArray != null) {
                        int len = jsonArray.size();
                        for (int i = 0; i < len; i++) {
                            //list.add((Double) jsonArray.get(i));
                            list.add((Double) Double.parseDouble(jsonArray.get(i) + ""));

                            System.out.print(list);
                        }
                    }
                    dh.setMeasureData(list);

                }
                in.close();
            }
        } catch (Exception e) {

        }

        return dh;
    }
    
    
    
    

    public String subStringDate(String dateTimes) {
        String newTimes = dateTimes.substring(11, 19);
        String newDate = dateTimes.substring(0, 10);
        // System.out.println("new Time : "+ newTimes);
        // System.out.println("new Date : "+ newDate);
        String newDateTime = newDate + " " + newTimes;
        // System.out.println("newDT : "+ newDateTime);
        return newDateTime;
    }

    public static void changeMeaStatus(String idmea) {
      
        JSONParser parser = new JSONParser();
        try {
            URL oracle = new URL("http://watjai.me:3000/watjaimeasure/" + idmea); // URL to Parse
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                JSONArray a = (JSONArray) parser.parse(inputLine);

                // Loop through each item
                for (Object o : a) {
                    JSONObject jo = (JSONObject) o;

                    boolean id = (boolean) jo.get("abnormalStatus");
                    System.out.println("ID : " + id);
                    jo.put("abnormalStatus", true);
                    
                    id = (boolean) jo.get("abnormalStatus");
                    System.out.println("after : " + id);
                }
                
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    static public List<DataHealth> doReadListMeaData(String patId){
         List<DataHealth> dhlist = null;
        JSONParser parser = new JSONParser();
        DataHealth dh = null;

        try {
            
            URL oracle = new URL("http://watjai.me:3000/patients/"+ patId +"/watjaimeasure/latest"); // URL to Parse
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream(), "UTF-8"));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                JSONArray a = (JSONArray) parser.parse(inputLine);
                if (dhlist == null) {
                    dhlist = new ArrayList<>();
                }
                // Loop through each item
                for (Object o : a) {
                    JSONObject tut = (JSONObject) o;
                    dh = new DataHealth();

                    String meaId = (String) tut.get("measuringId");
                    dh.setMeasureId(meaId);

                    String meaTime = (String) tut.get("alertTime");
                    String newdt = dh.subStringDate(meaTime);
                    dh.setMeasureTime(newdt);
                    System.out.println("TIME : " + newdt);

                    dhlist.add(dh);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dhlist;
    }
    
    
    static public List<DataHealth> showUnReadListMeaData(String patId){
         List<DataHealth> dhlist = null;
        JSONParser parser = new JSONParser();
        DataHealth dh = null;

        try {
            
            URL oracle = new URL("http://watjai.me:3000/patients/"+ patId +"/watjaimeasure/latest"); // URL to Parse
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream(), "UTF-8"));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                JSONArray a = (JSONArray) parser.parse(inputLine);
                if (dhlist == null) {
                    dhlist = new ArrayList<>();
                }
                // Loop through each item
                for (Object o : a) {
                    JSONObject tut = (JSONObject) o;
                    dh = new DataHealth();

                    String meaId = (String) tut.get("measuringId");
                    dh.setMeasureId(meaId);

                    String meaTime = (String) tut.get("alertTime");
                    String newdt = dh.subStringDate(meaTime);
                    dh.setMeasureTime(newdt);
                    System.out.println("TIME : " + newdt);

                    dhlist.add(dh);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dhlist;
    }
    
    
    
    
    

    public static void main(String[] args) throws IOException {
        //String idmea = "ME17092400016";
        //showData(idmea);
        // DataHealth d = new DataHealth();
        //d.subStringDate("2017-09-24T19:37:49.453Z");
        changeMeaStatus("ME1701000002");

    }

}
