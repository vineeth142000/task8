package TDDJUNIT;
public class Remove2characters {

	public String removeA(String string) {
		String remainingchar="";
		String remainingchar1="";
		int length=string.length();
		char firstchar=string.charAt(0);
		char secondchar=string.charAt(1);
	    if(firstchar=='A') {
			remainingchar+=string.substring(1,length);
			if(secondchar=='A') {
				remainingchar1+=string.substring(2,length);
				return remainingchar1;
			}
	    }	
		else if(secondchar=='A') {
			remainingchar+=firstchar+string.substring(2,length);
		}
		else {
			remainingchar+=string;
		}
	    return remainingchar;
	}
}