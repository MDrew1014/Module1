package com.techelevator;

public class Television {
	//instance variables
	private boolean isOn;
	private int currentChannel;
	private int currentVolume;
	//constants
	public static final boolean defaultIsOn = false;
	public static final int defaultCurrentChannel = 3;
	public static final int defaultCurrentVolume = 2;
	
	
	//Methods
	public void turnOff() {
		isOn=false;
	}
	public void turnOn() {
		isOn = true;
		currentChannel = 3;
		currentVolume = 2;
	}
	public void changeChannel(int newChannel) {
		if(isOn == false) {
			newChannel = currentChannel;
		}else if (isOn == true) {
			if (newChannel > 2 && newChannel < 19) {
				currentChannel = newChannel;
			}
		}
	}

	public void channelUp() {
		if(isOn == false) {
			currentChannel = defaultCurrentChannel;
		}else if (isOn == true) {
			currentChannel++;
			if (currentChannel > 18) {
				currentChannel = defaultCurrentChannel;
			}
		}
	}

	public void channelDown() {
		if (isOn == true) {
			currentChannel--;
		}{	if (currentChannel < 3) {
				currentChannel = 18;
		}}
		}
	
	public void raiseVolume() {
		if(isOn == false) {
			currentVolume = defaultCurrentVolume;
	}else if (isOn == true && currentVolume < 10) {
			currentVolume++;
		}
	}

	public void lowerVolume() {
		if(isOn == false) {
			currentVolume = defaultCurrentVolume;
	}
		if (isOn == true && currentVolume > 0) {
			currentVolume--;
		}
	}

	public boolean isOn() {
		return isOn;
	}
////getters and setters
	public int getCurrentChannel() {
		if (isOn == true) {
			return currentChannel;
		}
		return defaultCurrentChannel;
	}

	public int getCurrentVolume() {
		if (isOn == true) {
			return currentVolume;
		}
		return defaultCurrentVolume;
	}

	public static boolean isDefaultison() {
		return defaultIsOn;
	}

	public static int getDefaultcurrentchannel() {
		return defaultCurrentChannel;
	}

	public static int getDefaultcurrentvolume() {
		return defaultCurrentVolume;
	}
		
	
	



	
}