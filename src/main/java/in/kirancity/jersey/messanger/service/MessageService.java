package in.kirancity.jersey.messanger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import in.kirancity.jersey.messanger.database.DatabaseClass;
import in.kirancity.jersey.messanger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService(){
		Message m1 = new Message(1L, "Hello world", "Kaushik");
		Message m2 = new Message(2L, "Hello Jersey", "Kaushik");
		messages.put(m1.getId(), m1);
		messages.put(m2.getId(), m2);
	}
	
	public List<Message> getAllMessages(){
		return new ArrayList<>(messages.values());
	}
	
	public Message getMessage(Long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if(message.getId()<=0)
			return null;
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
}
