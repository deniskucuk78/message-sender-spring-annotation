package demo;

import org.springframework.stereotype.Component;

@Component
public class EmailSender implements MessageSender {


	public void send(Message msg) {
	
		System.out.println("Votre email est :" + msg);
	}

}
