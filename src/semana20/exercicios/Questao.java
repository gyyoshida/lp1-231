package semana20.exercicios;

public abstract class Questao {
    private int numero;
    private String enunciado;
    private Prova prova;

    public Questao(int numero, String enunciado, Prova prova){
        this.numero = numero;
        this.enunciado = enunciado;
        prova.addQuestao(this);
    }

    public abstract double pontuar(double pontuacao);

    public void addAlternativa(Alternativa alternativa){}
}