package o3_innerClasses;

public class O1_Fox {
    public static void main(String[] args) {
//        new Den();
        O1_Fox o1Fox = new O1_Fox();
        O1_Fox.Den den = o1Fox.new Den();

    }

    public void goHome() {
        new Den();
    }

    private class Den{}

}
