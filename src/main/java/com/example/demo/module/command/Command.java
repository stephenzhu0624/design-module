package com.example.demo.module.command;

import java.util.ArrayList;
import java.util.List;

public  class Command {

    private List<Receiver> receiverlist = new ArrayList<Receiver>();

    public void addCommand(Receiver receiver){
        receiverlist.add(receiver);
    }

    void executeCommand(){
        for (Receiver receiver : receiverlist){
            receiver.execute();
        }

    }
}
