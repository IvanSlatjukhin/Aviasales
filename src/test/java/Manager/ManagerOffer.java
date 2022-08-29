package Manager;

import domain.Offer;
import Repository.RepositoryOffer;

import java.util.Arrays;

public class ManagerOffer {
    private RepositoryOffer RepositoryOffer;

    public ManagerOffer(RepositoryOffer repositoryOffer) {
        this.RepositoryOffer = repositoryOffer;
    }

    public void add(Offer offer) {
        RepositoryOffer.add(offer);
    }

    public Offer[] findAll(String from, String to) {
        Offer[] result = new Offer[0];
        for (Offer ticket : RepositoryOffer.getAll()) {
            if (ticket.getFrom().equals(from) && ticket.getTo().equals(to)) {
                Offer[] tmp = new Offer[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

}