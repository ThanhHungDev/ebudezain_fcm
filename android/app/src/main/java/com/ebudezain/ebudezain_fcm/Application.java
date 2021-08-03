package com.ebudezain.ebudezain_fcm;

import io.flutter.app.FlutterApplication;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.common.PluginRegistry.PluginRegistrantCallback;
import io.flutter.plugins.GeneratedPluginRegistrant;
import io.flutter.plugins.firebasemessaging.FlutterFirebaseMessagingService;

public class Application extends FlutterApplication implements PluginRegistrantCallback {
    @override
    public void onCreate() {
        super.onCreate();
        FlutterFirebaseMessagingService.setPluginRegistrant(this);
    }

    @override
    public void registerWith(PluginRegistry registry) {
        GeneratedPluginRegistrant.registerWith(registry);
    }
}

//
//import io.flutter.app.FlutterApplication;
//import io.flutter.plugin.common.PluginRegistry;
//import io.flutter.plugin.common.PluginRegistry.PluginRegistrantCallback;
//import io.flutter.plugins.GeneratedPluginRegistrant;
//import io.flutter.plugins.firebasemessaging.FlutterFirebaseMessagingService;
//import io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin;
//import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
//
//public class Application extends FlutterApplication implements PluginRegistrantCallback {
//
//    @Override
//    public void onCreate() {
//        super.onCreate();
//        FlutterFirebaseMessagingService.setPluginRegistrant(this);
//    }
//
//    @Override
//    public void registerWith(PluginRegistry registry) {
//        FirebaseCloudMessagingPluginRegistrant.registerWith(registry);
//    }
//}
//
//package org.your.app;
//
//import io.flutter.app.FlutterApplication;
//import io.flutter.plugin.common.PluginRegistry;
//import io.flutter.plugin.common.PluginRegistry.PluginRegistrantCallback;
//import io.flutter.plugins.GeneratedPluginRegistrant;
//import
//        io.flutter.plugins.firebasemessaging.FlutterFirebaseMessagingService;
//
//public class Application extends FlutterApplication implements
//        PluginRegistrantCallback {
//    @override
//    public void onCreate() {
//        super.onCreate();
//        FlutterFirebaseMessagingService.setPluginRegistrant(this);
//    }
//
//    @override
//    public void registerWith(PluginRegistry registry) {
//        GeneratedPluginRegistrant.registerWith(registry);
//    }
//}