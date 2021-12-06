package test;

public class Enterprise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShipEnterprise myShip = new ShipEnterprise();
		Payload humans = new Payload();
		Payload machine = new Payload();
		Payload veryBigGuns = new Payload();
		WarpEngine v12 = new WarpEngine();
		Mission mission= myShip.launchTheShip(humans, machine, veryBigGuns, v12);
		mission.printStatus();

	}

}
//class Fiction{}
class StarWars extends Fiction{}
class Payload {
	// this is a payload to ship //
}

class Mission{
	String status;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	void printStatus()
	{
		System.out.println("Mission Status:"+status);
	}
}
class Engine{}
class WarpEngine extends Engine{}
class ShipEnterprise extends StarWars{
	
	
	Mission launchTheShip(Payload machine, Payload human, Payload guns,WarpEngine we)
	{
		Mission mission = new Mission();
		System.out.println("Mission has been started.");
		mission.setStatus("Completed...Valcuns Saved.");
		return mission;
	}
}