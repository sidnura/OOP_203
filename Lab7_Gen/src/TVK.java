import java.io.Serializable;

public class TVK <T extends Comparable<T>, V extends Serializable, K extends Number> {
    private T variable1;
    private V variable2;
    private K variable3;

    public TVK(T variable1, V variable2, K variable3) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;
    }

    public T getVariable1() {
        return variable1;
    }

    public V getVariable2() {
        return variable2;
    }

    public K getVariable3() {
        return variable3;
    }

    public void printClassNames() {
        System.out.println("Variable 1 class: " + variable1.getClass().getName());
        System.out.println("Variable 2 class: " + variable2.getClass().getName());
        System.out.println("Variable 3 class: " + variable3.getClass().getName());
    }

    public static void main(String[] args) {
        class Animal {}

        class Dog extends Animal implements Serializable {
            private String name;

            public Dog(String name) {
                this.name = name;
            }
        }

        Integer var1 = 10;
        Dog var2 = new Dog("Sharik");
        Double var3 = 3.14;

        TVK<Integer, Dog, Double> tvk = new TVK<>(var1, var2, var3);
        tvk.printClassNames();

    }
}