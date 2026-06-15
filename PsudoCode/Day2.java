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
    // public static void main(String[] args) {
    //     int a=12;
    //     int b=7;
    //     int c=5;
    //     int x=(a^b)+(c<<1);
    //     int y=(a&b)*(b|c);
    //     int res=(x>y)?x-y:y-x;
    //     System.out.println("X="+ x);
    //     System.out.println("y="+ y);
    //     System.out.println("res="+ res);
    // }
public static void main(String[] args) {
    // for(int i=1;i<=4;i++){
    //     for(int j=1;j<=4;j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }
//     for(int i=1,j=10;i<j;i++,j--){
//         System.out.println(i+" "+j);
// // time complexity: n/2
//     }
// for(int i=1;i<=10;i++){
//     System.out.println(i+" ");
//     if(i%3==0){
//         i++;
//     }
// }
int count=0;
    for(int i=1;i<=3;i++){
        for(int j=1;j<=2;j++){
            for(int k=1;k<=2;k++){
                count++;
            }
        }
    }
    System.out.println(count);
}
    
}

//<< num*2^n
//>> num/2;