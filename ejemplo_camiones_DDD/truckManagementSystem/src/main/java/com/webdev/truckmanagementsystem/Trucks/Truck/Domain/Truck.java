package com.webdev.truckmanagementsystem.Trucks.Truck.Domain;

import com.webdev.truckmanagementsystem.Trucks.Truck.Domain.ValueObjects.*;

import java.util.Objects;

public class Truck {

    private TruckBrand brand;
    private TruckModelYear modelYear;
    private TruckPlate plate;
    private TruckColor color;
    private TruckMechanicalRevisionDate mechanicalRevisionDate;

    public Truck(TruckBrand brand, TruckModelYear modelYear, TruckPlate plate, TruckColor color, TruckMechanicalRevisionDate mechanicalRevisionDate) {
        this.brand = brand;
        this.modelYear = modelYear;
        this.plate = plate;
        this.color = color;
        this.mechanicalRevisionDate = mechanicalRevisionDate;
    }

    public static Truck Create(TruckBrand brand, TruckModelYear modelYear, TruckPlate plate, TruckColor color, TruckMechanicalRevisionDate mechanicalRevisionDate)
    {
        Truck truck = new Truck(brand, modelYear, plate, color, mechanicalRevisionDate);
        //TODO: Pasos intermedios o eventos derivados
        return truck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return Objects.equals(brand, truck.brand) && Objects.equals(modelYear, truck.modelYear) && Objects.equals(plate, truck.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, modelYear, plate);
    }
}
