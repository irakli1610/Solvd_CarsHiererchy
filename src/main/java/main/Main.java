package main;


import javax.xml.bind.JAXBException;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import jaxb.*;



// in dao/jdbc only personsimpl and tiresimpl has fully defined methods, others are for visualization
public class Main {

	public static void main(String[] args) throws JAXBException  {

		JaxbPerson jaxbpers = new JaxbPerson();
		
		
		
		jaxbengine.marshall();
		
		jaxbengine.unmarshall();
		
	
	

		
		
	// dom xml testing

//		File xmlFile = new File("C:\\Users\\irakl\\Desktop\\javaTest\\eclipse workspace\\cars\\src\\main\\resources\\CarsHierarchy.xml");
//		
//		DocumentBuilderFactory docBuildFactory =  DocumentBuilderFactory.newInstance();
//		
//		try {
//			DocumentBuilder docBuilder = docBuildFactory.newDocumentBuilder();
//			Document document = docBuilder.parse(xmlFile);
//			
//			System.out.println(document.getDocumentElement().getNodeName());
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
//				//	System.out.println(nNode.getChildNodes());
//					System.out.println("engine_id:   "+ nNode.getTextContent());
//					System.out.println("name:   "+nNode2.getTextContent());
//					System.out.println("horsepower:   "+nNode3.getTextContent());
//					System.out.println("consumption:   "+nNode4.getTextContent());
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
//		System.out.println(person.getFirstName());
		
//		
//	
//		Tires tires=new Tires(22,9,9,"bridgestone");
//		TiresImpl  tiretest=new TiresImpl();
//		tiretest.updateEntityById(22, tires);
	//	tiretest.insertEntity(tires);
//		tiretest.deleteEntityById(22);
//		Tires tire=tires.readEntityById(2);
//		
//		System.out.println(tire);
		
		
		
		
		
		
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
//	System.out.println(user);	
//	System.out.println(password);
//	System.out.println(url);
//	

	
		
		
		
		
		
	}	


}
