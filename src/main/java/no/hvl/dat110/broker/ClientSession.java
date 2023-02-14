package no.hvl.dat110.broker;

import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.MessageUtils;
import no.hvl.dat110.messagetransport.Connection;

public class ClientSession {
	
	//TODO:IMPORTANT
	//The methods in this class must be used when the broker is to receive and send messages to a connected client.
	
	private String user;
	
	// underlying message transport connection
	private Connection connection;

	public ClientSession(String user, Connection connection) {
		this.user = user;
		this.connection = connection;

	}

	public void disconnect() {

		if (connection != null) {
			connection.close();
		}
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	public void send(Message message) {

		MessageUtils.send(connection, message);
	}

	// check whether there is some message on the connection
	public boolean hasData() {

		return connection.hasData();
	}

	public Message receive() {

		Message msg = MessageUtils.receive(connection);

		return msg;
	}

}
