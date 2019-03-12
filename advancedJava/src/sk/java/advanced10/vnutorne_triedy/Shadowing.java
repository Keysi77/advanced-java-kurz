package sk.java.advanced10.vnutorne_triedy;

public class Shadowing {
// zatienovanie premennej
    public int x = 0;

    class FirstLevel{

        public int x =1;

        void methodInFirstLevel(int x){
            System.out.println("x = " +x); // 23
            System.out.println("this.x = " +this.x); // 1
            System.out.println("Shadowing this.x = " +Shadowing.this.x); // 0
        }
    }

    public static void main(String[] args) {
        Shadowing st = new Shadowing();
        Shadowing.FirstLevel f1 = st.new FirstLevel();
        f1.methodInFirstLevel(23);
    }
}
