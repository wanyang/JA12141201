//接口的多继承：继承接口 + 新增特有的常量、抽象方法
//定义接口 + 继承接口 + 完成实现类 + 实例化	
public interface USB_WIFI extends USB,WiFi{
	void usb2wifi();
}