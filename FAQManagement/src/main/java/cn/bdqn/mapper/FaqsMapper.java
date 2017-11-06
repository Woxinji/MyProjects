package cn.bdqn.mapper;

import java.util.List;
import java.util.Map;

import cn.bdqn.pojo.Faqs;



public interface FaqsMapper {

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

	/**
	 * 查询id
	 * @param id
	 * @return
	 */
	Faqs findById(Integer id);
	
	
}
