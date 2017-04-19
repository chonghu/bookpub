package org.test.bookpub;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.test.bookpub.entity.Author;
import org.test.bookpub.entity.Book;
import org.test.bookpub.entity.Publisher;
import org.test.bookpub.entity.Reviewer;
import org.test.bookpub.repository.AuthorRepository;
import org.test.bookpub.repository.BookRepository;
import org.test.bookpub.repository.PublisherRepository;
import org.test.bookpub.repository.ReviewerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StartupRunner implements CommandLineRunner {
	
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private DataSource ds;

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired 
	private AuthorRepository authorRepository;
	@Autowired 
	private PublisherRepository publisherRepository;
	@Autowired
	private ReviewerRepository reviewerRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Hello, Richard!");
		logger.info("DataSource: "+ds.toString());
		logger.info("Number of books: " + bookRepository.count());
		
		Author author = new Author("Alex", "Antonov");
		author = authorRepository.save(author);
		Publisher publisher = new Publisher("Packt");
		publisher = publisherRepository.save(publisher);
		Book book = new Book("978-1-78528-415-1", "Spring Boot Recipes", author, publisher);
		Reviewer reviewer = new Reviewer("Richard", "HU");
		reviewerRepository.save(reviewer);
		
		List<Reviewer> items = new ArrayList<Reviewer>();
		items.add(reviewer);
		book.setReviewers(items);
		
		bookRepository.save(book);
			
	}
	
//	@Scheduled(initialDelay=1000, fixedRate=10000)
//	public void run() {
//		logger.info("Number of books: " + bookRepository.count());
//	}
}