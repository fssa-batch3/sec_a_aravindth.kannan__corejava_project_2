package SharpAndClean.TestUser;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import SharpAndClean.module.User;
import SharpAndClean.service.UserService;
import SharpAndClean.service.exception.ServiceException;

public class TestUpdateFeature {

	@Test
	public void testUpdateSuccess() {
		UserService userService = new UserService();
		User user1 = new User(3, "aravindth122@gmail.com", "AravindthKannan", "Aravindth@123", "9888844056", "user");
		try {
			assertTrue(userService.updateUser(user1, "aravindth12@gmail.com"));
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdateEmailNotFound() {
		UserService userService = new UserService();
		User user1 = new User(1, "aravindth12@gmail.com", "AravindthKavi", "Aravindth@123", "8072444056", "user");
		try {
			// Assuming the user with email "aravindth12@gmail.com" does not exist in the system
			userService.updateUser(user1, "noemail@gmail.com");
			fail("Expected ServiceException for email not found, but none was thrown.");
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdateInvalidEmailFormat() {
		UserService userService = new UserService();
		User user1 = new User(1, "aravindth12@gmail.com", "AravindthKavi", "Aravindth@123", "8072444056", "user");
		try {
			// Assuming "invalid_email_format" is not a valid email format
			userService.updateUser(user1, "invalidemailformat");
			fail("Expected ServiceException for invalid email format, but none was thrown.");
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdateMissingRequiredField() {
		UserService userService = new UserService();
		// Leaving the name field empty
		User user1 = new User(1, "maha12@gmail.com", "", "Navee@123", "8072444056", "user");
		try {
			userService.updateUser(user1, "maha12@gmail.com");
			fail("Expected ServiceException for missing required field, but none was thrown.");
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
}