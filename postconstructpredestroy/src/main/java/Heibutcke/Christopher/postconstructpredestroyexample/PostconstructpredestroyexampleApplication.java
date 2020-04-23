package Heibutcke.Christopher.postconstructpredestroyexample;

import Heibutcke.Christopher.postconstructpredestroyexample.dao.ClientDAO;
import Heibutcke.Christopher.postconstructpredestroyexample.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PostconstructpredestroyexampleApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(PostconstructpredestroyexampleApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Christopher adam"));

		System.out.println("Objeto ClientDAO: " + clientDAO);
		System.out.println("Objeto cliente: " + clientDAO.getClient());
	}
}
