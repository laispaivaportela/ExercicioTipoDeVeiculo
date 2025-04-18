/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;

/**
 *
 * @author laispaivaportela 
 */
/*
A. Escreva a classe Veiculo contendo Peso em quilos(int), VelocMax em Km/h(int) e Preco em R$ (float).
• Crie um construtor que inicialize os dados com zero e “”. ok
• Crie um construtor que inicialize os dados com valores passados por parâmetro. ok
• Crie métodos set’s para alterar os dados. ok
• Crie métodos get’s para retornar os dados. ok
• Crie um método para solicitar os dados para o usuário. ok
• Crie um método para imprimir os dados para o usuário. ok
• Construa um programa para testar a classe Veiculo. ok
B. Crie a classe CarroPasseio usando a classe Veiculo como base. Inclua Cor(Literal) e Modelo(Literal).
• Crie um construtor que inicialize os dados com zero e “”. ok
• Crie um construtor que inicialize os dados com valores passados por parâmetro. ok
• Crie métodos set’s para alterar os dados. ok
• Crie métodos get’s para retornar os dados. ok
• Crie um método para solicitar os dados para o usuário. ok
• Crie um método para imprimir os dados para o usuário. ok
• Construa um programa para testar a classe CarroPasseio. ok
C. Crie a classe Caminhao derivada da classe Veiculo. Inclua Toneladas( carga máxima), AlturaMax(int) e Comprimento(int).
• Crie um construtor que inicialize os dados com zero e “”. ok
• Crie um construtor que inicialize os dados com valores passados por parâmetro. ok
• Crie métodos set’s para alterar os dados. ok
• Crie métodos get’s para retornar os dados. ok
• Crie um método para solicitar os dados para o usuário. ok
• Crie um método para imprimir os dados para o usuário. ok
• Construa um programa para testar a classe Caminhao. ok
 */

import model.Caminhao;
import model.CarroPasseio;
import javax.swing.JOptionPane;

public class Principal {
    public static
    void main (String[] args) {
        JOptionPane.showMessageDialog (null , "Cadastro veiculo");

        //perguntando qual objeto deve ser  criado
        while (true) {
            Object[] opcoes = {"carro de passeio" , "caminhão" , "sair"};
            // Criando a caixa de diálogo com opções personalizadas
            int escolhaDeOpcao = JOptionPane.showOptionDialog (
                    null ,
                    "Escolha o tipo de veículo:" ,
                    "tipo de veiculo" ,
                    JOptionPane.DEFAULT_OPTION ,
                    JOptionPane.QUESTION_MESSAGE ,
                    null ,
                    opcoes ,
                    opcoes[0]
                                                              );
            if (escolhaDeOpcao != JOptionPane.CLOSED_OPTION) {
                //se o usuario escolher sair o programa encerra
                if (escolhaDeOpcao == 2) { //sair
                    JOptionPane.showMessageDialog (null , "Saindo...");
                    break;
                } else {
                    //vai criar o objeto que o usuário escolher
                    switch (escolhaDeOpcao) {
                        case 0:
                            JOptionPane.showMessageDialog (null , "Tipo de veículo: carro de passeio");
                            CarroPasseio carroPasseio = new CarroPasseio ();
                            carroPasseio.solicitarDados ();
                            carroPasseio.imprimeDados ();
                            break;
                        case 1:
                            JOptionPane.showMessageDialog (null , "Tipo de veículo: caminhão");
                            Caminhao caminhao = new Caminhao ();
                            caminhao.solicitarDados ();
                            caminhao.imprimeDados ();
                            break;
                    }
                }
            }
                    else
                    { //voltar
                        JOptionPane.showMessageDialog (null , "Nenhuma opção foi selecionada. Tente novamente.");
                    }


            }

    }
}