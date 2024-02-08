import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Factorial implements Runnable {
    /*public int number;
    public Factorial(Integer number){
        this.number = number;
    }*/
    @Override
    public void run() {
        List<Integer> numbers = new ArrayList<>();
        try {
            numbers = readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int number : numbers) {
            int initialNumber = number;
            int result = 1;
            if (number <= 0) {
                System.out.println("Provide only a positive number!");
            } else if (number == 1) {
                System.out.println(number + " factorial is 1");;
            } else {
                do {
                    result *= number;
                    number--;
                } while (number > 1);
                System.out.println(initialNumber + " factorial is " + result);
            }
        }
        System.out.println(Thread.currentThread().getName() + " ends");
    }
    public static List<Integer> readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("numbers"));
        StringBuffer stringBuffer = new StringBuffer("");
        String line;
        List<Integer> lines = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            stringBuffer.append(line);
            lines.add(Integer.parseInt(line));
        }
        br.close();
        return lines;
    }
}
