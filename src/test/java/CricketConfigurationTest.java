import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CricketConfigurationTest {

    @Test
    public void shouldLoadConfigFRomResources() {
        String configFileName = "application_test.yml";
        CricketConfiguration cricketConfiguration = CricketConfiguration.loadConfiguration(configFileName);
        assertEquals("dummy", cricketConfiguration.getApiKey());
        assertEquals("123456", cricketConfiguration.getUniqueMatchId());
        assertEquals("https://cricapi.com/api/cricketScoretest", cricketConfiguration.getCricketApiUrl());
    }
}