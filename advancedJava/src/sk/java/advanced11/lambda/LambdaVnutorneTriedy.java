package sk.java.advanced11.lambda;

public class LambdaVnutorneTriedy {
    // lambda vyrazy su len skratky, ako napisat vnutorne anonymne triedy
    public static void main(String[] args) {
        ILambdaExamples lambda = () -> System.out.println("hello world Anonynymna vnutorna trieda");

        ILambdaExamples lambda2 = new ILambdaExamples() {// vnutorna anonymna trieda lebo sa neda vytvorit konstruktor z implementacie
            @Override
            public void print() {
                // vnutorna anonymna trieda lebo sa neda vytvorit konstruktor z implementacie
                System.out.println("hello world Anonynymna vnutorna trieda 2");
            }
        };

        //lambda.print();
        printIt(lambda);
        printIt(lambda2);
    }

    public static void printIt(ILambdaExamples lambda){
        lambda.print();
    }
}
