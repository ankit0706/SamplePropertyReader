package com.sample.prop;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"classpath:application-uk.properties", "classpath:application-fr.properties"})
public class ExtraProperties {
	
	@Value("${uk.national.bank}")
	private String ukNationalBank;
	
	@Value("${uk.big.banks}")
	private List<String> ukBigBanks;
	
	@Value("${fr.national.bank}")
	private String frNationalBank;
	
	@Value("${fr.big.banks}")
	private List<String> frBigBanks;
	
	public String getUkNationalBank() {
		return ukNationalBank;
	}
	
	public List<String> getUkBigBanks(){
		return ukBigBanks;
	}
	
	public String getFrNationalBank() {
		return frNationalBank;
	}
	
	public List<String> getFrBigBanks(){
		return frBigBanks;
	}
}
