package com.study.springfinal.test.controller;

import org.springframework.stereotype.Controller;
/*������, �ý��ۿ� ���������� �ʴ� POJO�� ��ǥ
 Plain Old Java Object �߱���*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController{
	//� uri�� �������� �� � ��û�� ó�������� ���� 
	@RequestMapping(value="/hi", method=RequestMethod.GET)
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView("test/result");//setViewName�� ����
		System.out.println("contorller called");
		return mav;
	}
}








