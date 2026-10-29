package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import p000.og6;
import p000.oy5;
import p000.pz5;
import p000.rg1;
import p000.vz5;
import p000.x36;
import p000.y42;
import p000.y62;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b */
    public static volatile FirebaseAnalytics f16301b;

    /* JADX INFO: renamed from: a */
    public x36 f16302a;

    public static FirebaseAnalytics getInstance(Context context) {
        if (f16301b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f16301b == null) {
                        x36 x36VarM12475e = x36.m12475e(context, null);
                        FirebaseAnalytics firebaseAnalytics = new FirebaseAnalytics();
                        y42.m12854a0(x36VarM12475e);
                        firebaseAnalytics.f16302a = x36VarM12475e;
                        VarHandle.storeStoreFence();
                        f16301b = firebaseAnalytics;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16301b;
    }

    public static og6 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        x36 x36VarM12475e = x36.m12475e(context, bundle);
        if (x36VarM12475e == null) {
            return null;
        }
        oy5 oy5Var = new oy5();
        oy5Var.f27239a = x36VarM12475e;
        VarHandle.storeStoreFence();
        return oy5Var;
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) y62.m12983n(rg1.m10328d().m10331c(), 30000L);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        x36 x36Var = this.f16302a;
        pz5 pz5VarM9692a = pz5.m9692a(activity);
        x36Var.getClass();
        x36Var.m12478c(new vz5(x36Var, pz5VarM9692a, str, str2));
    }
}
