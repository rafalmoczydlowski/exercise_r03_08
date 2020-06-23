public class Main {
    public static void main(String[] args) {
        String name1 = new Greeter().setName();
        int count = new Greeter().setRepeatNumber();

        Runnable eloszki = new Greeter(count, name1);
        Runnable eloszki2 = new Greeter(6, "Kamil");

        Greeter.runInOrder(eloszki, eloszki2);
        System.out.println("============================");
        Greeter.runTogether(eloszki, eloszki2);
    }
}
