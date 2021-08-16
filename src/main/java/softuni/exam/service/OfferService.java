package softuni.exam.service;

import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import java.io.IOException;

//ToDo - Before start App implement this Service and set areImported to return false
@Service
public interface OfferService {

    boolean areImported();

    String readOffersFileContent() throws IOException;
	
	String importOffers() throws IOException, JAXBException;
}
