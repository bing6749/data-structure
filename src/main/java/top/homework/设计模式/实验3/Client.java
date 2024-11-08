package top.homework.设计模式.实验3;
/*
 * @author  MaRui
 * @date  2024/10/24 9:29
 * @version 1.0
 */


import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author MaRui
 */
public class Client {
    public static void main(String[] args) {
        ShapeFactory factory1 = new ShapeFactory();
        try {
            // 创建 DocumentBuilderFactory 和 DocumentBuilder 实例
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // 解析 XML 文件
            Document document = builder.parse(new File("C:\\Users\\ASUS\\IdeaProjects\\data-structure\\src\\main\\java\\top\\homework\\设计模式\\实验3\\shapes.xml"));
            document.getDocumentElement().normalize();

            // 获取所有 <shape> 节点的列表
            NodeList shapeList = document.getElementsByTagName("shape");
            String[] shapes = new String[shapeList.getLength()];

            // 提取每个 <shape> 节点的 "type" 属性
            for (int i = 0; i < shapeList.getLength(); i++) {
                shapes[i] = shapeList.item(i).getAttributes().getNamedItem("type").getNodeValue();
            }
            // 遍历每个形状，使用工厂模式创建对象并调用 draw 和 erase 方法
            for (String shapeType : shapes) {
                try {
                    Shape shape = factory1.createShape(shapeType);
                    shape.draw();
                    shape.erase();
                } catch (UnSupportedShapeException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (ParserConfigurationException e) {
            System.out.println(e.getMessage());
        } catch (IOException | SAXException e) {
            throw new RuntimeException(e);
        }
    }




}
