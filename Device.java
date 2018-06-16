package heussteuerung;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class Device {
	// Attribute

	String name;
	String mqttnick;
	String Beschreibung;
	public String broker = "tcp://wofi.no-ip.org:1883";
	String IPAdresse;

	// Konstruktor
	public Device(String name, String mqttnick, String beschreibung, String broker, String iPAdresse) {
		super();
		this.name = name;
		this.mqttnick = mqttnick;
		Beschreibung = beschreibung;
		//this.broker = broker;
		IPAdresse = iPAdresse;
	}

	// Konstruktor ohne broker
	public Device(String name, String mqttnick, String beschreibung, String iPAdresse) {
		super();
		this.name = name;
		this.mqttnick = mqttnick;
		//this.broker = "tcp://wofi.no-ip.org:1883";
		Beschreibung = beschreibung;
		IPAdresse = iPAdresse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMqttnick() {
		return mqttnick;
	}

	public void setMqttnick(String mqttnickNeu) {
		{

			String topic = "cmnd/" + mqttnick + "SwitchTopic";
			String content = mqttnickNeu;
			int qos = 2;
			String clientId = "JavaRE";
			MemoryPersistence persistence = new MemoryPersistence();

			try {
				MqttClient Client = new MqttClient(broker, clientId, persistence);
				MqttConnectOptions connOpts = new MqttConnectOptions();
				connOpts.setCleanSession(true);
				// System.out.println("Connecting to broker: " + broker);
				Client.connect(connOpts);
				System.out.println("Connected");
				// System.out.println("Publishing message: " + content);
				MqttMessage message = new MqttMessage(content.getBytes());
				message.setQos(qos);
				Client.publish(topic, message);
				// System.out.println("Message published");
				Client.disconnect();
				// System.out.println("Disconnected");
			} catch (MqttException me) {
				System.out.println("reason " + me.getReasonCode());
				System.out.println("msg " + me.getMessage());
				System.out.println("loc " + me.getLocalizedMessage());
				System.out.println("cause " + me.getCause());
				System.out.println("excep " + me);
				me.printStackTrace();
			}
		}
	}

	public String getBeschreibung() {
		return Beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		Beschreibung = beschreibung;
	}

	public String getBroker() {
		return broker;
	}

	public void setBroker(String broker) {
		this.broker = broker;
	}

	public String getIPAdresse() {
		return IPAdresse;
	}

	public void setIPAdresse(String iPAdresse) {
		IPAdresse = iPAdresse;
	}

	public void on() {

		String topic = "cmnd/" + mqttnick + "/power";
		String content = "on";
		int qos = 2;
		String clientId = "JavaRE";
		MemoryPersistence persistence = new MemoryPersistence();

		try {
			MqttClient Client = new MqttClient(broker, clientId, persistence);
			MqttConnectOptions connOpts = new MqttConnectOptions();
			connOpts.setCleanSession(true);
			// System.out.println("Connecting to broker: " + broker);
			Client.connect(connOpts);
			System.out.println("Connected");
			// System.out.println("Publishing message: " + content);
			MqttMessage message = new MqttMessage(content.getBytes());
			message.setQos(qos);
			Client.publish(topic, message);
			// System.out.println("Message published");
			Client.disconnect();
			// System.out.println("Disconnected");
		} catch (MqttException me) {
			System.out.println("reason " + me.getReasonCode());
			System.out.println("msg " + me.getMessage());
			System.out.println("loc " + me.getLocalizedMessage());
			System.out.println("cause " + me.getCause());
			System.out.println("excep " + me);
			me.printStackTrace();
		}
	}

	public void off() {

		String topic = "cmnd/" + mqttnick + "/power";
		String content = "off";
		int qos = 2;
		String clientId = "JavaRE";
		MemoryPersistence persistence = new MemoryPersistence();

		try {
			MqttClient Client = new MqttClient(broker, clientId, persistence);
			MqttConnectOptions connOpts = new MqttConnectOptions();
			connOpts.setCleanSession(true);
			// System.out.println("Connecting to broker: " + broker);
			Client.connect(connOpts);
			System.out.println("Connected");
			// System.out.println("Publishing message: " + content);
			MqttMessage message = new MqttMessage(content.getBytes());
			message.setQos(qos);
			Client.publish(topic, message);
			// System.out.println("Message published");
			Client.disconnect();
			// System.out.println("Disconnected");
		} catch (MqttException me) {
			System.out.println("reason " + me.getReasonCode());
			System.out.println("msg " + me.getMessage());
			System.out.println("loc " + me.getLocalizedMessage());
			System.out.println("cause " + me.getCause());
			System.out.println("excep " + me);
			me.printStackTrace();
		}

	}

	public void otaUrlUpgrade() {

		String topic = "cmnd/" + mqttnick + "/otaurl";
		String content = "http://sonoff.maddox.co.uk/tasmota/sonoff.bin";
		int qos = 2;
		String clientId = "JavaRE";
		MemoryPersistence persistence = new MemoryPersistence();

		try {
			MqttClient Client = new MqttClient(broker, clientId, persistence);
			MqttConnectOptions connOpts = new MqttConnectOptions();
			connOpts.setCleanSession(true);
			// System.out.println("Connecting to broker: " + broker);
			Client.connect(connOpts);
			System.out.println("Connected");
			// System.out.println("Publishing message: " + content);
			MqttMessage message = new MqttMessage(content.getBytes());
			message.setQos(qos);
			Client.publish(topic, message);
			// System.out.println("Message published");
			Client.disconnect();
			// System.out.println("Disconnected");
		} catch (MqttException me) {
			System.out.println("reason " + me.getReasonCode());
			System.out.println("msg " + me.getMessage());
			System.out.println("loc " + me.getLocalizedMessage());
			System.out.println("cause " + me.getCause());
			System.out.println("excep " + me);
			me.printStackTrace();
		}
	}

	public void OtaupgradeViaOtaUrl() {

		String topic = "cmnd/" + mqttnick + "/upgrade";
		String content = "1";
		int qos = 2;
		String clientId = "JavaRE";
		MemoryPersistence persistence = new MemoryPersistence();

		try {
			MqttClient Client = new MqttClient(broker, clientId, persistence);
			MqttConnectOptions connOpts = new MqttConnectOptions();
			connOpts.setCleanSession(true);
			// System.out.println("Connecting to broker: " + broker);
			Client.connect(connOpts);
			System.out.println("Connected");
			// System.out.println("Publishing message: " + content);
			MqttMessage message = new MqttMessage(content.getBytes());
			message.setQos(qos);
			Client.publish(topic, message);
			// System.out.println("Message published");
			Client.disconnect();
			// System.out.println("Disconnected");
		} catch (MqttException me) {
			System.out.println("reason " + me.getReasonCode());
			System.out.println("msg " + me.getMessage());
			System.out.println("loc " + me.getLocalizedMessage());
			System.out.println("cause " + me.getCause());
			System.out.println("excep " + me);
			me.printStackTrace();
		}
	}
}
