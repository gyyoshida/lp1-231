package semana11;

public class PessoaPrograma {
    Pessoa p1 = new Pessoa();
    p1.altura = 172;
    p1.peso = 70.3;

    double imc = p1.calcularImc();
    String faixa = p1.getFaixa();
    String situacao = p1.getSituacao();
}
