package com.whitehat.jr.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vehicle {

  private int vehicleId;
  private VehicleType vehicleType;
  private VehicleStatus status;
  private double rate;
  private String currentLocation;// = refreshed every 15 minute considering long journey
  private int userAssigned;
  
}
