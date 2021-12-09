package Beans;

public class Vacante {
	
	private Integer id;
	private String imagen = "no_image.png";
	private String nombre;
	private String apellido;
	private String departamento;
	private String sexo;
	
	public Vacante(Integer id, String imagen, String nombre, String apellido, String departamento, String sexo) {
		super();
		this.id = id;
		this.imagen = imagen;
		this.nombre = nombre;
		this.apellido = apellido;
		this.departamento = departamento;
		this.sexo = sexo;
	}

	public Vacante(Integer id, String nombre, String apellido, String departamento, String sexo) {
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

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


}
