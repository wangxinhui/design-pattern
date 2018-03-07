package com.methodFactory;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;

/**
 * @Author: by Administrator on 2018/3/7.
 */
public class XMLUtil {
    public static Object getBean() throws DocumentException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        SAXReader reader = new SAXReader();
        String path = XMLUtil.class.getResource("").getPath();
        Document document = reader.read(new File(path + "\\factory.xml"));
        String packageName = XMLUtil.class.getPackage().getName();

        Element root = document.getRootElement();

        for (Iterator<Element> it = root.elementIterator();it.hasNext();){
            Element element  = it.next();
            String className = element.getText();
            Class clazz = Class.forName(packageName + "." +  className);
            Object bean = clazz.newInstance();
            return bean;
        }
        return null;
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, DocumentException, IllegalAccessException {
        Object o = getBean();
        System.out.println(o);
    }
}
