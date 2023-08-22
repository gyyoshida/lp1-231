package semana20.exercicios;

public class QuestaoVF extends Questao {
    private boolean resposta;

    public QuestaoVF (int numero, String enunciado, Prova prova, boolean resposta) {
        super(numero, enunciado, prova);
        this.resposta = resposta;
    }

    @Override
    public double pontuar(double pontuacao) {
        if (resposta == true){
            pontuacao += 1;
        }
        return pontuacao;
    }
}
