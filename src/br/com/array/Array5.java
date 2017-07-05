package br.com.array;

/**
 * ESTUDO DO ARRAY - EXEMPLO 5 - PREENCHENDO UM ARRAY COM O LAÇO "FOR" e "FOREACH"
 * @author Thiago Luiz  - 1santthiago@gmail.com
 */
public class Array5 {
    public static void main(String[] args) {
        // INICIANDO UM ARRAY DE TAMANHO VARIAVEL
        int [] pares = {2,4,6,8};
        //  A ESTRUTURA ABAIXO PERCORE O ARRAY DE 0 ATE SEU TAMANHO MAXIMO
        for (int i = 0; i < pares.length; i++) {
            System.out.println("pares[" + i +"] = " + pares[i]);
        }
        // usando uma estrutura simplificada do laço for(foreach) para percorrer o array
        System.out.println("USO DO FOREACH");
        for (int i : pares) {
            System.out.println(i);
        }
    }
}
