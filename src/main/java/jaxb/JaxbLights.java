package jaxb;

import java.io.File;
import java.sql.SQLException;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dao.jdbc.LightsImpl;
import models.Lights;
import models.Tires;

public class JaxbLights {

	public static final Logger LOGGER = LogManager.getLogger();

	public String path = "C:\\Users\\irakl\\Desktop\\javaTest\\eclipse workspace\\cars\\src\\main\\resources\\JaxbLights.xml";

	public void marshall() {
		Scanner scanner = new Scanner(System.in);
		LOGGER.info("enter id of lights from database");
		int id = scanner.nextInt();

		LightsImpl lightsimpl = new LightsImpl();
		Lights ligdat = lightsimpl.readEntityById(id);

		Lights lights = new Lights(ligdat.getLightsId(), ligdat.getFrontLights(), ligdat.getBackLights(),
				ligdat.getTurnLights(), ligdat.getStopLights(), ligdat.getFogLights());

		JAXBContext jaxbcontext;
		try {
			jaxbcontext = JAXBContext.newInstance(Lights.class);
			Marshaller marshaller = jaxbcontext.createMarshaller();
			marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(lights, System.out);
			marshaller.marshal(lights, new File(path));
		} catch (JAXBException e) {
			LOGGER.error(e);
		} finally {
			scanner.close();
		}

	}

	public void unmarshall() {
		try {
			JAXBContext jaxbcont = JAXBContext.newInstance(Tires.class);
			Unmarshaller unmarshaller = jaxbcont.createUnmarshaller();
			Lights lig=(Lights)unmarshaller.unmarshal(new File(path));
			
			
				System.out.println("object information.  1 meats it has and 0 means it doesn't have");
				System.out.println("lights id: "+lig.getLightsId());
				System.out.println("front lights : "+lig.getFrontLights());
				System.out.println("back lights: "+lig.getBackLights());
				System.out.println("turn lights: "+lig.getTurnLights());
				System.out.println("stop lights: "+lig.getStopLights());
				System.out.println("fog lights: "+lig.getFogLights());

			
			
		} catch (JAXBException e) {
			LOGGER.error(e);
		}
	}
}
