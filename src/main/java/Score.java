import com.google.gson.annotations.SerializedName;

public class Score {
    private int creditsLeft;

    @SerializedName("team-1")
    private String team1;

    @SerializedName("team-2")
    private String team2;

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
