package com.ankit.traini8.controller;

import com.ankit.traini8.model.TraineeCenter;
import com.ankit.traini8.service.Traini8Service;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-center")
public class Controller {

    @Resource
    private final Traini8Service traini8Service;

    public Controller(Traini8Service traini8Service) {
        this.traini8Service = traini8Service;
    }

    @PostMapping
    public ResponseEntity<TraineeCenter> createTrainingCenter(@Valid @RequestBody TraineeCenter traineeCenter) {
        return ResponseEntity.ok(traini8Service.createTrainingCenter(traineeCenter));
    }

    @GetMapping
    public ResponseEntity<List<TraineeCenter>> getAllTrainingCenters() {
        return ResponseEntity.ok(traini8Service.getAllTrainingCenters());
    }
}