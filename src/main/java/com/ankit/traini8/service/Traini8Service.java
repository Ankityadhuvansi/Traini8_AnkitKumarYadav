package com.ankit.traini8.service;

import com.ankit.traini8.model.TraineeCenter;
import com.ankit.traini8.repository.Traini8Repo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Traini8Service {
    @Resource
    private Traini8Repo traini8Repo;

    public TraineeCenter createTrainingCenter(TraineeCenter traineeCenter) {
        return traini8Repo.save(traineeCenter);
    }

    public List<TraineeCenter> getAllTrainingCenters() {
        return traini8Repo.findAll();
    }
}
