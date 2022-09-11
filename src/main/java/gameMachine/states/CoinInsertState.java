package gameMachine.states;

import gameMachine.OneHandBandit;

public class CoinInsertState implements State{
    @Override
    public void insertTheCoin(OneHandBandit oneHandBandit) {
        System.out.println("Coin is inside");
    }

    @Override
    public void pullTheLever(OneHandBandit oneHandBandit) {
        System.out.println("Drawing...");
    }

    @Override
    public void takeThePrize(OneHandBandit oneHandBandit) {
        System.out.println("First pull the lever.");
    }

    @Override
    public void printActualStatus(OneHandBandit oneHandBandit) {
        oneHandBandit.getState();
    }

    @Override
    public String toString() {
        return "Coin inside.";
    }
}
