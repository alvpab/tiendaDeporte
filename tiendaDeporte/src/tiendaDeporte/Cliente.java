package tiendaDeporte;

public class Cliente extends Persona
{
	/*
	 * Atributos
	 */
	String tipoEmpleado[]={"POTENCIAL","NUEVO","VIP","MOROSO"};
	/*
	 * Constructor
	 */
	public Cliente()
	{ //CHECK si necesitamos a�adir par�metros al constructor
		this.tipoEmpleado=tipoEmpleado;
	} //Cierre del constructor sin par�metros
	public Cliente(String tipo)
	{
		this.tipoEmpleado=tipoEmpleado;
	} //Cierre del constructor con par�metros
	/*
	 * Funciones
	 */
	public static void darAlta()
	{
		Cliente nuevoCliente=new Cliente();
	} //Cierre de darAlta
}
