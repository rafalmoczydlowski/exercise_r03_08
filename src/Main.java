public class Main {
    public static void main(String[] args) {
        String name1 = new Greeter().setName();
        int count = new Greeter().setRepeatNumber();

        Runnable eloszki = new Greeter(count, name1);
        eloszki.run();

        Runnable eloszki2 = new Greeter(6, "Kamil");
        Thread thread = new Thread(eloszki2); // wywołanie metody run() w nowym wątku
        thread.start();
    }
}
