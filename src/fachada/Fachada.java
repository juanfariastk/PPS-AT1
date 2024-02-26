package fachada;

import model.Veiculo;
import repositorio.RepositorioVeiculos;
import shared.Marcas;

import java.util.ArrayList;

public class Fachada {

    private RepositorioVeiculos veiculosAtuais = new RepositorioVeiculos();
    private Marcas marcas = new Marcas();

    public void CadastrarVeiculo(String combustivel, String modelo, String marca, double autonomia, String tipoMotor, double capacidadeTanque, double quantidadeCombustivelAtual){
        Boolean validarMarcaEModelo = marcas.verificarModelo(modelo, marca);
        if(validarMarcaEModelo){
            veiculosAtuais.cadastrarVeiculo(combustivel, modelo, marca, autonomia, tipoMotor, capacidadeTanque, quantidadeCombustivelAtual);
        }

        throw new IllegalArgumentException("Marca não condiz com o modelo enviado");
    }

    public void ReabastecerFrotaPorTipoCombustivel(String tipoComb, double quantLitros){
        ArrayList<Veiculo> veiculosPorTipoComb = veiculosAtuais.ListarVeiculoPorTipoDeCombustivel(tipoComb);
        for(Veiculo veiculos: veiculosPorTipoComb){
            veiculos.setQuantidadeCombustivelAtual(quantLitros);
        }
    }

    public ArrayList<Veiculo> ListarTodosOsVeiculos(){
        return this.veiculosAtuais.getVeiculosArmazenados();
    }

    public ArrayList<Veiculo> ListarVeiculosComMaiorAutonomia(){
        return this.veiculosAtuais.listarVeiculoPorMaiorAutonomia();
    }

    public ArrayList<Veiculo> ListarVeiculosComMenorAutonomia(){
        return this.veiculosAtuais.listarVeiculoPorMenorAutonomia();
    }

    public ArrayList<Veiculo>ListarVeiculosComAutonomiaMenorQuePerc(double perc){
        return this.veiculosAtuais.listarVeiculoPorAutonomiaInferior(perc);
    }



}
