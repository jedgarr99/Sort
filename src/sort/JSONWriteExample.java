/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;
// Java program for write JSON to a file 
  
import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
import java.util.LinkedHashMap; 
import java.util.Map; 
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
  
public class JSONWriteExample 
{ 
    public static void main(String[] args) throws FileNotFoundException  
    { 
        // creating JSONObject 
        JSONObject jo = new JSONObject(); 
          
        // putting data to JSONObject 
        jo.put("business_id", "1SWheh84yJXfytovILXOAQ"); 
        jo.put("name", "Arizona Biltmore Golf Club"); 
        jo.put("address", "2818 E Camino Acequia Drive"); 
        jo.put( "city", "Phoenix" ); 
        jo.put( "state","AZ" ); 
        jo.put("postal_code", "85016"  ); 
        jo.put("latitude", 33.5221425  ); 
        jo.put( "longitude", -112.0184807 ); 
        jo.put( "stars", 3 ); 
        jo.put("review_count", 5  );
        jo.put("is_open", 0  );
        
          
        // for address data, first create LinkedHashMap 
        Map m = new LinkedHashMap(4); 
        m.put("streetAddress", "21 2nd Street"); 
        m.put("city", "New York"); 
        m.put("state", "NY"); 
        m.put("postalCode", 10021); 
          
        // putting address to JSONObject 
        jo.put("address", m); 
          
        // for phone numbers, first create JSONArray  
        JSONArray ja = new JSONArray(); 
          
        m = new LinkedHashMap(2); 
        m.put("type", "home"); 
        m.put("number", "212 555-1234"); 
          
        // adding map to list 
        ja.add(m); 
          
        m = new LinkedHashMap(2); 
        m.put("type", "fax"); 
        m.put("number", "212 555-1234"); 
          
        // adding map to list 
        ja.add(m); 
          
        // putting phoneNumbers to JSONObject 
        jo.put("phoneNumbers", ja); 
          
        // writing JSON to file:"JSONExample.json" in cwd 
        PrintWriter pw = new PrintWriter("eda.json"); 
        pw.write(jo.toJSONString()); 
          
        pw.flush(); 
        pw.close(); 
        
        /*{
  "business_id": "1SWheh84yJXfytovILXOAQ",
  "name": "Arizona Biltmore Golf Club",
  "address": "2818 E Camino Acequia Drive",
  "city": "Phoenix",
  "state": "AZ",
  "postal_code": "85016",
  "latitude": 33.5221425,
  "longitude": -112.0184807,
  "stars": 3,
  "review_count": 5,
  "is_open": 0,
  "attributes": {
    "GoodForKids": "False"
  },
  "categories": "Golf, Active Life",
  "hours": null
}
        
       {
     "lastName":"Smith",
    "address":{
        "streetAddress":"21 2nd Street",
         "city":"New York",
         "state":"NY",
         "postalCode":10021
    },
     "age":25,
     "phoneNumbers":[
            {
            "type":"home", "number":"212 555-1234"
            },
         {
            "type":"fax", "number":"212 555-1234"
         }
     ],
     "firstName":"John"
} */
        
        
    } 
} 