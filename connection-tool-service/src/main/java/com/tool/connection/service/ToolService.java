package com.tool.connection.service;

import java.lang.reflect.Field;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import com.tool.connection.pojo.OrderEntry;
import com.tool.connection.pojo.RequestOrderEntry;

@Service
public class ToolService {

	public ToolService() {
		// TODO Auto-generated constructor stub
	}

	public Object getByte(RequestOrderEntry requestOrderEntry) {
		OrderEntry oe = new OrderEntry();
		int totalSize = 0;

		OrderEntry orderEntry = convertROrderentryToOrderEntry(requestOrderEntry);
		Class<?> pojoclass = orderEntry.getClass();

		Field[] fields = pojoclass.getDeclaredFields();

		for (Field field : fields) {
			System.out.println(field.getName() + "--" + field.getType().getCanonicalName().concat(".SIZE"));
			System.out.println(field.getType());
			
			totalSize = totalSize + colculateSizeOfDataType(field);
			
		}
		System.out.println("TotalSize: "+totalSize);
		return null;
	}

	public OrderEntry convertROrderentryToOrderEntry(RequestOrderEntry requestOrderEntry) {
		OrderEntry orderEntry = new OrderEntry();
		orderEntry.setEntity_id(Integer.parseInt(requestOrderEntry.getEntity_id()));
		orderEntry.setSecurity_id(Integer.parseInt(requestOrderEntry.getSecurity_id()));
		orderEntry.setPrice(Double.parseDouble(requestOrderEntry.getPrice()));
		orderEntry.setOrder_no(Long.parseLong(requestOrderEntry.getOrder_no()));

		return orderEntry;
	}

	public int colculateSizeOfDataType(Field field) {
		int totalSize = 0; 
		switch (field.getType().getCanonicalName()) {
		case "int":
			totalSize = Integer.SIZE/8;
			break;
		case "double":
			totalSize = Double.SIZE/8;
			break;
		case "long":
			totalSize = Long.SIZE/8;
			break;

		default:
			break;
		}
		System.out.println(field.getType().getCanonicalName()+":"+totalSize);
		return totalSize;
	}

}
