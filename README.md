[![HitCount](http://hits.dwyl.com/JiangHaiYang01/LogHepler.svg)](http://hits.dwyl.com/JiangHaiYang01/LogHepler)   [![](https://www.jitpack.io/v/JiangHaiYang01/LogHelper.svg)](https://www.jitpack.io/#JiangHaiYang01/LogHelper)
# LogHelper
基于Logger 的一个日志框架,动态设置最大文件数量。每个文件最大的大小。



# Overview

log 文件如下图所示

![2020-06-04-15-06-10-1591254370](https://allens-blog.oss-cn-beijing.aliyuncs.com/uPic/2020-06-04-15-06-10-1591254370%20.png)

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
        implementation 'com.github.JiangHaiYang01:LogHelpe:0.0.1'
}

```

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
