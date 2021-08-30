package com.webdev.truckmanagementsystem.Trucks.Truck.Domain.ValueObjects;

import com.webdev.truckmanagementsystem.Shared.Domain.Aggregate.StringValueObject;
import com.webdev.truckmanagementsystem.Trucks.Truck.Domain.Exceptions.PlateLengthNotValid;
import com.webdev.truckmanagementsystem.Trucks.Truck.Domain.Exceptions.PlateLetterNotValid;
import com.webdev.truckmanagementsystem.Trucks.Truck.Domain.Exceptions.PlateNumericNotValid;

public class TruckPlate extends StringValueObject {

    private TruckPlate() {}

    public TruckPlate(String plate) {
        validate(plate);
        this.value = plate;
    }

    private void validate(String plate) throws RuntimeException {
        lenghtValidate(plate);
        plateLetterValidate(plate);
        plateNumericValidate(plate);
    }

    private void lenghtValidate(String plate) throws RuntimeException {
        if (plate.length() != 6)
        {
            throw new PlateLengthNotValid("La longitud de la placa no es correcta");
        }
    }

    private void plateLetterValidate(String plate) {
        if(!Character.isLetter(plate.charAt(0))|| !Character.isLetter(plate.charAt(1)) || !Character.isLetter(plate.charAt(2)))
        {
            throw  new PlateLetterNotValid("la placa no tiene letras validas");
        }
    }

    private void plateNumericValidate(String plate) {
        if(!Character.isDigit(plate.charAt(3))|| !Character.isDigit(plate.charAt(4)) || !Character.isDigit(plate.charAt(5)))
        {
            throw new PlateNumericNotValid("la plana no tiene valor numerico valido");
        }
    }

}


