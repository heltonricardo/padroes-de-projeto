package info.helton.structural_patterns.adapter.implementation_01.devices;

import info.helton.structural_patterns.adapter.implementation_01.intefaces.HDMI;

public class TV implements HDMI {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}

	@Override
	public void setSound(String sound) {
		System.out.println(">>> This is your sound: " + sound);
	}

}
