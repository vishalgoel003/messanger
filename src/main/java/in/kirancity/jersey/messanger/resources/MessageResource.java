package in.kirancity.jersey.messanger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.kirancity.jersey.messanger.model.Message;
import in.kirancity.jersey.messanger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(){
		return messageService.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_XML)
	public Message getMessage(@PathParam("messageId") Long id){
		return messageService.getMessage(id);
	}
	
}
