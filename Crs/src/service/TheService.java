package service;

import java.util.List;

import model.BankAccount;
import model.Product;
import model.Video;
import repository.BankAccountRepository;
import repository.ProductRepository;
import repository.VideoRepository;

public class TheService {
	
	private final ProductRepository productRepository;
	
	private final BankAccountRepository bankAccountRepository;

	private final VideoRepository videoRepository;

	public TheService(ProductRepository productRepository, BankAccountRepository bankAccountRepository, VideoRepository videoRepository) {
		this.productRepository = productRepository;
		this.bankAccountRepository = bankAccountRepository;
		this.videoRepository = videoRepository; 
	}

	public List<Product> getAllProducts() {
		return this.productRepository.getAllProducts();
	}
	
	public List<BankAccount> getAllBankAccounts() {
		return this.bankAccountRepository.getAllBankAccounts();
	}
	
	public List<Video> getAllVideos() {
		return this.videoRepository.getAllVideos();
	}
}
