package model;

public class Language {
	String langName;
	String tag;
	String create;
	String login;
	String language;
	String quit;
	String namePhrase;
	String surnamePhrase;

	public String getNamePhrase() {
		return namePhrase;
	}

	public void setNamePhrase(String namePhrase) {
		this.namePhrase = namePhrase;
	}

	public String getSurnamePhrase() {
		return surnamePhrase;
	}

	public void setSurnamePhrase(String surnamePhrase) {
		this.surnamePhrase = surnamePhrase;
	}

	public String getAgePhrase() {
		return agePhrase;
	}

	public void setAgePhrase(String agePhrase) {
		this.agePhrase = agePhrase;
	}

	String agePhrase;

	public Language() {
		super();
	}

	public Language(String langName, String tag, String create, String login, String language, String quit,
			String namePhrase, String surnamePhrase, String agePhrase) {
		super();
		this.langName = langName;
		this.tag = tag;
		this.create = create;
		this.login = login;
		this.language = language;
		this.quit = quit;
		this.namePhrase = namePhrase;
		this.surnamePhrase = surnamePhrase;
		this.agePhrase = agePhrase;
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
