package br.com.mandeira.shipping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.mandeira.shipping.model.ShippingStatus;
import br.com.mandeira.shipping.model.dto.ShippingInDTO;
import br.com.mandeira.shipping.service.ShippingService;

@RestController
@RequestMapping("api/shipping")
public class ShippingController {

	@Autowired
	private ShippingService shippingService;

	@PostMapping(value = "/calculate", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
	public ShippingStatus calculate(@RequestBody ShippingInDTO dto) {
		try {
			return this.shippingService.calculateShipping( dto.getCpf(), dto.getCodProd() );
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}
}
