package com.study.springfinal.controller.gallery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.springfinal.domain.Gallery;

@Controller
public class GalleryController{
	
	//������ �����ӿ��� ���ε� ������Ʈ��, apache fileupload�� �����		
	@RequestMapping(value="/gallery/regist", method=RequestMethod.POST)
	public String regist(Gallery gallery) {
		System.out.println("��� ����?");
		System.out.println("title "+gallery.getTitle());
		System.out.println("writer "+gallery.getWriter());
		System.out.println("content "+gallery.getContent());
		System.out.println("photo "+gallery.getPhoto());

		return null;
	}
}
