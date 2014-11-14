// The package containing our stubs.
import MemoryCatcherApp.*;

//Servant must inherit the generated code
public class MemoryCatcherServant extends _MemoryCatcherImplBase {
	// Add the MemoryCatchers methods here in the next step.

	int resources = 0;
	int points = 0;
	String memories = " ";
	String moments = " ";

	public void buy(int amount){
			resources = resources + amount;

	}


	public int getResource(){
		return resources;
	}

	public String getMemory(){
		return memories;
	}

	public String share(String memories){
			moments = memories + moments;
	}

}








