/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;
import java.util.Date;

/**
 *
 * @author aline
 */
public abstract class Veiculo {
       protected String placa;
       protected Marca marca; 
       protected String modelo;
       Date data = new Date(); 
       protected int horaEntrada = data.getHours(); 
       protected String nomeDono;
       protected String cpf;
       protected String telefone;
       public int posicao;

    public Veiculo(String placa, Marca marca, String modelo, String nomeDono, String cpf, String telefone) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.nomeDono = nomeDono;
        this.cpf = cpf;
        this.telefone = telefone;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", data=" + data + ", nomeDono=" + nomeDono + ", cpf=" + cpf + ", telefone=" + telefone + '}';
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }


    
}
