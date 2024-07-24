package HomeWork;
public class Task1 {
    static int [] a = {1,2,3,4,5,6,7,8};
    static int [] b = {1,2,3,4,5,6,6,8};

    public static boolean equals (int [] a, int [] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Task1.equals( a, b));
    }
}