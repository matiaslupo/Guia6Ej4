package modelo;

import java.util.Arrays;

public class ConjuntoNumeros implements Cloneable {

	private int[] celda; 
	private int lenght;
	private String nombre;
	
	
	
	public ConjuntoNumeros(String nombre, int dato) {
		this.lenght = 0;
		this.celda[0]= dato;
		this.nombre = nombre;
	}
	
	public int[] getCelda() {
		return celda;
	}
	
	public void agregarNum(int numero) {
		this.lenght++;
		this.celda[this.lenght]= numero;
	}
	
	public int getLenght() {
		return lenght;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		ConjuntoNumeros clonado= (ConjuntoNumeros) super.clone();
		clonado.celda= this.celda.clone();
		return clonado;
	}

	@Override
	public String toString() {
		return "ConjuntoNumeros [celda=" + Arrays.toString(celda) + ", largo=" + (lenght + 1) + ", nombre=" + nombre + "]";
	}	
	
}
