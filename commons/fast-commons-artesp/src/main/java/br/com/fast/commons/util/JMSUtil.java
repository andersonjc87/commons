// package br.com.fast.commons.util;
//
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Properties;
//
// import javax.jms.Connection;
// import javax.jms.JMSException;
// import javax.jms.Session;
//
// import org.hornetq.api.core.TransportConfiguration;
// import org.hornetq.api.jms.HornetQJMSClient;
// import org.hornetq.api.jms.JMSFactoryType;
// import org.hornetq.core.remoting.impl.netty.NettyConnectorFactory;
// import org.hornetq.core.remoting.impl.netty.TransportConstants;
// import org.hornetq.jms.client.HornetQConnectionFactory;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

/// ***
// * @author Julio Escobar
// */
//
// public class JMSUtil {
//
// private static final Logger logger = LoggerFactory.getLogger(JMSUtil.class);
//
// public static Connection getConnection(Properties prop) {
// Connection connection = null;
// try {
//
// Map<String, Object> connectionParams = new HashMap<String, Object>();
// connectionParams.put(TransportConstants.PORT_PROP_NAME, prop.getProperty("prop.server.port"));
// connectionParams.put(TransportConstants.HOST_PROP_NAME, prop.getProperty("prop.server.host"));
// TransportConfiguration transportConfiguration = new TransportConfiguration(
// NettyConnectorFactory.class.getName(), connectionParams);
// HornetQConnectionFactory cf = HornetQJMSClient.createConnectionFactoryWithoutHA(JMSFactoryType.TOPIC_CF,
// transportConfiguration);
// connection = cf.createConnection(prop.getProperty("prop.server.login"),
// prop.getProperty("prop.server.password"));
//
// } catch (Exception e) {
// logger.error("JMSUtil.getConnection", e);
// if(connection != null){
// try {
// connection.close();
// } catch (JMSException e1) {
// e1.printStackTrace();
// }
// }
// }
// return connection;
// }
//
// public static Session getSession(Connection con) {
// Session session = null;
// try {
//
// session = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
//
// } catch (Exception e) {
// logger.error("JMSUtil.getSession", e);
// }
// return session;
// }
// }
//
