package com.zjh.practice.注入类;
/*
   演示一个方法链编程风格
 */

public class Aliyun {
    private String appKey;

    private String appSecret;

    private String bucket;

    private String endPoint;

    public static class Builder{
        private String appKey;

        private String appSecret;

        private String bucket;

        private String endPoint;

        public Builder setAppKey(String appKey){
            this.appKey = appKey;
            return this;
        }

        public Builder setAppSecret(String appSecret){
            this.appSecret = appSecret;
            return this;
        }

        public Builder setBucket(String bucket){
            this.bucket = bucket;
            return this;
        }

        public Builder setEndPoint(String endPoint){
            this.endPoint = endPoint;
            return this;
        }

        public Aliyun build(){
            return new Aliyun(this);
        }

    }

    /**
     * 调用Builder类
     */
    public static Builder options(){
/*
          创建对象
          Aliyun.Builder demo = new Builder();
          return demo;
          简化为一句
*/
        return new Aliyun.Builder();


    }

    /**
     * 有参构造方法
     */
    private Aliyun(Builder builder){
        this.appKey = builder.appKey;
        this.appSecret = builder.appSecret;
        this.bucket = builder.bucket;
        this.endPoint = builder.endPoint;
    }

    public String getAppKey() {
        return appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public String getBucket() {
        return bucket;
    }

    public String getEndPoint() {
        return endPoint;
    }

    @Override
    public String toString() {
        return "Aliyun{" +
                "appKey='" + appKey + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", bucket='" + bucket + '\'' +
                ", endPoint='" + endPoint + '\'' +
                '}';
    }
}
