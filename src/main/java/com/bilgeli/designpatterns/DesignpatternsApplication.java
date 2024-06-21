package com.bilgeli.designpatterns;

public class DesignpatternsApplication {
	static Integer nonPrimitivInteger ; static Boolean nonPrimitivBoolean ;
	static int primitivInt ; static boolean primitivBoolean ;
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Integer: ");
		stringBuilder.append(nonPrimitivInteger);
		stringBuilder.append("\nint: ");
		stringBuilder.append(primitivInt);
		stringBuilder.append("\nBoolean: ");
		stringBuilder.append(nonPrimitivBoolean);
		stringBuilder.append("\nboolean: ");
		stringBuilder.append(primitivBoolean);

		System.out.println(stringBuilder);

	}

}
