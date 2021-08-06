package com.whitehat.jr.service;

import org.springframework.stereotype.Component;
import com.whitehat.jr.model.BookingDetails;

@Component
public interface VehicleBooking {
  String bookVehicle(BookingDetails details);
}
