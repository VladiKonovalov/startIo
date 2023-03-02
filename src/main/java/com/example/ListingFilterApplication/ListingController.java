package com.example.ListingFilterApplication;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListingController {
    private ListingService listingService;

    @Autowired
    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }

    @GetMapping("/listings")
    public List<Listing> getListings(
            @RequestParam("min_price") double minPrice,
            @RequestParam("max_price") double maxPrice,
            @RequestParam("min_min_cpm") double minMinCpm,
            @RequestParam("max_min_cpm") double maxMinCpm) {
        return listingService.getListings(minPrice, maxPrice, minMinCpm, maxMinCpm);
    }
}
