# rocketmq-demo 环境搭建
## 1. 下载rocketmq-all-4.7.0-bin-release
## 2. 添加环境变量: 
    ROCKETMQ_HOME D:\rocketmq-all-4.7.0-bin-release
## 3. 修改runserver.cmd和runbroker.cmd中的参数(调小参数值):
    set "JAVA_OPT=%JAVA_OPT% -server -Xms64m -Xmx64m -Xmn64m"
## 4. 启动 mqnamesrv.cmd 
    start mqnamesrv.cmd
## 5. 启动mqbroker.cmd
    start mqbroker.cmd -n localhost:9876
## 6. 启动Consumer.main()
## 7. 启动Producer.main()