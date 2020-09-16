package org.simpleframework.aop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.simpleframework.aop.aspect.AspectInfo;
import org.simpleframework.aop.mock.*;

import java.util.ArrayList;
import java.util.List;

public class AspectListExecutorTest {
    @DisplayName("Aspect排序：sortAspectList")
    @Test
    public  void sortTest(){
        List<AspectInfo> aspectInfoList = new ArrayList<>();
        aspectInfoList.add(new AspectInfo(3, new Mock1(), null));
        aspectInfoList.add(new AspectInfo(5, new Mock2(), null));
        aspectInfoList.add(new AspectInfo(2, new Mock3(), null));
        aspectInfoList.add(new AspectInfo(4, new Mock4(), null));
        aspectInfoList.add(new AspectInfo(1, new Mock5(), null));
        AspectListExecutor aspectListExecutor = new AspectListExecutor(AspectListExecutorTest.class, aspectInfoList);
        List<AspectInfo> sortedAspectInfoList = aspectListExecutor.getSortedAspectInfoList();
        //expected:Mock5->Mock3->Mock1->Mock4->Mock2
        for (AspectInfo aspectInfo: sortedAspectInfoList){
            System.out.println(aspectInfo.getAspectObject().getClass().getName());
        }

    }
}
