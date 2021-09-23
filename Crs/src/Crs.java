import java.util.List;

import model.BankAccount;
import model.Product;
import model.Video;
import service.TheService;

public class Crs {

	public static void main(String[] args) {

		TheService service = new TheService();

		List<Product> productList = service.getAllProducts();
		
		List<BankAccount> bankAccounts = service.getAllBankAccounts();
		
		List<Video> videos = service.getAllVideos();
	}

}
