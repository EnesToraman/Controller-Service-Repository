
import repository.BankAccountRepository;
import repository.ProductRepository;
import repository.VideoRepository;
import repositoryImpl.BankAccountRepositoryImpl;
import repositoryImpl.ProductRepositoryImpl;
import repositoryImpl.VideoRepositoryImpl;
import service.TheService;

public class Crs {

	public static void main(String[] args) {

		ProductRepository productRepository = new ProductRepositoryImpl();
		
		BankAccountRepository bankAccountRepository = new BankAccountRepositoryImpl();

		VideoRepository videoRepository = new VideoRepositoryImpl();
		
		TheService service = new TheService(productRepository, bankAccountRepository, videoRepository);

	}

}
