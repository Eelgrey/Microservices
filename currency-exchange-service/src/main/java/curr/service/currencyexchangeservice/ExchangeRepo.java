package curr.service.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRepo extends JpaRepository<ExchangeComp,Long>{
	
	ExchangeComp findByFromAndTo(String from, String to);

}
