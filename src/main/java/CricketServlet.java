import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class CricketServlet extends HttpServlet {

    CricketService cricketService;

    public CricketServlet(CricketService cricketService) {
        this.cricketService = cricketService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        Score score = cricketService.fetchCricketScore();
        Writer w = resp.getWriter();
        w.write("Team 1 is " + score.getTeam1() + "\n");
        w.write("Team 2 is " + score.getTeam2() + "\n");
        w.write("And winning score is " + score.getCreditsLeft() + "\n");
        w.flush();
        w.close();
    }
}
