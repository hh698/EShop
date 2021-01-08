package unit;

import com.alibaba.fastjson.JSON;
import com.hfq.eshop.commom.entity.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * JSON工具类
 * 处理和JSON相关的所有内容
 */
public class JSONUtil {
    public static void main(String[] args) {
        Entity entity = new Entity();
        entity.setId("100");
        entity.setCreateTime("10:10");
        String s = entity2JSON(entity);
        System.out.println(s);
        System.out.println("****************");

        List<Entity> entityList = new ArrayList<>();
        entityList.add(entity);
        String jsonList = entityList2JSON(entityList);
        System.out.println(jsonList);
        System.out.println("****************");

//        String jsonstr = "{\"createTime\":\"10:10\",\"id\":\"100\",\"isDel\":\"1\"}"; //没有泛型
//        Object obj = JSON2Entity(jsonstr, Entity.class);
//        Entity e = (Entity) obj;
//        System.out.println(e.getCreateTime());
//        System.out.println("****************");

        String jsonstr = "{\"createTime\":\"10:10\",\"id\":\"100\",\"isDel\":\"1\"}";//有泛型
        Entity e = JSON2Entity(jsonstr, Entity.class);
        System.out.println(e.getCreateTime());
        System.out.println("****************");


//        String jsonArr = "[{\"createTime\":\"10:10\",\"id\":\"100\",\"isDel\":\"1\"},{\"createTime\":\"10:50\",\"id\":\"100\",\"isDel\":\"1\"}]";
//        List<Entity> entityList1 = JSONArray2List(jsonArr, Entity.class);            //有泛型
//        System.out.println(entityList1.get(0).getCreateTime());
//        System.out.println(entityList1.get(1).getCreateTime());
//        System.out.println("****************");

        String jsonArr = "[{\"createTime\":\"10:10\",\"id\":\"100\",\"isDel\":\"1\"},{\"createTime\":\"10:50\",\"id\":\"100\",\"isDel\":\"1\"}]";
        List<?> obj = JSONArray2List(jsonArr, Entity.class);                           //没有泛型
        Entity entityList1 = (Entity)obj;
        System.out.println(entityList1.getCreateTime());
    }

    /***
     * 把对象转换成JSON格式的字符串
     * @param entity  指定对象
     * @return   返回JSON格式的字符串
     */
    public static  String entity2JSON(Object entity){
        return JSON.toJSONString(entity);
    }

    /***
     * 把对象列表转换成json格式的字符串
     * @param entityList  指定对象列表
     * @return 返回json格式的字符串
     */
    public static String entityList2JSON(List<?> entityList){
        return entity2JSON(entityList);
    }

    /***
     * 把字符串转换成指定类型的对象
     * @param json 要转换的对象
     * @param clazz 指定的类型
     * @return 返回的Object对象
     * ?泛型的通配符，代表的是未知的任意类型，或者说是Object
     */
//    public static Object JSON2Entity(String json,Class<?> clazz){
//        Object obj = JSON.parseObject(json, clazz);                   //没有泛型
//        return obj;
//    }

    public static <T> T JSON2Entity(String json,Class<T> clazz){        //有泛型
        return JSON.parseObject(json, clazz);
    }




    public static  List<?> JSONArray2List(String json,Class<?> clazz){     //没有泛型
        List<?> obj = JSON.parseArray(json, clazz);
        return obj;
    }

    /***
     * 将JSON数组装换成指定类型的对象列表
     * @param json  数据
     * @param clazz 指定的类型class对象
     * @param <T>   指定的类型
     * @return  返回对象列表
     */
//    public static <T> List<T> JSONArray2List(String json,Class<T> clazz){     //有泛型
//        return  JSON.parseArray(json,clazz);
//    }
}
