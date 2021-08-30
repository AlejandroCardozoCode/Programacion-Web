package com.webdev.truckmanagementsystem.Trucks.Truck.Application.Create;

import com.webdev.truckmanagementsystem.Trucks.Truck.Domain.Ports.TruckRepository;
import com.webdev.truckmanagementsystem.Trucks.Truck.Domain.Truck;
import com.webdev.truckmanagementsystem.Trucks.Truck.Domain.ValueObjects.*;

public class TruckCreator {

    private TruckRepository repository;

    public TruckCreator(TruckRepository repository) {
        this.repository = repository;
    }

    public void execute(String id, String brand, Integer modelYear, String plate, String color, String fecha) {
        Truck truck = Truck.Create(new TruckBrand(brand), new TruckModelYear(modelYear), new TruckPlate(plate), new TruckColor(color), new TruckMechanicalRevisionDate(fecha));
        repository.save(truck);
    }
}
