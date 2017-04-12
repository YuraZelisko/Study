package core2047;

import java.lang.invoke.ConstantCallSite;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
//		Person person = new Person("antonia", 32, "banderas", 70);
//		Class ref = person.getClass();
//		System.out.println(ref.getSuperclass().getSimpleName());
//		System.out.println(ref.getModifiers());
//		System.out.println();
//		Field [] fields = ref.getDeclaredFields();
//		for (Field field : fields) {
//			System.out.println(field.getModifiers());
////			System.out.println(field.getD);
//		}
//		Method []methods = ref.getDeclaredMethods();
//		for (Method method : methods) {
//			System.out.println(method.getReturnType());
//			Parameter [] parameters = method.getParameters();
//			for (Parameter parameter : parameters) {
//				System.out.println(parameter.isImplicit());
//			}
//		}
//		Constructor [] constructors = ref.getConstructors();
//		for (Constructor constructor : constructors) {
//			System.out.println(constructor);
//		}
//		Class [] classes = ref.getInterfaces();
//		for (Class class1 : classes) {
//			System.out.println(class1);
//		}
//		Person newPerson = (Person) ref.newInstance();
//		System.out.println(newPerson);
//		System.out.println(person);
//		
//		Field field = ref.getDeclaredField("name");
//		field.setAccessible(true);
//		field.set(person, "petro");
//		System.out.println(person);
//		
		
		Factory factory = new Factory("JMC", Arrays.asList(new Auto("mazda", new Engine(300)), 
				(new Auto("lada", new Engine(90))), 
				(new Auto("bmw", new Engine(200))), (new Auto("rover", new Engine(215)))));
		
		Auto carPower = factory.getAutos().get(0);
//		int carPowHigher = 0;
//		int carPowLower = 500;
//		for (int i = 0; i < "JMC".length(); i++) {
//		if (factory.getAutos().get(i).getEngine().getPower()>carPowHigher){
//			carPowHigher = factory.getAutos().get(i).getEngine().getPower();
//			System.out.println(carPowHigher);
//			for (int j = 0; j < "JMC".length(); j++) {
//				if (factory.getAutos().get(j).getEngine().getPower()>carPowLower){
//					carPowLower = factory.getAutos().get(j).getEngine().getPower();
//					System.out.println(carPowLower);
//					
//				}
//				carPowHigher=factory.getAutos().get(j).getEngine().getPower();
//				carPowLower =factory.getAutos().get(i).getEngine().getPower();
//				factory.getAutos().get(i).getEngine().setPower(carPowHigher);
//				factory.getAutos().get(j).getEngine().setPower(carPowLower);
				
				
		}
		
//	}System.out.println(factory);

}

