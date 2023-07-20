public class main {
    public static void main(String[] args) {
     var a = 2 <= 2 && !true;   // false
     var b = !false && 3 > 2;  // true
     var c = !(!true || false );   // true
     var d = 6 > 6 ^ !(true && true);  //false
     System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
}}
