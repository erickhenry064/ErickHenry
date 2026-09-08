/**
 * Repertório de Tipos Primitivos em JAVA
 * -----------------------------------------
 * Java possui 8 tipos primitivos, divididos em:
 * - Numéricos inteiros: byte, short, int, long
 * - Numéricos de ponto flutuante: float, double
 * - Caractere: char
 * - Lógico: boolean
 *
 * Para compilar e executar:
 *   javac PrimitiveTypes.java
 *   java PrimitiveTypes
 */
public class PrimitiveTypes {

    public static void main(String[] args) {

        // ---------- Tipos Inteiros ----------
        byte tipoByte = 127;                     // 8 bits  (-128 a 127)
        short tipoShort = 32000;                 // 16 bits (-32.768 a 32.767)
        int tipoInt = 2_147_483_000;              // 32 bits (~ -2,1bi a 2,1bi)
        long tipoLong = 9_223_372_036_854_775L;   // 64 bits

        // ---------- Tipos de Ponto Flutuante ----------
        float tipoFloat = 3.14159f;               // 32 bits, precisão simples
        double tipoDouble = 3.141592653589793;    // 64 bits, precisão dupla

        // ---------- Caractere ----------
        char tipoChar = 'A';                      // 16 bits, um único caractere Unicode

        // ---------- Lógico ----------
        boolean tipoBoolean = true;               // true ou false

        System.out.println("===== REPERTÓRIO DE TIPOS PRIMITIVOS - JAVA =====\n");

        imprimirTipo("byte", tipoByte, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        imprimirTipo("short", tipoShort, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        imprimirTipo("int", tipoInt, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        imprimirTipo("long", tipoLong, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.println("-------------------------------------------------");
        System.out.println("float    | valor: " + tipoFloat + " | bits: 32 | ~7 dígitos de precisão");
        System.out.println("double   | valor: " + tipoDouble + " | bits: 64 | ~15 dígitos de precisão");
        System.out.println("-------------------------------------------------");
        System.out.println("char     | valor: '" + tipoChar + "' | bits: 16 | código Unicode: " + (int) tipoChar);
        System.out.println("-------------------------------------------------");
        System.out.println("boolean  | valor: " + tipoBoolean + " | valores possíveis: true / false");
        System.out.println("-------------------------------------------------\n");

        // Demonstração de conversão implícita (widening) e explícita (narrowing)
        System.out.println("===== CONVERSÕES ENTRE TIPOS =====");
        int numeroInt = 100;
        double numeroDouble = numeroInt; // widening (implícita)
        System.out.println("int -> double (implícita): " + numeroInt + " -> " + numeroDouble);

        double valorAlto = 9.99;
        int valorTruncado = (int) valorAlto; // narrowing (explícita)
        System.out.println("double -> int (explícita, com cast): " + valorAlto + " -> " + valorTruncado);
    }

    // Método auxiliar para tipos inteiros, mostrando tamanho e faixa de valores
    private static void imprimirTipo(String nome, long valor, int bits, long min, long max) {
        System.out.printf("%-8s | valor: %-20d | bits: %-3d | faixa: %d a %d%n",
                nome, valor, bits, min, max);
    }
}
