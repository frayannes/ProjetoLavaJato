public class Carro {
    // Os atributos foram definidos como privado por causa do encapsulamento pra ter mais controle sobre o acesso desses valores
    private String marca;
    private String modelo;
    private String cor;
    private String placa;

    // Método get é responsável em retornar o valor do atributo 
    // sempre: tem o mesmo tipo de retorno que o atributo foi definico
    // nunca: tem parâmetro de entrada
    public String getMarca() {
        return marca;
    }

    // Método set é responsável por alterar o valor do atributo
    // sempre: tem parâmetro de entrada igual ao tipo do tributo 
    // nunca: tem valor de retorno(sempre void)
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;

    }
}
