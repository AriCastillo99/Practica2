
//Datos y variables para cada alumno
public class Estudiante {
	
	String nombre;
	int numControl;
	String materia;
	int calificacion;
	String estado;
	
	
	//Método constructor
	//Parametros que se solicitan para cada objeto
	public Estudiante(String nombre, int numControl, String materia, int calificacion, String estado) {
		setNombre(nombre);
		setNumcontrol(numControl);
		setMateria(materia);
		setCalificacion(calificacion);
		setEstado(estado);
	}
	
	//Seccion  de metodos: setters, getters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNumcontrol(int numControl) {
		this.numControl = numControl;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public int getNumcontrol() {
		return numControl;
	}
	public String getMateria() {
		return materia;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public String getEstado() {
		return estado;
	}

}
