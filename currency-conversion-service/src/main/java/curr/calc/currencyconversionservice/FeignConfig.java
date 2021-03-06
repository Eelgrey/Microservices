package curr.calc.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="currency-conversion-service", url="localhost:8000")
@FeignClient(name="currency-exchange-service")
@RibbonClient(name="currency-exchange-service")
public interface FeignConfig {
	
	@GetMapping("exchangeCurrency/from/{from}/to/{to}")
	public ConversionComp getFeignConvertedVal(@PathVariable("from") String from,
			@PathVariable("to") String to);
		

}
