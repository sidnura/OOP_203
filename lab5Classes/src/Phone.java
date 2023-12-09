

public class Phone {

    private int number;
    private String model;
    private double weight;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {}

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + ", номер " + number);
    }

    public void sendMessage(String... numbers)
    {
        System.out.println("Отправить сообщение на номера:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
