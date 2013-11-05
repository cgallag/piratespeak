import java.util.*;

public class PirateSpeak {

private Hashtable<String, String> pirateDictionary;

public PirateSpeak() {
    pirateDictionary = new Hashtable<String,String>();

	// fill the hashtable with words, hard-coded for now
	pirateDictionary.put("hello","ahoy");
	pirateDictionary.put("pardon me","avast");
	pirateDictionary.put("excuse me","arrr");
		
	pirateDictionary.put("sir","matey");
	pirateDictionary.put("madam","proud beauty");
	pirateDictionary.put("miss","comely wench");
	pirateDictionary.put("stranger","scurvy dog");
	pirateDictionary.put("officer","foul blaggart");
		
	pirateDictionary.put("where is","whar be");
	pirateDictionary.put("can you help me find","know ye");
	pirateDictionary.put("is that","be that");
	pirateDictionary.put("how far is it to","how many leagues to");
		
	pirateDictionary.put("the","th'");
	pirateDictionary.put("a","a briny");
	pirateDictionary.put("any","some forsaken");
	pirateDictionary.put("nearby","broadside");
	pirateDictionary.put("my","me");
	pirateDictionary.put("your","ye");
		
	pirateDictionary.put("old","barnacle-covered");
	pirateDictionary.put("attractive","comely");
	pirateDictionary.put("happy","grog-filled");
		
	pirateDictionary.put("restaurant","galley");
	pirateDictionary.put("hotel","fleabag inn");
	pirateDictionary.put("mall","market");
	pirateDictionary.put("pub","Skull & Scuppers");
	pirateDictionary.put("bank","buried treasure");
		
	pirateDictionary.put("I would like to","I be needin' t'");
	pirateDictionary.put("I desire to","I've a fierce fire in me belly t'");
	pirateDictionary.put("I wish I knew how to","I be hankerin' t'");
	pirateDictionary.put("my mother told me to","me dear ol' mum, bless her soul, tol' me t'");
	pirateDictionary.put("my companion would like to","me mate, ol' Rumpot, wants t'");

	pirateDictionary.put("find","come across");
	pirateDictionary.put("take a nap","have a bit of a lie-down");
	pirateDictionary.put("make a withdrawal","seize all me gold");
	pirateDictionary.put("have a cocktail","swill a pint or two o' grog");
}

    public int getLength() {
	return pirateDictionary.size();
    }

    public String getContents() {
	String s = "{";
	for(Enumeration e= pirateDictionary.keys(); e.hasMoreElements();) {
	    String el = (String)e.nextElement();
	    s += el + "=" + (String)pirateDictionary.get(el) + "; ";
	}
	s += "}";
	return s;
    }

    public String translate(String greeting, String person, String question, String article, String adj, String place, String desire, String action) {
	return (String)pirateDictionary.get(greeting) + " " + (String)pirateDictionary.get(person) + ", " + (String)pirateDictionary.get(question) + " " + (String)pirateDictionary.get(article) + " " + (String)pirateDictionary.get(adj) + " " + (String)pirateDictionary.get(place) + "? " + (String)pirateDictionary.get(desire) + " " + (String)pirateDictionary.get(action) + ".";
    } 

    public static void main(String[] args) {
	Scanner ps = new Scanner(System.in);
	PirateSpeak pirateDct = new PirateSpeak();
	int dictLength = pirateDct.getLength();
	System.out.println("Welcome to the English-Pirate Speak Translation Program!\n\nThis program will prompt you through entering an English sentence and will translate it to Pirate Speak for you.\n\nThe size of the dictionary is: " + dictLength + "\n");
	String dictContents = pirateDct.getContents();
	System.out.println(dictContents + "\n");
	System.out.println("Please enter a greeting: hello | pardon me | excuse me:");
	String greeting = ps.nextLine();
	System.out.println("Please enter a person: sir | madam | miss | stranger | officer :");
	String person = ps.nextLine();
	System.out.println("Please enter a question: where is | can you help me find | is that | how far is it to :");
	String question = ps.nextLine();
	System.out.println("Please enter an article: the | a | any | nearby | my | your :");
	String article = ps.nextLine();
	System.out.println("Please enter an adjective: old | attractive | happy :");
	String adj = ps.nextLine();
	System.out.println("Please enter a place: restaurant | hotel | mall | pub | bank :");
	String place = ps.nextLine();
	System.out.println("Please enter a desire: I would like to | I desire | I wish I knew how to | my mother told me to | my companion would like to :");
	String desire = ps.nextLine();
	System.out.println("Please enter an action: find | take a nap | make a withdrawal | have a cocktail:");
	String action = ps.nextLine();
	ps.close();
	System.out.println("\nYou entered:\n" + greeting + " " + person + ", " + question + " " + article + " " + adj + " " + place + "? " + desire + " " + action + ".\n");
	System.out.println("Here's your sentence translated into Pirate Speak:\n" + pirateDct.translate(greeting,person,question,article,adj,place,desire,action) + "\n");
	System.out.println("Thank you for using the English-to-Pirate Speak Translator! Ahoy, have a good day, arrr!");
	
    }
}