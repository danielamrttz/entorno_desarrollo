package models;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private int edad;
	
/**
 * Constructor donde le pasamos los parametros
 * 
 * @param nombre 		String donde ponemos el nombre de la persona
 * @param apellidos		String donde ponemos los apellidos de la persona
 * @param edad			Int donde indicamos la edad de la persona
 * @throws				Excepcion que nos lanza si la edad introducida no esta entre 0 y 130
 */
	
	public Persona(String nombre, String apellidos, int edad) {
		
		if(edad<0 || edad>130) {
			throw new IllegalArgumentException ("La edad debe estar entre 0 y 130");
		}
		
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
		
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos (String apellidos) {
		this.apellidos=apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad() {
		this.edad=edad;
	}
	

/**
 * Metodo que devuelve si uan persona es menor de edad, mayor de edad o jubilado
 * 
 * 
 * @return String que nos devuelve si es menor de edad, mayor de edad o jubilado
 */
	
	public String mostrarEdad() {
		String frase="";
		
		if (edad<18) {
			frase= "Menor de edad";
		}else if (edad>=18 && edad<=65) {
			frase= "Mayor de edad";
		}else {
			frase= "Jubilado";
		}
		return frase;
	
	}

}
