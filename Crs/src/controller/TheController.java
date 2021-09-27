package controller;

import repository.BankAccountRepository;
import repository.ProductRepository;
import repository.VideoRepository;
import repositoryImpl.BankAccountRepositoryImpl;
import repositoryImpl.ProductRepositoryImpl;
import repositoryImpl.VideoRepositoryImpl;
import service.TheService;

public class TheController {
	
	ProductRepository productRepository = new ProductRepositoryImpl();
	
	BankAccountRepository bankAccountRepository = new BankAccountRepositoryImpl();

	VideoRepository videoRepository = new VideoRepositoryImpl();
	
	TheService theService = new TheService(productRepository, bankAccountRepository, videoRepository);
	
	public TheController(TheService theService) {
		this.theService = theService;
	}

}
