package jaxb;

import java.io.File;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dao.jdbc.TiresImpl;
import models.Tires;

public class JaxbTires {
public String path ="C:\\Users\\irakl\\Desktop\\javaTest\\eclipse workspace\\cars\\src\\main\\resources\\JaxbTires.xml";
	
    private static final Logger LOGGER = LogManager.getLogger(JaxbTires.class);
	

	
	public void marshall()  {
			Scanner scanner = new Scanner(System.in);
			LOGGER.info("enter id of tires from databasse");
			int id =scanner.nextInt();
			
			
			TiresImpl tiresimpl = new TiresImpl();
			Tires tiresFromDatabase = tiresimpl.readEntityById(id);
		

			
			Tires tires = new Tires(tiresFromDatabase.getTireId(), tiresFromDatabase.getNumberOfTires(),tiresFromDatabase.getTireSize(),tiresFromDatabase.getTireBrand());
			JAXBContext jaxbcont;
			try {
				jaxbcont = JAXBContext.newInstance(Tires.class);
				Marshaller marshaller = jaxbcont.createMarshaller();
				marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
				marshaller.marshal(tires, System.out);
				marshaller.marshal(tires, new File(path));

			} catch (JAXBException e) {
				LOGGER.error(e);
				
			}	scanner.close();
	
		
	}
	
	
	
	
	
	public void unmarshall() {
		try {
			JAXBContext jaxbcont = JAXBContext.newInstance(Tires.class);
			Unmarshaller unmarshaller = jaxbcont.createUnmarshaller();
			Tires tir=(Tires)unmarshaller.unmarshal(new File(path));
			
			
				System.out.println("object information");
				System.out.println("tires id: "+tir.getTireId());
				System.out.println("number of tires : "+tir.getNumberOfTires());
				System.out.println("size of tires: "+tir.getTireSize());
				System.out.println("tires brand: "+tir.getTireBrand());

			
			
		} catch (JAXBException e) {
			LOGGER.error(e);
		}
		
	}
}
