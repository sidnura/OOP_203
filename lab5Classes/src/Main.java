public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setModel("iPhone XR");
        phone.setNumber(4758457);
        phone.setWeight(0.15);

        System.out.println("Информация о телефоне:");
        System.out.println("Модель: " + phone.getModel());
        System.out.println("Номер: " + phone.getNumber());
        System.out.println("Вес: " + phone.getWeight() + " кг");

        phone.receiveCall("Anna");
        phone.receiveCall("Sasha", 12345);

        phone.sendMessage("Privet", "Kak dela?");



        System.out.println();
        Reader reader1 = new Reader("Сидоров А. В.", 123, "ФМиИТ", "25.04.2004", "1234");
        Reader reader2 = new Reader("Иванов В. А.", 456, "ФЭТ", "25.11.2003", "5678");

        reader1.takeBook(3);
        reader1.takeBook("Математический анализ", "Дифференциальные уравнения", "Дискретная математика");
        reader1.takeBook(new Book("Математический анализ", "Автор1"), new Book("Дифференциальные уравнения", "Автор2"), new Book("Дискретная математика", "Автор3"));
        reader2.returnBook(3);
        reader2.returnBook("Физика1", "Физика2", "Физика3");

    }
}