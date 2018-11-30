package br.unipe.pos.model;

public class Valores implements ValoresITF {

	private int valores[] = new int[10];

	@Override
	public boolean ins(int v) {
		if (v > 0) {
			for (int i = 0; i < 10; i++) {
				if (this.valores[i] == 0) {
					valores[i] = v;
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int del(int i) {
		if (this.size() > 0 && i < valores.length) {
			int aux = valores[i];
			valores[i] = 0;
			return aux;
		}
		return -1;
	}

	@Override
	public int size() {
		int tam = 0;
		for (int i = 0; i < 10; i++) {
			if (this.valores[i] != 0) {
				tam++;
			}
		}
		return tam;
	}
	/**
	 * @author Anderson
	 * @param oASPDAJKDJADJSA
	 */
	@Override
	public double mean() {
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += valores[i];
		}
		return (sum > 0) ? sum / this.size() : -1;
	}

	@Override
	public int greater() {
		int maior = this.valores[0];
		for (int i = 1; i < 10; i++) {
			if (valores[i] > maior) {
				maior = valores[i];
			}
		}
		return (maior > 0) ? maior : -1;
	}

	/**
	 * ajsndjksandjksandfnfdnsdfnsadfndnsfjkl
	 */
	@Override
	public int lower() {
		int menor = 0;
		boolean primeiro = true;
		for (int i = 0; i < 10; i++) {
			if (valores[i] > 0) {
				if (primeiro) {
					menor = valores[i];
					primeiro = false;
				} else {
					if (valores[i] < menor) {
						menor = valores[i];
					}
				}
			}
		}
		return (menor > 0) ? menor : -1;
	}

}
