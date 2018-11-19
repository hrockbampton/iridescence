package interfaces;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore {
	private ArrayList<Toy> toyList;

	public ToyStore() {
		

	}
      
	public Toy getThatToy(String nm){
		for(Toy t : toyList) {
			if(t.getName().equals(nm)){
				return t;
			}
		}
	return null;
	}
	
	public void loadToys(String toys, int count) {
		for(String s : toys.split(" ")) {
		Toy t = getThatToy(s);
			if(t == null) {
				toyList.add(new Toy(s));
			} else {
				t.setCount(t.getCount() + 1);
			}
		}
	}

        
	public String getMostFrequentToy() {
		
	
		return "";
	}

	public void sortToysWithSelectionSort() {// needs regular for loop to track and use indicies
		//check with your teacher on this one!
	}

	public void sortToysWithInsertionSort() {// needs regular for loop to track and use indicies
		//and on this one!
	}
	//comparable interface!
	public void sortToysWithCompareTo() {
	
	}

	public String toString() {
		return "";
	}
}
