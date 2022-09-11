package gameMachine.states;

import gameMachine.OneHandBandit;

public class NoCoinState implements State{
    @Override
    public void insertTheCoin(OneHandBandit oneHandBandit) {
        System.out.println("you insert the coin");
        oneHandBandit.setState(new CoinInsertState());
    }

    @Override
    public void pullTheLever(OneHandBandit oneHandBandit) {
        System.out.println("You have to insert the coin.");
    }

    @Override
    public void takeThePrize(OneHandBandit oneHandBandit) {
        System.out.println("You have to insert the coin.");
    }

    @Override
    public void printActualStatus(OneHandBandit oneHandBandit) {
        System.out.println(oneHandBandit.getState());
    }

    @Override
    public String toString() {
        return "No coin !!";
    }
}
