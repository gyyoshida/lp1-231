package semana17;

import java.util.List;

public class Correntista {
    private int codigo;
    private String nome;
    private List<Conta> contas;
    
    public Correntista (int codigo, String nome, List<Conta> contas) {
        this.codigo = codigo;
        this.nome = nome;
        this.contas = contas;
    }
}