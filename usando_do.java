/*
 * A idéia aqui é usar a estrutura de 
 * repetição do while 
 * junto a uma variavel acumuladora 
 * ara somar os números digitados
 */
/**
 * @author ¥
 * @version 1.0
 */
package usando_do_while;

// importando classes 
import static java.lang.Character.toUpperCase;
import java.util.Scanner;

public class Usando_do_while {

    public static void main(String[] args) {
        //declarando as variaveis
        int n;
        String resp;
        //iniciando a variavel acumuladora
        int s = 0;

        //criando objeto teclado
        Scanner teclado = new Scanner(System.in);

        //processamento
        do {
            System.out.println("Digite um número: \n");
            n = teclado.nextInt();
            s = s + n;
            System.out.println("Deseja continuar? [S/N] \n");

            /*
             * atribuindo valor do obejto à variavel resp
             * e utilizando o metodo toUpperCase para evitar 
             * possiveis erros
             */
            resp = teclado.next().toUpperCase();

        } while (resp.equals("S"));

        //saida de dados 
        System.out.println("A soma dos números digitados é : \n " + s);

    }
}
