package PsudoCode;

public class Day2 {
    // public static void main(String[] args) {
    //     int a=13;
    //     int b=9;
    //     int res=(a&b)+(a|b)+(a^b);
    //     System.out.println(res);
    // }
    // public static void main(String[] args) {
    //     int num=18;
    //     int left=num<<2;
    //     int right=num>>1;
    //     System.out.println("left"+left);
    //     System.out.println("right"+right);
    // }
    public static void main(String[] args) {
        int a=12;
        int b=7;
        int c=5;
        int x=(a^b)+(c<<1);
        int y=(a&b)*(b|c);
        int res=(x>y)?x-y:y-x;
        System.out.println("X="+ x);
        System.out.println("y="+ y);
        System.out.println("res="+ res);
    }
    
}

//<< num*2^n
//>> num/2;