package pattern.factroy;

import java.util.Properties;

public class Test {

	public static void main(String[] args) throws Exception {
		
		//问题：当增加新的水果时，工厂类需要修改
//		Fruit f = FruitFactroy01.getFruit("orange");
//		f.eat();

		//问题：pattern.factroy.Apple全名太长（起别名）
//		Fruit f = FruitFactroy02.getFruit("pattern.factroy.Apple");
//		f.eat();
		
		//使用配置文件
		Properties pro = new PropertiesOperate().getPro();
		Fruit f = FruitFactroy02.getFruit(pro.getProperty("apple"));
		f.eat();
	}

}