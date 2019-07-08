
public interface Shape {
//        创建一个接口
	void draw();
	
	
}
//我们将创建一个 Shape 接口和实现 Shape 接口的实体类。下一步是定义工厂类 ShapeFactory。
//FactoryPatternDemo，我们的演示类使用 ShapeFactory 来获取 Shape 对象。
//它将向 ShapeFactory 传递信息（CIRCLE / RECTANGLE / SQUARE），
//以便获取它所需对象的类型。