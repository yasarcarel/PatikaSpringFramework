package com.yasarcarel.aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciAsilIs {

    @AroundInvoke public Object loglama(InvocationContext context){
        System.out.println("İlk Hali:" + context.getMethod().getName());

        //kullanıcı giriş yapmış mı
        boolean isLogin=true; //yol kesici olacak değişkenimiz
        Object isContinue=null;   //eğer yol kesilmezse devam edecek

        if(isLogin){
            //önce sisteme giriş yapın
            System.out.println("önce sisteme giriş yapın");
            return null;
        }else{
            try{
                isContinue= context.proceed(); //devam etmesini sağlayan çük
                System.out.println("Sonraki Hali: "+isContinue);
            }catch (Exception e){
                e.printStackTrace();
            }
            return isContinue;
        }
    }
}
