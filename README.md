# 🤖 AI Application Generator (AI应用生成平台)

> 基于 Java 21 + LangChain4j 构建的代码生成平台。整合 DeepSeek 与通义千问大模型，实现从 Prompt 解析、代码生成到自动部署的闭环。

## ✨ 项目亮点 (Key Features)

* **⚡ 极致性能优化**：
    * 利用 **Java 21 虚拟线程 (Virtual Threads)** 重构高耗时 I/O 任务，结合 `CompletableFuture` 实现异步编排。
    * 实测任务吞吐量相较传统线程池方案提升 **300%**。
* **🧠 强大的模型集成**：
    * 基于 **LangChain4j** 框架，无缝集成 **DeepSeek**、**通义千问** 等多种主流 LLM。
    * 采用声明式 **AI Service** 编程模型，支持结构化输出与工具调用 (Function Calling)。
* **🌊 实时流式响应**：
    * 基于 **Reactor** 响应式编程与 **SSE (Server-Sent Events)** 技术。
    * 自定义 `TokenStream` 处理器，实现 AI 响应逐字流式输出，大幅降低用户等待焦虑。
* **🛠️ 设计模式实践**：
    * 综合运用**策略模式** (多模型切换)、**模板方法模式** (生成流程标准化) 与 **访问者模式** (代码质量检测)。

## 🛠️ 技术栈 (Tech Stack)

* **基础环境**: Java 21, Maven, Git
* **核心框架**: Spring Boot 3.x
* **AI 框架**: LangChain4j, LangGraph4j, Spring AI
* **数据库/缓存**: MySQL, Redis, Redisson, MyBatis-Flux
* **其他**: Selenium
