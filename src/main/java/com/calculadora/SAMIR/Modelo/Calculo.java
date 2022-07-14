package com.calculadora.SAMIR.Modelo;

import org.apache.commons.math3.util.Precision;

public class Calculo {

	private String data;
	private float reajusteAcumulado;
	private float salario;	
	private float correcao;
	private float salarioCorrigido;
	private float juros;
	private float salarioJuros;
	private float salarioTotal;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public float getReajusteAcumulado() {
		return reajusteAcumulado;
	}
	public void setReajusteAcumulado(float reajusteAcumulado) {
		this.reajusteAcumulado = reajusteAcumulado;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getCorrecao() {
		return correcao;
	}
	public void setCorrecao(float correcao) {
		this.correcao = correcao;
	}
	public float getSalarioCorrigido() {
		return salarioCorrigido;
	}
	public void setSalarioCorrigido(float salarioCorrigido) {
		this.salarioCorrigido = salarioCorrigido;
	}
	public float getJuros() {
		return juros;
	}
	public void setJuros(float juros) {
		this.juros = juros;
	}
	public float getSalarioJuros() {
		return salarioJuros;
	}
	public void setSalarioJuros(float salarioJuros) {
		this.salarioJuros = salarioJuros;
	}
	public float getSalarioTotal() {
		return salarioTotal;
	}
	public void setSalarioTotal(float salarioTotal) {
		this.salarioTotal = salarioTotal;
	}
	public Calculo(String data, float reajusteAcumulado, float salario, float correcao, float juros, float porcentagemRMI) {
		super();
		 float porcentagem = porcentagemRMI / 100;
		this.data = data;
		this.reajusteAcumulado = reajusteAcumulado;
		this.salario = Precision.round((salario * porcentagem),2);;
		this.correcao = correcao;
		this.salarioCorrigido = Precision.round(((salario * correcao) * porcentagem),2);
		this.juros = juros / 100;
		this.salarioJuros = Precision.round(((salario * correcao * juros / 100) * porcentagem),2);
		this.salarioTotal = Precision.round((this.salarioCorrigido + this.salarioJuros),2);
	}
	
}
