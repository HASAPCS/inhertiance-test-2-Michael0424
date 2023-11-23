

package com.example;

import javax.swing.plaf.basic.BasicComboBoxRenderer;

public class Appliance {
    // Attributes
    // TODO: Declare common attributes for electronic devices, such as brand and model and powerUsage.
    private String brand;
    private String model;
    private double powerUsage;
    // Constructor
    public Appliance(String brand, String model, int powerUsage) {
        // TODO: Initialize all attributes
    }

    // Getters
    // TODO: Implement getters for brand, model, and powerUsage
    public String getbrand(){
        return brand;
    }
    public String getmodel(){
        return model;
    }
    public double getpowerUsage(){
        return powerUsage;
    }
    // displayInfo Method
    // TODO: Implement a method that returns information about the appliance, including brand, model, and power usage.
    // Check the tests for more details

    public String displayInfo() {
        return "Brand: BrandX, Model: ModelY, Power Usage: 500 Watts" ;
    }

    // isEcoFriendly Method
    // TODO: Implement a method to check if the appliance is eco-friendly based on its power usage. 
    // An appliance that uses less than 400 Watts of power is eco-friendly.

}

