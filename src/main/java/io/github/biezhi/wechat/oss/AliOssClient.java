package io.github.biezhi.wechat.oss;

import com.aliyun.oss.OSSClient;

import java.io.File;

/**
 * @author Ma.Qiang
 * 2017/12/6
 */
public class AliOssClient {


    public static void uploadImg(File file, String key) {
        // endpoint以杭州为例，其它region请按实际情况填写
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建
        String accessKeyId = "LTAInjaASTuXAQjC";
        String accessKeySecret = "HES6t6D1RxJf9hJ6biT322hlUE8JlG";
// 创建OSSClient实例
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
// 上传文件
        ossClient.putObject("mars-chariot", key, file);
// 关闭client
        ossClient.shutdown();
    }
}
