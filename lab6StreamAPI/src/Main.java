//Блок 1

//№1
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long count = numbers.stream()
                .filter(num -> num % 2 == 0)
                .count();
        System.out.println("Количество парных чисел: " + count);



    }
}


//№2
//import java.util.Arrays;
//import java.util.List;
//public class Main {
//    public static void main(String[] args) {
//        List<String> surnames = Arrays.asList("J1", "H", "k", "J2", "J3", "i", "J4");
//        surnames.stream()
//                .filter(surname -> surname.startsWith("J"))
//                .forEach(System.out::println);
//    }
//}



//№3
//import java.util.Arrays;
//public class Main {
//    public static void main(String[] args) {
//        String[] strings = {"c", "d", "a", "b", "e"};
//        Arrays.stream(strings)
//                .sorted()
//                .forEach(System.out::println);
//    }
//}




//Блок 2
//Задача 1
//import java.util.Arrays;
//import java.util.List;
//public class Main {
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> evenNumbers = findEvenNumbers(numbers);
//        System.out.println("Even numbers: " + evenNumbers);
//    }
//    public static List<Integer> findEvenNumbers(List<Integer> numbers) {
//        return numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .toList();
//    }
//}


//Задача 2
//import java.util.Arrays;
//import java.util.List;
//public class Main {
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("john", "", "julia", "anna", "james", "adam");
//
//        // Приведение всех непустых имен к верхнему регистру
//        List<String> upperCaseNames = names.stream()
//                .filter(name -> !name.isEmpty())
//                .map(String::toUpperCase)
//                .toList();
//
//        System.out.println("Непустые имена в верхнем регистре: " + upperCaseNames);
//
//        // Подсчет количества имен, начинающихся с определенной буквы (например, "J")
//        char startingLetter = 'J';
//        long count = names.stream()
//                .filter(name -> name.startsWith(String.valueOf(startingLetter)))
//                .count();
//
//
//        System.out.println("Количество имен, начинающихся с буквы " + startingLetter + ": " + count);
//    }
//}
