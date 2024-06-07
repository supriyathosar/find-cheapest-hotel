package service;

import hotel.dto.Hotel;

import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.time.Instant;
import java.util.*;

public class ReservationSystem {
    private final List<Hotel> hotels;

    public ReservationSystem(List<Hotel> hotels) {
        this.hotels = hotels;
    }



    public Hotel findCheapestHotel(String day){

        if(Objects.nonNull(day)){
                    return hotels.stream().filter(Objects :: nonNull).filter(hotel -> Objects.nonNull(hotel))
                                         .filter(hotel -> Objects.nonNull(hotel.getRateMap().get(day)))
                                        .min(Comparator.comparingDouble(hotel -> hotel.getRateMap().get(day))).orElse(null);
        }else{
                     return hotels.stream().filter(Objects :: nonNull).filter(hotel -> Objects.nonNull(hotel))
                                         .filter(hotel -> Objects.nonNull(hotel.getRateMap().get(Instant.now().truncatedTo(ChronoUnit.DAYS).toString())))
                                        .min(Comparator.comparingDouble(hotel -> hotel.getRateMap().get(Instant.now().truncatedTo(ChronoUnit.DAYS).toString()))).orElse(null);
        }
        
    }
}
