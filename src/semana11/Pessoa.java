package semana11;

public class Pessoa {
    public double altura;
    public double peso;

    public double calcularImc() {
        return peso / Math.pow(altura, 2);

    }

    public String getFaixa() {
        
    }

    public String getSituacao() {
        if (calcularImc() > 24.9) {
            return "PERDER";
        } else
            if (calcularImc() < 18.5) {
                return "GANHAR";
            } else 
                return "NORMAL";
    }
}