package in.kirancity.jersey.messanger.service;

import java.util.ArrayList;
import java.util.List;

import in.kirancity.jersey.messanger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		Message m1 = new Message(1L, "Hello world", "Kaushik");
		Message m2 = new Message(2L, "Hello Jersey", "Kaushik");
		List<Message> result = new ArrayList<>();
		result.add(m1);
		result.add(m2);
		return result;
	}

}
