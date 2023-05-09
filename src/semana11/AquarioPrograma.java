package semana11;

public class AquarioPrograma {
    public static void main(String[] args) {

        Aquario aquario1 = new Aquario();
        aquario1.comprimento = 40;
        aquario1.largura = 20;
        aquario1.altura = 50;
        aquario1.temperaturaDesejada = 25;
        aquario1.temperaturaAmbiente = 20.5;
        
        System.out.println(aquario1.calcularVolume());
        System.out.println(aquario1.calcularPotenciaDoTermostato());
        System.out.println(aquario1.calcularQuantidadeLitrosFiltro());
    }
}
