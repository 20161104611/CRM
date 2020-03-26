package com.imnu.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imnu.crm.mapper.QuoteMapper;
import com.imnu.crm.pojo.Quote;
import com.imnu.crm.pojo.QuoteExample;

@Service
@Transactional
public class QuoteServiceImp implements QuoteService {
	
	@Autowired
	public QuoteMapper quoteMapper;

	@Override
	public void addQuote(Quote quote) {
		
		quoteMapper.insertSelective(quote);
	}

	@Override
	public List<Quote> findQuoteByPage(int page) {
		QuoteExample example = new QuoteExample();
		return quoteMapper.selectByExample(example);
	}

	@Override
	public void DelectQuoteById(int id) {
		
		quoteMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateQuote(int id, Quote quote) {
		QuoteExample example = new QuoteExample();
		example.createCriteria().andIdEqualTo(id);
		quoteMapper.updateByExampleSelective(quote, example);
		
	}
}
