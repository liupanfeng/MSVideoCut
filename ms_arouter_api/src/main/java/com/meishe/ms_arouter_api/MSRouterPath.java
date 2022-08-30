package com.meishe.ms_arouter_api;


import com.meishe.ms_arouter_annotatio.bean.RouterBean;

import java.util.Map;

/**
 * All rights Reserved, Designed By www.meishesdk.com
 *
 * @Author: lpf
 * @CreateDate: 2022/8/30 下午4:30
 * @Description:  路由表下面的具体内容
 * @Copyright: www.meishesdk.com Inc. All rights reserved.
 */
public interface MSRouterPath {
    Map<String, RouterBean> getPathMap();
}
