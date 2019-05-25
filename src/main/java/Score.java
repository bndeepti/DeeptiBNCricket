import com.google.gson.annotations.SerializedName;

public class Score {
    int creditsLeft;

    @SerializedName("team-1")
    String team1;

    @SerializedName("team-2")
    String team2;

    public int getCreditsLeft() {
        return creditsLeft;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }
}
