package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.InterfaceC1187tm;
import p000.InterfaceC1224um;
import p000.b26;
import p000.f26;
import p000.h06;
import p000.i06;
import p000.l26;
import p000.o06;
import p000.p26;
import p000.pz5;
import p000.qz5;
import p000.sz5;
import p000.t16;
import p000.vz5;
import p000.x36;
import p000.y42;
import p000.zw5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementSdk {

    /* JADX INFO: renamed from: a */
    public final x36 f16258a;

    public AppMeasurementSdk(x36 x36Var) {
        this.f16258a = x36Var;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return x36.m12475e(context, null).f33962b;
    }

    public void beginAdUnitExposure(String str) {
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        x36Var.m12478c(new i06(x36Var, str, (byte) 0));
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        x36Var.m12478c(new vz5(x36Var, str, str2, bundle));
    }

    public void endAdUnitExposure(String str) {
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        x36Var.m12478c(new i06(x36Var, str, (byte) 1));
    }

    public long generateEventId() {
        return this.f16258a.m12481g();
    }

    public String getAppIdOrigin() {
        return this.f16258a.f33966f;
    }

    public String getAppInstanceId() {
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        zw5 zw5Var = new zw5();
        x36Var.m12478c(new o06(x36Var, zw5Var, (byte) 1));
        return (String) zw5.m13831G(zw5Var.m13832F(50L), String.class);
    }

    public List<Bundle> getConditionalUserProperties(String str, String str2) {
        return this.f16258a.m12480f(str, str2);
    }

    public String getCurrentScreenClass() {
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        zw5 zw5Var = new zw5();
        x36Var.m12478c(new o06(x36Var, zw5Var, (byte) 4));
        return (String) zw5.m13831G(zw5Var.m13832F(500L), String.class);
    }

    public String getCurrentScreenName() {
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        zw5 zw5Var = new zw5();
        x36Var.m12478c(new o06(x36Var, zw5Var, (byte) 3));
        return (String) zw5.m13831G(zw5Var.m13832F(500L), String.class);
    }

    public String getGmpAppId() {
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        zw5 zw5Var = new zw5();
        x36Var.m12478c(new o06(x36Var, zw5Var, (byte) 0));
        return (String) zw5.m13831G(zw5Var.m13832F(500L), String.class);
    }

    public int getMaxUserProperties(String str) {
        return this.f16258a.m12477b(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f16258a.m12476a(str, str2, z);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        x36Var.m12478c(new f26(x36Var, null, str, str2, bundle, true, true));
    }

    public void logEventNoInterceptor(String str, String str2, Bundle bundle, long j) {
        Long lValueOf = Long.valueOf(j);
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        x36Var.m12478c(new f26(x36Var, lValueOf, str, str2, bundle, true, false));
    }

    public void performAction(Bundle bundle) {
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        x36Var.m12478c(new h06(x36Var, bundle, new zw5()));
    }

    public Bundle performActionWithResponse(Bundle bundle) {
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        zw5 zw5Var = new zw5();
        x36Var.m12478c(new h06(x36Var, bundle, zw5Var));
        return zw5Var.m13832F(5000L);
    }

    public void registerOnMeasurementEventListener(InterfaceC1224um interfaceC1224um) {
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        y42.m12854a0(interfaceC1224um);
        ArrayList arrayList = x36Var.f33963c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (interfaceC1224um.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            p26 p26Var = new p26();
            p26Var.f27331a = interfaceC1224um;
            VarHandle.storeStoreFence();
            arrayList.add(new Pair(interfaceC1224um, p26Var));
            if (x36Var.f33967g != null) {
                try {
                    x36Var.f33967g.registerOnMeasurementEventListener(p26Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            x36Var.m12478c(new b26(x36Var, p26Var, (byte) 0));
        }
    }

    public void setConditionalUserProperty(Bundle bundle) {
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        x36Var.m12478c(new sz5(x36Var, bundle));
    }

    public void setCurrentScreen(Activity activity, String str, String str2) {
        pz5 pz5VarM9692a = pz5.m9692a(activity);
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        x36Var.m12478c(new vz5(x36Var, pz5VarM9692a, str, str2));
    }

    public void setEventInterceptor(InterfaceC1187tm interfaceC1187tm) {
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        l26 l26Var = new l26();
        VarHandle.storeStoreFence();
        if (x36Var.f33967g != null) {
            try {
                x36Var.f33967g.setEventInterceptor(l26Var);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w("FA", "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        x36Var.m12478c(new sz5(x36Var, l26Var));
    }

    public void setUserProperty(String str, String str2, Object obj) {
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        x36Var.m12478c(new qz5(x36Var, str, str2, obj, true));
    }

    public void unregisterOnMeasurementEventListener(InterfaceC1224um interfaceC1224um) {
        Pair pair;
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        y42.m12854a0(interfaceC1224um);
        ArrayList arrayList = x36Var.f33963c;
        synchronized (arrayList) {
            int i = 0;
            while (true) {
                try {
                    if (i >= arrayList.size()) {
                        pair = null;
                        break;
                    } else {
                        if (interfaceC1224um.equals(((Pair) arrayList.get(i)).first)) {
                            pair = (Pair) arrayList.get(i);
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                Log.w("FA", "OnEventListener had not been registered.");
                return;
            }
            arrayList.remove(pair);
            p26 p26Var = (p26) pair.second;
            if (x36Var.f33967g != null) {
                try {
                    x36Var.f33967g.unregisterOnMeasurementEventListener(p26Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            x36Var.m12478c(new b26(x36Var, p26Var, (byte) 1));
        }
    }

    public final void zza(boolean z) {
        x36 x36Var = this.f16258a;
        x36Var.getClass();
        x36Var.m12478c(new t16(x36Var, z));
    }

    @Deprecated
    public void setMeasurementEnabled(boolean z) {
    }

    @Deprecated
    public static AppMeasurementSdk getInstance(Context context, String str, String str2, String str3, Bundle bundle) {
        return x36.m12475e(context, bundle).f33962b;
    }

    @Deprecated
    public void setConsent(Bundle bundle) {
    }

    @Deprecated
    public void setMeasurementEnabled(Boolean bool) {
    }
}
