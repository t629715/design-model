package com.example.designmodel.factory.simplefactory;

public class CourseFactory {
//    public ICourse create(String name){
//        if ("Java".equals(name)){
//            return new JavaCourse();
//        }else {
//            return null;
//        }
//    }
//
//    public ICourse course(String className){
//        try{
//            if (className == null || className == ""){
//                return (ICourse) Class.forName(className).newInstance();
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return null;
//    }

    public ICourse create(Class clzz){
        try{
            if (clzz != null){
                return (ICourse) clzz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
