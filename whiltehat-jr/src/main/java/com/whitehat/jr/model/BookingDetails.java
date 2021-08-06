package com.whitehat.jr.model;

import java.util.Date;
import lombok.Data;

@Data
public class BookingDetails {

  private int vehicleId;
  private VehicleType vehicleType;
  private double rate;
  private double distance;
  private Date startTime;
  private int userId;
  
}
