package com.francesca.pascalau.designpatterns.behavioral.state;

public class Fan {

    private final State fanOff;
    private final State fanLow;
    private final State fanMed;

    private State state;

    public Fan() {
        fanOff = new FanOffState(this);
        fanLow = new FanLowState(this);
        fanMed = new FanMedState(this);

        state = fanOff;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public String toString() {
        return state.toString();
    }

    public State getFanOff() {
        return fanOff;
    }

    public State getFanLow() {
        return fanLow;
    }

    public State getFanMed() {
        return fanMed;
    }

    public void setState(State state) {
        this.state = state;
    }
}
