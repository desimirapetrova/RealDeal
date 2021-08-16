package softuni.exam.service;


import org.springframework.stereotype.Service;

import java.io.IOException;

//ToDo - Before start App implement this Service and set areImported to return false
@Service
public interface PictureService {

    boolean areImported();

    String readPicturesFromFile() throws IOException;
	
	String importPictures() throws IOException;

}
