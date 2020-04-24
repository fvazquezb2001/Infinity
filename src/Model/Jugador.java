package Model;

public class Jugador {
	
	private int fuerza;
	private int dextreza;
	private int mente;
	private int voluntad;
	private int vitalidad;
	private int tecnologia;
	private int infinitypoint;
	private int iniciativa;
	
	

	public Jugador(int fz, int dex, int men, int vol, int vil, int tecn, int infip, int ini){
		this.fuerza=fz;
		this.dextreza=dex;
		this.mente=men;
		this.voluntad=vol;
		this.vitalidad=vil;
		this.tecnologia=tecn;
		this.infinitypoint=infip;
		this.iniciativa=ini;
	}
	
	//Getters and Setters
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getDextreza() {
		return dextreza;
	}
	public void setDextreza(int dextreza) {
		this.dextreza = dextreza;
	}
	public int getMente() {
		return mente;
	}
	public void setMente(int mente) {
		this.mente = mente;
	}
	public int getVoluntad() {
		return voluntad;
	}
	public void setVoluntad(int voluntad) {
		this.voluntad = voluntad;
	}
	public int getVitalidad() {
		return vitalidad;
	}
	public void setVitalidad(int vitalidad) {
		this.vitalidad = vitalidad;
	}
	public int getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(int tecnologia) {
		this.tecnologia = tecnologia;
	}
	public int getInfinitypoint() {
		return infinitypoint;
	}
	public void setInfinitypoint(int infinitypoint) {
		this.infinitypoint = infinitypoint;
	}
	public int getIniciativa() {
		return iniciativa;
	}
	public void setIniciativa(int iniciativa) {
		this.iniciativa = iniciativa;
	}

	@Override
	public String toString() {
		return "Jugador [fuerza=" + fuerza + ", dextreza=" + dextreza + ", mente=" + mente + ", voluntad=" + voluntad
				+ ", vitalidad=" + vitalidad + ", tecnologia=" + tecnologia + ", infinitypoint=" + infinitypoint
				+ ", iniciativa=" + iniciativa + "]";
	}



}
