package gameMachine.states;

import gameMachine.OneHandBandit;

public class WinState implements State {
    @Override
    public void insertTheCoin(OneHandBandit oneHandBandit) {
        System.out.println("Take your prize first");
    }

    @Override
    public void pullTheLever(OneHandBandit oneHandBandit) {
        System.out.println("Take your prize first");
    }

    @Override
    public void takeThePrize(OneHandBandit oneHandBandit) {
        System.out.println("congratulation !");
        oneHandBandit.setState(new NoCoinState());
    }

    @Override
    public void printActualStatus(OneHandBandit oneHandBandit) {
        System.out.println("win");
    }
}
