package info.helton.structural_patterns.adapter.implementation_01;

import info.helton.structural_patterns.adapter.implementation_01.adapters.HDMIToOldMonitorAdapter;
import info.helton.structural_patterns.adapter.implementation_01.adapters.HDMIToVGAAdapter;
import info.helton.structural_patterns.adapter.implementation_01.devices.Computer;
import info.helton.structural_patterns.adapter.implementation_01.devices.OldMonitor;
import info.helton.structural_patterns.adapter.implementation_01.devices.TV;

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");

		System.out.println("------ Monitor ----------");

		Computer pc2 = new Computer();
		OldMonitor monitor = new OldMonitor();
		// pc2.connectPort(monitor.getConnector()); //Don't work! That's the reason why
		// we create the adapter
		pc2.connectPort(new HDMIToVGAAdapter(monitor));
		pc2.sendImageAndSound("Cat and rainbow", "Nyan cat song");

		System.out.println("------ Monitor Class Adapter ----------");

		Computer pc3 = new Computer();
		HDMIToOldMonitorAdapter monitorAdaptee = new HDMIToOldMonitorAdapter();
		pc3.connectPort(monitorAdaptee);
		pc3.sendImageAndSound("Cat and rainbow", "Nyan cat song");
	}
}
