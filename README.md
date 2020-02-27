# BaseStructure

spring boot jpa 项目基础模板，包含spring boot jpa项目的常用文件、工具类和目录结构，用于快速构建一个spring boot项目

## 项目结构

    └─src
        └─main 
            ├─java 
            │  └─base
            │      │  Application.java
            │      │
            │      ├─common //存放公用类
            │      │  │  ResultBuilder.java
            │      │  │
            │      │  └─entity
            │      │          ResultValue.java
            │      │
            │      ├─config
            │      │      Swagger2Config.java
            │      │
            │      ├─controller //控制层
            │      ├─dao // dao层，存放持久化层文件
            │      ├─dto // dto，存放前后端交互实体类
            │      ├─entity // 存放持久化实体类
            │      ├─enums // 存放枚举类
            │      │      ExceptionEnum.java
            │      │
            │      ├─exception
            │      │      FlyException.java
            │      │
            │      ├─handler
            │      │      FlyExceptionHandler.java
            │      │
            │      ├─service // 存放service层接口
            │      │  └─impl // 存放service层接口实现
            │      └─util // 存放工具类
            │              DateTimeUtil.java
            │              FileUtil.java
            │
            └─resources
                    application.yml
                    
## 使用
下载后可直接在基础项目上开发
##### 1、下载

    git pull git@github.com:newbby123/BaseStructure.git

或者下载我打包好的[maven archrttype]()

