package persona;

public class Paciente {
	
	//1 atributos
	String numeroSeguroSocial;
	String tipoSangre;
	boolean expediente;
	boolean seguroGastosMedicos;
	String cita;
	String doctorAsignado;
	boolean alergias;
	
	
	
	
	//2 constructor
	
	Paciente(String numeroSeguroSocial, String tipoSangre, boolean expediente, boolean seguroGastosMedicos,
			String cita, String doctorAsignado, boolean alergias) {
		
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.tipoSangre = tipoSangre;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
		this.cita = cita;
		this.doctorAsignado = doctorAsignado;
		this.alergias = alergias;
	}// constructor con todos los campos
	
	
	//2.1 Constructor que recopile solo los datos requeridos u obligatorios
	Paciente(String numeroSeguroSocial, boolean expediente, boolean seguroGastosMedicos){
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
	} //constructor con campos obligatorios
	
	
	// 3 metodos


	@Override
	public String toString() {
		return "Paciente [numeroSeguroSocial=" + numeroSeguroSocial + ", tipoSangre=" + tipoSangre + ", expediente="
				+ expediente + ", seguroGastosMedicos=" + seguroGastosMedicos + ", cita=" + cita + ", doctorAsignado="
				+ doctorAsignado + ", alergias=" + alergias + "]";
	}
	
	
	
	
	
	

}//Clase paciente
