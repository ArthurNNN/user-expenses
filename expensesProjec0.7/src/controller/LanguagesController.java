package controller;

import java.util.HashMap;
import java.util.Scanner;

// import languages.*;
import model.Language;

public class LanguagesController {
	public static Language languageSelection(Scanner reader, Language language, HashMap<String, Language> languages) {
		MenuController.LanguagesMenu(language.getTag());
		String command = reader.nextLine();
		if (command.equals("1"))
			language = languages.get("english");
		if (command.equals("2"))
			language = languages.get("catalan");
		if (command.equals("3"))
			language = languages.get("spanish");
		if (command.equals("4"))
			language = languages.get("russian");
		return language;
	}

	public static HashMap<String, Language> initLanguages() {

		// we are declaring languagesInit of type hashMap and assigning a new object
		// HashMap of String and Language object
		HashMap<String, Language> languagesInit = new HashMap<String, Language>();

//		EnglishLanguage.init(languagesInit);
//
//		CatalanLanguage.init(languagesInit);

//		RussianLanguage.init(languagesInit);

//		SpanishLanguage.init(languagesInit);

		return languagesInit;
	}
}
