package curr.calc.currencyconversionservice;

import java.math.BigDecimal;


public class ConversionComp {
	
	private Long id;
	private String from;
	private String to ;
	private BigDecimal exchangeMultiple;
	private BigDecimal quantity;
	private BigDecimal totalAmt;
	private Long port;
	
	public ConversionComp(){
		
	}
	public ConversionComp(Long id, String from, String to, BigDecimal exchangeMultiple, BigDecimal quantity,
			BigDecimal totalAmt, Long port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeMultiple = exchangeMultiple;
		this.quantity = quantity;
		this.totalAmt = totalAmt;
		this.port = port;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getExchangeMultiple() {
		return exchangeMultiple;
	}
	public void setExchangeMultiple(BigDecimal exchangeMultiple) {
		this.exchangeMultiple = exchangeMultiple;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}
	public Long getPort() {
		return port;
	}
	public void setPort(Long port) {
		this.port = port;
	}
	@Override
	public String toString() {
		return "ConversionComp [id=" + id + ", from=" + from + ", to=" + to + ", exchangeMultiple=" + exchangeMultiple
				+ ", quantity=" + quantity + ", totalAmt=" + totalAmt + ", port=" + port + "]";
	}
	
	
}
