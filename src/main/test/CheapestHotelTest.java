package main.test;

import hotel.dto.Hotel;
import service.ReservationSystem;
import org.junit.jupiter.api.Test;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.time.Instant;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheapestHotelTest {

        @Test
    public void findCheapestHotel(){
        Map<String,Double> rateMapMiamiBeach = new HashMap<String,Double>();
        rateMapMiamiBeach.put(Instant.now().truncatedTo(ChronoUnit.DAYS).toString(),80D);

         Map<String,Double> rateMapMiamiDowntown = new HashMap<String,Double>();
        rateMapMiamiDowntown.put(Instant.now().truncatedTo(ChronoUnit.DAYS).toString(),120D);

         Map<String,Double> rateMapMiamiMidtown = new HashMap<String,Double>();
        rateMapMiamiMidtown.put(Instant.now().truncatedTo(ChronoUnit.DAYS).toString(),100D);
        
        Hotel miamiBeach = new Hotel(rateMapMiamiBeach, "Miami Beach");
        Hotel miamiDowntown = new Hotel(rateMapMiamiDowntown, "Miami Downtown");
        Hotel miamiMidtown = new Hotel(rateMapMiamiMidtown, "Miami Midtown");
        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(miamiDowntown);
        hotelList.add(miamiBeach);
        hotelList.add(miamiMidtown);
        ReservationSystem reservationSystem = new ReservationSystem(hotelList);
        Hotel cheapestHotel = reservationSystem.findCheapestHotel(Instant.now().truncatedTo(ChronoUnit.DAYS).toString());
        assertTrue(cheapestHotel.getName().equals(miamiBeach.getName()));
    }
    
}
