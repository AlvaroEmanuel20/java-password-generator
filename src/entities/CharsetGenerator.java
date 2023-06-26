package entities;

public class CharsetGenerator {
	
	private final String NUMBERS = "0123456789";
	private final String UPPERLETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final String LOWERLETTERS = "abcdefghijklmnopqrstuvwxyz";
	private final String SPECIALCHARS = "@!?#$%&*()[]{},._-~+=";
	
	public CharsetGenerator() {}

	public String generate(PasswordGenerator passGen) {
		String charset = "";
		
		charset += (passGen.isHasNumbers()) ? this.NUMBERS : "";
		charset += (passGen.isHasUpperLetters()) ? this.UPPERLETTERS : "";
		charset += (passGen.isHasLowerLetters()) ? this.LOWERLETTERS : "";
		charset += (passGen.isHasSpecialChars()) ? this.SPECIALCHARS : "";
		
		return charset;
	}
 			
}
