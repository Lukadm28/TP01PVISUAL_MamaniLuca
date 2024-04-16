package ar.edu.unju.fi.ejercicio08.model;

public class CalculadoraEspecial {
	
	    private int n;

	    public CalculadoraEspecial() {
	        
	    }

	    public int getN() {
	        return n;
	    }

	    public void setN(int n) {
	        this.n = n;
	    }

	    public long calcularSumatoria() {
	        long sumatoria = 0;
	        for (int k = 1; k <= n; k++) {
	            sumatoria += (k * (k + 1) / 2) * (k * (k + 1) / 2);
	        }
	        return sumatoria;
	    }

	    public long calcularProductoria() {
	        long productoria = 1;
	        for (int k = 1; k <= n; k++) {
	            productoria *= (k * (k + 4));
	        }
	        return productoria;
	    }
	}



