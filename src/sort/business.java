/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.ArrayList;
import java.util.Objects;
 
import java.util.Comparator;

/**
 *
 * @author elisaortizloyola
 * @param <T>
 */
public class business implements Comparable{
    private String business_id;
    private String name; 
    private String address1; 
    private String city; 
    private String state; 
    private String postal_code; 
    private Double latitude; 
    private  Double longitude; 
    private Double stars;
    private Long review_count;
    private Long is_open;
    ArrayList<String> attributes;
    private String categories; 
    ArrayList<String> hours;

    public business(String business_id, String name, String address1, String city, String state, String postal_code, Double latitude, Double longitude, Double stars, Long review_count, Long is_open, ArrayList<String> attributes, String categories, ArrayList<String> hours) {
        this.business_id = business_id;
        this.name = name;
        this.address1 = address1;
        this.city = city;
        this.state = state;
        this.postal_code = postal_code;
        this.latitude = latitude;
        this.longitude = longitude;
        this.stars = stars;
        this.review_count = review_count;
        this.is_open = is_open;
        this.attributes = attributes;
        this.categories = categories;
        this.hours = hours;
    }

    public String getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(String business_id) {
        this.business_id = business_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getStars() {
        return stars;
    }

    public void setStars(Double stars) {
        this.stars = stars;
    }

    public Long getReview_count() {
        return review_count;
    }

    public void setReview_count(Long review_count) {
        this.review_count = review_count;
    }

    public Long getIs_open() {
        return is_open;
    }

    public void setIs_open(Long is_open) {
        this.is_open = is_open;
    }

    public ArrayList<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<String> attributes) {
        this.attributes = attributes;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public ArrayList<String> getHours() {
        return hours;
    }

    public void setHours(ArrayList<String> hours) {
        this.hours = hours;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final business other = (business) obj;
        if (!Objects.equals(this.business_id, other.business_id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "business{" + "business_id=" + business_id + ", name=" + name + ", address1=" + address1 + ", city=" + city + ", state=" + state + ", postal_code=" + postal_code + ", latitude=" + latitude + ", longitude=" + longitude + ", stars=" + stars + ", review_count=" + review_count + ", is_open=" + is_open + ", attributes=" + attributes.toString() + ", categories=" + categories + ", hours=" + hours.toString() + '}';
    }


    @Override
    public int compareTo(Object o) {
        if(o.getClass().getSimpleName().equals("business")){
            return this.business_id.compareTo(((business)o).getBusiness_id());
        }
        else
            return -10;    
    }

    
    
    
}
