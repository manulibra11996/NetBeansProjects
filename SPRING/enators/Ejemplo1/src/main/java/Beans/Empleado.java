package Beans;

public class Empleado {

	
	private Integer id;
	private String imagen = "no_image.png";
	private String nombre;
	private String apellido;
	private Departamentos departamento;
	private Integer sexo;
	
	
	public Empleado() {
		super();
	}

	public Empleado(Integer id, String imagen, String nombre, String apellido, Departamentos departamento,
			Integer sexo) {
		super();
		this.id = id;
		this.imagen = imagen;
		this.nombre = nombre;
		this.apellido = apellido;
		this.departamento = departamento;
		this.sexo = sexo;
	}
	
	public Empleado(Integer id, String nombre, String apellido, Departamentos departamento, Integer sexo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.departamento = departamento;
		this.sexo = sexo;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Departamentos getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}
	
	public Integer getSexo() {
		return sexo;
	}
	
	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}
	
}
