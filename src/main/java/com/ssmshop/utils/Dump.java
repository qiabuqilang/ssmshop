package com.ssmshop.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
public class Dump<T> {
    public static <T> void dumpAll(List<T> List){
        for (T item:List
             ) {
            printObjectFields(item);
        }
    }

    public static void printObjectFields(Object object){

        Field[] fields = object.getClass().getDeclaredFields();
        for (int i = 0;i<fields.length;i++){
            String name = fields[i].getName();
            String out = name;
            name = name.substring(0,1).toUpperCase()+name.substring(1);
            try{
                Method method = object.getClass().getMethod("get"+name);
                out += "----"+method.invoke(object);
            }catch (NoSuchMethodException e){
               e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }finally {
                System.out.println(out);
            }


        }
    }
}
