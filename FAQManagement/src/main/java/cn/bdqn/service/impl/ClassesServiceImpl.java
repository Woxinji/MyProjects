package cn.bdqn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bdqn.mapper.ClassesMapper;
import cn.bdqn.pojo.Classes;
import cn.bdqn.service.ClassesService;

@Service("classesService")
public class ClassesServiceImpl implements ClassesService {

	@Autowired
	private ClassesMapper classesMapper;
	
	@Override
	public List<Classes> findByAll() {
		return classesMapper.findByAll();
	}

}
