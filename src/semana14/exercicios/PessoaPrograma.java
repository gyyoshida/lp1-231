package semana14.exercicios;

public class PessoaPrograma {
    public static void main(String[] args) {
    
    Pessoa p1 = new Pessoa(1.70, 70);
    
    System.out.println(p1.calcularImc());
    System.out.println(p1.getFaixa());
    System.out.println(p1.getSituacao());
    }
}
