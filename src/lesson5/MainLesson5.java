package lesson5;

public class MainLesson5 {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        float[] arr = new float[size];
        arrayOf1(arr);
        slowRunArray(arr);
        fastRunArray(arr);
    }

    static void slowRunArray (float[] x) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            x[i] = (float)(x[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время выполнения первого метода составило: " + (System.currentTimeMillis() - a));
    }

    static void fastRunArray (float[] x) {
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        long a = System.currentTimeMillis();
        System.arraycopy(x, 0, a1, 0, h);
        System.arraycopy(x, h, a2, 0, h);
        new Thread(() -> methodOfDouble(a1)).start();
        new Thread(() -> methodOfDouble(a2)).start();
        System.arraycopy(a1, 0, x, 0, h);
        System.arraycopy(a2, 0, x, h, h);
        System.out.println("Время выполнения второго метода составило: " + (System.currentTimeMillis() - a) + "\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(x[i] + " " + x[i+h]);
        }
    }

    public static void methodOfDouble(float[] x) {
        for (int i = 0; i < h; i++) {
            x[i] = (float)(x[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public static void arrayOf1 (float[] x) {
        for (int i = 0; i < size; i++) {
            x[i] = 1;
        }
    }
}
