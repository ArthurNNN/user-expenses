package app;

import java.util.HashMap;
import java.util.Scanner;

import model.Language;

public class LanguagesController {
	public static Language languageSelection(Scanner reader, Language language, HashMap<String, Language> languages) {
		MenuController.LanguagesMenu(language.getTag());
		String command = reader.nextLine();
		if (command.equals("english"))
			language = languages.get("english");
		if (command.equals("catalan"))
			language = languages.get("catalan");
		if (command.equals("spanish"))
			language = languages.get("spanish");
		if (command.equals("russian"))
			language = languages.get("russian");
		return language;
	}

// to-do while
	public static HashMap<String, Language> initLanguages() {
		HashMap<String, Language> languagesInit = new HashMap<String, Language>();

		languagesInit.put("english", new Language("English", "eng", "create", "login", "language", "quit",
				"Tell me your name: ", "Tell me your surname: ", "Tell me your age: "));
		languagesInit.put("catalan", new Language("Catalan", "cat", "crear", "logejar-se", "llengua", "sortir",
				"Diga'm el teu nom: ", "Diga'm el teu cognom:", "Diga'm la teva edat: "));
		languagesInit.put("spanish", new Language("Spanish", "spa", "crear", "loguearse", "lengua", "salir",
				"Dime tu nombre: ", "Dime tu apellido: ", "Dime tu edad: "));
		languagesInit.put("russian", new Language("Russian", "rus", "создать", "войти", "язык", "выход",
				"Назовите ваше имя:", "Назовите вашу фамилию:", "Назовите ваш возраст:"));

		return languagesInit;
	}
}
