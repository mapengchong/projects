package solution;

import shipping.IContainer;
import shipping.ITruck;

public class Truck implements ITruck {
	String regID;
	IContainer container;
	String destination;

	Truck(String regID, String destination){
		this.regID = regID;
		this.destination = destination;
	}
	@Override
	public String registration() {
		// TODO Auto-generated method stub
		return this.regID;
	}

	@Override
	public String destinationCity() {
		// TODO Auto-generated method stub
		return this.destination;
	}

	@Override
	public boolean addContainer(IContainer container) {
		// TODO Auto-generated method stub
		if (this.container == null){
			this.container = container;
			return true;
		}
		return false;
	}

	@Override
	public IContainer offloadContainer() {
		// TODO Auto-generated method stub
		IContainer conRet = container;
		container = null;
		return conRet;
	}

	@Override
	public boolean hasContainer() {
		// TODO Auto-generated method stub
		return !(container == null);
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		String n = (container == null) ? "no container" : "container " + container.id();
		System.out.println("Truck " + registration() + " is headed to " + destinationCity() + " with " + n);
	}

}
