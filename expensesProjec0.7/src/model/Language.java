package model;

import java.util.HashMap;

public class Language {

	public String name;
	public String tag;
	public HashMap<String, String> messages;
	//public ArrayList<String> countries;

	public Language(String name, String tag) {
		this.name = name;
		this.tag = tag;
		this.messages = new HashMap<String, String>();
	}

	public HashMap<String, String> getMessage() {
		return messages;
	}

	public void setMessage(HashMap<String, String> prompts) {
		this.messages = prompts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}
