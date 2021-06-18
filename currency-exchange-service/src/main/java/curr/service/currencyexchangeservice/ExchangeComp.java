package curr.service.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeComp {
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="curr_From")
	private String from;
	
	@Column(name="curr_To")
	private String to ;
	
	@Column(name="Ex_Multiple")
	private BigDecimal exchangeMultiple;
	
	@Column(name="port")
	private Long port;
	
	public ExchangeComp() {
		super();
	}

	public ExchangeComp(Long id, String from, String to, BigDecimal exchangeMultiple, Long port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchangeMultiple = exchangeMultiple;
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

	public Long getPort() {
		return port;
	}

	public void setPort(Long port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "ExchangeComp [id=" + id + ", from=" + from + ", to=" + to + ", exchangeMultiple=" + exchangeMultiple
				+ ", port=" + port + "]";
	}


}
