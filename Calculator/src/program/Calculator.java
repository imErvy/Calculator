// In this program you must pass the parameters in Portuguese so that the operation is done correctly, such as: "multiplicar 5 3"
package program;

public class Calculator {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if(args[0].equals("somar")){
            sum(x, y);
        } else if (args[0].equals("subtrair")) {
            minus(x, y);
        } else if (args[0].equals("multiplicar")) {
            multiplicar(x, y);
        } else if (args[0].equals("dividir")) {
            dividir(x, y);
        } else {
            System.out.println("Erro: Operacao inexistente");
        }
	}
	static void sum(int x, int y){
        System.out.println("O resultado da operação é " + (x + y));
    }

    static void minus(int x, int y){
        System.out.println("O resultado da operação é " + (x - y));
    }

    static void multiplicar (int x, int y){
        System.out.println("O resultado da operação é " + (x * y));
    }

    static void dividir(int x, int y){
        System.out.println("O resultado da operação é " + (x / y));
    }
}
