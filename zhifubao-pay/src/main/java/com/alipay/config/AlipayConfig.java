package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092800612820";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCLgCzIuPWs0uiR/FQiccdw9LGIide+tADVFRb6DS4/n9ssIqOW4N87h59T/AcNOJ5/kQcgHvkqljCSwsLuEjCaJc0K1NkvAdO8NIe70YUqcMG7oEQGp+SqwVgrD7caex80xRbUyW8mP33ebVGxaNti78pPlHKmYvbUbSD21PKjoLFeUpgAimOKobA3TjJjTe41SivfjCknZ93Dfw+QPVws7GSEnG0biEoNfducQ7XISia4rViCpVjGX3ZYNT9mun7wM+jqKfw/4sdjHOCqeVCBSPT5vg7Tesm5JaLawda9XrNQzxDoMy3wHGXyF8jXAvOyJdztpfuUcG0lQOz2TUmhAgMBAAECggEBAIEHu2Slf8etBSUSqZd6eikGi7dpGD7yK9rruObsjhyXdZgrKfkCYjijx0FdWgBmoGQJ9vdE7t7vMFpu/vJJrN7HnBIqsgACxp/MTsfwkiWhSfCL2p/1Z1Jxp2WdEZXS0Bh1PBrxfnd4Pqofn3JjNJkchpp5ClrQKtJtZhIpAY1KUOnnkRGCDrnUFn7O65oZIP33k+qBRP6A4CdJ7Dt7UJUTKr39ALNi8gf9gB+4GRY5NtxH3dcTbseO/wKW87rJDCYLueRSy/DP9wgbll+rPzmNNY8aVj52HF1250HQe+AqFsdSIA7w8DrP8QKe+cBMS1nyoNF/XDWM3ah6nY4m4CkCgYEA3eGvBb6jXOhaLPxRchT0UZnAK/7PpfX8AMXBXiaRsCNr5dLi3NrOEf6/EsTjjvA9rgTkr4GVanCWEkFd9cusCiCivHKTsJVbWVd/4KkrIOPSyP9SHkmlTpLZQzMHa4FWnISTUXZv7Bwo042zZScM8SZRwGWYQgxtuDeiML1JtacCgYEAoPOWMC63T8NEbaeZ6RJ83t92S3Jnw5jqM2WA/+pgteRwwpkQCL8jA99HYNHM0aLNPv/Ba9Cd+2oPD/lSOPwCONh8qGZngpx3XZdyvbAHJgZuS4yepU2z9DzyMGdCJx7ZgxC/ClEQECxIUrinIXrGMlwh1wAtOOxsrYYGS640f3cCgYEAgfL+nb+0T+KphbVVQhpxqSUCPwIivVFfAVjQ0oKGSwHD3LtxMOZZUILBh42WtQ2RIk0tXnjneIpt6k0saZuaq+fHR9VXGFGxSZcMhxis8LtdpWibwK9jSKyK4GePjfAXON4QpeJW1JL9ekGActq3IrlNogAed3ht/jlfHWqPM/sCgYB6p4ahq0go8b647ctdkag1VAfbERFAPszjZAv9eog+tRq1QV21vKsbbVEA2IEElNNimha1aeKq0LUv0Ck3odyzo07EKl3hbAmO+jYHlhisgqQU0NGpWWC01Kkf9+Cy3VCXD/D2FLZwDL8EwxEic2SMxidHqCvOQGXFiuhLTjNVmwKBgQCbs1FmLuk8LyfYimXTMIJZT4E21DyZM7e1b7D4rWAKLtk9F1w8lzbQRdkGYDR/EHUf/zXJ7WDXk0FWO2Aj/H5JnHvnNi+8ofcp14tnuJuZSi79HZqyySRx3uqY74YjVzQmK0mxoc7A57CyXRu7/J0x9ihH37ywNfKP9alulb17NA==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1m7BhQriyI7NpzYp18O65xvR2QeLQ3oYoL5KO1W5z9lkFCUEPl7KK1DsNBZKWTNje2vtlZZSflon4nvWVdtczVMpgnEtV0P0SrRnG0hXct6IDiqS6MVKqXpFxizBIeJbC35hYgvlZ+hZKQ7itM7By2JmllVZflUNtKYOijmHOe84cH6e6GTSJ09qAd69PmaAk8hH1mzqJwI4ruE3X6V22yxmp5nOMqpcqjtzSe/0Diizy+8dljB9lhXs7kEx6NdeD1NolV5XSGaXaVEPdgZAifxlO6OVo8MvXLAtfWdZiQmTk1CZZkPL4XwRbjEkGf9Id0/g5S5nLwIoqC5qFl+8HQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8989/zhifubao/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8989/zhifubao/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

