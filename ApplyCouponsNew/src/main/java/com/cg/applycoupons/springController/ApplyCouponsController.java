package com.cg.applycoupons.springController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.applycoupons.DAO.ICapstoreRepo;
import com.cg.applycoupons.ServiceLayer.ICapstoreService;

@Controller
public class ApplyCouponsController {

	@Autowired
	ICapstoreService service;

	
	 


	@RequestMapping(value = "/applycoupons", method = RequestMethod.POST)
	public Double applyCoupon(String couponCode, Double price)  {

		return service.applyCoupons(couponCode, price);

	}

	
	

}