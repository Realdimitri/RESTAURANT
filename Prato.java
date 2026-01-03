public class Prato {
    private String nomePrato;
    private String nomeBebida;
    private double valorPrato;
    private int qntPrato;
    private  int qntbebida;
    private double valoroBebida;
    private double total;

    public Prato(String nomePrato, String nomeBebida, double valorPrato, double valoroBebida, double total) {
        this.nomePrato = nomePrato;
        this.nomeBebida = nomeBebida;
        this.valorPrato = valorPrato;
        this.valoroBebida = valoroBebida;
        this.total = total;
    }
    public double TotalPedido(){
        return (qntPrato*valorPrato) + (qntbebida*valoroBebida);
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public String getNomeBebida() {
        return nomeBebida;
    }

    public double getValorPrato() {
        return valorPrato;
    }

    public double getValoroBebida() {
        return valoroBebida;
    }

    public double getTotal() {
        return total;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public void setNomeBebida(String nomeBebida) {
        this.nomeBebida = nomeBebida;
    }
}
