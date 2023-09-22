package exercise.coding101.kiwee.methods;

public class AfterSchoolRoutine implements AfterSchool {
    public static void main(String[] args) {
        // call methods with following five activities in any order you'd like

        // playPiano
        // playSoccer
        // makeFunOfDad
        // makeFunOfMom
        // eatSnack
    }

    @Override
    public void playPiano(String myName) {
        // TODO Auto-generated method stub
    }

    @Override
    public int playSoccerAndScore(int playingTime) {
        int score = (int) Math.random() * 10;
        System.out.println("I played " + playingTime + " and scored " + score);

        return score;
    }

    @Override
    public void makeFunOfDad() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean makeFunOfMom() {
        boolean success = Math.random() > 0.5;
        // TODO Auto-generated method stub

        return success;
    }

    @Override
    public String eatSnack() {
        // TODO Auto-generated method stub
        return null;
    }
}
