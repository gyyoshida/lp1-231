package semana20.exercicios;

import java.util.List;

public class QuestaoUE extends Questao { 
    private char resposta;
    private List<Alternativa> alternativas;

    public QuestaoUE(int numero, String enunciado, Prova prova, List<Alternativa> alternativas, char resposta) {
        super(numero, enunciado, prova);
        this.resposta = resposta;
        this.alternativas = alternativas;
    }

    @Override 
    public double pontuar(double pontuacao) {
        if (resposta == 'A') {
            pontuacao += 1;
        }
        return pontuacao;
    }
}
