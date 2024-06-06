package main;

import java.util.Comparator;
import java.util.List;
import java.time.Instant;
import java.time.temporal.ChronoUnit.
import java.util.*;

public class ReservationSystem {
    private final List<Hotel> hotels;

    public ReservationSystem(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public Hotel findCheapestHotel() {
        return hotels.stream().sorted(Comparator.comparingDouble(Hotel::getRate)).findFirst().get();
    }

    public Hotel findCheapestHotel(String day){

        if(Object.nonNull(day){
                    return hotels.stream.filter(Objects :: nonNull).filter(hotel -> Objects.nonNull(hotel)
                                         .filter(hotel -> Objects.nonNull(hotel.getRateMap.get(day)))
                                        .min(Compartor.comparingDouble(hotel -> hotel.getRateMap.get(day))).orElse(null);                                        
        }else{
                     return hotels.stream.filter(Objects :: nonNull).filter(hotel -> Objects.nonNull(hotel)
                                         .filter(hotel -> Objects.nonNull(hotel.getRateMap.get(Instant.now().truncatedTo(ChornoUnit.DAYS).toString())))
                                        .min(Compartor.comparingDouble(hotel -> hotel.getRateMap.get(Instant.now().truncatedTo(ChronoUnit.DAYS).toString()))).orElse(null);                                        
        }
        
    }
}
