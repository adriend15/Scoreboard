public class Main {
    public static void main(String[] args) {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");

        game.recordPlay(0);
        game.recordPlay(2);

        info = game.getScore();

        System.out.println(info);
    }
}
