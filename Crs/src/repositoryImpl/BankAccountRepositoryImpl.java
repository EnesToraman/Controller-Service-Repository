package repositoryImpl;

import java.util.ArrayList;
import java.util.List;

import model.BankAccount;
import repository.BankAccountRepository;

public class BankAccountRepositoryImpl implements BankAccountRepository{

	private BankAccount account1;
	
	private BankAccount account2;
	
	public BankAccountRepositoryImpl() {
		
	}
	
	public BankAccountRepositoryImpl(BankAccount account1, BankAccount account2) {
		
		this.account1 = account1;
		this.account2 = account2;
		
		account1.setId(1L);
		account1.setName("Enes");
		account1.setAmount(250.0);

		account2.setId(2L);
		account2.setName("Yahya");
		account2.setAmount(350.0);
	}

	@Override
	public List<BankAccount> getAllBankAccounts() {

		List<BankAccount> bankAccounts = new ArrayList<BankAccount>();
		
		bankAccounts.add(account1);
		bankAccounts.add(account2);
		
		return bankAccounts;
	}

}
