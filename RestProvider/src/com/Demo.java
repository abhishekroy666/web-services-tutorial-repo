package com;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hi")
public class Demo {

	@GET
	public String sayHi(){
		return "Welcome to REST Web Service";
	}
	
	@GET
	@Path("/html")
	@Produces(value=MediaType.TEXT_HTML)
	public String sayHTML(){
		return "<h1>Welcome to REST Web Service HTML Msg</h1>";
	}
	
	@GET
	@Path("/xml")
	@Produces(value=MediaType.TEXT_XML)
	public String sayXML(){
		return "<Msg>Welcome to REST Web Service XML Msg</Msg>";
	}
	
	@GET
	@Path("/text")
	@Produces(value=MediaType.TEXT_PLAIN)
	public String sayText(){
		return "Welcome to REST Web Service Text Msg";
	}
}
