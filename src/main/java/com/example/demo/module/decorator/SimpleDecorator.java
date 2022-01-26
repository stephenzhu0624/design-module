package com.example.demo.module.decorator;

public abstract class SimpleDecorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    void wear(){
        if(component != null){
            component.wear();
        }
    }
}
