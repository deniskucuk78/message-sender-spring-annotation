package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

@ComponentScan
public class MainMessageSenderAnnotation {

	public static void main(String[] args) {
		try(AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(MainMessageSenderAnnotation.class)){
		
		MessageSender eS = ctx.getBean("smsSender",MessageSender.class); // L'argument String est le nom de la classe qui implémente l'interface (avec la premiere lettre en minuscule)
		
		Message msg = ctx.getBean(Message.class);
		
		
		eS.send(msg);

	}
	
		
	}

}
