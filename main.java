public class main {
    public static void main(String[] args) {
        // [A]
        boolean a_result = 2 <= 2 && !true;
        System.out.println("[A] Result: " + a_result);

        // [B]
        boolean b_result = !false && 3 > 2;
        System.out.println("[B] Result: " + b_result);

        // [C]
        boolean t = false;
        boolean f = true;
        boolean c_result = !(t || f);
        System.out.println("[C] Result: " + c_result);

        // [D]
        boolean d_result = 6 > 6 ^ !(true && true);
        System.out.println("[D] Result: " + d_result);
    }
}
