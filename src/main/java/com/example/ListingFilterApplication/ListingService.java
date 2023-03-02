package com.example.ListingFilterApplication;

import java.util.List;

public interface ListingService {
    List<Listing> getListings(double minPrice, double maxPrice, double minMinCpm, double maxMinCpm);
}