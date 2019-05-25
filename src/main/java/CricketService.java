import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CricketService {

    private HttpURLConnection urlConnection = null;
    final Logger logger = Logger.getLogger("CricketService");

    // TODO read API url from a config file
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

    public Score fetchCricketScore() throws IOException {
        InputStream in = null;
        try {
            in = urlConnection.getInputStream();
            String encoding = urlConnection.getContentEncoding();
            encoding = encoding == null ? "UTF-8" : encoding;
            String response = IOUtils.toString(in, encoding);
            return new Gson().fromJson(response, Score.class);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Cricket API connection closed");
        } finally {
            in.close();
        }
        return null;
    }
}
