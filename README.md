# Design_Pattern_2020
Design Pattern Course Design of Software School of Tongji University 2020

## Dependency

gradle 

## JetBrain Usage

use `Edit configurations`.

## Commandline Usage

### Test All

```
$ ./gradlew test
```

### Test A Method

```
$ ./gradlew test --tests com.github.tongjisserollman.iceamusementpark.patternname.PatternTest.TestMethod
```

### Run Main

```
$ ./gradlew run
```

## Project Structure

```
Design_Pattern_2020                                 
├─ LICENSE                                                 // MIT
├─ README.md                                               // this file
└─ src
   ├─ main
   │ └─ java
   │     └─ com/github/tongjisserollman/iceamusementpark   // parent package        (lower)   
   │        ├─ builder                                     // pattern name package  (lower)
   │        │  ├─ Smoothie.java                            // use case class        (KamelCase)
   │        │  └─ SmoothieBuilder.java                     // use case class        (KamelCase)
   │        ├─ Main.java                                   // Main Class
   │        └─ util                                        // tool package
   │           └─ Utils.java                               // tool class, logger within
   └─ test                                                 //
      └─ java                                              //
         └─ com/github/tongjisserollman/iceamusementpark   //
            └─ builder                                     // pattern name package  (lower)
               └─ SmoothieTest.java                        // use case test class   (KamelCase)

```

## Code Style

[Alibaba](https://github.com/alibaba/Alibaba-Java-Coding-Guidelines.git)
