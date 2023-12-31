package com.example.be.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.be.dto.PriceRequest;
import com.example.be.payload.DataResponse;
import com.example.be.services.PriceService;

@RestController
@RequestMapping("api/price")
public class PriceController {
	
	@Autowired
	PriceService priceService;
	
	@RequestMapping(value= "{id_clinic}",method = RequestMethod.POST, produces = "application/json")
	public DataResponse createToken (@PathVariable("id_clinic") String id_clinic, @RequestBody List<PriceRequest> priceRequests ){
		return priceService.addPricesClinic(id_clinic, priceRequests);
	}

	@RequestMapping(value= "edit",method = RequestMethod.POST, produces = "application/json")
	public DataResponse editPrice (@RequestBody PriceRequest priceRequests ){
		return priceService.editPrice(priceRequests);
	}

	@RequestMapping(value= "delete/{id}",method = RequestMethod.GET, produces = "application/json")
	public DataResponse deletePrice (@PathVariable String id){
		return priceService.deletePrice(id);
	}
	
}
