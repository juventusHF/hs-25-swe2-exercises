package ch.juventus.threads;

public class ThreadInfoExample {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadInfo());
        Thread thread2 = new Thread(new ThreadInfo());

        System.out.println("T1 -> " + thread1.getState());
        thread1.start();
        System.out.println("T1 -> " + thread1.getState());

        System.out.println("T2 -> " + thread2.getState());
        thread2.start();
        System.out.println("T2 -> " + thread2.getState());
    }

}
