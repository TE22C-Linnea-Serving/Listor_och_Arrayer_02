import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String[] leksaker = {"Docka", "Kloss", "Lego", "Pussel", "Kritor"};
        String[] klasskamrater = {"Tea", "Aleksandra", "Anna", "Vilma", "Amira"};
        int[] varden = {1,3,4,7,8};

        for(int i=0; i<leksaker.length; i++) {
            System.out.println(klasskamrater[i] + " ger " + leksaker[i] + " betyget " + varden[i]);
        }

        ArrayList<String> cities = new ArrayList<String>();
        boolean fortsatt = true;

        while(fortsatt) {
            System.out.println("Add word:");
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            if(text.equalsIgnoreCase("exit")){
                fortsatt = false;
            }else{
                cities.add(text);
            }
        }
        System.out.println(cities);
    }
}