package gameMachine;

public class Main {
    public static void main(String[] args) {

        OneHandBandit oneHandBandit = new OneHandBandit();

        oneHandBandit.insertTheCoin();
        oneHandBandit.pullTheLever();
        oneHandBandit.takeThePrize();
        oneHandBandit.printActualStatus();



    }
}
