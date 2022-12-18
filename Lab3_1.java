import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double firstarray[] = new double[0];
        int count = 0;
        int k = 1;
        System.out.print("Введите первый элемент массива: ");
        while (!in.hasNext("quit") & in.hasNextDouble()) {
            System.out.print("Введите следующий элемент массива или quit: ");
            double newarray[] = firstarray; //новый вспомогательный массив
            if (in.hasNextDouble()) {
                firstarray = new double[k];
                firstarray[count] = in.nextDouble();
                for (int count1 = 0; count1 + 1 < k; count1++) {
                    firstarray[count1] = newarray[count1];
                }
                k += 1;
                count++;
            }
        }
        System.out.print("Исходный массив: ");
        for (double a : firstarray)
            System.out.print(a + " "); //вывод исходного массива
        if (in.hasNext("quit")) {
            double sum = 0;//sum-сумма кол-ва элементов до k
            for (int count1 = 0; count1 + 1 < k; count1++) {
                sum = sum + firstarray[count1];
                firstarray[count1] = sum / (count1 + 1);
            }
            System.out.println(" ");
            System.out.print("Новый массив: ");
            for (double b : firstarray)
                System.out.print(b + " "); //вывод нового массива
        }
    }
}