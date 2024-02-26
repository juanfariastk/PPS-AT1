package repositorio;

import model.Veiculo;

import java.util.ArrayList;
import java.util.Comparator;

public class RepositorioVeiculos {
    private ArrayList<Veiculo> veiculosArmazenados = new ArrayList<>();

    public Veiculo cadastrarVeiculo(String combustivel, String modelo, String marca, double autonomia, String tipoMotor, double capacidadeTanque, double quantidadeCombustivelAtual){
        Veiculo veiculoNovo = new Veiculo(combustivel, modelo, marca, autonomia, tipoMotor, capacidadeTanque, quantidadeCombustivelAtual);
        veiculosArmazenados.add(veiculoNovo);
        return veiculoNovo;
    }

    public ArrayList<Veiculo> getVeiculosArmazenados(){
        return this.veiculosArmazenados;
    }

    public ArrayList<Veiculo> localizarVeiculosPorMotorizacao(String motorizacao){
        ArrayList<Veiculo> veiculosEncontrados = new ArrayList<Veiculo>();

        for(Veiculo veiculo: veiculosArmazenados){
            if(veiculo.getTipoMotor().equals(motorizacao)){
                veiculosEncontrados.add(veiculo);
            }
        }

        return veiculosEncontrados;
    }

    public ArrayList<Veiculo> listarVeiculoPorMaiorAutonomia() {
        ArrayList<Veiculo> veiculosEncontrados = new ArrayList<>();

        for (Veiculo veiculo : veiculosArmazenados) {
            veiculosEncontrados.add(veiculo);
            //organiza os veiculos de maior autonomia
            veiculosEncontrados.sort(Comparator.comparing(Veiculo::getAutonomia).reversed());
        }

        while (veiculosEncontrados.size() > 10) {
            veiculosEncontrados.remove(veiculosEncontrados.size() - 1);
        }
        return veiculosEncontrados;
    }

    public ArrayList<Veiculo> listarVeiculoPorMenorAutonomia() {
        ArrayList<Veiculo> veiculosEncontrados = new ArrayList<>();

        for (Veiculo veiculo : veiculosArmazenados) {
            veiculosEncontrados.add(veiculo);
            //organiza os veiculos de menor autonomia
            veiculosEncontrados.sort(Comparator.comparing(Veiculo::getAutonomia));
        }

        while (veiculosEncontrados.size() > 10) {
            veiculosEncontrados.remove(veiculosEncontrados.size() - 1);
        }

        return veiculosEncontrados;
    }

    public ArrayList<Veiculo> listarVeiculoPorAutonomiaInferior(double perc) {
        ArrayList<Veiculo> veiculosEncontrados = new ArrayList<>();

        for (Veiculo veiculo : veiculosArmazenados) {
            if(veiculo.getAutonomia()<perc)veiculosEncontrados.add(veiculo);
        }

        return veiculosEncontrados;
    }

    public ArrayList<Veiculo> ListarVeiculoPorTipoDeCombustivel(String tipoCombus){
        ArrayList<Veiculo> veiculosEncontrados = new ArrayList<>();

        for (Veiculo veiculo : veiculosArmazenados) {
            if(veiculo.getCombustivel().equals(tipoCombus)) veiculosEncontrados.add(veiculo);
        }

        return  veiculosEncontrados;
    }

}
