package com.whitehat.jr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.whitehat.jr.model.BookingDetails;
import com.whitehat.jr.service.BookingService;

@RestController
public class BookVehicleController {
  
  @Autowired
  private BookingService bookingService;

  
  @PostMapping(path = "vehicles/book")
  public String bookVehicle(@RequestBody BookingDetails details) throws Exception{
    
    return bookingService.bookAVehicle(details);
    
 
  }
  
}
