public class main {

    /**
     * Main class
     * @param args
     */
    public static void main(String[] args) {
        int a = 5;
        System.out.println(fak(a));
    }

    /**
     * 
     * @param a is the faculty we want to calculate
     * @return the faculty number we want
     */
    public static final int fak(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return fak(a - 1) + fak(a - 2);
        }
    }
}
