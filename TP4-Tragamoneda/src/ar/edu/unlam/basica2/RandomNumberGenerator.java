package ar.edu.unlam.basica2;

public class RandomNumberGenerator implements NumberGenerator {

	private Integer number;

	@Override
	public Integer generate() {

		return this.number = (int) Math.random() * 10 + 1;
	}

}
