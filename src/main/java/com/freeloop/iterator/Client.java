package com.freeloop.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Client
 *
 * @author fj
 * @since 2023/4/15 14:57
 */
public class Client {
    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollage infoCollage = new InfoCollage();
        collegeList.add(computerCollege);
        collegeList.add(infoCollage);
        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollage();
    }
}
