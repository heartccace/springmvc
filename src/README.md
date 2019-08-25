####运行方式####
1. 导入所需依赖包
2. CMD命令下到到项目中根目录下运行 mvn -Dmaven.test.skip -U clean package
3. 到target目录下，使用java -jar 运行 springmvc-1.0-SNAPSHOT-war-exec.jar
3. 访问localhost:8080

处理器管理
------------------------------------
    映射: HandlerMapping
        映射请求(Request)到处理器(Handler)加上其关键的拦截器(HandlerInterceptor)列表, 其映射关系基于不同的
        HandlerMapping实现的一些标准细节。其中主要两种HandlerMapping实现，RequestmappingHandlerMapping
        支持标注@RequestMappig的方法，SimpleUrlHandlerMapping维护精确的URL路径与处理器的映射。
    适配: HandlerAdapter
    执行: HandlerExecutionChain
    
页面渲染
---------------------------------------
    视图解析: ViewResolver
    国际化: LocaleResolver、LocaleContextResolver
    个性化: ThemeResolver

异常处理
-------------------------------
    异常解析: HandlerExceptionResolver