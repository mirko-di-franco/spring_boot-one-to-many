package com.generation.relazionionetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.relazionionetomany.entity.Photo;
import com.generation.relazionionetomany.repository.PhotoRepo;

@Service
public class PhotoServ {

	@Autowired
	PhotoRepo photoRepo;
	
	
	public Photo addOrModify(Photo photo) {
		Photo newPhoto = photoRepo.save(photo);
		return null;
	}
}
