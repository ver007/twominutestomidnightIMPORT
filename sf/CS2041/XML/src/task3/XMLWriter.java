package task3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import task3.Book.Editor;
import task3.Book.Name;

//import Book;


public class XMLWriter {
	String file;
	Vector<Book> books;

	public XMLWriter(String filename, Vector<Book> books) {
		this.file = filename;
		this.books = books;
		Iterator bookIt = books.iterator();
		Element bib = new Element("bib");
		while(bookIt.hasNext()){
			Book book = (Book) bookIt.next();
			//try{
				//Element bib = new Element("bib");
				//Create a book and set the year attribute
				Element aBook = new Element("book");
				//aBook.setAttribute("year", new String(String.format("%d",book.getYear())));
				Element year = new Element("year");
				year.addContent( new String(String.format("%d",book.getYear())));
				aBook.addContent(year);
				//Add the title to the book
				Element title = new Element("title");
				title.addContent(book.getTitle());        
				aBook.addContent(title);
				//Add the author(s)
				Vector<Name> tempNames = book.getAuthors();
				Iterator<Name> it = tempNames.iterator();
				while(it.hasNext()){
					Element author = new Element("author");
					Name tempName = it.next();
					Element first = new Element("first");
					first.addContent(tempName.getFirst());
					Element last = new Element("last");
					last.addContent(tempName.getLast());
					author.addContent(first);
					author.addContent(last);
					aBook.addContent(author);

				}
				//Add the publisher
				Element publisher = new Element("publisher");
				publisher.addContent(book.getPublisher());
				aBook.addContent(publisher);
				
				//Add the price 
				Element price = new Element("price");
				Element priceDol = new Element("dollarsUS");
				priceDol.addContent(new String(String.format("%.2f",book.getPrice())));
				Element priceEuro = new Element("euro");
				priceEuro.addContent(new String(String.format("%.2f",book.getPriceEuro())));
				
				price.addContent(priceDol);
				price.addContent(priceEuro);
				aBook.addContent(price);
				
				//Add the editor if they exist
				if(book.getEditor()!=null){
					//Create the editor
					Editor tempEditor = book.getEditor();
					Element editor = new Element("editor");
					//Create the editors name
					Name editName = tempEditor.getName();
					Element first = new Element("first");
					first.addContent(editName.getFirst());
					Element last = new Element("last");
					last.addContent(editName.getLast());
					//Add the name
					editor.addContent(first);
					editor.addContent(last);
					//Create and add the affiliation
					Element affiliation = new Element("affiliation");
					affiliation.addContent(tempEditor.getAffiliation());
					editor.addContent(affiliation);
					//Add the editor to the book
					aBook.addContent(editor);

				}
				bib.addContent(aBook);
			}
		
			
			

	try{
			
			XMLOutputter serializer = new XMLOutputter();
			serializer.setFormat(Format.getPrettyFormat().setIndent("\t"));
			FileWriter Xmlfile = new FileWriter(file, false);
			Document myDocument = new Document(bib);
			//serializer.output(myDocument, System.out);
			serializer.output(myDocument, Xmlfile);
			Xmlfile.flush();
			Xmlfile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
