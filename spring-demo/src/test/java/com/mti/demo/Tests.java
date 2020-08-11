package com.mti.demo;

import com.mti.demo.model.Person;
import com.mti.demo.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.util.CollectionUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaopf@mti-sh.cn
 * @Description TODO
 * @createTime 2020年07月23日
 */
public class Tests {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		if (CollectionUtils.isEmpty(list)) {
			System.out.println("哈哈");
		}
	}


	@Test
	public void getResource() throws IOException {
//		ClassPathResource
		ClassPathResource resource = new ClassPathResource("application_context.xml");
//		ClassPathResource resource = new ClassPathResource("/application_context.xml",User.class);
		InputStream input = resource.getInputStream();
		Assert.assertNotNull(input);
		System.out.println(resource.getClassLoader());
		System.out.println(resource.getPath());
		System.out.println("哈哈");
	}


	@Test
	public void getResources() {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		System.out.println(classLoader.getResource("").getPath());
		System.out.println(this.getClass().getResource("").getPath());
		System.out.println(this.getClass().getResource("/").getPath());
		System.out.println(System.getProperty("user.dir"));
	}


	@Test
	public void getResourcess() {

		//FileSystemResourceresource1=newFileSystemResource("target/classes/application_context.xml");
		FileSystemResource resource1 = new FileSystemResource("C:\\project\\github\\spring-framework\\spring-demo\\src\\main\\resources\\application_context.xml");
		InputStream input = null;
		try {
			input = resource1.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(input);
		System.out.println(resource1.getPath());
	}


	@Test
	public void fileStreamTest() {
		try {
			byte bWrite[] = {44, 55, 3, 55, 75};
			OutputStream os = new FileOutputStream("test.txt");
			for (int x = 0; x < bWrite.length; x++) {
				os.write(bWrite[x]); // writes the bytes
			}
			os.close();

			InputStream is = new FileInputStream("test.txt");
			int size = is.available();

			for (int i = 0; i < size; i++) {
				System.out.print((char) is.read() + "  ");
			}
			is.close();
		} catch (IOException e) {
			System.out.print("Exception");
		}
	}

	@Test
	public void fileStreamTest2() {

		try {
			File f = new File("a.txt");
			FileOutputStream fop = new FileOutputStream(f);
			// 构建FileOutputStream对象,文件不存在会自动新建

			OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
			// 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

			writer.append("中文输入");
			// 写入到缓冲区

			writer.append("\r\n");
			// 换行

			writer.append("English");
			// 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入

			writer.close();
			// 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

			fop.close();
			// 关闭输出流,释放系统资源

			FileInputStream fip = new FileInputStream(f);
			// 构建FileInputStream对象

			InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
			// 构建InputStreamReader对象,编码与写入相同

			StringBuffer sb = new StringBuffer();
			while (reader.ready()) {
				sb.append((char) reader.read());
				// 转成char加到StringBuffer对象中
			}
			System.out.println(sb.toString());
			reader.close();
			// 关闭读取流

			fip.close();
			// 关闭输入流,释放系统资源
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@Test
	public void getResource1() {
		try {
			System.out.println(System.getProperty("user.dir"));
			//FileSystemResource
			FileSystemResource resource1 = new FileSystemResource("build/resources/main/application_context.xml");//相对路径
			// //FileSystemResourceresource1=newFileSystemResource("F:\\workspace\\Spmvc_Learn\\spring_study\\spring-chap1\\target\\classes\\application_context.xml");//绝对路径
			InputStream input = resource1.getInputStream();
			Assert.assertNotNull(input);
			System.out.println(resource1.getPath());
			System.out.println(resource1.getDescription());
			Resource resource = resource1.createRelative("application_context.xml");
			System.out.println(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void useResourceLoader() {
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource resource = null;
		String location = "";

		//location以/开头
		location = "/application_context.xml";
		resource = resourceLoader.getResource(location);
		System.out.println(resource.getClass());

		//location以classpath开头
		location = "classpath:application_context.xml";
		resource = resourceLoader.getResource(location);
		System.out.println(resource.getClass());

		//抛出MalformedURLException异常，进而执行getResourceByPath方法
		location = "target/classes/application_context.xml";
		resource = resourceLoader.getResource(location);
		System.out.println(resource.getClass());

		//同上
		location = "F:/workspace/Spmvc_Learn/spring_study/spring-chap1/target/classes/application_context.xml";
		resource = resourceLoader.getResource(location);
		System.out.println(resource.getClass());

		//ResourceUtils.isFileURL(url)为true，返回FileUrlResource
		location = "file:/target/classes/application_context.xml";
		resource = resourceLoader.getResource(location);
		System.out.println(resource.getClass());

		//ResourceUtils.isFileURL(url)为false，返回UrlResource
		location = "https://cn.bing.com/";
		resource = resourceLoader.getResource(location);
		System.out.println(resource.getClass());
	}

	@Test
	public void useResourceLoaders() {
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource resource = null;
		String location = "";
		resourceLoader = new FileSystemResourceLoader();
		//抛出MalformedURLException异常，进而执行getResourceByPath方法
		location = "target/classes/application_context.xml";
		resource = resourceLoader.getResource(location);
		System.out.println(resource.getClass());
		//同上
		location = "C:\\project\\github\\spring-framework\\spring-demo\\build\\resources\\main\\application_context.xml";
		resource = resourceLoader.getResource(location);
		System.out.println(resource.getClass());
	}


	@Test
	public void usePatternResolver() throws IOException {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = null;
		String location = "";
		//使用DefaultResourceLoader的情况下，改变location的内容
		location = "application_context.xml";
		resources = resolver.getResources(location);//调用DefaultResourceLoader.getResource()方法
		sout(resources);
		location = "classpath*:config/beans.xml";
		resources = resolver.getResources(location);//findAllClassPathResources
		sout(resources);
		location = "classpath*:*/beans.xml";
		resources = resolver.getResources(location);//findPathMatchingResources
		sout(resources);
		location = "file:F:/workspace/Spmvc_Learn/spring_study/spring-chap1/target/classes/*/beans.xml";
		resources = resolver.getResources(location);//findPathMatchingResources
		sout(resources);
		location = "F:/workspace/Spmvc_Learn/spring_study/spring-chap1/target/classes/application_context.xml";
		resources = resolver.getResources(location);//调用resourceLoader.getResource()方法
		sout(resources);  //更新ClassLoader
		location = "F:/workspace/Spmvc_Learn/spring_study/spring-chap1/target/classes/application_context.xml";
		resolver = new PathMatchingResourcePatternResolver(new FileSystemResourceLoader());
		resources = resolver.getResources(location);//调用FileSystemResourceLoader.getResource()方法
		sout(resources);
	}

	public void sout(Resource[] resources) {
		for (Resource resource : resources) {
			System.out.println(resource);
		}
	}


	@Test
	public void MyBean() {        //解析application_context.xml文件  ,  生成管理相应的Bean对象
		ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");
		User user = (User) context.getBean("user");
		System.out.println(user);
		System.out.println(user.hashCode());
		User user1 = (User) context.getBean("user");
		System.out.println(user1);
		System.out.println(user1.hashCode());
	}

	@Test
	public void MyBeans() {
		//解析application_context.xml文件  ,  生成管理相应的Bean对象
		ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		System.out.println(person.hashCode());
		//                Person  person2  =  (Person)  context.getBean("person");
		//                System.out.println(person2);
		//                System.out.println(person2.hashCode());



	}





}
