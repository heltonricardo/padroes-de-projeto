package info.helton.structural_patterns.adapter.implementation_01.devices;

import info.helton.structural_patterns.adapter.implementation_01.intefaces.VGA;

public class OldMonitor implements VGA {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}

}
