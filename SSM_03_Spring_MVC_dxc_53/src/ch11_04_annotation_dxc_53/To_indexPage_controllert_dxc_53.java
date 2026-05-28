package ch11_04_annotation_dxc_53;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class To_indexPage_controllert_dxc_53 {
	
	//第二个注解，@RequestMapping，可以标在类上或方法上
	@RequestMapping("/to_index_01.do")
	public String to_index_01(){
		String to_path="/index.jsp";
		System.out.println("基于注解开发->dxc");
		return to_path;
	}
	
	
	
	@RequestMapping("/to_index_02.do")
	//to_index_02.do?name=123 这个地址只能访问，不能作为定义
	public String to_index_02(String name){
		String to_path="/index.jsp";
		System.out.println("从客户端向服务端传数据->dxc->name"+name);
		return to_path;
	}
	
	@RequestMapping("/to_index_03.do/{name}")
	//to_index_02.do?name=123 这个地址只能访问，不能作为定义
	public String to_index_03(@PathVariable("name") String name){
		String to_path="/index.jsp";
		System.out.println("从客户端向服务端传数据->dxc->name"+name);
		return to_path;
	}
	
	@RequestMapping("/to_index_05.do")
	//to_index_02.do?name=123 这个地址只能访问，不能作为定义
	public String to_index_05(User_dxc_53 user_dxc_53){
		String to_path="/index.jsp";
		System.out.println("从客户端向服务端传数据->dxc->name"+user_dxc_53.toString());
		return to_path;
	}
	//以上示例演示的都是方法的返回值，需要用到视图解析器（默认jsp）
	
	//json
	
	@RequestMapping("/to_index_07.do")
	//to_index_02.do?name=123 这个地址只能访问，不能作为定义
	@ResponseBody
	public String to_index_07(User_dxc_53 user_dxc_53){
		String to_path="/index.jsp";
		System.out.println("从客户端向服务端传数据->dxc->name"+user_dxc_53.toString());
		return to_path;
	}
}
