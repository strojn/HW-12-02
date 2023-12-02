package org.example;

import org.example.lambda_closure.Operation;

public class Main {
    public static void main(String[] args)
    {
        int x=20;
        int y=90;
//анонімний клас
        doSub(x, new Operation()
        {
            //overrides the operate() method
            @Override
            public void operate(int n)
            {
//                y += 10;//java: local variables referenced from a lambda expression must be final or effectively final
                System.out.println("Sub is: "+(n-y));
            }
        });
//лямбда
//        Operation anonymousFunction = n -> System.out.println("Sub is: "+(y-n));
        doSub(  x,
                n -> System.out.println("Sub is: "+(y-n))
        );
//        y=100;//java: local variables referenced from a lambda expression must be final or effectively final
    }
    private static void doSub(int i, Operation op)
    {
        op.operate(i);
    }
}