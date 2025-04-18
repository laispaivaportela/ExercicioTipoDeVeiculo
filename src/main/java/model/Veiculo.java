/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author laispaivaportela
 */
import javax.swing.*;

public class Veiculo {
    private int pesoVeiculo;
    private int velMaxVeiculo;
    private float precoVeiculo;
//variaveis de instancia 
    public Veiculo(){
        this.pesoVeiculo = 0;
        this.velMaxVeiculo = 0;
        this.precoVeiculo = 0;
        //construtor (comeca com 0)
    }
    public
    Veiculo (int pesoVeiculo, int velMaxVeiculo, float precoVeiculo){
        setPesoVeiculo(pesoVeiculo);
        setVelMaxVeiculo (velMaxVeiculo);
        setPrecoVeiculo (precoVeiculo);
        //construtor (inicializa o valor passado por parametro)
    }
    public  void solicitarDados(){
        setPesoVeiculo (Integer.parseInt(JOptionPane.showInputDialog(null , "Digite o peso do veiculo (em kg):")));
        setVelMaxVeiculo (Integer.parseInt(JOptionPane.showInputDialog (null , "Digite a velocidade máxima do veículo (em km/h):")));
        setPrecoVeiculo (Float.parseFloat (JOptionPane.showInputDialog (null , "Digite o preço do veículo (em reais):")));
        //recebe os dados e atribui eles
    }
    public String informacoesVeiculo() {
        return (String.format(
                "peso do veiculo: %dkg\nvelocidade maxima: %d km/h\npreco: R$%.2f\n" ,
                this.getPesoVeiculo () ,
                this.getVelMaxVeiculo () ,
                this.getPrecoVeiculo ()
                                                  ));
        //formata
    }

    public void imprimeDados(){
        JOptionPane.showMessageDialog (null , informacoesVeiculo());
        //imprime
    }
    
    
//sets
    public
    void setPesoVeiculo (int pesoVeiculo) {
        this.pesoVeiculo = pesoVeiculo;
    }
    public
    void setVelMaxVeiculo (int velMaxVeiculo) {
        this.velMaxVeiculo = velMaxVeiculo;
    }
    public
    void setPrecoVeiculo (float precoVeiculo) {
        this.precoVeiculo = precoVeiculo;
    }
//gets
    public int getPesoVeiculo () {
        return pesoVeiculo;
    }
    public int getVelMaxVeiculo () {
        return velMaxVeiculo;
    }
    public float getPrecoVeiculo () {
        return precoVeiculo;
    }

}