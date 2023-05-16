package semana11;

public class PessoaPrograma {
    Pessoa p1 = new Pessoa();
    p1.altura = 172;
    p1.peso = 70.3;
    
    System.out.println(p1.calcularImc());
    System.out.println(p1.getFaixa());
    System.out.println(p1.getSituacao());
}
