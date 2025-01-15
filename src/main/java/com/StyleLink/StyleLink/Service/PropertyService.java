package com.StyleLink.StyleLink.Service;

import com.StyleLink.StyleLink.Entity.Property;
import com.StyleLink.StyleLink.Entity.User;
import com.StyleLink.StyleLink.Repository.PropertyRepository;
import com.StyleLink.StyleLink.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service	
public class PropertyService {
	@Autowired
	private com.StyleLink.StyleLink.Respository.PropertyRepository propertyRepository;
	
	@Autowired
	private UserRepository userRepository;

	public Property createProperty(Property property, Long UserId) {
		User Owner = userRepository.findById(userId);
				.orElseThrow(() -> new RuntimeException("User not found"));
		property.setOwner(owner);
		return propertyRepository.save(property);
	}
	
	//get property by user Id
	public Property getPropertybyId(Long Id) {
		return propertyRepository.findById(Id);
	}
	
	public List<Property> getAllProperties() {
		return propertyRepository.findAll();
	}
	
}
