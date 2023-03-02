package com.example.ListingFilterApplication;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListingServiceImpl implements ListingService {
    private List<Listing> listings;

    @Autowired
    public ListingServiceImpl(@Value("classpath:listing-details.csv") Resource resource) throws IOException, CsvValidationException {
        // load data from CSV file
        CSVReader reader = new CSVReader(new InputStreamReader(resource.getClass().getResourceAsStream("...")));
        String[] header = reader.readNext(); // skip header row
        CsvToBean<Listing> csvToBean = new CsvToBeanBuilder(reader).withType(Listing.class).build();
        this.listings = csvToBean.parse();
    }

    @Override
    public List<Listing> getListings(double minPrice, double maxPrice, double minMinCpm, double maxMinCpm) {
        // filter listings based on query parameters
        return listings.stream()
                .filter(l -> l.getPrice() >= minPrice && l.getPrice() <= maxPrice)
                .filter(l -> l.getMinCpm() >= minMinCpm && l.getMinCpm() <= maxMinCpm)
                .collect(Collectors.toList());
    }
}