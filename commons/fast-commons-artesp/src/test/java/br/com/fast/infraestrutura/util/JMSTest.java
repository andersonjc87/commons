//package br.com.fast.infraestrutura.util;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//import javax.jms.Connection;
//
//import org.junit.Test;
//
//import br.com.fast.commons.util.JMSUtil;
//
//public class JMSTest {
//
//	@Test
//	public void test() {
//		Connection conn;
//		try {
//			conn = JMSUtil.getConnection(getProp());
//			if( conn != null ){
//				System.out.println("Connection: "+conn.toString());
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public Properties getProp() throws IOException {
//		Properties props = new Properties();
//		FileInputStream file = new FileInputStream("./properties/HQ.properties");
//		props.load(file);
//		return props;
//	}
//
//}
