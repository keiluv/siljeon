package com.booksearch.booksearchapp.book;

import java.util.List;

public interface BookService {
	public int insertBook(BookVO vo);

	public int deleteBook(int seq);

	public int updateBook(BookVO vo);

	public BookVO getBook(int seq);

	public List<BookVO> getBookList();
}
