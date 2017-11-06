package cn.bdqn.service;

import java.util.List;
import java.util.Map;

import cn.bdqn.pojo.Faqs;

public interface FaqsService {

	/**
	 * 动态查询
	 * @param map
	 * @return
	 */
	List<Faqs> findByAll(Map<String,Object>map);
	
	/**
	 * 新增
	 */
	Integer saveFaqs(Faqs faqs);
}
