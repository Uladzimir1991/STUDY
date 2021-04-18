import java.util.Locale;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String input = sc.nextLine();
//                Locale russian = new Locale ("RU");
        String lowerCase = input.toLowerCase(Locale.ROOT);

        if (lowerCase.equals("вячеслав")){
            System.out.println("Привет,Вячеслав!");
        } else {
            System.out.println("Нет такого имени ");
        }
    }
}
