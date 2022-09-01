package com.meishe.ms_arouter_compiler;

public interface ProcessorConfig {

    // @MSRouter注解 的 包名 + 类名
    String AROUTER_PACKAGE =  "ms_arouter_annotation.MSRouter";

    // 接收参数的TAG标记
    String OPTIONS = "moduleName"; //目的是接收 每个module名称
    String APT_PACKAGE = "packageNameForAPT"; //目的是接收 包名（APT 存放的包名）


}
