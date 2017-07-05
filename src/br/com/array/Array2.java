package br.com.array;

import java.util.Random;

/**
 *   ESTUDO DO ARRAY - EXEMPLO 2 - SORTEIO DE UMA CARTA
 * @author Thiago Luiz  - 1santthiago@gmail.com
 */
public class Array2 {
    public static void main(String[] args) {
        String[]nipes={"ESPADAS","PAUS","COPAS","OUROS"};
        String[]faces={"AZ","2","3","4","5","6","7","8","9","10","VALETE","DAMA","REIS"};
        // A LINHA ABAIXO EXIBE A QNTD DOS ARRAYS
        System.out.println("O " + faces.length);
        System.out.println("" + nipes.length);
        // A LINHA ABAIXO CRIA UM OBJETO USANDO COMO MODELO A CLASSE RANDOM
        Random sorteio = new Random();
        // A LINHA ABAIXO FAZ O SORTEIO DOS INDICES DOS NAIPES
        // USANDO O OBJETO SORTEIO E ATRIBUI O RESULTADO A VARIAVEL INDICE_FACE
        // O NUMERO 4 GERA NUMEROS ALEATORIOS NO INTERVALO DE 0 A 3
        int indice_nipes = sorteio.nextInt(4);
        // A LINHA ABAIXO FAZ O SORTEIO DOS INDICES DAS FACES DAS CARTAS
        // USANDO O OBJETO SORTEIO E ATRIBUI O RESULTADO A VARIAVEL INDICE_FACE
        // O NUMERO .LENGTH GERA NUMEROS ALEATORIOS NO INTERVALO DO TAMANHO TOTAL DO ARRAY DE 0 A 12
        int indice_faces = sorteio.nextInt(faces.length);
        // AS LINHA ABAIXO ATRIBUEM O RESULTADO DO SORTEIO AO ARRAY CORRESPONDENTE
        // INDICE DE ARRAY É SEMPRE NUMERO INTEIRO, MAS HÁ EXCESSOES
        String face = faces[indice_faces];
        String nipe = nipes[indice_nipes];
        // A LINHA ABAIXO EXIBE A CARTA SORTEADA
        System.out.println(faces +" de "+ nipes);
        
    }
}
