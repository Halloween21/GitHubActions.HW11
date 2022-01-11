public class main{
    public static void main(String[] args) {
        int a=5;
        System.out.println(fak(5));
    }
    public static int fak( int a){
        if (a==0 || a==1){
            return fak(a);
        }
        else {
            return fak(a-1)+fak(a-2);
        }
    }
}