package com.edl.tadnumero;

/* REGRAS DE NEGÓCIO
* - Valor máximo: 100 — valores maiores que 100 serão convertidos para 100
* - Valor mínimo: 0 — valores menores que 0 (negativos) serão convertidos para 0
* (positivo de 0 a 100)
* - Valores maiores que 40 e menores que 60 (valor > 40 && valor < 60) serão convertidos para 40 se menores que 50 (valor < 50) ou para 60 se maiores ou iguais a 50 (valor >= 50)
*/

public class Numero {
    private float valor;

    public Numero() {
        this.valor = 0;
    }

    public Numero(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        boolean valorMenorQueZero = valor < 0;
        boolean valorMaiorQueQuarentaEMenorQueSessenta = valor > 40 && valor < 60;
        boolean valorMenorQueCinquenta = valor < 50;
        boolean valorMaiorQueCem = valor > 100;
        if(valorMenorQueZero) {
            valor = 0;
            return;
        } else if(valorMaiorQueQuarentaEMenorQueSessenta) {
            if(valorMenorQueCinquenta) {
                valor = 40;
            } else {
                valor = 60;
            }
        } else if(valorMaiorQueCem) {
            valor = 100;
        }
        this.valor = valor;
    }
}
