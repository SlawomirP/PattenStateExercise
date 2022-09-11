package gameMachine.states;

import gameMachine.OneHandBandit;

public interface State {

    //metody dla głownej klasy - automatu do gry, beda rozwijane
    //w kazdej klasie ze stanem
    void insertTheCoin(OneHandBandit oneHandBandit);
    void pullTheLever(OneHandBandit oneHandBandit);
    void takeThePrize(OneHandBandit oneHandBandit);
    void printActualStatus(OneHandBandit oneHandBandit);
}
