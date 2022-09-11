package gameMachine.states;

import gameMachine.OneHandBandit;

public class LoseState implements State{
    @Override
    public void insertTheCoin(OneHandBandit oneHandBandit) {
        System.out.println("you insert the coin");
    }

    @Override
    public void pullTheLever(OneHandBandit oneHandBandit) {

    }

    @Override
    public void takeThePrize(OneHandBandit oneHandBandit) {

    }

    @Override
    public void printActualStatus(OneHandBandit oneHandBandit) {

    }
}
