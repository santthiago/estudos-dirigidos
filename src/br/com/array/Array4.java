package br.com.array;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * ESTUDO DO ARRAY - EXEMPLO 4 - PREENCHENDO UM ARRAY COM O LAÇO "FOR"
 * @author Thiago Luiz  - 1santthiago@gmail.com
 */
public class Array4 {
    public static void main(String[] args) {
       int[] idades = new int[10];
       // A ESTRUTURA ABAIXO CRIA AS VARIAVEIS QUE IRÃO PREENCHER AS 10 POSIÇÕES
        for (int i = 0; i < 10; i++) {
            idades[i] =  i * 10;
            System.out.println("INTERVALO DE IDADES: [" + i + "]" + " = " + idades[i]);
        }
    }
}
