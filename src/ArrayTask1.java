import java.util.*;

/**
 * Created by grisha on 8/31/16.
 */
public class ArrayTask1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размерность массива:");
        int size = in.nextInt();

        int[] mass = new int[size];

        for (int i = 0; i< mass.length; i++)
            mass[i] = (int)(Math.random()*5);

        Arrays.sort(mass);

        for (int k: mass)
        System.out.println(k);

        int count = 0;
        for (int i = 0; i< mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {


                if (i != j && mass[i] != -1 && mass[i] == mass[j]){
                    mass[i] = -1;
                    mass[j] = -1;
                    count = count + 1;
                }
            }
        }

        System.out.println("В массиве " + count + " дублей");

    }
}
