import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public class CricketConfiguration {

    private String cricketApiUrl;

    private String apiKey;

    private String uniqueMatchId;

    public static CricketConfiguration loadConfiguration(String fileName) {
        InputStream resourceAsStream = CricketApplication.class.getClassLoader().getResourceAsStream(fileName);
        Yaml configuration = new Yaml();
        return configuration.loadAs(resourceAsStream, CricketConfiguration.class);
    }

    public String getUniqueMatchId() {
        return uniqueMatchId;
    }

    public void setUniqueMatchId(String uniqueMatchId) {
        this.uniqueMatchId = uniqueMatchId;
    }

    public CricketConfiguration() {

    }

    public CricketConfiguration(String cricketApiUrl, String apiKey, String uniqueMatchId) {
        this.cricketApiUrl = cricketApiUrl;
        this.apiKey = apiKey;
        this.uniqueMatchId = uniqueMatchId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getCricketApiUrl() {
        return cricketApiUrl;
    }

    public void setCricketApiUrl(String cricketApiUrl) {
        this.cricketApiUrl = cricketApiUrl;
    }
}
