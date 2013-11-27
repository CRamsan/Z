package com.cesarandres.z.auth;

import java.sql.SQLException;

import com.cesarandres.z.database.Database;
import com.cesarandres.z.event.CommandReceivedEvent;
import com.cesarandres.z.event.IEventReceivedListener;
import com.cesarandres.z.network.ServerNetwork;

public class Authenticator implements IEventReceivedListener {

	private Database source;
	private ServerNetwork network;

	public Authenticator(int maxConnections) {
		try {
			this.source = new Database();
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("Error initializing the database");
			e.printStackTrace();
		}
		this.network = new ServerNetwork(maxConnections);
		this.network.addCommandReceivedEventListener(this);
	}

	@Override
	public void commandReceivedEventOccurred(CommandReceivedEvent evt) {
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args) {

	}
}
