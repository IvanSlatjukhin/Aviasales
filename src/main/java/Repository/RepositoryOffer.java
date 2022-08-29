package Repository;

import domain.Offer;

public class RepositoryOffer {
    private Offer[] tickets = new Offer[0];

    public void add(Offer offer) {
        Offer[] tmp = new Offer[tickets.length + 1];
        System.arraycopy(tickets, 0, tmp, 0, tickets.length);
        tmp[tmp.length - 1] = offer;
        tickets = tmp;
    }

    public Offer[] getAll() {
        return tickets;
    }

}