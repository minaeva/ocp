package observer;

public class JobSearch {

    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("First");
        jobSite.addVacancy("Second");

        Observer subscriber1 = new Subscriber("Sveta");
        Observer subscriber2 = new Subscriber("Vova");

        jobSite.addObserver(subscriber1);
        jobSite.addObserver(subscriber2);

        jobSite.addVacancy("Third");
    }
}
