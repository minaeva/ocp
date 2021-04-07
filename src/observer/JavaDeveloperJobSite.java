package observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {

    List<String> vacancies = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(this.vacancies);
        }
    }
}
