# LogHelper
基于Logger 的一个日志框架,动态设置最大文件数量。每个文件最大的大小。


# 前言

只是基于 开源项目 Logger 二次开发，但是存在新能开销，如果对手机性能有要求，建议查看 [基于微信XLog的日志框架&&对于XLog的分析](https://allens.icu/posts/60625924/#more)

> 建议在 [博客说明](https://allens.icu/posts/f4408143/#more) 中查看 阅读体验更佳

# 效果展示

log 文件如下图所示

![2020-06-04-15-06-10-1591254370](http://allens-blog.oss-cn-beijing.aliyuncs.com/allens-blog/f0h1y.png)

# Download

## Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```
allprojects {
	repositories {
		maven { url 'https://www.jitpack.io' }
	}
}
```
## Step 2. Add the dependency

```
dependencies {
        implementation 'com.github.JiangHaiYang01:LogHelper:0.0.2'
}

```

当前最新版本 [![](https://www.jitpack.io/v/JiangHaiYang01/LogHelper.svg)](https://www.jitpack.io/#JiangHaiYang01/LogHelper)

# Usage

## 初始化

默认保存在 沙盒位置， 不需要任何权限。

```
LogHelper.init(this, true)
```

可自行设置文件大小，最大文件数量 以及文件所在位置，
```
LogHelper.init(this,"path",5,6,true)
```


## 记录日志到本地

```
LogHelper.i("记录日志")

LogHelper.d("debug");
LogHelper.e("error");
LogHelper.w("warning");
LogHelper.v("verbose");
LogHelper.i("information");
LogHelper.wtf("What a Terrible Failure");
LogHelper.d("hello %s", "world");
```

这边是基于 Logger 开源项目进行二次封装。所以用法也和Logger 完全相同


# 源码

[Github](https://github.com/JiangHaiYang01/LogHelper)
[博客说明](https://allens.icu/posts/f4408143/#more)



# License

```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
