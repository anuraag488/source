package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import java.lang.invoke.VarHandle;
import p000.az4;
import p000.d76;
import p000.oa6;
import p000.xk5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends az4 {

    /* JADX INFO: renamed from: c */
    public xk5 f16256c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f16256c == null) {
            xk5 xk5Var = new xk5((byte) 26);
            VarHandle.storeStoreFence();
            this.f16256c = xk5Var;
        }
        d76 d76Var = oa6.m9017q(context, null, null).f26514f;
        oa6.m9016l(d76Var);
        if (intent == null) {
            d76Var.f16838m.m12504a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        d76Var.f16831L.m12505b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                d76Var.f16838m.m12504a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        d76Var.f16831L.m12504a("Starting wakeful intent.");
        SparseArray sparseArray = az4.f14968a;
        synchronized (sparseArray) {
            try {
                int i = az4.f14969b;
                int i2 = i + 1;
                az4.f14969b = i2;
                if (i2 <= 0) {
                    az4.f14969b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
