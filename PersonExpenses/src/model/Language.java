package model;

public class Language {
	String langName;
	String tag;
	String create;
	String login;
	String language;
	String quit;
	
	
	public Language() {
		super();
	}


	public Language(String langName, String tag, String create, String login, String language, String quit) {
		super();
		this.langName = langName;
		this.tag = tag;
		this.create = create;
		this.login = login;
		this.language = language;
		this.quit = quit;
	}


	public String getLangName() {
		return langName;
	}


	public void setLangName(String langName) {
		this.langName = langName;
	}


	public String getTag() {
		return tag;
	}


	public void setTag(String tag) {
		this.tag = tag;
	}


	public String getCreate() {
		return create;
	}


	public void setCreate(String create) {
		this.create = create;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public String getQuit() {
		return quit;
	}


	public void setQuit(String quit) {
		this.quit = quit;
	}
	
	

	
	

}
