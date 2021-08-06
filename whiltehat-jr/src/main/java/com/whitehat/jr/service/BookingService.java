package com.whitehat.jr.service;

import org.springframework.stereotype.Service;
import com.whitehat.jr.model.BookingDetails;
import com.whitehat.jr.model.VehicleType;

@Service
public class BookingService {
 
  
  
  public String bookAVehicle(BookingDetails details) throws Exception {
    
       
    if(details.getVehicleType().name().equalsIgnoreCase(VehicleType.CAR.name())) {
      VehicleBooking carBooking = new CarBooking();
      return carBooking.bookVehicle(details);
    }
    else if(details.getVehicleType().name().equalsIgnoreCase(VehicleType.SUV.name())) {
      VehicleBooking suvBooking = new SuvBooking();
      return suvBooking.bookVehicle(details);
    }else {
      throw new Exception("not supported");
    }
 
    
  }
  
  
}
