package hotel.dto;

import java.util.Comparator;
import java.util.Objects;
import java.util.Map;

public class Hotel {


    public String getName() {
        return name;
    }

    private final String name;
    private final Map<String,Double> rateMap;

      public Hotel(Map<String,Double> rateMap, String name) {

          this.rateMap = rateMap;
        this.name = name;
    }



    public Map<String,Double> getRateMap(){
        return this.rateMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hotel)) return false;
        Hotel hotel = (Hotel) o;

        return hotel.getRateMap().entrySet().stream().allMatch(e->e.getValue().equals(this.getRateMap().get(e.getKey()))) &&
                Objects.equals(name, hotel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRateMap(), name);
    }
}
