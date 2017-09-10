package co.id.payment.corporate.corporateh2h.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
public class Clientpic {
	
	@Id @GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
		)
	public String idpic;
	
	@NotEmpty @NotNull 
	@ManyToOne
	@JoinColumn(name = "clientid")
	public Client clientid;
	
	@NotEmpty @NotNull
	public String picname;
	
	@NotEmpty @NotNull
	public String picunit;
	public String picemail;
	
	@NotEmpty @NotNull
	public String piccontact;
	
	
	public String getIdpic() {
		return idpic;
	}
	public void setIdpic(String idpic) {
		this.idpic = idpic;
	}
	public Client getClient() {
		return clientid;
	}
	public void setClient(Client clientid) {
		this.clientid = clientid;
	}
	public String getPicname() {
		return picname;
	}
	public void setPicname(String picname) {
		this.picname = picname;
	}
	public String getPicunit() {
		return picunit;
	}
	public void setPicunit(String picunit) {
		this.picunit = picunit;
	}
	public String getPicemail() {
		return picemail;
	}
	public void setPicemail(String picemail) {
		this.picemail = picemail;
	}
	public String getPiccontact() {
		return piccontact;
	}
	public void setPiccontact(String piccontact) {
		this.piccontact = piccontact;
	}
}
