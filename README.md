# grpc-demo
1. 通过 Protobuf 生成消息载体和对应语言的 server、client
2. client 和 server 的通信都有单次和数据流两种形式，所以一种 4 中形式
3. 有 maven, gradle, bazel 三种方式都有插件可以方便的编译 Protobuf
4. 如果 Protobuf generated files 不在 Source folder, 可以在 Project structure ->
Module 中手动设置
5. IDEA 有 maven 视图可以直接 `compile`
