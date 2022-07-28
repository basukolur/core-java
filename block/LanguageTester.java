package com.xworkz.block;

import com.xworkz.block.dto.LanguageDTO;

public class LanguageTester {
	public static void main(String[] args) {
		LanguageDTO dto = new LanguageDTO();
		dto.setId(123);
		dto.setSerialNo(123456789L);
		dto.setName("ABC");
		dto.setPrice(20.00);
		dto.setBlock('B');
		dto.setRate(5.0f);

		// boxing
		Integer id = dto.getId();
		// un boxing
		int id1 = id.intValue();

		Long sNo = dto.getSerialNo();
		long serialNo = sNo.longValue();

		Double price = dto.getPrice();
		double price1 = price.doubleValue();

		Character block = dto.getBlock();
		char block1 = block.charValue();

		Float rate = dto.getRate();
		float rate1 = rate.floatValue();

		System.out.println(dto);
	}

}
