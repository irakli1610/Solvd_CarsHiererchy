package jaxb;

import java.io.File;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dao.jdbc.EngineImpl;
import models.Engine;
import models.Tires;



// this implementation wont work becouse i haven't defined readEntityById() in EngineImpl. so this is just sample class
public class JaxbEngine {
	
public String path ="C:\\Users\\irakl\\Desktop\\javaTest\\eclipse workspace\\cars\\src\\main\\resources\\JaxbEngine.xml";
	
    private static final Logger LOGGER = LogManager.getLogger(JaxbEngine.class);
	

	
	public void marshall()  {
			Scanner scanner = new Scanner(System.in);
			LOGGER.info("enter id of engine from databasse");
			int id =scanner.nextInt();
			
			
			EngineImpl engineimpl = new EngineImpl();
			Engine enginefromdatabase = engineimpl.readEntityById(id);
		

			
			Engine engine = new Engine(enginefromdatabase.getEngineId(), enginefromdatabase.getName(),enginefromdatabase.getHorsepower(),enginefromdatabase.getConsumption());
			JAXBContext jaxbcont;
			try {
				jaxbcont = JAXBContext.newInstance(Engine.class);
				Marshaller marshaller = jaxbcont.createMarshaller();
				marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
				marshaller.marshal(engine, System.out);
				marshaller.marshal(engine, new File(path));

			} catch (JAXBException e) {
				LOGGER.error(e);
				
			}	scanner.close();
	
		
	}
	
	
	
	
	
	public void unmarshall() {
		try {
			JAXBContext jaxbcont = JAXBContext.newInstance(Tires.class);
			Unmarshaller unmarshaller = jaxbcont.createUnmarshaller();
			Engine eng=(Engine)unmarshaller.unmarshal(new File(path));
			
			
				System.out.println("object information");
				System.out.println("engine id: "+eng.getEngineId());
				System.out.println("engine name : "+eng.getName());
				System.out.println("engine horsepower: "+eng.getHorsepower());
				System.out.println("engine consumption: "+eng.getConsumption());

			
			
		} catch (JAXBException e) {
			LOGGER.error(e);
		}
		
	}
}
