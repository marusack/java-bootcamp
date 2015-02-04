package topic4.UserService;

public class UserFactory {

	private UserFactory() {
	}

	public static UserService getLocalService() {
		return new UserImp();
	}

	public static UserService getRemoteServiceUsingWebService() {
		return new UserProxy(new UserWebServiceClient());
	}
}
