创建参考地址:

一定要做好web的配置,否则启动会报找不到资源.

https://www.cnblogs.com/gen9201117/p/9360805.html

转换地址是:CommoConfig.java ——> viewResolver 方法或者是在 properties 文件中的 spring.mvc.view.xxx 配置.

还有访问地址的方法:addResourceHandlers 即可.

CommoConfig 和 prooperties 中,只需要存在一个即可.