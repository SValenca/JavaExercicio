package model;
// Escreva um programa para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius. (C = (F-32) * 5 / 9) 

public class Temperatura {

    // calcular a temperatura em celsius
    public double calcularTempF(float fahrenheit){       
        double celsius = ((fahrenheit - 32) * 5 / 9);
        return celsius;
        
    }
    //calcular Temperatura em fahrenheit  
    public double calcularTempC(float celsius){
            double fahrenheit = ((celsius * 9/5) + 32);
            return fahrenheit;
        }
}
