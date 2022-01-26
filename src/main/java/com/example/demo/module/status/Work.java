package com.example.demo.module.status;

public class Work {
    private State state;

    public int time ;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Work() {
    }

    public Work(State state, int time) {
        this.state = state;
        this.time = time;
    }
    public void work(){
        state.work(this);
    }
}
