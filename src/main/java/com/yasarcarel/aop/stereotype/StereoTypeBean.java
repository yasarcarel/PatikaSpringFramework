package com.yasarcarel.aop.stereotype;

import lombok.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@BenimStereoType
@Data @NoArgsConstructor @AllArgsConstructor
public class StereoTypeBean {
    private Long id;
    private String name = "hamood";
    private String trade;
}
//stereotype birden fazla annotation'i tek bir
//yerde yazıp , o annatotaion yapısını çağırarak
//kullandığımız yapıdır.