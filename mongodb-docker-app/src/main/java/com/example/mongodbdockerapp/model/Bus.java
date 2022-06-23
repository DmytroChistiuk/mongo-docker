package com.example.mongodbdockerapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Bus {
    @Id
    private int id;
    //    @Column(name = "bus_number")
    private String busNumber;
    private String model;
//    @OneToMany(mappedBy = "bus", fetch = FetchType.EAGER)
//    List<Driver> drivers = new ArrayList<>();
}
