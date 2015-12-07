package com.atguigu.spring.beans.collections;

import java.util.Properties;

public class DataSource {
	private Properties propertise;

	public Properties getPropertise() {
		return propertise;
	}

	public void setPropertise(Properties propertise) {
		this.propertise = propertise;
	}

	@Override
	public String toString() {
		return "DataSource [propertise=" + propertise + "]";
	}
	

}
