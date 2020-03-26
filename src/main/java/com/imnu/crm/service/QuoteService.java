package com.imnu.crm.service;

import java.util.List;

import com.imnu.crm.pojo.Quote;

public interface QuoteService {

	void addQuote(Quote quote);

	List<Quote> findQuoteByPage(int page);

	void DelectQuoteById(int id);

	void updateQuote(int id, Quote quote);

}
