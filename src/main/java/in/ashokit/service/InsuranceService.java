package in.ashokit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.InsurancePlans;
import in.ashokit.repository.InsuranceRepository;

@Service
public class InsuranceService 
{
	
	@Autowired
	private InsuranceRepository repo;
	
	public void savePlans()
	{
		InsurancePlans p1 = new InsurancePlans();
		p1.setPlanName("Jeevan Bheem");
		p1.setPlanStatus("CREATED");
		repo.save(p1);
		System.out.println("RECORD INSERTED");
		
	}

}
