package com.fssa.sharpandclean.test;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

//import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.fssa.sharpandclean.model.Barber;
import com.fssa.sharpandclean.service.BarberService;
import com.fssa.sharpandclean.service.exception.ServiceException;
 
 class TestRegisterbarberFeature {
	@Test 
	 void testBarberRegisterSuccess() {
		BarberService barberService = new BarberService();
		Barber barber = new Barber("kavi", "kavi@gmail.com", "Kavi@123", "9887766576", "I have 10 years work experience in this barber career.", "https://losbarberosclassicbarbershop.com/wp-content/uploads/2019/06/Profile-_0000_Yamil.jpg", "3/25, East Street, velachery, Chennai - 08", "Everyday is great hair day with me around. I am a barber. I shape people's hair for a living. I spend time with my clients and I can make them laugh.","https://youprobablyneedahaircut.com/wp-content/uploads/2021/01/Mens-Haircut-1.jpg.webp","https://luxuo-com-production.s3.ap-southeast-1.amazonaws.com/2022/05/2-Quiff.jpg","https://eo54oy2xq6y.exactdn.com/wp-content/uploads/2023/04/Haircuts-For-Men-With-Thick-Hair-18.jpg?strip=all&lossy=1&resize=667%2C600&ssl=1");
		try {
			assertTrue(barberService.registerBarber(barber));
		}catch(ServiceException e) {
			System.out.println(e.getMessage()); 
		}
	} 
	
	
	 @Test
	     void testRegistrationEmailEmpty() {
		 BarberService barberService = new BarberService();
			Barber barber = new Barber("kavi", "", "Kavi@123", "9887766576", "I have 10 years work experience in this barber career.", "https://losbarberosclassicbarbershop.com/wp-content/uploads/2019/06/Profile-_0000_Yamil.jpg", "3/25, East Street, velachery, Chennai - 08", "Everyday is great hair day with me around. I am a barber. I shape people's hair for a living. I spend time with my clients and I can make them laugh.","https://youprobablyneedahaircut.com/wp-content/uploads/2021/01/Mens-Haircut-1.jpg.webp","https://luxuo-com-production.s3.ap-southeast-1.amazonaws.com/2022/05/2-Quiff.jpg","https://eo54oy2xq6y.exactdn.com/wp-content/uploads/2023/04/Haircuts-For-Men-With-Thick-Hair-18.jpg?strip=all&lossy=1&resize=667%2C600&ssl=1");
	        try {
	           barberService.registerBarber(barber);
	            fail();
	        } catch (ServiceException e) {
	        	System.out.println(e.getMessage()); 
	        }
	    }

	    @Test
	     void testRegistrationPhoneNumberInvalid() {
	    	BarberService barberService = new BarberService();
			Barber barber = new Barber("kavi", "kavi@gmail.com", "Kavi@123", "9887766Ajdg", "I have 10 years work experience in this barber career.", "https://losbarberosclassicbarbershop.com/wp-content/uploads/2019/06/Profile-_0000_Yamil.jpg", "3/25, East Street, velachery, Chennai - 08", "Everyday is great hair day with me around. I am a barber. I shape people's hair for a living. I spend time with my clients and I can make them laugh.","https://youprobablyneedahaircut.com/wp-content/uploads/2021/01/Mens-Haircut-1.jpg.webp","https://luxuo-com-production.s3.ap-southeast-1.amazonaws.com/2022/05/2-Quiff.jpg","https://eo54oy2xq6y.exactdn.com/wp-content/uploads/2023/04/Haircuts-For-Men-With-Thick-Hair-18.jpg?strip=all&lossy=1&resize=667%2C600&ssl=1");
	        try {
	           barberService.registerBarber(barber);
	            fail();
	        } catch (ServiceException e) {
	        	System.out.println( e.getMessage()); 
	        }
	    }

	    @Test
	     void testRegistrationEmptyPassword() {
	    	BarberService barberService = new BarberService();
			Barber barber = new Barber("kavi", "kavi@gmail.com", "", "9887766576", "I have 10 years work experience in this barber career.", "https://losbarberosclassicbarbershop.com/wp-content/uploads/2019/06/Profile-_0000_Yamil.jpg", "3/25, East Street, velachery, Chennai - 08", "Everyday is great hair day with me around. I am a barber. I shape people's hair for a living. I spend time with my clients and I can make them laugh.","https://youprobablyneedahaircut.com/wp-content/uploads/2021/01/Mens-Haircut-1.jpg.webp","https://luxuo-com-production.s3.ap-southeast-1.amazonaws.com/2022/05/2-Quiff.jpg","https://eo54oy2xq6y.exactdn.com/wp-content/uploads/2023/04/Haircuts-For-Men-With-Thick-Hair-18.jpg?strip=all&lossy=1&resize=667%2C600&ssl=1");
	        try {
	           barberService.registerBarber(barber);
	            fail();
	        } catch (ServiceException e) {
	        	System.out.println( e.getMessage()); 
	        }
	    }



	    @Test
	     void testRegistrationEmptyBarbername() {
	    	BarberService barberService = new BarberService();
			Barber barber = new Barber("", "kavi@gmail.com", "Kavi@123", "9887766Ajdg", "I have 10 years work experience in this barber career.", "https://losbarberosclassicbarbershop.com/wp-content/uploads/2019/06/Profile-_0000_Yamil.jpg", "3/25, East Street, velachery, Chennai - 08", "Everyday is great hair day with me around. I am a barber. I shape people's hair for a living. I spend time with my clients and I can make them laugh.","https://youprobablyneedahaircut.com/wp-content/uploads/2021/01/Mens-Haircut-1.jpg.webp","https://luxuo-com-production.s3.ap-southeast-1.amazonaws.com/2022/05/2-Quiff.jpg","https://eo54oy2xq6y.exactdn.com/wp-content/uploads/2023/04/Haircuts-For-Men-With-Thick-Hair-18.jpg?strip=all&lossy=1&resize=667%2C600&ssl=1");
	        try {
	           barberService.registerBarber(barber);
	            fail();
	        } catch (ServiceException e) {
	        	System.out.println( e.getMessage()); 
	        }
	    }

	    @Test
	     void testRegistrationNullBarber() {
	    	BarberService barberService = new BarberService();
	        try {
	        	barberService.registerBarber(null);
	            fail();
	        } catch (ServiceException e) {
	        	System.out.println(e.getMessage()); 
	        }
	    }
}
