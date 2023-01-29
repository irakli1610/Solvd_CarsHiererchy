package main;


import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.parser.ParseException;

import models.CarOwner;
import models.CarParts;
import models.CarServices;
import models.CarShops;
import models.CarSystems;
import models.Cars;
import models.Engine;
import models.Person;
import service.ServiceCarOwnerMapper;
import service.ServiceCarPartsMapper;
import service.ServiceCarServiceMapper;
import service.ServiceCarShopsMapper;
import service.ServiceCarSystemsMapper;
import service.ServiceCarsMapper;
import service.ServiceEngineMapper;
import service.ServiceGearBoxMapper;
import service.ServiceHeatingCoolingMapper;
import service.ServiceLightsMapper;
import service.ServicePersonMapper;
import service.ServiceServiceEmployeeMapper;
import service.ServiceServicedCarsMapper;
import service.ServiceShopEmployeeMapper;
import service.ServiceTiresMapper;

// in dao/jdbc only personsimpl and tiresimpl has fully defined methods, others are for visualization


//json reading is down in this main class
public class Main {

	public static void main(String[] args) throws JAXBException, IOException, ParseException  {

	    final Logger LOGGER = LogManager.getLogger(Main.class);
		
	    // all 4 methods are described in every service class. iნ main method there is a few examples about them.
	    
	    // running insertEntity method multiple times will cause SQLException, becouse
	    // primary key is not autogenerated and on the second try it will give duplicate
	    // primary key error.
	    
	    
	    
	    
//	    Person personTest=new Person(55,"shio","nachkebia", 27);
//	    ServicePersonMapper personMyBatis = new ServicePersonMapper();
//	    personMyBatis.insertEntity(personTest);
//	    personMyBatis.updateEntity( personTest);
	    
	    

//	    List<Person> personsdat =personMyBatis.getALLEntities();
//	    personMyBatis.deleteEntity(55);
//	    for (Person person : personsdat) {
//			LOGGER.info(person);
//		}
//	
	
	    
	    
//--------------------	    
	    
    
//	    ServiceCarOwnerMapper carOwnerMyBatis = new ServiceCarOwnerMapper();
//	    CarOwner carownerTest = new CarOwner(96,"maaany",3);
//	    carOwnerMyBatis.insertEntity(carownerTest);
//	    carOwnerMyBatis.getALLEntities();
//	  
	    
	    
//--------------------	    
	    
	    
//	    CarParts cparts = new CarParts(22,4,3,2);
//	    ServiceCarPartsMapper carpartsmapper = new ServiceCarPartsMapper();
//	    carpartsmapper.insertEntity(cparts);
//	    carpartsmapper.getALLEntities();
	   	    
	    
//-----------------------	    
	    
	    
//	-----------------------------------   
//	    Engine engine = new Engine(445,"nanospeed",759,19);
//	    ServiceEngineMapper engMapper = new ServiceEngineMapper();
//	    engMapper.insertEntity(engine);
//	    engMapper.getALLEntities();
//	    
//----------------------------
//	    
	    
	    
	    
//	    ServiceGearBoxMapper gearboxmapper = new ServiceGearBoxMapper();
//	    gearboxmapper.getALLEntities();
//	    
//	    
//	    ServiceTiresMapper tiresMapper = new ServiceTiresMapper();
//	    tiresMapper.getALLEntities();
//	    
 
	    
	    
	    
	    
	    
	    
//-------------------------------------	  
//	    CarServices carserv = new CarServices(57,"alphaservice");
//	    ServiceCarServiceMapper carservicemapper = new ServiceCarServiceMapper();
//	    carservicemapper.insertEntity(carserv);
//	    carservicemapper.getALLEntities();
//
//
//-----------------------------------------	    
	    
	    
	    
	    
	    
	    
//	    CarShops carshop = new CarShops(67,"shopper", 349);
//	    ServiceCarShopsMapper carshopmapper = new ServiceCarShopsMapper();
//	    carshopmapper.insertEntity(carshop);
//	    carshopmapper.getALLEntities();
//	 
	    
	    
	    
	    
	    
//-----------------------	    
	    
//	    Cars car = new Cars(57,"macken",2014,2,5,4,1);
//	    ServiceCarsMapper carsmapper = new ServiceCarsMapper();
//	    carsmapper.insertEntity(car);
//	    carsmapper.getALLEntities();
//	    
//
//----------------------	    
	    
	    
//---------------------------	    
//	    CarSystems carst = new CarSystems(45,4,2);
//	    ServiceCarSystemsMapper carsystemsmapper = new ServiceCarSystemsMapper();
//	    carsystemsmapper.insertEntity(carst);
//	    carsystemsmapper.getALLEntities();
//
//----------------------	   
	    
	    
	    
	    
	    
	    
//	    ServiceHeatingCoolingMapper heatcool = new ServiceHeatingCoolingMapper();
//	    
//	    heatcool.getALLEntities();
//	    
//	    ServiceLightsMapper lights = new ServiceLightsMapper();
//	    lights.getALLEntities();
//	    
//	    
//	    ServiceServicedCarsMapper servedcars = new ServiceServicedCarsMapper();
//	    servedcars.getALLEntities();
//	    
//	    ServiceServiceEmployeeMapper servemp = new ServiceServiceEmployeeMapper();
//	    servemp.getALLEntities();
//	    
//	    
//	    ServiceShopEmployeeMapper shopemp = new ServiceShopEmployeeMapper();
//	    shopemp.getALLEntities();
//	    
	    
	    
	    
	    
	    
	    
//------------------------------------------------------------------------------------------------------		
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
