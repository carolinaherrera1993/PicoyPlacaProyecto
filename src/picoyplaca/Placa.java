/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoyplaca;

/**
 *
 * @author carol
 */
public class Placa {

    private String numeroPlaca; // numero de placa
    private Integer ultimoDigito; // ultimo digito de placa

    public Integer getUltimoDigito() {

        ultimoDigito = Integer.valueOf(getNumeroPlaca().substring(getNumeroPlaca().length() - 1));

        return ultimoDigito;
    }

    public Placa(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

}
