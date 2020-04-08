package in.co.goldsgymindia.purchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"in.co.goldsgymindia.purchase.controller", "in.co.goldsgymindia.purchase.filters", "in.co.goldsgymindia.purchase.model", "in.co.goldsgymindia.purchase.repos", "in.co.goldsgymindia.purchase.service", "in.co.goldsgymindia.purchase.util"})
public class PurchaseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseApiApplication.class, args);
	}

}

