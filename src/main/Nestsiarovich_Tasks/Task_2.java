import java.util.Scanner;

public class Task_2 {
        public static void main (String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Введите длину массива: ");
            int size = input.nextInt();
            int[] array = new int[size];
            System.out.println("Введите элементы массива: ");

            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }
            System.out.print("Введённые элементы массива: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(" " + array[i]);
            }
            for(int i = 0; i < array.length; i++){
                if (array[i] % 3 ==0){
                    System.out.println();
                    System.out.print(array[i]+ " кратное 3");
                }
                else if(array[i] % 3 != 0){
                    System.out.println();
                    System.out.print(array[i] + " Число не кратное 3 ");
                }
            }

        }

}
