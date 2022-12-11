import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Monkey> monkeys = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {

        for (int i = 0; i < 8; i++) {
            monkeys.add(new Monkey());
        }

        String[][] input = loadData();

        monkeys.get(0).items.add(83);
        monkeys.get(0).items.add(97);
        monkeys.get(0).items.add(95);
        monkeys.get(0).items.add(67);
        monkeys.get(1).items.add(71);
        monkeys.get(1).items.add(70);
        monkeys.get(1).items.add(79);
        monkeys.get(1).items.add(88);
        monkeys.get(1).items.add(56);
        monkeys.get(1).items.add(70);


    }

    public static String[][] loadData() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Puzzle11.txt"));
        String[][] input = new  String[8][6];
        int counter = 0;
        int innerCounter = 0;

        while(sc.hasNext()){
            String s = sc.nextLine();
            if(s.equals("")){
                innerCounter = 0;
                counter ++;
            } else {
                input[counter][innerCounter] = s;
                innerCounter ++;
            }
        }

        return input;
    }
    public static void adjustData(String[][] input){

    }

}
