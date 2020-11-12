package solution;

import java.util.List;
import java.util.ArrayList;

import shipping.IContainer;
import shipping.IShip;

public class Ship implements IShip {
	private String regID;
	private List<IContainer> containers;

	public Ship(String regID){
		this.regID = regID;
		this.containers = new ArrayList<IContainer>();
	}

	@Override
	public List<IContainer> containers() {
		// TODO Auto-generated method stub
		return this.containers;
	}

	@Override
	public List<IContainer> offload() {
		// TODO Auto-generated method stub
		List<IContainer> conRet = this.containers;
		this.containers = new ArrayList<>();
		return conRet;
	}

	@Override
	public String getRegistration() {
		// TODO Auto-generated method stub
		return this.regID;
	}

	@Override
	public void setRegistration(String id) {
		// TODO Auto-generated method stub
		this.regID = id;
	}

	@Override
	public void addContainer(IContainer container) {
		// TODO Auto-generated method stub
		this.containers.add(container);
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Ship " + getRegistration() + " has " + containers().size() + " containers.");
	}

}
