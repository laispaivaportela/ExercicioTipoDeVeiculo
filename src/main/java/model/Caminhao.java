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
class Caminhao extends Veiculo {
    private int toneladasVeiculo;
    private int alturaMaxVeiculo;
    private int comprimentoVeiculo;
//variaveis de instancia 


        public Caminhao(){
            this.toneladasVeiculo = 0;
            this.alturaMaxVeiculo = 0;
            this.comprimentoVeiculo = 0;
            //construtor (comeca com 0)
        }
    public Caminhao (int toneladasVeiculo, int alturaMaxVeiculo, int comprimentoVeiculo){
        setToneladasVeiculo(toneladasVeiculo);
        setAlturaMaxVeiculo(alturaMaxVeiculo);
        setComprimentoVeiculo(comprimentoVeiculo);
        //construtor (inicializa o valor passado por parametro)
    }
//sets e gets
    public void setToneladasVeiculo (int toneladasVeiculo) {
        this.toneladasVeiculo = toneladasVeiculo;
    }
    public int getToneladasVeiculo () {
        return toneladasVeiculo;
    }
    public void setAlturaMaxVeiculo (int alturaMaxVeiculo) {
        this.alturaMaxVeiculo = alturaMaxVeiculo;
    }
    public int getAlturaMaxVeiculo () {
        return alturaMaxVeiculo;
    }
    public void setComprimentoVeiculo (int comprimentoVeiculo) {
        this.comprimentoVeiculo = comprimentoVeiculo;
    }
    public int getComprimentoVeiculo (){return comprimentoVeiculo;}

    public  void solicitarDados(){
        super.solicitarDados();
        setToneladasVeiculo (Integer.parseInt (JOptionPane.showInputDialog (null , "Digite a capacidade máxima do veiculo (em toneladas):")));
        setAlturaMaxVeiculo (Integer.parseInt(JOptionPane.showInputDialog (null , "Digite a altura máxima do veículo (em metros):")));
        setComprimentoVeiculo (Integer.parseInt(JOptionPane.showInputDialog (null , "Digite o comprimento do veículo (em metros):")));
        //recebe os dados e atribui eles
    }
    public String informacoesVeiculo() {
        return (String.format(
                "----caminhão----\n%s\ncapacidade máxima do veículo: %d toneladas\naltura máxima do veículo: %d metros\ncomprimento do veículo: %d metros\n" ,
                super.informacoesVeiculo(),
                this.getToneladasVeiculo () ,
                this.getAlturaMaxVeiculo (),
                this.getComprimentoVeiculo ()
                             ));
        //formata
    }

}
