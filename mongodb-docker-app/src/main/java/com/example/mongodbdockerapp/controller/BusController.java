package com.example.mongodbdockerapp.controller;

import com.example.mongodbdockerapp.repo.BusRepository;
import com.example.mongodbdockerapp.model.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BusController {
    @Autowired
    BusRepository repository;

    @GetMapping("/find-buses")
    public List<Bus> getAllBuses() {
        return repository.findAll();
    }

    @GetMapping("/save-bus")
    public ResponseEntity<String> save(@RequestBody Bus bus) {
        Bus savedBus = repository.save(bus);
        if (!savedBus.equals(null)) {
            return new ResponseEntity<>("Bus saved!", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Bus not saved!", HttpStatus.BAD_REQUEST);
        }
    }
}
