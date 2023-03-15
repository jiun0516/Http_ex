package ch02;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonMainTest3 {
	
	public static void main(String[] args) {
		
		JsonArray jsonArray = new JsonArray();
		// [] <--- 
		// jsonObject
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "티모");
		
		System.out.println(jsonArray);
		System.out.println("---------------");
		System.out.println(jsonObject);
		
		jsonArray.add(jsonObject);
		jsonArray.add(jsonObject);
		jsonArray.add(jsonObject);
		
		System.out.println("----------------");
		System.out.println(jsonArray);
		
		JsonArray jsonArray1 = new JsonArray();
		
		JsonObject jsonObject1 = new JsonObject();
		jsonObject1.addProperty("userId", 1);
		jsonObject1.addProperty("id", 1);
		jsonObject1.addProperty("title", "delectus aut autem");
		jsonObject1.addProperty("completed", false);
		
		JsonObject jsonObject2 = new JsonObject();
		jsonObject2.addProperty("userId", 1);
		jsonObject2.addProperty("id", 2);
		jsonObject2.addProperty("title", "quis ut nam facilis et officia qui");
		jsonObject2.addProperty("completed", false);
		
		JsonObject jsonObject3 = new JsonObject();
		jsonObject3.addProperty("userId", 1);
		jsonObject3.addProperty("id", 3);
		jsonObject3.addProperty("title", "fugiat veniam minus");
		jsonObject3.addProperty("completed", false);
		
		jsonArray1.add(jsonObject1);
		jsonArray1.add(jsonObject2);
		jsonArray1.add(jsonObject3);
		
		System.out.println(jsonArray1);
		
		// JsonArray 에서 JsonObject 꺼내는 방법
		JsonObject targetObject = jsonArray.get(2).getAsJsonObject();
		
		System.out.println(targetObject);
		String strName = targetObject.get("name").getAsString();
		System.out.println(strName);
	}

}
