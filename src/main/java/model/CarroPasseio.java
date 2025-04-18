/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author laispaivaportela
 */
import model.Veiculo;
import javax.swing.*;

public
class CarroPasseio extends Veiculo{
    private String corVeiculo;
    private String modeloVeiculo;
//variaveis de instancia 
    public CarroPasseio() {
        this.corVeiculo = "";
        this.modeloVeiculo = "";
        //construtor (comeca com null)
    }
    public CarroPasseio(String corVeiculo, String modeloVeiculo){
            setCorVeiculo (corVeiculo);
            setModeloVeiculo(modeloVeiculo);
            //construtor (inicializa o valor passado por parametro)
        }
    public void solicitarDados() {
        super.solicitarDados();
        setCorVeiculo (JOptionPane.showInputDialog("Digite a cor do veículo:"));
        setModeloVeiculo(JOptionPane.showInputDialog("Digite o modelo do veículo:"));
        //recebe os dados e atribui eles
    }
    public String informacoesVeiculo() {
        return (String.format(
                "----carro passeio----\n%s\ncor do veículo: %s\nmodelo do veículo: %s\n" ,
                super.informacoesVeiculo(),
                this.getCorVeiculo() ,
                this.getModeloVeiculo()
                             ));
        //formata
    }
    //sets e gets
    public void setCorVeiculo (String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }
    public String getCorVeiculo () {
        return corVeiculo;
    }
    public void setModeloVeiculo (String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }
    public String getModeloVeiculo () {
        return modeloVeiculo;
    }



    }
