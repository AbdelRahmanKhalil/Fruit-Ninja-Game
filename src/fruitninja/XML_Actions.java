package fruitninja;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Text;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.File;
import java.io.FileOutputStream;

public class XML_Actions {
	public  void writeXML(String scorex,String filename){
		try {
		Document doc=new Document();
		Element root=new Element("game");
		doc.setRootElement(root);
		Element score=new Element("score");
			score.addContent(new Text(scorex));
			root.addContent(score);
		System.out.println("wrote to the file");
		XMLOutputter xmlOutput=new XMLOutputter(Format.getPrettyFormat());
		xmlOutput.output(doc,new FileOutputStream(new File(filename)));
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	
}
