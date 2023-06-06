package semana14.exercicios;

public class AquarioPrograma {
    public static void main(String[] args) {

        Aquario aquario1 = new Aquario(40, 20, 50);
        
        System.out.println(aquario1.calcularVolume());
        System.out.println(aquario1.calcularPotenciaDoTermostato(25, 20.5));
        System.out.println(aquario1.calcularQuantidadeLitrosFiltro());
    }
}
