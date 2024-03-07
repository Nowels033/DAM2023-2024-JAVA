package reto5_3;

public class CAsignatura {

	//piCodigo, psNombre, poProfesor, piHorasSemanales
	
	private int piCodigo;
	private String psNombre;
	private CProfesor poProfesor;
	private int piHorasSemanales;
	
	/**
	 * @param piCodigo
	 * @param psNombre
	 * @param poProfesor
	 * @param piHorasSemanales
	 */
	public CAsignatura(int piCodigo, String psNombre, CProfesor poProfesor, int piHorasSemanales) {
		super();
		this.piCodigo = piCodigo;
		this.psNombre = psNombre;
		this.poProfesor = poProfesor;
		this.piHorasSemanales = piHorasSemanales;
	}
	/**
	 * @return el psNombre
	 */
	public String getPsNombre() {
		return psNombre;
	}
	/**
	 * @param psNombre el psNombre a establecer
	 */
	public void setPsNombre(String psNombre) {
		this.psNombre = psNombre;
	}
	/**
	 * @return el poProfesor
	 */
	public CProfesor getPoProfesor() {
		return poProfesor;
	}
	/**
	 * @param poProfesor el poProfesor a establecer
	 */
	public void setPoProfesor(CProfesor poProfesor) {
		this.poProfesor = poProfesor;
	}
	/**
	 * @return el piCodigo
	 */
	public int getPiCodigo() {
		return piCodigo;
	}
	/**
	 * @param piCodigo el piCodigo a establecer
	 */
	public void setPiCodigo(int piCodigo) {
		this.piCodigo = piCodigo;
	}
	
	/**
	 * @return el piHorasSemanales
	 */
	public int getPiHorasSemanales() {
		return piHorasSemanales;
	}
	/**
	 * @param piHorasSemanales el piHorasSemanales a establecer
	 */
	public void setPiHorasSemanales(int piHorasSemanales) {
		this.piHorasSemanales = piHorasSemanales;
	}
	@Override
	public String toString() {
		return "CAsignatura [Codigo=" + getPiCodigo() + ", Nombre=" + getPsNombre()
				+ ", HorasSemanales()=" + getPiHorasSemanales() + "Profesor : "+getPoProfesor()+"]";
	}
	
	
	
}
