package com.whitehat.jr.dao;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.ComponentScan;
import com.whitehat.jr.model.Vehicle;
import com.whitehat.jr.model.VehicleStatus;
import com.whitehat.jr.model.VehicleType;
import lombok.val;

@ComponentScan
public class VehicleData {
  
  public static Map<Integer, Vehicle> vehicleMap = new HashMap<>();
  
  public static void loadVehicles() {
    
    val vehicle1 = new Vehicle();
    vehicle1.setVehicleId(1);
    vehicle1.setStatus(VehicleStatus.AVAILABLE);
    vehicle1.setVehicleType(VehicleType.CAR);
    vehicle1.setRate(12.6);
    vehicle1.setCurrentLocation("1000.00|200.07");
    
    vehicleMap.put(vehicle1.getVehicleId(), vehicle1);
    
    val vehicle2 = new Vehicle();
    vehicle2.setVehicleId(2);
    vehicle2.setStatus(VehicleStatus.BOOKED);
    vehicle2.setVehicleType(VehicleType.SUV);
    vehicle2.setRate(19.6);
    vehicle2.setCurrentLocation("1009.00|200.07");
    
    vehicleMap.put(vehicle2.getVehicleId(), vehicle2);
    
  }
}
