package com.calculadora.SAMIR.Modelo;

public class InfoCalculo {
	private String dib;
	private String dip;
	private String atulizacao;
	private String incioJuros;
	private float rmi;
	private boolean juros;
	private boolean salario13;
	private int tipoJuros;
	private int tipoCorrecao;
	private boolean salarioMinimo;
	private boolean limiteMinimoMaximo;
	private String dibAnterior;
	private float porcentagemRMI;
	public String getDib() {
		return dib;
	}
	public void setDib(String dib) {
		this.dib = dib;
	}
	public String getDip() {
		return dip;
	}
	public void setDip(String dip) {
		this.dip = dip;
	}
	public String getAtulizacao() {
		return atulizacao;
	}
	public void setAtulizacao(String atulizacao) {
		this.atulizacao = atulizacao;
	}
	public float getRmi() {
		return rmi;
	}
	public void setRmi(float rmi) {
		this.rmi = rmi;
	}
	public boolean isJuros() {
		return juros;
	}
	public void setJuros(boolean juros) {
		this.juros = juros;
	}
	public boolean isSalario13() {
		return salario13;
	}
	public void setSalario13(boolean salario13) {
		this.salario13 = salario13;
	}
	public int getTipoJuros() {
		return tipoJuros;
	}
	public void setTipoJuros(int tipoJuros) {
		this.tipoJuros = tipoJuros;
	}
	public int getTipoCorrecao() {
		return tipoCorrecao;
	}
	public void setTipoCorrecao(int tipoCorrecao) {
		this.tipoCorrecao = tipoCorrecao;
	}
	public boolean isSalarioMinimo() {
		return salarioMinimo;
	}
	public void setSalarioMinimo(boolean salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	public String getIncioJuros() {
		return incioJuros;
	}
	public void setIncioJuros(String incioJuros) {
		this.incioJuros = incioJuros;
	}
	public boolean isLimiteMinimoMaximo() {
		return limiteMinimoMaximo;
	}
	public void setLimiteMinimoMaximo(boolean limiteMinimoMaximo) {
		this.limiteMinimoMaximo = limiteMinimoMaximo;
	}
	public String getDibAnterior() {
		return dibAnterior;
	}
	public void setDibAnterior(String dibAnterior) {
		this.dibAnterior = dibAnterior;
	}
	public float getPorcentagemRMI() {
		return porcentagemRMI;
	}
	public void setPorcentagemRMI(float porcentagemRMI) {
		this.porcentagemRMI = porcentagemRMI;
	}
	
}
