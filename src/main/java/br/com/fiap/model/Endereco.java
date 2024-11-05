package br.com.fiap.model;



public class Endereco
{
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String uf;
    private String cep;
    private String cidade;
    public Endereco(String logradouro, int numero, String complemento, String bairro, String uf,
                    String cep, String cidade) {
        super();

        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.uf = uf;
        this.cep = cep;
        this.cidade = cidade;
    }

    public Endereco() {

    }

    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }



    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return logradouro + " Número: " + numero + " Bairro: " + bairro + " Estado: " + uf + " CEP: " + cep;
    }




}
