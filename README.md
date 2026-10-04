# java-study

Java 学习仓库。按知识点分包，每个知识点配单元测试和讲解卡。

## 当前进度

| 单元 | 主题 | 状态 |
| --- | --- | --- |
| 000 | 工具链与阅读指南 | 已完成 |
| 001 | 集合框架 | 待开始 |
| 002 | 泛型 | 待开始 |
| 003 | 异常处理 | 待开始 |
| 004 | IO 与 NIO | 待开始 |
| 005 | 面向对象设计（接口、多态、设计模式入门） | 待开始 |
| 006 | 并发与线程 | 待开始 |
| 007 | 工程化与数据库（JUnit、日志、JDBC） | 待开始 |

## 环境要求

- JDK 17（本机路径 `C:\Program Files\Java\jdk-17`）
- Maven 3.9.16（本机路径 `E:\apache-maven-3.9.16`）

## 常用命令

```
mvn clean test      编译并运行全部单元测试
mvn clean package   打包到 target/
java -cp target/classes study.basics.HelloJava   运行第 0 单元的示例
```

## 在 Eclipse 中使用

`File → Import… → Maven → Existing Maven Projects`，选择本目录。不要用"新建 Java 项目"的方式打开。

## 目录约定

- `src/main/java` 主源码，包名按知识点划分
- `src/test/java` 单元测试，包名与主源码一一对应
- `docs/` 每个单元的讲解卡

## 许可

MIT
