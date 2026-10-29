package org.chromium.net;

import android.net.TrafficStats;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.xy4;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ThreadStatsUid {
    private static final Method sClearThreadStatsUid;
    private static final Method sSetThreadStatsUid;

    static {
        try {
            sSetThreadStatsUid = TrafficStats.class.getMethod("setThreadStatsUid", Integer.TYPE);
            sClearThreadStatsUid = TrafficStats.class.getMethod("clearThreadStatsUid", null);
        } catch (NoSuchMethodException | SecurityException e) {
            xy4.m12785n("Unable to get TrafficStats methods", e);
        }
    }

    public static void clear() {
        try {
            sClearThreadStatsUid.invoke(null, null);
        } catch (IllegalAccessException e) {
            xy4.m12785n("TrafficStats.clearThreadStatsUid failed", e);
        } catch (InvocationTargetException e2) {
            xy4.m12785n("TrafficStats.clearThreadStatsUid failed", e2);
        }
    }

    public static void set(int i) {
        try {
            sSetThreadStatsUid.invoke(null, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            xy4.m12785n("TrafficStats.setThreadStatsUid failed", e);
        } catch (InvocationTargetException e2) {
            xy4.m12785n("TrafficStats.setThreadStatsUid failed", e2);
        }
    }
}
