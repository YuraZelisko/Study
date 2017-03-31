package except;

import java.util.logging.Logger;

public class UserValidator implements Validator {

	@Override
	public void validate(Object object) throws Exception {
		User user = (User) object;
		String loginFromDB = "mamba";

		try {
			if (user.getLogin().equalsIgnoreCase(loginFromDB)) {
				throw new UserException(ValidatorMeseges.LOGIN_ALREADY_EXIST);
			}
			else if(user.getEmail().contains("@")){
				throw new UserException(ValidatorMeseges.EMAIL_VALIDATION_EXEPTION);
				
			}
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
