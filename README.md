# Design_Pattern_2020 

同济大学软件学院 2020-2021 学年 第 1 学期设计模式课程小组项目

[English Version](https://github.com/TongjiSSERollMan/Design_Pattern_2020/commits/master/README-eng.md)

## 项目依赖

Gradle 

## 关于 JetBrain 配置

使用 `Edit configurations` 编辑配置。

## 编写代码时的注意事项

### 代码风格

[阿里巴巴 Java 编写指南](https://github.com/alibaba/Alibaba-Java-Coding-Guidelines.git)

文件命名方式参见下文项目结构。

### 用例类

所有游乐设施请继承 `FacilityTemplate` 类。'

在类方法中记得加入 `CallStackLogger`，格式如下：

```Java
CallStackLogger.log(
        new CallStackLogInfo(
                "$类名",
                "$方法名",
                String.valueOf(System.identityHashCode(this)),
                "$对方法功能的描述"
        )
);
```

### 测试类

测试类命名时需要带有 “Test” 字样，供 `Gradle` 识别。 

测试类应当包含 Assert 语句。Junit 提供的 Assert 语句参见
[此文档](https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html)
。

## 关于命令行

### 文字编码

本项目使用 UTF-8 作为文字编码，项目的输出统一为中文。

Win10 自带的命令行工具 `cmd` 和 `Powershell` 默认使用 GBK 编码，在运行本项目时命令行中的输出可能会变成乱码
（如果没有出现乱码，可以跳过本段）。

**注意： Win10 支持修改系统默认编码，但直接将系统默认编码改为 UTF-8 可能导致若干软件出错。**

在 `Powershell` 中输入下列命令可以将 `cmd` 的默认编码改为 UTF-8：
 
```
> Set-ItemProperty 'HKCU:\Software\Microsoft\Command Processor' AutoRun 'chcp 65001 >NUL'
```

要回滚前述操作，可以在 `Powershell` 中输入下列命令：

```
> Set-ItemProperty 'HKCU:\Software\Microsoft\Command Processor' AutoRun ''
```

### 运行全部测试

```
$ ./gradlew test
```

### 运行对特定方法的测试

```
$ ./gradlew test --tests com.github.tongjisserollman.iceamusementpark.patternname.PatternTest.TestMethod
```

### 运行 Main 方法

```
$ ./gradlew run
```

## 项目结构

```
Design_Pattern_2020                                 
├─ LICENSE                                                 // MIT 协议
├─ README.md                                               // 本文档
└─ src
   ├─ main
   │ └─ java
   │     └─ com/github/tongjisserollman/iceamusementpark   // 项目父包  （全小写）  
   │        ├─ builder                                     // 设计模式包 （全小写）
   │        │  ├─ Smoothie.java                            // 用例类  （大驼峰）
   │        │  └─ SmoothieBuilder.java                     // 用例类  （大驼峰）
   │        ├─ Main.java                                   // 主类
   │        └─ util                                        // 工具包
   │           └─ Utils.java                               // 工具类，包含了 CallStackLogger 
   └─ test                                                 //
      └─ java                                              //
         └─ com/github/tongjisserollman/iceamusementpark   //
            └─ builder                                     // 设计模式包  （全小写）
               └─ SmoothieTest.java                        // 测试用例类  （大驼峰）

```
