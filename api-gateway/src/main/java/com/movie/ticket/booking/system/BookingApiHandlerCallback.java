package com.movie.ticket.booking.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingApiHandlerCallback {


    @GetMapping("/booking-fallback")
    public String BookingApiFallback(){
        return "Booking Service is in maintenance mode. Please try after sometime";
    }
}
