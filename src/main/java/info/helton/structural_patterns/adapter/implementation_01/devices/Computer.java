package info.helton.structural_patterns.adapter.implementation_01.devices;

import info.helton.structural_patterns.adapter.implementation_01.intefaces.HDMI;

public class Computer {
	private HDMI port;

	public void connectPort(HDMI screen) {
		System.out.println("Connecting on HDMI port...");
		this.port = screen;
	}

	public void sendImageAndSound(String image, String sound) {
		if (port == null) {
			System.out.println("Connect a HDMI cable first");
		} else {
			port.setImage(image);
			port.setSound(sound);
		}
	}
}
