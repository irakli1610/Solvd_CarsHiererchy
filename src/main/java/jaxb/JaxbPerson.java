package jaxb;

import models.Person;
import utils.ConnectionPool;

import javax.xml.bind.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dao.jdbc.PersonImpl;

import java.io.*;
import java.util.Scanner;

public class JaxbPerson {
	public String path = "C:\\Users\\irakl\\Desktop\\javaTest\\eclipse workspace\\cars\\src\\main\\resources\\JaxbPerson.xml";

	private static final Logger LOGGER = LogManager.getLogger(JaxbPerson.class);

	public void marshall() {
		Scanner scanner = new Scanner(System.in);
		LOGGER.info("enter id of person from databasse");
		int id = scanner.nextInt();

		PersonImpl personimpl = new PersonImpl();
		Person personFromDatabase = personimpl.readEntityById(id);

		Person person = new Person(personFromDatabase.getPersonId(), personFromDatabase.getFirstName(),
				personFromDatabase.getLastName(), personFromDatabase.getAge());
		JAXBContext jaxbcont;
		try {
			jaxbcont = JAXBContext.newInstance(Person.class);
			Marshaller marshaller = jaxbcont.createMarshaller();
			marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(person, System.out);
			marshaller.marshal(person, new File(path));

		} catch (JAXBException e) {
			LOGGER.error(e);

		} finally {
			scanner.close();
		}

	}

	public void unmarshall() {
		try {
			JAXBContext jaxbcont = JAXBContext.newInstance(Person.class);
			Unmarshaller unmarshaller = jaxbcont.createUnmarshaller();
			Person pers = (Person) unmarshaller.unmarshal(new File(path));

			LOGGER.info("object information");
			LOGGER.info("person id: " + pers.getPersonId());
			LOGGER.info("first name : " + pers.getFirstName());
			LOGGER.info("last name: " + pers.getLastName());
			LOGGER.info("age: " + pers.getAge());

		} catch (JAXBException e) {
			LOGGER.error(e);
		}

	}

}
