package cn.bdqn.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bdqn.service.ClassesService;

public class ClassesController {

	@Autowired
	private ClassesService classesService;
	
	
}
