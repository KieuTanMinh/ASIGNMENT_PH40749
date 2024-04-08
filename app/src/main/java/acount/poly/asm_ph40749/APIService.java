package acount.poly.asm_ph40749;

import java.util.List;

import acount.poly.asm_ph40749.model.SanphamModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface APIService {
    String DOMAIN = "http://192.168.1.12:3000/api/";

    @GET("get-list-car")
    Call<List<SanphamModel>> getSanphams();

    @POST("post-car")
    Call<SanphamModel> addSanpham(@Body SanphamModel sanpham);

    @DELETE("delete-car-by-id/{id}")
    Call<Void> deleteSanpham(@Path("id") String id);

    @PUT("update-car-by-id/{id}")
    Call<SanphamModel> updateSanpham(@Path("id") String id, @Body SanphamModel sanpham);
}
