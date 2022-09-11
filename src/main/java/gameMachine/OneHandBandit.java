package gameMachine;

import gameMachine.states.NoCoinState;
import gameMachine.states.State;

public class OneHandBandit {
    State state;

    public OneHandBandit() {
        this.state = new NoCoinState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

