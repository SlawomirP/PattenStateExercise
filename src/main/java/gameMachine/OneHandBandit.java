package gameMachine;

import gameMachine.states.CoinInsertState;
import gameMachine.states.NoCoinState;
import gameMachine.states.State;

public class OneHandBandit {
    State state;

    public OneHandBandit() {
        this.state = new NoCoinState();
    }
    void insertTheCoin(){
        this.state.insertTheCoin(this);
    }
    void pullTheLever(){
        this.state.pullTheLever(this);
    }
    void takeThePrize(){
        this.state.takeThePrize(this);
    }
    void printActualStatus(){
        this.state.printActualStatus(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

