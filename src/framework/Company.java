package framework;

public class Company extends Customer implements IPerson {

	@Override
	public void getBirthDate() {
		System.out.println("getting birth from Company!!");

	}

	@Override
	public void setBirthDate() {
		System.out.println("setting birth from Company!!");

	}

}