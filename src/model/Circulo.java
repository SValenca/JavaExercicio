package model;
//1) Escreva um programa para ler o raio de um círculo, calcular e escrever a sua área (Pi * (raio * raio)) 
public class Circulo {
    public double raio;

    public double calcularArea(){
        var area = 3.14 *raio * raio;
        return area;
    }
}
