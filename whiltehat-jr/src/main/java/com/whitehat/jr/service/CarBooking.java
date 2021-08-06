package com.whitehat.jr.service;

import java.util.Map;
import com.whitehat.jr.dao.VehicleData;
import com.whitehat.jr.model.BookingDetails;
import com.whitehat.jr.model.Vehicle;
import com.whitehat.jr.model.VehicleStatus;
import lombok.val;

public class CarBooking implements VehicleBooking{
  
  

  @Override
  public String bookVehicle(BookingDetails details) {
    Map<Integer, Vehicle> map = VehicleData.vehicleMap;
      if(map.containsKey(details.getVehicleId())) {
        val vehicle = map.get(details.getVehicleId());
        vehicle.setStatus(VehicleStatus.BOOKED);
        vehicle.setUserAssigned(details.getUserId());
        return "your vehicle was booked";
      }else {
        return "could not be booked";
      }
    
  }


}
