package br.com.array;

/**
 * ESTUDO DO ARRAY - EXEMPLO 3 - INSTANCIANDO UM ARRAY de tamanho fixo
 * @author Thiago Luiz  - 1santthiago@gmail.com
 */
public class Array3 {
    public static void main(String[] args) {
        // INICIANDO UM ARRAY COM TAMANHO FIXO DE 5 VARIAVEIS
        int[] impares = new int[5];
        impares[0]=1;
        impares[1]=3;
        impares[2]=5;
        impares[3]=7;
        impares[4]=9;
        System.out.println("TAMANHO DO ARRAY: " + impares.length);
        System.out.println("POSIÇÃO 1 DO ARRAY: " + impares[1]);
        //  A LINHA ABAIXO GERA UM ERRO, POIS  O TAMANHO DO ARRAY É 5
        //impares[5]=11;
        //System.out.println("POSIÇÃO 5 DO ARRAY: " + impares[5]);
        
    }
}
