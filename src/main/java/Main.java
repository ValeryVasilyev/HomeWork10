
import java.time.Instant;

import static java.time.temporal.ChronoField.NANO_OF_SECOND;

public class Main {

    public static void main(String[] args) {
        Factorial fact = new Factorial();
//        Instant start = Instant.now(); // Время старта программы
//        fact.run(); // прогон в main-потоке
//        Instant endMain = Instant.now();
//        System.out.println("Execution time, ns: " + (endMain.getLong(NANO_OF_SECOND) - start.getLong(NANO_OF_SECOND))); // Вывод времени выполнения
//
//        Thread tread1 = new Thread(new Factorial());
//        tread1.start();
//        Instant end1 = Instant.now();
//        System.out.println("Execution time, ns: " + (end1.getLong(NANO_OF_SECOND) - start.getLong(NANO_OF_SECOND)));
//
//        Thread tread2 = new Thread(new Factorial());
//        tread2.start();
//        Instant end2 = Instant.now();
//        System.out.println("Execution time, ns: " + (end2.getLong(NANO_OF_SECOND) - start.getLong(NANO_OF_SECOND)));

        for (int i = 0; i < 5; i++) {
            new Thread(new Factorial()).start(); }
            System.out.println("Waiting end of thread " + Thread.currentThread().getName());
    }


}
