package semana11.exercicios;

public class PessoaPrograma {
    public static void main(String[] args) {
    
    Pessoa p1 = new Pessoa();
    p1.altura = 1.72;
    p1.peso = 70.3;
    
    System.out.println(p1.calcularImc());
    System.out.println(p1.getFaixa());
    System.out.println(p1.getSituacao());
    }
}
