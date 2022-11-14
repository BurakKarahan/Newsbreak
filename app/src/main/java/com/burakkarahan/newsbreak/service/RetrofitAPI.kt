package com.burakkarahan.newsbreak.serviceimport com.burakkarahan.newsbreak.model.Loginimport com.burakkarahan.newsbreak.model.ResultModelimport com.burakkarahan.newsbreak.model.Rootimport com.burakkarahan.newsbreak.model.Saveimport io.reactivex.Observableimport retrofit2.http.GETimport retrofit2.http.Queryinterface RetrofitAPI {    @GET("top-headlines")    fun getData(@Query("country") country: String, @Query("category") category: String, @Query("sortBy") sortBy: String, @Query("pageSize") pageSize: String, @Query("apiKey") apiKey: String): Observable<Root>    //fun getData(): Call<List<CostModel>>    @GET("top-headlines")    fun getData(@Query("sources") sources: String, @Query("pageSize") pageSize: String, @Query("apiKey") apiKey: String): Observable<Root>    @GET("everything")    fun getDataSearch(@Query("q") searchWord: String, @Query("pageSize") pageSize: String, @Query("apiKey") apiKey: String): Observable<Root>    @GET("addFavorite.php")    fun getDataFavorite(@Query("id_user") id_user: String, @Query("publishedAt") publishedAt: String, @Query("author") author: String, @Query("urlToImage") urlToImage: String, @Query("title") title: String, @Query("content") content: String, @Query("name") name: String, @Query("description") description: String): Observable<Save>    @GET("viewFavorite.php")    fun getDataFavorite(@Query("id_user") id_user: String): Observable<List<Save>>    @GET("Login.php")    fun getDataLogin(@Query("mail") mail: String, @Query("password") password: String): Observable<Login>    @GET("Signin.php")    fun getDataSignin(@Query("name") name: String, @Query("surname") surname: String, @Query("mail") mail: String, @Query("password") password: String): Observable<ResultModel>}