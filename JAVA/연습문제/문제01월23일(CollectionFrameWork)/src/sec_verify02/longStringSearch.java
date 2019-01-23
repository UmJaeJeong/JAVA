package sec_verify02;

import java.util.ArrayList;

public class longStringSearch {

	private ArrayList<String> stringList;

	public longStringSearch(int i) {
		stringList = new ArrayList(i);
	}
	
	public String longestString() {
		int max = 0;
		int idx = 0;
		for(int i=0; i<stringList.size();i++) {
			String str = stringList.get(i);
			if(max<str.length()) {
				max =str.length();
				idx = i;
			}
		}
		return stringList.get(idx);
	}
	public void addString(String str) {
		stringList.add(str);
	}

	public ArrayList<String> getStringList() {
		return stringList;
	}

	public void setStringList(ArrayList<String> stringList) {
		this.stringList = stringList;
	}
	
	

}
