package comunicacion;

public class Periodico extends Escrito {
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen,String titulo,String autor,int paginas,String fecha,String primicia,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.setFecha(fecha);
		this.setPrimicia(primicia);
		this.setInterpretacion(interpretacion);
		
	}
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha=fecha;
	}
	
	public String getPrimicia() {
		return primicia;
	}
	public void setPrimicia(String primicia) {
		this.primicia=primicia;
	}
	
	public String getIntepretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion=interpretacion;
	}
	
	//métodos
	public int palabrasTotales(int param) {
		return this.getPaginas()*param*10;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.getFecha()+"\n"+this.getPrimicia();
	}

}
