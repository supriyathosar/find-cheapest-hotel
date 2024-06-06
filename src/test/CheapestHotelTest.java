package test;

import main.Hotel;
import main.ReservationSystem;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.time.Instant;
import java.time.temporal.ChronoUnit.
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheapestHotelTest {

    @Test
    public void findCheapestHotel(){
        Hotel MiamiBeach = new Hotel(80, "Miami Beach");
        Hotel MiamiDowntown = new Hotel(120, "Miami Downtown");
        Hotel MiamiMidtown = new Hotel(100, "Miami Midtown");
        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(MiamiDowntown);
        hotelList.add(MiamiBeach);
        hotelList.add(MiamiMidtown);
        ReservationSystem reservationSystem = new ReservationSystem(hotelList);
        Hotel cheapestHotel = reservationSystem.findCheapestHotel();
        assertEquals(MiamiBeach, cheapestHotel);
    }

        @Test
    public void findCheapestHotel(){
        Map rateMapMiamiBeach = new HashMap<String,Double>();
        rateMapMiamiBeach.put(Instant.now().truncatedTo(ChornoUnit.DAYS).toString(),80D);
         Map rateMapMiamiDowntown = new HashMap<String,Double>();
        rateMapMiamiDowntown.put(Instant.now().truncatedTo(ChornoUnit.DAYS).toString(),120D);
         Map rateMapMiamiMidtown = new HashMap<String,Double>();
        rateMapMiamiMidtown.put(Instant.now().truncatedTo(ChornoUnit.DAYS).toString(),100D);
        
        Hotel MiamiBeach = new Hotel(rateMapMiamiBeach, "Miami Beach");
        Hotel MiamiDowntown = new Hotel(rateMapMiamiDowntown, "Miami Downtown");
        Hotel MiamiMidtown = new Hotel(rateMapMiamiMidtown, "Miami Midtown");
        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(MiamiDowntown);
        hotelList.add(MiamiBeach);
        hotelList.add(MiamiMidtown);
        ReservationSystem reservationSystem = new ReservationSystem(hotelList);
        Hotel cheapestHotel = reservationSystem.findCheapestHotel(Instant.now().truncatedto(ChronoUnit.DAYS).toString());
        assertEquals(MiamiBeach, cheapestHotel);
    }
    
}
