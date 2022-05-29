## IAaaS: Intelligent Accommodation as a Service —— 智慧住宿即服务

![](https://img.shields.io/badge/language-Java-orange.svg)
![](https://img.shields.io/badge/backend_frame-Spring_Boot-6db33f.svg)
![](https://img.shields.io/badge/ORM-MyBatis-red.svg)
![](https://img.shields.io/badge/frontend_frame-Vue_3.0-4fc08d.svg)
![](https://img.shields.io/badge/components-Ant_Design-348dfe.svg)
![](https://img.shields.io/badge/deploy-Docker-blue.svg)
![](https://img.shields.io/badge/miniprogram_frame-Taro-0000c2.svg)
![](https://img.shields.io/badge/license-Apache_2.0-green.svg)

----

### 一、项目介绍

本项目设计并实现了一种智慧住宿即服务的解决方案，旨在解决房地产类企业为学生提供住宿服务时，遇到的集团化管理存在的以下问题：

* 多：企业同时需要对多栋公寓楼多个房间多位住户进行管理和服务，事务繁多
* 重：公寓里的每栋楼每层楼每个房间都需要企业安排大量人力去运营和管理
* 低：企业/公寓里很多办事流程存在沟通和审批成本，效率较为低下
* 散：多栋公寓间栋资源分布较为散乱，较难统一管理
* 慢：每栋公寓数据无法做到实时同步，实效性慢

本项目基于Web开发技术，结合人工智能、区块链等计算机技术，以多终端的形式为住宿类企业提供一套高度自动化的智能解决方案，协助企业更好更便捷地管理企业内部人员，并赋能客户服务。

### 二、项目模块

```text
IAaaS
|———— 统一后台服务
|———— Web端服务
    |———— 客户端
    |———— 企业管理端
|———— 移动端服务
    |———— 小程序端
        |———— 客户端
    |———— 移动App端
        |———— 客户端
        |———— 企业管理端
```

### 三、技术选型

#### 1、后台服务

| 技术            | 说明          |
|---------------|-------------|
| SpringBoot    | 后台框架        |
| MyBatis       | ORM框架       |
| PageHelper    | MyBatis分页插件 |
| Druid         | 数据库连接池      |
| Jenkins       | 自动化部署工具     |
| Swagger-UI    | 文档生成工具      |
| MySQL         | 关系型数据存储     |
| Redis         | 缓存存储        |
| Elasticsearch | 搜索引擎        |

#### 2、Web前端

| 技术     | 说明       |
|--------|----------|
| Vue.js | 前端框架     |
| Antd   | 前端组件库    |
| echart | 前端可视化组件库 |

#### 3、微信小程序端/移动App端

| 技术   | 说明          |
|------|-------------|
| Taro | 跨端跨框架开发解决方案 |

### 四、系统架构
#### 1、业务架构
待更新
#### 2、系统服务架构
待更新

### 五、功能概览
#### 1、企业端
* 公寓楼管理
* 企业人员管理

（其他功能开发中）

#### 2、客户端
待更新

---

### 开源许可证
[Apache License 2.0](https://github.com/weiyuchens/IAaaS/blob/master/LICENSE)

Copyright (c) 2022-2023 weiyuchen