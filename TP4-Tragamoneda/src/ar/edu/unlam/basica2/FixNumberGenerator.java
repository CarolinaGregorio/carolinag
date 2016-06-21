package ar.edu.unlam.basica2;

public class FixNumberGenerator implements NumberGenerator {

	private Integer number;

	public FixNumberGenerator(Integer number) {
		if(number >0 && number<=10){
			this.number = number;
		}
	}

	@Override
	public Integer generate() {
		return number;
	}

}
