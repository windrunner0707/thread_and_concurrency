###并发编程练习,网课知识总结   

项目中的自定义注解:   
自定义注解中使用了@Retention(RetentionPolicy.SOURCE)表示该注解生命周期只在Java源文件这一阶段,仅做提示用   
注解共2类   
1.Recommend表示是否提倡这样做   
2.ThreadSafe表示这样做是否是线程安全的   
