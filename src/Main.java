import fachada.Fachada;

public class Main {
    public static void main(String[] args) {
        Fachada fachada = new Fachada();

        fachada.CadastrarVeiculo("Gasolina", "BMW Serie 3", "BMW", 50.0, "TipoMotor1", 60.0, 20.0);
        fachada.CadastrarVeiculo("Diesel", "Alpina B7", "Alpina", 45.0, "TipoMotor2", 70.0, 30.0);
        fachada.CadastrarVeiculo("Gasolina", "Porsche 911", "Porsche", 55.0, "TipoMotor3", 65.0, 25.0);
        fachada.CadastrarVeiculo("Gasolina", "BMW X6", "BMW", 48.0, "TipoMotor1", 65.0, 25.0);
        fachada.CadastrarVeiculo("Gasolina", "BMW Z4", "BMW", 52.0, "TipoMotor1", 55.0, 30.0);
        fachada.CadastrarVeiculo("Gasolina", "BMW 435i", "BMW", 49.0, "TipoMotor1", 70.0, 30.0);
        fachada.CadastrarVeiculo("Diesel", "Porsche Cayenne", "Porsche", 42.0, "TipoMotor3", 80.0, 40.0);
        fachada.CadastrarVeiculo("Diesel", "Porsche Panamera", "Porsche", 44.0, "TipoMotor3", 75.0, 35.0);
        fachada.CadastrarVeiculo("Diesel", "Porsche Cayman", "Porsche", 46.0, "TipoMotor3", 65.0, 25.0);
        fachada.CadastrarVeiculo("Gasolina", "Alpina D7", "Alpina", 47.0, "TipoMotor2", 60.0, 30.0);
        fachada.CadastrarVeiculo("Gasolina", "Alpina D5 S", "Alpina", 50.0, "TipoMotor2", 55.0, 35.0);
        fachada.CadastrarVeiculo("Gasolina", "Alpina XD4 S", "Alpina", 54.0, "TipoMotor2", 65.0, 30.0);


        System.out.println("Veiculos atuais: ");
        System.out.println(fachada.ListarTodosOsVeiculos());

        fachada.ReabastecerFrotaPorTipoCombustivel("Gasolina", 10.0);

        System.out.println("Verificar reabastecimento: ");
        System.out.println(fachada.ListarTodosOsVeiculos());

        System.out.println("Veículos com maior autonomia:");
        System.out.println(fachada.ListarVeiculosComMaiorAutonomia());

        System.out.println("Veículos com menor autonomia:");
        System.out.println(fachada.ListarVeiculosComMenorAutonomia());

        System.out.println("Veículos com autonomia menor que 30%:");
        System.out.println(fachada.ListarVeiculosComAutonomiaMenorQuePerc(30.0));



    }
}
