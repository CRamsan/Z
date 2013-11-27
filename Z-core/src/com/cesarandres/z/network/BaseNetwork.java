package com.cesarandres.z.network;

import java.util.ArrayList;

import com.cesarandres.z.event.CommandReceivedEvent;
import com.cesarandres.z.event.IEventReceivedListener;
import com.cesarandres.z.event.IEventSource;

public abstract class BaseNetwork implements IEventSource {

    public static final short LISTENING_PORT = 4931;

    private ArrayList<IEventReceivedListener> listenerList = new ArrayList<IEventReceivedListener>();

    @Override
    public void addCommandReceivedEventListener(IEventReceivedListener listener) {
	listenerList.add(listener);
    }

    @Override
    public void removeCommandReceivedEventListener(IEventReceivedListener listener) {
	listenerList.remove(listener);
    }

    @Override
    public void firecommandReceivedEvent(CommandReceivedEvent evt) {
	for (IEventReceivedListener listener : listenerList) {
	    listener.commandReceivedEventOccurred(evt);
	}
    }

    protected abstract void connectionEnded(ServiceConnection connection);
}
