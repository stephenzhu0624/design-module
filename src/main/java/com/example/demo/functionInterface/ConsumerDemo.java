package com.example.demo.functionInterface;

import javax.swing.*;
import java.beans.DesignMode;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerDemo {



    public static void main(String[] args) { ;

        ConsumerDemo demo = new ConsumerDemo();
        ConsumerTest test= new ConsumerTest();
        BiConsumer<DemoVO, Consumer<Object>> printMessage = demo::printMessage;
        printMessage.accept(new DemoVO("a","b"),s -> test.accept2(s));
        Function<String,String> function = s -> test.firstMethod(s);
        Consumer<DemoVO> accept = test::accept;
        String abcfirst = function.apply("abcfirst");
        System.out.println(abcfirst);
//        DemoVO demoVO = new DemoVO("a", "b");
//        demo.printMessage(demoVO,(s1)->test.accept(s1));
//        demo.printMessage(new DemoVO("b","c"),(s1)->test.accept2(s1));
    }

    void printMessage(DemoVO message, Consumer<Object> consumerTestFunction){
        consumerTestFunction.accept(message);

    }
}
