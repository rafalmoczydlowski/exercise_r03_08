import java.util.Scanner;

public class Greeter implements Runnable {

    private int repeatNumber;
    private String targetName;

    // konstruktor bez parametrów do wpisywania z konsoli
    public Greeter() {
        repeatNumber = 0;
        targetName = "";
    }

    //konstruktor z dwoma parametrami
    public Greeter(int count, String name) {
        this.repeatNumber = count;
        this.targetName = name;
    }

    // metoda zwracająca liczbę powtórzeń komunikatu w metodzie run()
    public int setRepeatNumber() {
        System.out.println("Ile razy mam powtórzyć czynność?");
        Scanner sc = new Scanner(System.in);
        int repeatNumber = sc.nextInt();
        return repeatNumber;
    }

    // metoda zwracająca imię wysyłane do komunikatu w metodzie run()
    public String setName () {
        System.out.println("Podaj imię: ");
        Scanner sc = new Scanner(System.in);
        String targetName = sc.next();
        return targetName;
    }

    // implementacja domyślnej metody z interfejsu Runnable
    public void run() {
        for (int i = 0; i < repeatNumber; i++) {
            System.out.println("Witaj, " + targetName);
        }
    }

    // metoda uruchamiająca każde zadanie w oddzielnym wątku
    public static void runTogether(Runnable... tasks) {
        for (Runnable n : tasks) {
            Thread thread = new Thread(n);
            thread.start();
        }
    }

    // metoda uruchamiająca wszystkie zadania w bieżącym wątku
    public static void runInOrder(Runnable... tasks) {
        for (Runnable n : tasks) {
            n.run();
        }
    }
}