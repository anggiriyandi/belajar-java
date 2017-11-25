package com.belajar.ecommerce;

public class Product {

	private String kode;
	private String nama;
	private int stok;

	public Product(){}

	public Product(String kode, String nama, int stok){
		this.kode = kode;
		this.nama = nama;
		this.stok = stok;
	}

	public void setKode(String kode){
		this.kode = kode;
	}

	public String getKode(){
		return this.kode;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return this.nama;
	}

	public void setStok(int stok){
		this.stok = stok;
	}

	public int getStok(){
		return this.stok;
	}

}