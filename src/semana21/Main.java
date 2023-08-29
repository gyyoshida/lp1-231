package semana21;

import java.util.ArrayList;

// interface = contrato
// conjunto de métodos (somente assinatura sem corpo)
// classe concreta que IMPLEMENTA interface

// classe abstrata FiguraGeometrica
// interface FiguraGeometrica

// quadrado - lado - calcular area e perimetro
// retangulo - base, altura - calcular area e perimetro
//

public class Main {
    public static void main(String[] args) { 
        System.out.println("Main...");

        FiguraGeometrica q1 = new Quadrado(10);
        FiguraGeometrica q2 = new Quadrado(20);

        FiguraGeometrica r1 = new Retangulo(10, 5);

        Tela tela = new Tela();
        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);
        System.out.println(tela.totalArea());
        System.out.println(tela.totalPerimetro());

        // arrays
        double[] notas = new double[3];
        notas[0] = 10.0;
        notas[1] = 3.0;
        notas[2] = 5.0;
        // notas[3] = 5.0;

        System.out.println(notas[0]);

        // Coleções
        // List - 
        // Set
        // Map chave - valor

        //String[] nomes = new String[10];
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");

        String nome = nomes.get(1);
        System.out.println(nome);

        System.out.println(nomes.size());

        // nomes.clear();

        System.out.println(nomes.size());

        // for (int i = 0; 1 < nomes.size(); i++) {
        //     String nome = nomes.get(i);
        // }

        for (String n : nomes) {
            System.out.println(n);
        }

        // nomes.remove(1);
        nomes.remove("Maria");
        
        for (String n : nomes) {
            System.out.println(n);
        }
    }
}
