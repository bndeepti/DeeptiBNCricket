import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class CricketServiceTest {

    CricketService cricketService;
    String cricketApiUrl = "https://cricapi.com/api/cricketScore?apikey=VxTrpVBGuiYb2fJBOwukYHS4R9r2&unique_id=1034809";

    @Before
    public void setup() {
        cricketService = new CricketService(cricketApiUrl);
    }

    @Test
    public void testShouldFetchCricketScoreFromCricketAPI() throws IOException {
        Score score = cricketService.fetchCricketScore();
        assertNotNull(score);
        assertEquals("England", score.getTeam1());
        assertEquals("India", score.getTeam2());
        assertNotNull(score.getCreditsLeft());
    }
}
