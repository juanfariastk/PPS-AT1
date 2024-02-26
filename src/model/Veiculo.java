package model;

public class Veiculo {
    private String combustivel;
    private String marca;
    private String modelo;
    private double autonomia;
    private String tipoMotor;
    private double capacidadeTanque;
    private double quantidadeCombustivelAtual;


    public Veiculo(String combustivel, String marca, String modelo, double autonomia, String tipoMotor, double capacidadeTanque, double quantidadeCombustivelAtual) {
        this.combustivel = combustivel;
        this.marca = marca;
        this.autonomia = autonomia;
        this.modelo = modelo;
        this.tipoMotor = tipoMotor;
        this.capacidadeTanque = capacidadeTanque;
        this.quantidadeCombustivelAtual = quantidadeCombustivelAtual;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getQuantidadeCombustivelAtual() {
        return quantidadeCombustivelAtual;
    }

    public void setQuantidadeCombustivelAtual(double quantidadeCombustivel) {
        this.quantidadeCombustivelAtual += quantidadeCombustivel;
    }
}
