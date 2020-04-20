package com.sample.prop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropReaderController {
	
	@Autowired
	ExtraProperties extraProps;
	
	@Value("${usa.national.bank}")
	private String usaNationalBank;
	
	@Value("${usa.big.banks}")
	private List<String> bigBanks;
	
	@RequestMapping("/natbank")
	public String getNatBank() {
		return usaNationalBank;
	}
	
	@RequestMapping("/bigbanks")
	public String getBanks() {
		return bigBanks.toString();
	}
	@RequestMapping("/natbanken")
	public String getNatBankEn() {
		return extraProps.getUkNationalBank();
	}
	
	@RequestMapping("/bigbanksen")
	public String getBanksEn() {
		return extraProps.getUkBigBanks().toString();
	}
	
	@RequestMapping("/natbankfr")
	public String getNatBankFr() {
		return extraProps.getFrNationalBank();
	}
	
	@RequestMapping("/bigbanksfr")
	public String getBanksFr() {
		return extraProps.getFrBigBanks().toString();
	}
	
	@RequestMapping("/numbers")
	public String getNumbers() {
		return bigBanks.toString();
	}
	
}
