package com.webdev.truckmanagementsystem.Trucks.Truck.Domain.ValueObjects;

import com.webdev.truckmanagementsystem.Shared.Domain.Aggregate.StringValueObject;
import com.webdev.truckmanagementsystem.Trucks.Truck.Domain.Exceptions.NotValidColor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TruckColor extends StringValueObject {

    private TruckColor(){}

    public  TruckColor(String color)
    {
        validate(color);
    }

    private void validate(String color)
    {
        validateColor(color);
    }

    private void validateColor(String color)
    {
        String regex = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
        Pattern p = Pattern.compile(regex);
        if (color == null || color.isEmpty() || !p.matcher(color).matches())
        {
            throw new NotValidColor("el color ingresado no es valido");
        }
    }
}
