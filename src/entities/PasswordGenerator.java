package entities;

public class PasswordGenerator {
	
	private boolean hasNumbers;
	private boolean hasUpperLetters;
	private boolean hasLowerLetters;
	private boolean hasSpecialChars;
	private Integer passLength;

	public PasswordGenerator() {}
	
	public PasswordGenerator(
			boolean hasNumbers, 
			boolean hasUpperLetters, 
			boolean hasLowerLetters,
			boolean hasSpecialChars,
			Integer passLength
	) {
		this.hasNumbers = hasNumbers;
		this.hasUpperLetters = hasUpperLetters;
		this.hasLowerLetters = hasLowerLetters;
		this.hasSpecialChars = hasSpecialChars;
		this.passLength = passLength;
	}

	public boolean isHasNumbers() {
		return this.hasNumbers;
	}

	public void setHasNumbers(boolean hasNumbers) {
		this.hasNumbers = hasNumbers;
	}

	public boolean isHasUpperLetters() {
		return this.hasUpperLetters;
	}

	public void setHasUpperLetters(boolean hasUpperLetters) {
		this.hasUpperLetters = hasUpperLetters;
	}

	public boolean isHasLowerLetters() {
		return this.hasLowerLetters;
	}

	public void setHasLowerLetters(boolean hasLowerLetters) {
		this.hasLowerLetters = hasLowerLetters;
	}

	public boolean isHasSpecialChars() {
		return this.hasSpecialChars;
	}

	public void setHasSpecialChars(boolean hasSpecialChars) {
		this.hasSpecialChars = hasSpecialChars;
	}
	
	public Integer getPassLength() {
		return this.passLength;
	}
	
	public void setPassLength(Integer length) {
		this.passLength = length;
	}
	
	public String generate(CharsetGenerator charGen) {
		String charset = charGen.generate(this);
		String password = "";
		
		for (int i = 0; i < this.passLength; i++) {
			password += charset.charAt((int) Math.floor(Math.random() * charset.length()));
		}
		
		return password;
	}
	
}
