package day5_homework_01.core;

public class JGoogleManagerAdapter implements GoogleService{

	@Override
	public void googleService(String message) {
		JGoogleManagerAdapter manager = new JGoogleManagerAdapter();
		manager.googleService(message);
	}
}