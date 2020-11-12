package solution;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import shipping.IContainer;
import shipping.IDockyard;
import shipping.IShip;
import shipping.ITruck;
import shipping.ShippingProcessorBase;

public class ShippingProcessor extends ShippingProcessorBase {

	public ShippingProcessor(IDockyard dockyard) {
		super(dockyard);
		// TODO Auto-generated constructor stub
	}

	//@Override
	/*protected void processShippingEvent(String input) {
		// TODO Auto-generated method stub

	}*/

	@Override
	protected void processTruck(String registration, String destination) {
		// TODO Auto-generated method stub
		ITruck truck = new Truck(registration, destination);
		System.out.print("Before Loading: ");
		truck.printDetails();
		getDockyard().loadTruck(truck);
		System.out.print("After Loading: ");
		truck.printDetails();
	}

	@Override
	protected IShip processShip(String registration) {
		// TODO Auto-generated method stub
		IShip ship = new Ship(registration);
		List<IContainer> containers = readManifest(registration);
		for (IContainer cont : containers){
			ship.addContainer(cont);
			//getDockyard().addContainer(cont);
		}
		System.out.print("Before Unloading : ");
		ship.printDetails();
		containers = ship.offload();
		for (IContainer cont : containers){
			getDockyard().addContainer(cont);
		}
		System.out.print("After Unloading : ");
		ship.printDetails();
		return ship;
	}

	@Override
	protected List<IContainer> readManifest(String shipId) {
		// TODO Auto-generated method stub
		List<IContainer> containers = new ArrayList<>();
		String fileName = shipId + "-Manifest.txt";
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		BufferedReader reader = new BufferedReader(fileReader);
		String input;
		try {
			input = reader.readLine();
			while (input != null)
			{
				String cont[] = input.split(" ");
				IContainer container = new Container(cont[0].trim(), cont[1].trim());
				containers.add(container);
				input = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return containers;
	}

}
