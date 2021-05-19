package TP5_Package;

public class Categoria {

	private int id;
	private String categoria;
	

	public Categoria(int id, String categoria) {
		this.setId(id);
		this.categoria = categoria;
	}

	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return  categoria ;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
