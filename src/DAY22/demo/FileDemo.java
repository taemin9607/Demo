package DAY22.demo;

import java.io.File;

/**
 * @author 泰民
 * @title: FileDemo
 * @projectName day22
 * @description: 将操作系统的文件、目录（文件夹、路径，封装成File对象
 * 提供方法，操作系统中的内容
 * File与系统无关内容、
 * 文件file
 * 目录directory
 * 路径path
 * @date 2019/7/713:40
 */
public class FileDemo {
    public static void main(String[] args) {
        //file类静态成员变量
        //与系统有关的路径分隔符
        String separator=File.pathSeparator;
        System.out.println(separator);//是一个分号，目录的分割 linux;

        //与系统有关的默认名称分隔符
        separator=File.separator;
        System.out.println(separator);//向右\  目录名称分隔符  Linux |

    }
}
