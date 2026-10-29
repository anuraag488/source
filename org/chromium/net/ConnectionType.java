package org.chromium.net;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
public @interface ConnectionType {
    public static final int CONNECTION_2G = 3;
    public static final int CONNECTION_3G = 4;
    public static final int CONNECTION_4G = 5;
    public static final int CONNECTION_5G = 8;
    public static final int CONNECTION_BLUETOOTH = 7;
    public static final int CONNECTION_ETHERNET = 1;
    public static final int CONNECTION_LAST = 8;
    public static final int CONNECTION_NONE = 6;
    public static final int CONNECTION_UNKNOWN = 0;
    public static final int CONNECTION_WIFI = 2;
}
