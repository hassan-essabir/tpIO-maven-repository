package pres;

import metier.IMetier;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class PrestentationV2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "config.xml" });
		IMetier metier = (IMetier) context.getBean("metier");
		System.out.println(metier.calcul());
	}

}
