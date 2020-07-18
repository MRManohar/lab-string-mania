package utility;

public class StringMethod {
	private String input;
	
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public String lower(String input) {
		return input.toLowerCase();
	}
	public String upper(String input) {
		return input.toUpperCase();
	}
	public String firstCharacter(String input) {
		String c =input.charAt(0)+" "; 
		return c.trim();
	}
	public String length(String input) {
		int len = input.length();
		String lengt = Integer.toString(len);
		return lengt;
	}
	public String trim(String input) {
		return input.trim();
	}
}