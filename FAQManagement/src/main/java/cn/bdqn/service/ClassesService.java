package cn.bdqn.service;

import java.util.List;
import java.util.Map;

import cn.bdqn.pojo.Classes;

public interface ClassesService {

	

	/**
	 * 类别全部
	 * @param map
	 * @return
	 */
	List<Classes> findByAll();
}
