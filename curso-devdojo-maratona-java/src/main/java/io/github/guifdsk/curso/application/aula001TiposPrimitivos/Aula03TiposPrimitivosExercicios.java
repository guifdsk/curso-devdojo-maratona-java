package io.github.guifdsk.curso.application.aula001TiposPrimitivos;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
/*        Prática

        Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

        Eu  <nome>, morando no endereço <endereco>,
        confirmo que recebi o salário de <salario>, na data <data>
*/

        String nome = "Goku";
        String endereco = "Japão";
        double salario = 1500.00;
        String dataRecebimentoSalario = "30/10/2023";
        String informe =
                "Eu " + nome + ", morando no endereço " + endereco + " confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario + ".";

        System.out.println(informe);
    }
}
