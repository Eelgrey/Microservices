package curr.calc.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class ConversionController {
	
	@Autowired
	FeignConfig feign;
	
	@GetMapping("exchangeCurrency/from/{from}/to/{to}/quantity/{quant}")
	public ConversionComp getConvertedValue(@PathVariable String from,@PathVariable String to, @PathVariable Long quant){
		
		//return new ConversionComp(10001L, from, to,BigDecimal.valueOf(65), BigDecimal.valueOf(quant), BigDecimal.valueOf(quant*65),8100L);
	
		//extra code
		Map<String, String> val =new HashMap<String, String>();
	
	val.put("from", from);
	val.put("to", to);
	
	ResponseEntity<ConversionComp> resEn=new RestTemplate().getForEntity("http://localhost:8000/exchangeCurrency/from/{from}/to/{to}",ConversionComp.class,val);
	
	//extra code
	// to remove this we use feign
	ConversionComp conversion=resEn.getBody();
	conversion.setQuantity(BigDecimal.valueOf(quant));
	conversion.setTotalAmt(BigDecimal.valueOf(quant).multiply(conversion.getExchangeMultiple()));
	return conversion;

	}
	
	
	@GetMapping("exchangeCurrencyFeign/from/{from}/to/{to}/quantity/{quant}")
	public ConversionComp getConvertedValueByFeign(@PathVariable String from,@PathVariable String to, @PathVariable Long quant){
		
		
	ConversionComp conversion=feign.getFeignConvertedVal(from, to);
	conversion.setQuantity(BigDecimal.valueOf(quant));
	conversion.setTotalAmt(BigDecimal.valueOf(quant).multiply(conversion.getExchangeMultiple()));
	return conversion;
	}
}
