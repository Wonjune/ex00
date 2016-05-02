package org.wonjune.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wonjune.domain.ProductVO;

@Controller
public class SampleController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping("/doD")
	public String doD(Model model){
		
		//make sample data
		ProductVO product = new ProductVO("Sample Product", 10000);
		ProductVO product2 = new ProductVO("Sample Product2", 20000);
		
		logger.info("doD");
		
		model.addAttribute(product);
		model.addAttribute("product2", product2);
		
		return "productDetail";
	}
	
}
