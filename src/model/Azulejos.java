package model;
/*Escreva um programa para ler as dimensões de uma cozinha retangular (comprimento, largura e altura),
 calcular e escrever a quantidade de caixas de azulejos para se colocar em todas as suas paredes 
 (considere que não será descontada a área ocupada por portas e janelas). Cada caixa de azulejos possui 1,5 m2.*/
public class Azulejos {
    
    public double calcularAzulejos(double altura,double comprimentoP,double larguraP){
        double paredeMaior = comprimentoP * altura;
        double paredeMenor = larguraP * altura;
        double totalDeParedes = (paredeMaior + paredeMenor )* 2;
        double quantidadeAzulejos =  totalDeParedes / 1.5;
        return quantidadeAzulejos;
    }
}
