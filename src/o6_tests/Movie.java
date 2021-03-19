package o6_tests;

public class Movie {
    private int butter = 5;

    private Movie() {
    }

    public static void main(String[] args) {
        var movie = new Movie();
        Movie.Popcorn in = new Movie().new Popcorn();
        in.startMovie();
    }

    protected class Popcorn {
        private Popcorn() {
        }

//        public static int butter = 10;

        public void startMovie() {
            System.out.println(butter);
        }
    }

}
