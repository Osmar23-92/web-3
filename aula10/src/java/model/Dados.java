package model;


public class Dados {
    private double peso;
    private double altura;
    
    public Dados() {}

    public Dados(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularImc() {
        return peso / Math.pow(altura, 2);
    }
    
    public String emitirLaudo() {
        String laudo = "";
        double imc = calcularImc();
        if ( imc < 18.5 ){
             laudo = "Abaixo do peso";
        } else if ( imc >= 18.5 && imc < 25 ){
             laudo = "Peso normal";
        } else {
            laudo = "Acima do peso";
        }
 
        return laudo;
    }
    
    @Override
    public String toString() {
        return "<hr>" + 
                "<h4> Resultado: </h4>" +
                "<ul>" +
                "<li> PESO: " + this.peso + " kg </li>" +
                "<li> ALTURA: " + this.altura + " m </li>" +
                "<li> IMC: " + calcularImc() + "kg/m² </li>" +
                "<li>" + emitirLaudo() + "</li>" +
                "</ul>";
    }
    
    
    
}
