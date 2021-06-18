package curr.service.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {
	
	@Autowired
	private Environment envi;


	@Autowired
	ExchangeRepo ex;
	
	@GetMapping("exchangeCurrency/from/{from}/to/{to}")
	public ExchangeComp getExchangeValue(@PathVariable String from, @PathVariable String to){
		
		ExchangeComp ExComp=ex.findByFromAndTo(from, to);
		ExComp.setPort(Long.valueOf(envi.getProperty("local.server.port")));
		return ExComp;
		//return new ExchangeComp(1000L,from,to,BigDecimal.valueOf(65), Long.valueOf(envi.getProperty("local.server.port")));
	}
}
