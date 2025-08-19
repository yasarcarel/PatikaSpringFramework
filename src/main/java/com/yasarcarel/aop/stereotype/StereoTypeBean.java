package com.yasarcarel.aop.stereotype;

import lombok.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@BenimStereoType
@Data @NoArgsConstructor @AllArgsConstructor
public class StereoTypeBean {
    private Integer id = 1453;
    private String name = "Ahmet Yılmaz";
    private String trade;
}
//stereotype birden fazla annotation'i tek bir
//yerde yazıp , o annatotaion yapısını çağırarak
//kullandığımız yapıdır.