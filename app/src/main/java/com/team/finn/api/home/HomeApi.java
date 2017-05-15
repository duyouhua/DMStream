package com.team.finn.api.home;

import com.team.finn.model.logic.home.bean.HomeCarousel;
import com.team.finn.model.logic.home.bean.HomeCate;
import com.team.finn.model.logic.home.bean.HomeCateList;
import com.team.finn.net.response.HttpResponse;

import java.util.List;
import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

import static com.team.finn.api.NetWorkApi.getCarousel;
import static com.team.finn.api.NetWorkApi.getHomeCate;
import static com.team.finn.api.NetWorkApi.getHomeCateList;

/**
 *  版本号：1.0
 *  备注消息：
 **/
public interface HomeApi {

    /**
     *  首页分类列表
     * @return
     */
    @GET(getHomeCateList)
    Observable<HttpResponse<List<HomeCateList>>>  getHomeCateList(@QueryMap Map<String,String> params);

    /**
     *   首页 列表详情页
     * @return
     */
    @GET(getHomeCate)
    Observable<HttpResponse<List<HomeCate>>> getHomeCate(@QueryMap Map<String,String> params);

    /**
     *   首页   推荐轮播图
     * @return
     */
    @GET(getCarousel)
    Observable<HttpResponse<List<HomeCarousel>>> getCarousel(@QueryMap Map<String,String> params);

}
