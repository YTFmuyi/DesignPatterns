package com.yangtengfei;
import java.io.File;
public class CreateDir {
    public static void main(String args[]) {
        String dirname = "./tmp/user/java/bin";
        File d = new File(dirname);
        // 现在创建目录
        d.mkdirs();
    }
}
