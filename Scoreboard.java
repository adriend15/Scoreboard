public class Scoreboard {
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;


    public Scoreboard(String one, String two) {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }
    public String getScore(){
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }

    public void recordPlay(int score) {
        if (activeTeam == teamOne){
            teamOneScore += score;
            activeTeam = teamTwo;
        }
        else{
            teamTwoScore += score;
            activeTeam = teamOne;
        }
    }
}
