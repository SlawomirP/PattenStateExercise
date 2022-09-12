package gameMachine.states;

import gameMachine.OneHandBandit;

import java.util.Random;

public class CoinInsertState implements State{
    Random random = new Random();
    @Override
    public void insertTheCoin(OneHandBandit oneHandBandit) {
        System.out.println("Coin is inside");
    }

    @Override
    public void pullTheLever(OneHandBandit oneHandBandit) {
        System.out.println("Drawing...");
        int draw = random.nextInt(11);
        if(draw>=0 && draw<2){
            System.out.println("you win");
            oneHandBandit.setState(new WinState());
        } else {
            System.out.println("You lose");
            oneHandBandit.setState(new NoCoinState());
        }
    }

    @Override
    public void takeThePrize(OneHandBandit oneHandBandit) {
        System.out.println("First pull the lever.");

    }

    @Override
    public void printActualStatus(OneHandBandit oneHandBandit) {
        System.out.println("coin inside");
    }

}
