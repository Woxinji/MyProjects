package cn.bdqn.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bdqn.mapper.FaqsMapper;
import cn.bdqn.pojo.Faqs;
import cn.bdqn.service.FaqsService;


@Service("faqsService")
public class FaqsServiceImpl  implements FaqsService{

	@Autowired
	private FaqsMapper faqsMapper; 
	
	
	
	public void setFaqsMapper(FaqsMapper faqsMapper) {
		this.faqsMapper = faqsMapper;
	}

	@Override
	public List<Faqs> findByAll(Map<String, Object> map) {
		return faqsMapper.findByAll(map);
	}

	@Override
	public Integer saveFaqs(Faqs faqs) {
		return faqsMapper.saveFaqs(faqs);
	}

}
