public class main {
    public static void main(String[] args) {
        // [A]
        boolean a_result = 2 <= 2 && !true;  // 2 è uguale a 2 quindi true, not true è false quindi il risultato di and è FALSE
        System.out.println("[A] Result: " + a_result);

        // [B]
        boolean b_result = !false && 3 > 2;  // not false è true , 3 è maggiore di 2 è true , quimmdi il risultato di end è TRUE
        System.out.println("[B] Result: " + b_result);

        // [C]
        boolean t = false;
        boolean f = true;
        boolean c_result = !(t || f);  // true or false è true , considenrando che il not il risutato di not true è FALSE
        System.out.println("[C] Result: " + c_result);

        // [D]
        boolean d_result = 6 > 6 ^ !(true && true);  // 6 > 6 false , lo xor tra false e not true restituisce FALSE
        System.out.println("[D] Result: " + d_result);
    }
}
