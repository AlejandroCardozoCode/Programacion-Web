package com.webdev.truckmanagementsystem.Trucks.Truck.Domain.ValueObjects;

import com.webdev.truckmanagementsystem.Shared.Domain.Aggregate.StringValueObject;

public class TruckMechanicalRevisionDate extends StringValueObject {

    private TruckMechanicalRevisionDate() {}

    public  TruckMechanicalRevisionDate(String fecha)
    {
        validate(fecha);
    }

    private void validate(String fecha)
    {
    }
}
