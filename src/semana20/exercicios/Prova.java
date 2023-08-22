package semana20.exercicios;

import java.util.List;

public class Prova {
    private int codigo; 
    private int pontuacao;
    private List<Questao> questoes;

    public Prova(int codigo, int pontuacao, List<Questao> questoes){
        this.codigo = codigo;
        this.pontuacao = pontuacao;
        this.questoes = questoes;
    }

    public void addQuestao(Questao questao) {
        this.questoes.add(questao);
    }

    public double calcularPontuacao() {
        double pontuacaoTotal = 0;
        for (Questao questao : questoes) {
            pontuacaoTotal += questao.pontuar(pontuacao);
        }
        return pontuacaoTotal;
    }
}
