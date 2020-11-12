package solution;

import shipping.IContainer;

public class Container implements IContainer {
	private String id;
	private String description;
	private String destination;

	public Container(String id, String destination){
		this.id = id;
		this.destination = destination;
		this.description = "";
	}
	@Override
	public String id() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public String destinationCity() {
		// TODO Auto-generated method stub
		return this.destination;
	}

}
