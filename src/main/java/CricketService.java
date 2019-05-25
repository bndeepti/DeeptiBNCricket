import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CricketService {

    HttpURLConnection urlConnection;
    Logger logger = Logger.getLogger("CricketService");

    public CricketService(String cricketApiUrl) {
        try {
            URL url = new URL(cricketApiUrl);
            urlConnection = (HttpURLConnection) url.openConnection();
        } catch (MalformedURLException e) {
            logger.log(Level.SEVERE, "Malformed Cricket API Url");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Cricket API connection closed");
        }
    }

    public String fetchCricketScore() {
        try {
            return urlConnection.getResponseMessage();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Cricket API connection closed");
        }
        return null;
    }
}
