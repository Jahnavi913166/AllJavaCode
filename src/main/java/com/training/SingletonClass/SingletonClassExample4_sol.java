package com.training.SingletonClass;

import com.training.Serialization_deSerialization.Product;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* to stay away from reflection api we have 2 solution
    1.if object is already created -> throw exception from inside constructor
    2.use enum
because reflection api break the singleton design pattern
*/
//class Product {

//    1.solution
//    private static Product product;
//
//    private Product() {
//        //if object is already created -> throw exception from inside constructor
//        if (product != null) {
//            throw new RuntimeException("you are trying to break singleton pattern/class");
//        }
//    }
//
//    public static Product getInstance() {
//        if (product == null) {
//            synchronized (Product.class) {
//                if (product == null) {
//                    product = new Product();
//                }
//            }
//        }
//        return product;
//    }
//
//
//}

//}
enum SingletonClassSolEnum {
    INSTANCE;

    public void test() {
        System.out.println("test method");
    }


}

class SingletonClassExample4_sol {
    public static void main(String[] args) {
//        Product p1 = Product.getInstance();
//        System.out.println(p1.hashCode());
//        Product p2 = Product.getInstance();
//        System.out.println(p2.hashCode());

   /*     try {
            Constructor<Product> constructor = Product.class.getDeclaredConstructor();
            //we need to change constructor accessibility at runtime
            constructor.setAccessible(true);//private -> public
            Product newInstance = constructor.newInstance();
            System.out.println("new instance:" + newInstance.hashCode());
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    */


        //2 way enum
        SingletonClassSolEnum s = SingletonClassSolEnum.INSTANCE;
        s.test();


    }
}
