package teste;

import java.util.Date;

public class Email {

	Integer id;
	Date dataAtualizacao;
	
	public Email(int id, Date date) {
		this.id = id;
		this.dataAtualizacao = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

}
