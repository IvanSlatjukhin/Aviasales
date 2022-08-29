package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Offer implements Comparable<Offer> {
    private int id;
    private int price;
    private String from;
    private String to;
    private int flightTimeInMinutes;

    @Override
    public int compareTo(Offer o) {
        return price - o.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return id == offer.id &&
                price == offer.price &&
                flightTimeInMinutes == offer.flightTimeInMinutes &&
                from.equals(offer.from) &&
                to.equals(offer.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, from, to, flightTimeInMinutes);
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", price=" + price +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", flightTimeInMinutes=" + flightTimeInMinutes +
                '}';
    }

}