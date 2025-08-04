package com.yasarcarel.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;

//kapsam
//yaşam süresi
//preformansı iyi veya kötü etkileyebilir
@Named
//@ApplicationScoped // bütün uygulama boyunca çalışıyor. bütün kullanıcılar için
//@RequestScoped //1 istek boyunca çalışır
//@SessionScoped //1 kullanıcı için yaşar ancak log out yapıldığında biter. bean instance olmasını sağlamak için
//@Dependent //Bukelemun
//@ConversationScoped //belli istek boyunca çalışır.


public class _00_Scoped {
}
