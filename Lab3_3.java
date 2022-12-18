import java.util.Scanner;

public class Lab3_3 {
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
        System.out.println(" ");
        if (in.hasNext("quit")) {
            double max = firstarray[0];
            System.out.print("Новый массив: " + max + " ");
            for (int count2 = 0; count2 + 1 < k; count2++) { //вывод элементов, которые больше чем предыдущий максимальный - можно было также реализовать это через метод List.toArray(), но я не уверен что его можно использовать
                if (firstarray[count2]>max) {
                    max=firstarray[count2];
                    System.out.print(max + " ");
                }
            }
        }
    }
}