/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

// Java program to read JSON from a file 
  
import java.io.FileReader; 
import java.util.Iterator; 
import java.util.Map; 
  
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 
  
public class leeJason 
{ 
    public static void main(String[] args) throws Exception  
    { 
        // parsing file "JSONExample.json" 
        //Object obj = new JSONParser().parse(new FileReader("business10k.json")); 
           Object obj = new JSONParser().parse(new FileReader("prueba3.json")); 
        // typecasting obj to JSONObject 
        JSONObject jo = (JSONObject) obj; 

        String business_id= (String) jo.get("business_id"); 
        String name = (String) jo.get("name"); 
        String address1= (String) jo.get("address"); 
        String city = (String) jo.get("city"); 
        String state = (String) jo.get("state"); 
        String postal_code = (String) jo.get("postal_code"); 
        Double latitude = (Double) jo.get("latitude"); 
        Double longitude = (Double) jo.get("longitude"); 
        Double stars = (Double) jo.get("stars");
        Long review_count = (Long) jo.get("review_count");
        Long is_open = (Long) jo.get("is_open");
          
        System.out.println(business_id); 
        System.out.println(name); 

        Map attributes = ((Map)jo.get("attributes")); 
          
        if(attributes!=null){
            Iterator<Map.Entry> itr1 = attributes.entrySet().iterator(); 
            while (itr1.hasNext()) { 
              Map.Entry pair = itr1.next(); 
              System.out.println(pair.getKey() + " : " + pair.getValue());  
            }
        } 
        String categories = (String) jo.get("categories");
        
        Map hours = ((Map)jo.get("hours")); 

        if(hours!=null){
           Iterator<Map.Entry> itr2 = hours.entrySet().iterator(); 
        while (itr2.hasNext()) { 
            Map.Entry pair = itr2.next(); 
            System.out.println(pair.getKey() + " : " + pair.getValue()); 
        }  
        }
 
        
        }  
    } 
 