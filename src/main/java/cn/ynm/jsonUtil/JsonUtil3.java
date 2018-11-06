package cn.ynm.jsonUtil;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonUtil3 {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/cn/ynm/jsonUtil/test3.json");
        String content = FileUtils.readFileToString(file,"utf-8");

        Person person = new Gson().fromJson(content, Person.class);
        System.out.println(person.getGroup().getInfo().getAddress());

    }

}
