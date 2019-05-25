import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class CricketServiceTest {

    CricketService cricketService;

    @Before
    public void setup() {
        cricketService = new CricketService();
    }

    @Test
    public void testShouldFetchCricketScore() {
        Score score = cricketService.fetchCricketScore();
        assertNull(score);
    }
}
