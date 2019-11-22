package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Message {

	@Value("Message") private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return " "+text+ " ";
	}
	
	
	
	
	
}
