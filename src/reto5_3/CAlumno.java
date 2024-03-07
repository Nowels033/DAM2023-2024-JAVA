package reto5_3;

import java.util.Arrays;
import java.util.Date;

public class CAlumno extends CPersona {

	// CAlumno: psNombre, psApellido1, pdNacimiento, piDni, paoAsignatura, paiNota;

	private CAsignatura[] paoAsignatura;
	private int[] paiNota;

	/**
	 * @param psNombre
	 * @param psApellido1
	 * @param pdNacimiento
	 * @param piDni
	 */
	public CAlumno(String psNombre, String psApellido1, Date pdNacimiento, int piDni) {
		super(psNombre, psApellido1, pdNacimiento, piDni);

		this.paoAsignatura = new CAsignatura[3];
		this.paiNota = new int[3];
	}

	/**
	 * @return el paoAsignatura
	 */
	public CAsignatura[] getPaoAsignatura() {
		return paoAsignatura;
	}

	/**
	 * @param paoAsignatura el paoAsignatura a establecer
	 */
	public void setPaoAsignatura(CAsignatura[] paoAsignatura) {
		this.paoAsignatura = paoAsignatura;
	}

	public void setPaoAsignaturaAñadir1(CAsignatura asignatura) {

		for (int i = 0; i < this.paoAsignatura.length; i++) {

			if (this.paoAsignatura[i] == null) {

				this.paoAsignatura[i] = asignatura;
			}
		}

	}

	/**
	 * @return el paiNota
	 */
	public int[] getPaiNota() {
		return paiNota;
	}

	/**
	 * @param paiNota el paiNota a establecer
	 */
	public void setPaiNota(int[] paiNota) {
		this.paiNota = paiNota;
	}

	public void setPaiNotaAñadir1(int nota) {

		for (int i = 0; i < this.paiNota.length; i++) {

			if (this.paiNota == null) {

				this.paiNota[i] = nota;
			}
		}

	}

	@Override
	public String toString() {
		return "Alumno [Asignatura =" + Arrays.toString(getPaoAsignatura()) + ", Nota =" + Arrays.toString(getPaiNota())
				+ ", Nombre =" + getPsNombre() + ", Apellido1 =" + getPsApellido1() + ", Nacimiento ="
				+ getPdNacimiento() + ", Dni =" + getPiDni() + "]";
	}

}
