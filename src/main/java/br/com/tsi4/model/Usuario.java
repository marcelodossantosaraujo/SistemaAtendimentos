package br.com.tsi4.model;

public class Usuario {
	private long pkUsuario;
	private long pkHospital;
	private String nomeusuario;
	private String senha;
	private String nivelusuario;

	public Usuario() {

	}

	public long getPkUsuario() {
		return pkUsuario;
	}

	public void setPkUsuario(long pkUsuario) {
		this.pkUsuario = pkUsuario;
	}

	public long getPkHospital() {
		return pkHospital;
	}

	public void setPkHospital(long pkHospital) {
		this.pkHospital = pkHospital;
	}

	public String getNomeusuario() {
		return nomeusuario;
	}

	public void setNomeusuario(String nomeusuario) {
		this.nomeusuario = nomeusuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNivelusuario() {
		return nivelusuario;
	}

	public void setNivelusuario(String nivelusuario) {
		this.nivelusuario = nivelusuario;
	}

}
