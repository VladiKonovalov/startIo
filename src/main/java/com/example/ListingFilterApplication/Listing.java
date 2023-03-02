package com.example.ListingFilterApplication;
public class Listing {
    private String sessionId;
    private String advertiserId;
    private String country;
    private double price;
    private int eventTypeId;
    private int gdpr;
    private double minCpm;
    private double priority;
    private double bidPrice;


    // constructor, getters, setters

//package com.example.ListingFilterApplication;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//@Document(collection = "listings")
//public class Listing {
//    @Id
//    private String sessionId;
//    private String advertiserId;
//    private String country;
//    private Double price;
//    private Integer eventTypeId;
//    private Integer gdpr;
//    private Double minCpm;
//    private Double priority;
//    private Double bidPrice;
//
//    public Listing() {
//    }
//
    public Listing(String sessionId, String advertiserId, String country, Double price, Integer eventTypeId, Integer gdpr, Double minCpm, Double priority, Double bidPrice) {
        this.sessionId = sessionId;
        this.advertiserId = advertiserId;
        this.country = country;
        this.price = price;
        this.eventTypeId = eventTypeId;
        this.gdpr = gdpr;
        this.minCpm = minCpm;
        this.priority = priority;
        this.bidPrice = bidPrice;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(String advertiserId) {
        this.advertiserId = advertiserId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public Integer getGdpr() {
        return gdpr;
    }

    public void setGdpr(Integer gdpr) {
        this.gdpr = gdpr;
    }

    public Double getMinCpm() {
        return minCpm;
    }

    public void setMinCpm(Double minCpm) {
        this.minCpm = minCpm;
    }

    public Double getPriority() {
        return priority;
    }

    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public Double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }

}
// Listing.java
