package Lesson_2;

public class Outer {

    private int outerVar;

    public Outer(int outerVar) {
        this.outerVar = outerVar;
    }

    public void infoOuter() {
        System.out.println(outerVar);
       // System.out.println(innerVar);
    }

    class Inner {
        private int innerVar;

        public Inner(int innerVar) {
            this.innerVar = innerVar;
        }

        public void infoInner() {
            System.out.println(outerVar);
            System.out.println(innerVar);
        }

    }
}
