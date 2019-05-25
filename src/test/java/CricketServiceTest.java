import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class CricketServiceTest {

    CricketService cricketService;

    @Before
    public void setup() {
        cricketService = new CricketService("http://www.google.com");
    }

    @Test
    public void testShouldFetchCricketScore() {
        String score = cricketService.fetchCricketScore();
        assertNotNull(score);
    }
}
