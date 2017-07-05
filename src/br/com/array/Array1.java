
/**
 *   ESTUDO DO ARRAY - EXEMPLO 1  - ARRAY SIMPLES
 * @author Thiago Luiz  - 1santthiago@gmail.com
 */
public class Array1 {
    public static void main(String[] args) {
        // SEM ARRAY
        System.out.println("ARRAY SIMPLES");
        System.out.println("1.SEM ARRAY");
        // O STRING ACEITA QUALQUER TIPO DE CARACTERE
        String time1="PALMEIRAS";
        String time2="CORINTHIANS";
        String time3="SÃO PAULO";
        String time4="SANTOS";
        System.out.println("TIME: " + time2);
        System.out.println("2.COM ARRAY");
        // A LINHA ABAIXO CRIA UM ARRAY SIMPLES DE TAMANHO 4
        String[]times={"PALMEIRAS","CORINTHIANS","SÃO PAULO","SANTOS"};
        // A LINHA ABAIXO EXIBE O CONTEUDO DO ARRAY
        //[0] [1] [2] [3]
        System.out.println("TIME: " + times[1]);
        // A LINHA ABAIXO EXIBE O TAMANHO DO ARRAY
        // O COMANDO .LENGTH EXIBE O TAMANHO DO ARRAY
        System.out.println("TAMANHO ARRAY " + times.length);
        // A LINHA ABAIXO ALTERA O CONTEUDO DE UM ARRAY
        times[1]="FLAMENGO";
        System.out.println("TIME: " + times[1]);
    }
    
}
