package you.main;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class Start {

	public static void main(String[] args) throws Exception
	 {
		 try {

	            if (args.length != 1) {

	                System.err.println ("Usage: java TestSAXParsing [filename]");

	                System.exit (1);

	            }
	            // Get SAX Parser Factory

	            SAXParserFactory factory = SAXParserFactory.newInstance();

	            // Turn on validation, and turn off namespaces

	            factory.setValidating(true);

	            factory.setNamespaceAware(false);

	            SAXParser parser = factory.newSAXParser();

	            parser.parse(new File(args[0]), new MyHandler());
		 
		 } catch (ParserConfigurationException e) {

	            System.out.println("The underlying parser does not support " +

	                               " the requested features.");

	      } catch (FactoryConfigurationError e) {

	            System.out.println("Error occurred obtaining SAX Parser Factory.");

	      } catch (Exception e) {

	            e.printStackTrace();

	      }
		
	 }
}
	class MyHandler extends DefaultHandler {

	    // SAX callback implementations from ContentHandler, ErrorHandler, etc.

	

}
