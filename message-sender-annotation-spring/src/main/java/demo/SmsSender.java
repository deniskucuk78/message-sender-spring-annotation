package demo;

import org.springframework.stereotype.Component;

@Component
public class SmsSender implements MessageSender {


	
	
	
	public void send(Message msg) {
		

		System.out.println("Votre sms :"+ msg);
	}

}
