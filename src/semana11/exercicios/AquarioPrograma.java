package semana11.exercicios;

public class AquarioPrograma {
    public static void main(String[] args) {

        Aquario aquario1 = new Aquario();
        aquario1.comprimento = 40;
        aquario1.largura = 20;
        aquario1.altura = 50;
        
        System.out.println(aquario1.calcularVolume());
        System.out.println(aquario1.calcularPotenciaDoTermostato(24, 26));
        System.out.println(aquario1.calcularQuantidadeLitrosFiltro());
    }
}
