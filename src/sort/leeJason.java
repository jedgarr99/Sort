/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

// Java program to read JSON from a file 
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class leeJason {

    public static void main(String[] args) throws Exception {
        
        ArrayList<String> atributes, ours;
        ArrayList<business> b = new ArrayList<>();
        String line=null;

        FileReader f = new FileReader("business10k.json");
        BufferedReader br = new BufferedReader(f);
        
        line=br.readLine();
        while ( line != null) {
            Object obj = new JSONParser().parse(line);
            JSONObject jo = (JSONObject) obj;

            String business_id = (String) jo.get("business_id");
            String name = (String) jo.get("name");
            String address1 = (String) jo.get("address");
            String city = (String) jo.get("city");
            String state = (String) jo.get("state");
            String postal_code = (String) jo.get("postal_code");
            Double latitude = (Double) jo.get("latitude");
            Double longitude = (Double) jo.get("longitude");
            Double stars = (Double) jo.get("stars");
            Long review_count = (Long) jo.get("review_count");
            Long is_open = (Long) jo.get("is_open");
            atributes = new ArrayList<>();

            Map attributes = ((Map) jo.get("attributes"));

            if (attributes != null) {
                Iterator<Map.Entry> itr1 = attributes.entrySet().iterator();
                while (itr1.hasNext()) {
                    Map.Entry pair = itr1.next();
                    atributes.add(pair.getKey() + " : " + pair.getValue()); 
                }
            }
            String categories = (String) jo.get("categories");
            ours = new ArrayList<>();
            Map hours = ((Map) jo.get("hours"));

            if (hours != null) {
                Iterator<Map.Entry> itr2 = hours.entrySet().iterator();
                while (itr2.hasNext()) {
                    Map.Entry pair = itr2.next();
                    ours.add(pair.getKey() + " : " + pair.getValue()); 
                }
            }
            business a = new business(business_id, name, address1, city, state, postal_code, latitude, longitude, stars, review_count, is_open,
                    atributes, categories, ours);
            b.add(a);
            line=br.readLine();
        }

    }
}
