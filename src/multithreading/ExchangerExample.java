package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerExample {

    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friendAction = new ArrayList<>();

        friendAction.add(Action.SCISSORS);
        friendAction.add(Action.PAPER);
        friendAction.add(Action.STONE);
        friendAction.add(Action.STONE);

        List<Action> friendAction2 = new ArrayList<>();
        friendAction2.add(Action.STONE);
        friendAction2.add(Action.STONE);
        friendAction2.add(Action.SCISSORS);
        friendAction2.add(Action.PAPER);

        new BestFriend("Ihor", friendAction, exchanger);
        new BestFriend("Lena", friendAction2, exchanger);
    }
}

enum Action {
    STONE, SCISSORS, PAPER
}

class BestFriend extends Thread {

    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.setName(name);
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if ((myAction == Action.STONE && friendsAction == Action.SCISSORS) ||
                (myAction == Action.SCISSORS && friendsAction == Action.PAPER) ||
                (myAction == Action.PAPER && friendsAction == Action.STONE)) {
            System.out.println(name + " WINS!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                System.out.println("Run of " + Thread.currentThread().getName() + " action = " + action);
                reply = exchanger.exchange(action);
                whoWins(action, reply);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}