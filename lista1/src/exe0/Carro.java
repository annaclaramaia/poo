package exe0;
import javax.swing.*;

public class Carro {
    // VARIÁVEIS (são fortemente tipáveis)

    //Int: é um tipo primitivo de dados
    public int ano;
    public float velocidade;
    //String: é um tipo de dado do tipo classe
    public String marca, modelo;

    // MÉTODOS CONSTRUTORES
    public Carro(){
        this.marca = "indefinido";
        this.modelo = "indefinido";
    }
    public Carro(String marca, String modelo, int ano, int velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }
    // MÉTODOS
    public void exibeDetalhes(){
        // this: representa o objeto que chama o metodo
        System.out.println("Modelo: " + this.modelo +
                "\nMarca: " + this.marca +
                "\nAno: " + this.ano +
                "\nVelocidade: " + this.velocidade +
                "\n ");
    }
    public void exibeDetalhes2(){
        // this: representa o objeto que chama o metodo
        JOptionPane.showMessageDialog(null,"Modelo: " + this.modelo +
                "\nMarca: " + this.marca +
                "\nAno: " + this.ano +
                "\nVelocidade: " + this.velocidade);
    }
    //acelerar o carro
    //o x representa o quanto vai acelerar
    public void acelerar(float x){
        this.velocidade += x;
    }
    //frear o carro
    public void frear(float x){
        if(this.velocidade >= x){
            this.velocidade -= x;
        }
        else{
            System.out.println("Impossível frear");
        }
    }
}
