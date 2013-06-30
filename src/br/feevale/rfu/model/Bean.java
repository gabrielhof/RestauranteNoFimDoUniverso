package br.feevale.rfu.model;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

@SuppressWarnings("serial")
public class Bean implements Serializable {
	
	public String toXML() {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		
		try {
			JAXBContext context = JAXBContext.newInstance(getClass());
			
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			marshaller.marshal(this, os);
			return new String(os.toByteArray(), "UTF-8");
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				os.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Bean> T fromXML(String xml, Class<T> clazz) {
		try {
			File file = File.createTempFile("jaxb_", ".xml");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(xml);
			writer.flush();
			writer.close();
			
			JAXBContext context = JAXBContext.newInstance(clazz);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			T bean = (T) unmarshaller.unmarshal(file);
			
			file.delete();
			
			return bean;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
