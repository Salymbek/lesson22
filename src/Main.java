import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();



        ArrayList<Integer>numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
        numbers.add(random.nextInt(1,100));

        }

        ArrayList<Integer>jupSan = new ArrayList<>();
        ArrayList<Integer>takSan = new ArrayList<>();


        for (Integer san:numbers) {
            if (san % 2 ==0){
                jupSan.add(san);
            }else {
                takSan.add(san);
            }
        }
        System.out.println("JUP SANDAR");
        jupSan.forEach(System.out::println);
        System.out.println("TAK SANDAR");
        takSan.forEach(System.out::println);
    }
}