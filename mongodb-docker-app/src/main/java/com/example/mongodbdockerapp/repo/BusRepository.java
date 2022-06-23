package com.example.mongodbdockerapp.repo;

import com.example.mongodbdockerapp.model.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BusRepository extends MongoRepository<Bus, Integer> {
}
