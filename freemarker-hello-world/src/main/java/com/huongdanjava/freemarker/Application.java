package com.huongdanjava.freemarker;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class Application {

	public static void main(String[] args) {
		Configuration configuration = new Configuration(Configuration.VERSION_2_3_27);
		configuration.setClassForTemplateLoading(Application.class, "/");

		try {
			Template template = configuration.getTemplate("hello.ftl");
			StringWriter writer = new StringWriter();
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", "Khanh");

			template.process(map, writer);

			System.out.println(writer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
