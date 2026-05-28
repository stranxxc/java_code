package ch07_Bean_Life_cycle_dxc_53;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//这是一个Bean处理器，对Bean在执行初始化方法前后进行功能增强
public class My_Bean_Post_Processor_dxc_53 implements BeanPostProcessor {
	public Object postProcessAfterInitialization(Object cur_bean_obj,
			String cur_beanName) throws BeansException {
		if ("user_01_Bean".equals(cur_beanName)) {
			System.out.println("-------第7-1：对user_01_bean后增强-------");

		}
		System.out.println("-------第7-2步：对全部的bean后增强-------");
		return cur_bean_obj;
	}

	public Object postProcessBeforeInitialization(Object cur_bean_obj,
			String cur_beanName) throws BeansException {

		System.out.println("-------第五步：对全部的bean前增强-------");
		return cur_bean_obj;
	}
}
