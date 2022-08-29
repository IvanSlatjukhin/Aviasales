package Repository;

import domain.Offer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryOfferTest {
    RepositoryOffer repositoryOffer = new RepositoryOffer();
    Offer offer1 = new Offer(1, 400, "SVO", "MBA", 570);
    Offer offer2 = new Offer(2, 300, "SVO", "MBA", 620);
    Offer offer3 = new Offer(3, 200, "SVO", "SIP", 180);
    Offer offer4 = new Offer(4, 100, "SVO", "KVK", 90);

    @BeforeEach
    public void setUp() {
        repositoryOffer.add(offer1);
        repositoryOffer.add(offer2);
        repositoryOffer.add(offer3);
        repositoryOffer.add(offer4);
    }

    @Test
    public void shouldAddAndSortByRepository() {
        Offer[] expected = {offer4, offer3, offer2, offer1};
        Offer[] actual = repositoryOffer.getAll();
        Arrays.sort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

}
