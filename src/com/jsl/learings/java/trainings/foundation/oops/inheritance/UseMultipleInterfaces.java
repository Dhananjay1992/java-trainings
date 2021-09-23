package com.jsl.learings.java.trainings.foundation.oops.inheritance;

//public class UseMultipleInterfaces implements BaseInterface{
//	public static void main(String[] args) {
//		UseMultipleInterfaces useMultipleInterfaces = new UseMultipleInterfaces();
//		System.out.println(useMultipleInterfaces.getFullName());
//		System.out.println(BaseInterface.getDefaultName());
//	}
//}


public class UseMultipleInterfaces implements BaseInterface, AnotherInterface {
	public static void main(String[] args) {
		UseMultipleInterfaces useMultipleInterfaces = new UseMultipleInterfaces();
		System.out.println(useMultipleInterfaces.getFullName());
		System.out.println(BaseInterface.getDefaultName());
	}

	@Override
	public String getFullName() {
		return AnotherInterface.super.getFullName();
	}
}
