package main;


import javax.xml.bind.JAXBException;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.Iterator;

import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import jaxb.*;
import mappers.CarOwnerMapper;
import mappers.PersonMapper;
import models.Person;
import utils.Author;
import utils.BookModelForJsonParsing;
import utils.ConnectionPool;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

// in dao/jdbc only personsimpl and tiresimpl has fully defined methods, others are for visualization


//json reading is down in this main class
public class Main {

	public static void main(String[] args) throws JAXBException, IOException, ParseException  {

	    final Logger LOGGER = LogManager.getLogger(Main.class);
		

	    
	    
//	    
//	    PersonMapper personMyBatis = new PersonMapper();
//	    personMyBatis.getALLPersons();
	    
	    CarOwnerMapper carOwnerMyBatis = new CarOwnerMapper();
	    
	    carOwnerMyBatis.getALLCarOwners();

		
//		// --- JACKSON --- //
//	    		
//	    
//	    		Author author = new Author("j.k.","rowling");
//	    		String[] subtitles = {"water","earth","fire","air"};
//	    		BookModelForJsonParsing bookmodel = new BookModelForJsonParsing("samplebook",476,true,subtitles,author);
//	    		
//	    		
//	    		Person person = new Person(5, "murad","beridze",24);
//	    
//	    
//	    		File bookmodeldest = new File("src\\main\\resources\\bookmodel.son");
//				File personJson = new File("src\\main\\resources\\jsonPerson.son");
//				
//				
//				
//				
//				ObjectMapper objectmapper = new ObjectMapper();
//				
//				try {
//
//					objectmapper.writeValue(personJson, person);
//					Person person1 = objectmapper.readValue(personJson, Person.class);
//					LOGGER.info(person1.getFirstName());
//					
//					JsonNode persNode =objectmapper.readTree(personJson);
//					LOGGER.info(persNode.get("age"));
//
//					
//					
//					
//					
//					objectmapper.writeValue(bookmodeldest, bookmodel);
//					
//					BookModelForJsonParsing retrieved = objectmapper.readValue(bookmodeldest, BookModelForJsonParsing.class);
//					LOGGER.info(retrieved.getName());
//					LOGGER.info(retrieved.getSize());
//					LOGGER.info(retrieved.getSubtitles()[1]);
//					LOGGER.info(retrieved.getAuthors().getName());
//					LOGGER.info(retrieved.getAuthors().getSurname());
//				
//				} catch (StreamReadException e) {
//					LOGGER.error(e);
//				} catch (DatabindException e) {
//					LOGGER.error(e);
//				} catch (IOException e) {
//					LOGGER.error(e);
//				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//json reading
//		
//		JSONParser jsonparser = new JSONParser();
//		FileReader reader = new FileReader(".\\src\\main\\resources\\jsonTest.json");
//		
//		Object object =jsonparser.parse(reader); 
//		JSONObject bookObject=(JSONObject)object;
//		
//		String title =(String) bookObject.get("title");
//		Long relase_year = (Long) bookObject.get("relase year");
//		JSONArray authors = (JSONArray) bookObject.get("author");
//		JSONObject jsonObject =  (JSONObject) bookObject.get("subtitles");
//		
//		
//		LOGGER.info(jsonObject.get("subtitle_1"));
//		LOGGER.info(jsonObject.get("subtitle_2"));
//		LOGGER.info(jsonObject.get("subtitle_3"));
//		LOGGER.info(jsonObject.get("subtitle_4"));
//
//		
//		for (int i = 0; i < authors.size(); i++) {
//			System.out.println(authors.get(i));
//		}
//
//		LOGGER.info(title);
//		LOGGER.info(relase_year);
//		
		
		
		
		
//	//	jaxb example
//		
//		JaxbPerson jaxbpers = new JaxbPerson();
//		
//		
//		
//		jaxbpers.marshall();
//		
//		jaxbpers.unmarshall();
		
	
	

		
		
	// dom xml testing

//		File xmlFile = new File("C:\\Users\\irakl\\Desktop\\javaTest\\eclipse workspace\\cars\\src\\main\\resources\\CarsHierarchy.xml");
//		
//		DocumentBuilderFactory docBuildFactory =  DocumentBuilderFactory.newInstance();
//		
//		try {
//			DocumentBuilder docBuilder = docBuildFactory.newDocumentBuilder();
//			Document document = docBuilder.parse(xmlFile);
//			
//			LOGGER.info(document.getDocumentElement().getNodeName());
//			
//			NodeList nList=document.getElementsByTagName("engine_id");
//			NodeList nList2=document.getElementsByTagName("name");
//			NodeList nList3=document.getElementsByTagName("horsepower");
//			NodeList nList4=document.getElementsByTagName("consumption");
//
//
//
//			for (int i = 0; i < nList.getLength(); i++) {
//				
//				Node nNode =nList.item(i);
//				Node nNode2 =nList2.item(i);
//				Node nNode3 =nList3.item(i);
//				Node nNode4 =nList4.item(i);
//
//
//				if(nNode.getNodeType()==Node.ELEMENT_NODE) {
//					
//				//	LOGGER.info(nNode.getChildNodes());
//					LOGGER.info("engine_id:   "+ nNode.getTextContent());
//					LOGGER.info("name:   "+nNode2.getTextContent());
//					LOGGER.info("horsepower:   "+nNode3.getTextContent());
//					LOGGER.info("consumption:   "+nNode4.getTextContent());
//
//					
//				}
//			}
//
//		} catch (ParserConfigurationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SAXException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		

		
		
		
		
		
		// table manipulations
		
	//	Person personTest =new Person(35,"irakli","zandukeli",48);
//		PersonImpl pers = new PersonImpl();
		
		
	//	pers.updateEntityById(19, personTest);
	//	pers.deleteEntityById(33);
		//pers.insertEntity(personTest);
		
		
//		Person person = pers.readEntityById(4);
//		LOGGER.info(person.getFirstName());
		
//		
//	
//		Tires tires=new Tires(22,9,9,"bridgestone");
//		TiresImpl  tiretest=new TiresImpl();
//		tiretest.updateEntityById(22, tires);
	//	tiretest.insertEntity(tires);
//		tiretest.deleteEntityById(22);
//		Tires tire=tires.readEntityById(2);
//		
//		LOGGER.info(tire);
		
		
		
		
		
		
		// testing getProperty method
		
//		  Properties p = new Properties();
//		  
//	       String url ;
//	       String user ;
//	       String password ;
//		 try (FileInputStream file = new FileInputStream("C:\\Users\\irakl\\Desktop\\javaTest\\eclipse workspace\\cars\\src\\main\\resources\\propertyFile.properties")) {
//	            p.load(file);
//	        } catch (IOException e) {
//	          
//	        }
//		 
//		 
//	        url = p.getProperty("url");
//	        user = p.getProperty("user");
//	        password = p.getProperty("password");
//	LOGGER.info(user);	
//	LOGGER.info(password);
//	LOGGER.info(url);
//	

	
		
		
		
		
		
	}	


}
