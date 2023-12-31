package com.fssa.sharpandclean.service;

import java.util.Base64;
import java.util.List;


import com.fssa.sharpandclean.dao.BarberDAO;
import com.fssa.sharpandclean.dao.SalonDAO;
import com.fssa.sharpandclean.dao.exception.BarberDAOException;
import com.fssa.sharpandclean.dao.exception.SalonDAOException;
import com.fssa.sharpandclean.model.Barber;
import com.fssa.sharpandclean.model.Salon;
import com.fssa.sharpandclean.service.exception.ServiceException;
import com.fssa.sharpandclean.utils.PasswordUtil;
import com.fssa.sharpandclean.validation.BarberValidator;
import com.fssa.sharpandclean.validation.exception.InvalidBarberException;
 
public class BarberService {

	// register barber method.
	public boolean registerBarber(Barber barber) throws  ServiceException {
		BarberDAO barberDAO = new BarberDAO();
		try { 
			if(barber == null) {
				throw  new InvalidBarberException("Barber is null");
			}
			
			if(barberDAO.isEmailExists(barber.getBarberEmail())) {
				throw new ServiceException("Barber with this email is aleady exists");
			}
			
			BarberValidator.validateBarber(barber);	
			 byte[] salt = PasswordUtil.generateSalt();
	          byte[] derivedKey = PasswordUtil.deriveKey(barber.getBarberPassword(), salt);
	          barber.setSalt(Base64.getEncoder().encodeToString(salt));
	          barber.setBarberPassword(Base64.getEncoder().encodeToString(derivedKey));
	            
			return barberDAO.createBarber(barber);
		}catch( Exception e) {
			
			throw new ServiceException("Register details is not valid so registration failed.");
		}
		
	}
	
	
	// method to get salon by barber email
	
			public Barber getBarberByEmail(String barberEmail ) throws ServiceException {
		     try {
				    BarberDAO barberDAO = new BarberDAO();
				 // Retrieve the salon by salonId from the SalonDAO
				    return barberDAO.getBarberByEmail(barberEmail);
				}catch(BarberDAOException e) {
					throw new ServiceException(e);
				}	
		    }
	
	// Method to Login a barber.
	public boolean loginBarber(Barber barber) throws ServiceException {
		try {
			BarberValidator.validateBarberEmail(barber.getBarberEmail());
			BarberValidator.validateBarberPassword(barber.getBarberPassword());

			BarberDAO barberDAO = new BarberDAO();

			if (barberDAO.isEmailExists(barber.getBarberEmail())) {
				
			if (barberDAO.login(barber)) {
				System.out.println(barber.getBarberEmail()+"Successfully logged in");
				return true; 
			} else {
				return false;
			}
			
			}
			else {
				throw new ServiceException("Before logging in, you have to register");
			}
		}
			
		catch (ServiceException | InvalidBarberException | BarberDAOException e) {
			throw new ServiceException(e.getLocalizedMessage());
		}
	}
	
//	get all barbers for user view.
	public List<Barber> getAllBarber() throws ServiceException{
		
		BarberDAO barberDAO = new BarberDAO();
		try {
			if(barberDAO.listAllBarber() != null) {
				return barberDAO.listAllBarber();
			}
		}catch(BarberDAOException e) {
			throw new ServiceException("Invalid query for get All Barbers.");
		}
		return null;
		
	}
	
	// method for update barber.
		public boolean updateBarber(Barber barber)throws ServiceException {
			
			BarberDAO barberDAO = new BarberDAO();
			
			try {
				if(barber == null) {
					throw new InvalidBarberException("Barber is null");
				}
				
				BarberValidator.validateBarber(barber);
				return barberDAO.updateBarber(barber);
			} catch(InvalidBarberException | BarberDAOException e) {
				throw new ServiceException ("Update Barber details is not valid, so update barber failed.");
			}
			
			
		}
		
		
		// method to delete a barber.
		
		public boolean deleteBarber(String barberEmail) throws ServiceException {
			BarberDAO  barberDAO = new BarberDAO();
			try {
				if(barberEmail == null) {
					throw new InvalidBarberException("Barber email is null.");
				}
				if(barberDAO.isEmailExists(barberEmail)) {
					BarberValidator.validateBarberEmail(barberEmail);
					return barberDAO.deleteBarber(barberEmail);
				}
			}catch(InvalidBarberException | BarberDAOException e) {
				throw new ServiceException(e);
			}
			return false;
			
		}
	
	
	
	
}
