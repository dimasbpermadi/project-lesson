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
public class Clientips {

	@Id @GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
		)
	private String ipid;
	
	@NotNull @NotEmpty @JoinColumn(name = "clientid")
	@ManyToOne
	private Client clientid;
	
	@NotEmpty @NotNull
	private String clientip;
	
	public String getIpid() {
		return ipid;
	}
	public void setIpid(String ipid) {
		this.ipid = ipid;
	}
	public Client getClient() {
		return clientid;
	}
	public void setClient(Client clientid) {
		this.clientid = clientid;
	}
	public String getClientip() {
		return clientip;
	}
	public void setClientip(String clientip) {
		this.clientip = clientip;
	}
}
