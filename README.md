### 参考：
[Android N App分屏模式完全解析](http://unclechen.github.io/2016/03/12/Android%20N%20App%E5%88%86%E5%B1%8F%E6%A8%A1%E5%BC%8F%E5%AE%8C%E5%85%A8%E8%A7%A3%E6%9E%90-%E4%B8%8A%E7%AF%87/)


Android的分屏模式开发注意事项
android7.0 的API开始有了分屏功能，在测试时注意到主页面在分屏模式下，页面所占比例在增大或者减小的时候都会调用oncreat方法，所以查资料总结一下分屏对页面的生命周期的影响以及开发时的注意事项：

App页面从全屏模式切换到分屏模式，会经历销毁后重建的过程，所以它的Activity生命周期会从oncreat(）重新走一遍。

1、禁用分屏模式
一般情况下，App默认都允许分屏模式。但有的开发者认为自己的App只有在全屏状态下才能正常使用，要是被分屏的话用起来会很难受，这时候就得对该App禁用分屏模式。具体操作是在AndroidManifest.xml的application节点添加属性android:resizeableActivity="false"，表示应用页面不接受分屏；如此一来，即使用户开启了分屏模式，切换到该应用时仍会强制回到全屏模式。

2、分屏切换时Activity的生命周期
App页面从全屏模式切换到分屏模式，它的Activity生命周期会经历销毁后重建的过程，如果开发者想保持App页面在分屏前的模样，则需给该页面的activity节点加上以下的属性描述 android:configChanges="screenLayout|orientation"

3、分屏在视频播放时的注意事项
对于视频播放页面，需要在它的activity节点加上如下属性描述，android:configChanges="screenLayout|orientation"
对于视频播放页面，建议Activity代码不在onPause方法中暂停播放视频，而应当在onStop方法中暂停播放，并在onStart方法中恢复播放视频，以避免无谓的资源浪费

4、获取分屏模式的状态及状态切换的监听
App运行过程中，若想获知当前是否处于分屏模式，则可调用isInMultiWindowMode方法，该方法返回true表示处于分屏模式，返回false表示处于全屏模式。
每当进入多窗口，或者退出多窗口的时候，应用会触发Activity页面的onMultiWindowModeChanged方法。通过重载该方法，开发者可以即时收到分屏与全屏的切换通知。
