package ch08_Java_reflect_dxc_53;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//这是一个测试程序，主要演示java反射相关模块
public class Test_01_java_reflect_dxc_53 {

	public static void main(String[] args) throws Exception {
		User_dxc_53 user_dxc_53 = new User_dxc_53();
		user_dxc_53.setXing_ming("张三");
		user_dxc_53.xing_ming = "张三";// 通过属性名直接赋值
		// 第一个模块：如何获取类对象，获取方式有三种：将类的全限定名作为参数，
		Class<User_dxc_53> user_class = User_dxc_53.class;

		// 第一步：获取类的属性定义，
		Field[] declared_fields_all = user_class.getDeclaredFields();// 获取全部属性的定义
		for (Field field_each : declared_fields_all) {
			System.out.println("第一步：Field->类的属性" + field_each.getName());
			// 1-public,2-private,8-static
			System.out.println("第一步：Field->类的修饰符" + field_each.getModifiers());
		}
		// 第二步：获取类的方法
		Method[] declared_methods_all = user_class.getDeclaredMethods();// 获取全部声明的方法

		for (Method method_each : declared_methods_all) {
			System.out.println("第二步：Method->类的实例方法" + method_each.getName());
		}
		// 第三步：获取类的构造方法
		Constructor<?>[] declared_constructors_all = user_class
				.getDeclaredConstructors();
		for (Constructor constructors_each : declared_constructors_all) {
			System.out.println("第三步：Constructor->类的构造方法"
					+ constructors_each.getName());
		}
		// 第四步：实例化一个对象
		User_dxc_53 user_instance_01 = user_class.newInstance();//
		// 4-2,
		// 权限通过
		Field declared_field = user_class.getDeclaredField("xing_ming");// 输入参数，来自类的定义
		declared_field.setAccessible(true);// 该属性就可以赋值了
		declared_field.set(user_instance_01, "张三");

		System.out.println("第4-1步：无参构造方式进行实例化->"
				+ user_instance_01.toString_2());

		Constructor<User_dxc_53> declared_constructor = user_class
				.getDeclaredConstructor(String.class, int.class);// 有参构造，传入的参数仍为类，具体由构造方法决定。

		User_dxc_53 user_instance_03 = declared_constructor.newInstance("张三",18);
		
		System.out.println("第4-2步：有参构造方式进行实例化->"
				+ user_instance_03.toString_2());

		
		//第五步：通过反射，执行实例方法
		Method declared_method = user_class.getDeclaredMethod("setXing_ming", String.class);
		//invoke执行时，传入两个参数，指实例。第2个参数，指传入的具体值
		declared_method.invoke(user_instance_03, "张三_invoke");
		System.out.println("第5步：使用method对象为属性赋值->"
				+ user_instance_03.toString_2());

	}

}
