package solution;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import shipping.IContainer;
import shipping.IDockyard;
import shipping.ITruck;

public class Dockyard implements IDockyard {
	private int size;
	private HashMap<String, Queue<IContainer>> containers;

	public Dockyard(){
		containers = new HashMap<>();
	}

	@Override
	public void addContainer(IContainer container) {
		// TODO Auto-generated method stub
		String des = container.destinationCity();
		if (!containers.containsKey(des)){
			containers.put(des, new LinkedList<>(Arrays.asList(container)));
		}else{
			containers.get(des).add(container);
		}
		size++;
	}

	@Override
	public boolean loadTruck(ITruck truck) {
		// TODO Auto-generated method stub
		String des = truck.destinationCity();
		Queue<IContainer> contQ = containers.get(des);
		if(!contQ.isEmpty() && truck.addContainer(contQ.peek())){
			contQ.remove();
			size--;
			return true;
		}
		return false;
	}

	@Override
	public int containerCount() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public int containerCount(String destinationCity) {
		// TODO Auto-generated method stub
		return containers.get(destinationCity).size();
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("The dockyard contains " + size + " containers.");
		for (Map.Entry<String,Queue<IContainer>> item : containers.entrySet()){
			System.out.println(item.getKey() + " : " + item.getValue().size());
		}
	}

}
