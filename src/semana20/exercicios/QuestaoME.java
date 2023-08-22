package semana20.exercicios;

import java.util.List;

public class QuestaoME extends Questao { 
    private List<Resposta> respostas;
    private List<Alternativa> alternativas;

    public QuestaoME(int numero, String enunciado, Prova prova, List<Alternativa> alternativas, List<Resposta> respostas) {
        super(numero, enunciado, prova);
        this.respostas = respostas;
        this.alternativas = alternativas;
    }

    @Override
    public double pontuar(double pontuacao) {
        if (respostas == 'A' || respostas == 'D') {
            pontuacao += 1;
        }
        return pontuacao;
    }
    


}
