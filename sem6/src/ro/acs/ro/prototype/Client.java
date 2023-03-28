package ro.acs.ro.prototype;

public class Client implements AbstractPrototype{
	
	private String clientName;
	private String phoneNumber;
	private String email;

	private Client() {
		
	}
	
	@Override
	public AbstractPrototype createACopy() throws CloneNotSupportedException{
		return (AbstractPrototype)this.clone();
	}

	public AbstractPrototype createADeepCopy() {
		Client client = new Client();
		client.clientName = this.clientName;
		client.phoneNumber = this.phoneNumber;
		client.email = this.email;
		return (AbstractPrototype)client;
	}
	
	public Client(String clientName, String phoneNumber, String email) {
		
		this.clientName = clientName;
		if(clientName.length()>=3) {
			this.clientName = clientName;
		}else {
			throw new IllegalArgumentException();
		}
		this.phoneNumber = phoneNumber;
		this.email = email;
		if(email.contains("@")) {
			this.email = email;
		}else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public String toString() {
		return "Client [clientName=" + clientName + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
	
	
	

}
