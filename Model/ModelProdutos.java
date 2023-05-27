package Model;
public class ModelProdutos {
    private String produtos;
    private double preco;
    private String marca;
    private String modelo;
    private String codigo;

    public ModelProdutos(String produtos, double preco, String marca, String modelo, String codigo) {
        this.produtos = produtos;
        this.preco = preco;
        this.marca = marca;
        this.modelo = modelo;
        this.codigo = codigo;
    }

    public String getProdutos() {
        return produtos;
    }

    public double getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
