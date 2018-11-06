package cn.ynm;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class JsonUtil {
    Gson gson = new Gson();

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/cn/ynm/test.json");
        String content = FileUtils.readFileToString(file,"utf-8");

        JsonParser parser = new JsonParser();
        JsonArray jsonArray = parser.parse(content).getAsJsonArray();

        Gson gson = new Gson();
        ArrayList<UserBean> userBeans = new ArrayList<UserBean>();
        for (JsonElement user : jsonArray) {
            UserBean userBean = gson.fromJson(user, UserBean.class);
            userBeans.add(userBean);
            System.out.println(userBean.getAge());
        }

    }

}
