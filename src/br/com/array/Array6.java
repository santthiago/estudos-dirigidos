package br.com.array;

/**
 * ESTUDO DO ARRAY - EXEMPLO 6 - ARRAY MULTIDIMENSIONAL
 * @author Thiago Luiz  - 1santthiago@gmail.com
 */
public class Array6 {
    public static void main(String[] args) {
        // A LINHA ABAXIO CRIA UM ARRAY DE DUAS DIMENSOES COM 3 LINHAS E 3 COLUNAS
        // CADA CONJUNTO DE CHAVES É UMA LINHA DA TABELA
        // CADA VIRGULA DENTRO DAS CHAVES CRIADAS CORRESPONDE UMA COLUNA
        String[][] agenda = {{"BILL","1111-1111","BILL@E-MAIL.COM"},{"LINUS","2222-2222","LINUS@EMAIL"},{"JOBS","3333-3333","JOBS@EMAIL"}};
        // EXEMPLO RECUPERANDO O EMAIL DO BILL
        System.out.println(agenda[0][2]);
        // MONTANDO A AGENDA DE CONTATOS
        // O PRIMEIRO LAÇO PERCORRE AS LINHAS
        for (int i = 0; i <agenda.length; i++) {
            System.out.println("_______________________");
            // O SEGUNDO LAÇO DENTRO DO PRIMEIRO LAÇO, PERCORRE AS COLUNAS
            for (int j = 0; j <agenda[i].length; j++) {
                System.out.println(agenda[i][j]);
            }
            
        }
    }
}
