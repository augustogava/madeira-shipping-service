package br.com.mandeira.shipping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mandeira.shipping.model.ShippingStatus;
import br.com.mandeira.shipping.repository.ShippingRepository;

@Service
public class ShippingService {

	@Autowired
	private ShippingRepository shippingRepository;
	
    public ShippingStatus calculateShipping(String cpf, Integer codProd ){
    	Double v = this.shippingRepository.getValue(codProd);
    	
    	return new ShippingStatus(v, 10, true);
    }

}
