package com.sbk.SoapSerializer;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;
import java.io.ByteArrayInputStream;
import java.io.File;

public class OrderSoapProcessor
{
    public static XmlMapper xmlMapper;
    public static File file;

    public void unMarshaller(String messageString) throws javax.xml.soap.SOAPException, java.io.IOException, javax.xml.bind.JAXBException
    {
        SOAPMessage message = MessageFactory.newInstance().createMessage(null,
                new ByteArrayInputStream(messageString.getBytes()));
        Unmarshaller unmarshaller = JAXBContext.newInstance(Order.class).createUnmarshaller();
        Order order = (Order)unmarshaller.unmarshal(message.getSOAPBody().extractContentAsDocument());
    }
}
