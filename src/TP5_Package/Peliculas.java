package TP5_Package;

public class Peliculas {

	private int id;
	private static int cont=0;
	private String nombre;
	Categoria categoria;
	
	public Peliculas(String nombre,Categoria categoria) {
		cont++;
		this.id = cont;
		this.nombre = nombre;
		this.categoria =categoria;
	}
	
	//public Peliculas() {}
	
	public static int ProximoId()
	{
		return cont+1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	@Override
	public String toString() {
		return "Peliculas: " + id + ", nombre=" + nombre + ", categoria=" + categoria.getCategoria();
	}

	public void categoria(Categoria selectedItem) {
		// TODO Auto-generated method stub
		
	}
	
	
}
