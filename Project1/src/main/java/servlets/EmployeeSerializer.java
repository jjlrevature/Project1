package servlets;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import common.Employee;

public class EmployeeSerializer extends StdSerializer<Employee> {
	
	public EmployeeSerializer() {
		this(null);
	}
	
	protected EmployeeSerializer(Class<Employee> t) {
        super(t);
    }

    public void serialize(Employee car, JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider)
            throws IOException {

        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("username", car.getUsername());
        jsonGenerator.writeStringField("password", car.getPassword());
        jsonGenerator.writeNumberField("employeeid", car.getEmployeeID());
        jsonGenerator.writeEndObject();
    }
}
