package com.ashkin.findfriends.app;

import android.app.Activity;
import android.app.Application;

import com.ashkin.findfriends.util.LogUtil;

import java.util.ArrayList;

/**
 * Application 介绍
 * <p>
 * 一.
 * Application 和 Activity、Service 一样是 android 框架的一个系统组件。
 * 当 android 程序启动时系统会创建一个 application 对象，用来存储系统的一些信息。
 * 通常我们是不需要指定一个 Application 的，这时系统会自动帮我们创建。
 * 如果需要创建自己的 Application，也很简单：
 * 创建一个类继承Application并在 AndroidManifest.xml 的application标签中进行注册。
 * (只需要给 Application 标签增加个 name 属性把自己的 Application的名字定入即可)。
 * Android 系统会为每个程序运行时创建一个 Application 类的对象且仅创建一个，
 * 所以 Application 可以说是单例(singleton)模式的一个类。
 * 且 Application 对象的生命周期是整个程序中最长的，它的生命周期就等于这个程序的生命周期。
 * 因为它是全局的单例的，所以在不同的 Activity,Service 中获得的对象都是同一个对象。
 * 所以通过Application来进行一些，数据传递、数据共享、数据缓存等操作。
 * <p>
 * 二.程序的入口
 * Android 使用 Google Dalvik VM，相对于传统 Java VM 而言有着很大的不同，
 * 在 Sun 的 Java 体系中入口点和标准 c 语言一样是 main()，
 * 而每个 Android 程序都包含着一个 Application 实例，
 * 一个 Application 实例中有多个 Activity、Service、ContentProvider 或 Broadcast Receiver。
 * 其实在android.app.Application这个包的onCreate才是真正的Android入口点，只不过大多数开发者无需重写该类。
 * <p>
 * <p>
 * 第一步、
 * 写一个全局的单例模式的 MyApplication 继承自 Application 重写onCreate
 * <p>
 * 第二步、配置全局的 Context
 * <application
 * android:name=".app.FindFriendsApp">
 * </application>
 */

/**
 * 自定义的 Application，继承自 Application
 */
public class FindFriendsApp extends Application {

    public static final String TAG = "FindFriendsApp";

    private static ArrayList<Activity> activities = new ArrayList<>();

    public FindFriendsApp() {

    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    /**
     * 添加一个 Activity 对象到 activities 集合
     * add a activity to activities
     * @param activity Activity object
     */
    public static void addActivity(Activity activity) {
        LogUtil.i(TAG, "addActivity : " + activity.getComponentName());

        activities.add(activity);
    }

    /**
     * 从 activities 集合中删除 Activity
     * remove a activity from activities
     * @param activity Activity object
     */
    public static void removeActivity(Activity activity) {
        LogUtil.i(TAG, "removeActivity : " + activity.getComponentName());

        activities.remove(activity);
    }

    /**
     * 遍历 activities 集合并调用每个 Activity 对象的 finish() 方法
     * find all activity from activities and call their finish()
     */
    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                LogUtil.i(TAG, "finishActivity : " + activity.getComponentName());

                activity.finish();
            }
        }
    }
}
