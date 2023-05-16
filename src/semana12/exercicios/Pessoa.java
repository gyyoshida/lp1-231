package semana12.exercicios;

public class Pessoa {
    public double altura;
    public double peso;

    public Pessoa(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }
    
    public double calcularImc() {
        return peso / Math.pow(altura, 2);
    }

    public String getFaixa() {
        if (calcularImc() < 18.5) {
            return "ABAIXO DO PESO";
        } else 
            if (calcularImc() < 25) {
              return "PESO NORMAL";
            } else 
                if (calcularImc() < 30) {
                 return "SOBREPESO";
                } else {
                     return "OBESIDADE";
                       }  
    }
    

    public String getSituacao() {
        if (calcularImc() < 18.5) {
            return "GANHAR"; 
        } else 
            if (calcularImc() < 25) {
                return "NORMAL";
            } else {
                    return "PERDER"; 
                   }
    }
}
