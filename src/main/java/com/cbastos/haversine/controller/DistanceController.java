package com.cbastos.haversine.controller;

import com.cbastos.haversine.model.DistanceRequest;
import com.cbastos.haversine.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/distance")
public class DistanceController {

    @Autowired
    private DistanceService distanceService;

    @PostMapping("/calculate")
    public double calculateDistance(@RequestBody DistanceRequest request) {
        return distanceService.calculateDistance(
                request.getLat1(),
                request.getLon1(),
                request.getLat2(),
                request.getLon2()
        );
    }
}