package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p000.C0805jo;
import p000.C1077qn;
import p000.a02;
import p000.ar1;
import p000.az5;
import p000.bf6;
import p000.bh6;
import p000.d76;
import p000.dd6;
import p000.dn6;
import p000.dy5;
import p000.e66;
import p000.ea6;
import p000.eh6;
import p000.ex5;
import p000.fe6;
import p000.gd6;
import p000.iw5;
import p000.iz5;
import p000.ja6;
import p000.jl6;
import p000.ly5;
import p000.mg6;
import p000.mz5;
import p000.oa6;
import p000.oe6;
import p000.ol6;
import p000.op5;
import p000.os5;
import p000.oz5;
import p000.pq3;
import p000.pz5;
import p000.qx5;
import p000.rn6;
import p000.se6;
import p000.td6;
import p000.tq5;
import p000.tt2;
import p000.uh6;
import p000.v23;
import p000.wg6;
import p000.x66;
import p000.y42;
import p000.yb6;
import p000.yd6;
import p000.yj5;
import p000.ys5;
import p000.zs5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementDynamiteService extends ex5 {

    /* JADX INFO: renamed from: a */
    public oa6 f16259a;

    /* JADX INFO: renamed from: b */
    public final C0805jo f16260b;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f16259a = null;
        this.f16260b = new C0805jo(0);
    }

    /* JADX INFO: renamed from: F */
    public final void m4068F() {
        if (this.f16259a != null) {
            return;
        }
        C1077qn.m9989o("Attempting to perform action before initialize.");
    }

    /* JADX INFO: renamed from: G */
    public final void m4069G(String str, qx5 qx5Var) {
        m4068F();
        dn6 dn6Var = this.f16259a.f26517i;
        oa6.m9014j(dn6Var);
        dn6Var.m4603c0(str, qx5Var);
    }

    @Override // p000.gx5
    public void beginAdUnitExposure(String str, long j) {
        m4068F();
        ly5 ly5Var = this.f16259a.f26522n;
        oa6.m9013i(ly5Var);
        ly5Var.m8149u(str, j);
    }

    @Override // p000.gx5
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        mg6Var.m8309J(str, str2, bundle);
    }

    @Override // p000.gx5
    public void clearMeasurementEnabled(long j) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        mg6Var.m9741u();
        ea6 ea6Var = ((oa6) mg6Var.f36084a).f26515g;
        oa6.m9016l(ea6Var);
        ar1 ar1Var = new ar1((byte) 22);
        ar1Var.f14798b = null;
        ar1Var.f14799c = mg6Var;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(ar1Var);
    }

    @Override // p000.gx5
    public void endAdUnitExposure(String str, long j) {
        m4068F();
        ly5 ly5Var = this.f16259a.f26522n;
        oa6.m9013i(ly5Var);
        ly5Var.m8150v(str, j);
    }

    @Override // p000.gx5
    public void generateEventId(qx5 qx5Var) {
        m4068F();
        dn6 dn6Var = this.f16259a.f26517i;
        oa6.m9014j(dn6Var);
        long jM4613r0 = dn6Var.m4613r0();
        m4068F();
        dn6 dn6Var2 = this.f16259a.f26517i;
        oa6.m9014j(dn6Var2);
        dn6Var2.m4604d0(qx5Var, jM4613r0);
    }

    @Override // p000.gx5
    public void getAppInstanceId(qx5 qx5Var) {
        m4068F();
        ea6 ea6Var = this.f16259a.f26515g;
        oa6.m9016l(ea6Var);
        ja6 ja6Var = new ja6((byte) 0);
        ja6Var.f22141b = qx5Var;
        ja6Var.f22142c = this;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(ja6Var);
    }

    @Override // p000.gx5
    public void getCachedAppInstanceId(qx5 qx5Var) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        m4069G((String) mg6Var.f24902k.get(), qx5Var);
    }

    @Override // p000.gx5
    public void getConditionalUserProperties(String str, String str2, qx5 qx5Var) {
        m4068F();
        ea6 ea6Var = this.f16259a.f26515g;
        oa6.m9016l(ea6Var);
        yb6 yb6Var = new yb6((byte) 4);
        yb6Var.f35105c = qx5Var;
        yb6Var.f35104b = str;
        yb6Var.f35106d = str2;
        yb6Var.f35107e = this;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(yb6Var);
    }

    @Override // p000.gx5
    public void getCurrentScreenClass(qx5 qx5Var) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        uh6 uh6Var = ((oa6) mg6Var.f36084a).f26520l;
        oa6.m9015k(uh6Var);
        eh6 eh6Var = uh6Var.f31880g;
        m4069G(eh6Var != null ? eh6Var.f18106b : null, qx5Var);
    }

    @Override // p000.gx5
    public void getCurrentScreenName(qx5 qx5Var) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        uh6 uh6Var = ((oa6) mg6Var.f36084a).f26520l;
        oa6.m9015k(uh6Var);
        eh6 eh6Var = uh6Var.f31880g;
        m4069G(eh6Var != null ? eh6Var.f18105a : null, qx5Var);
    }

    @Override // p000.gx5
    public void getGmpAppId(qx5 qx5Var) {
        String strM6958a;
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        oa6 oa6Var = (oa6) mg6Var.f36084a;
        try {
            strM6958a = iw5.m6958a(oa6Var.f26509a, oa6Var.f26524p);
        } catch (IllegalStateException e) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12505b(e, "getGoogleAppId failed with exception");
            strM6958a = null;
        }
        m4069G(strM6958a, qx5Var);
    }

    @Override // p000.gx5
    public void getMaxUserProperties(String str, qx5 qx5Var) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        y42.m12851X(str);
        op5 op5Var = ((oa6) mg6Var.f36084a).f26512d;
        m4068F();
        dn6 dn6Var = this.f16259a.f26517i;
        oa6.m9014j(dn6Var);
        dn6Var.m4605e0(qx5Var, 25);
    }

    @Override // p000.gx5
    public void getSessionId(qx5 qx5Var) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        ea6 ea6Var = ((oa6) mg6Var.f36084a).f26515g;
        oa6.m9016l(ea6Var);
        oz5 oz5Var = new oz5((byte) 23);
        oz5Var.f27249b = qx5Var;
        oz5Var.f27250c = mg6Var;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(oz5Var);
    }

    @Override // p000.gx5
    public void getTestFlag(qx5 qx5Var, int i) {
        m4068F();
        byte b = 1;
        if (i == 0) {
            dn6 dn6Var = this.f16259a.f26517i;
            oa6.m9014j(dn6Var);
            mg6 mg6Var = this.f16259a.f26521m;
            oa6.m9015k(mg6Var);
            AtomicReference atomicReference = new AtomicReference();
            ea6 ea6Var = ((oa6) mg6Var.f36084a).f26515g;
            oa6.m9016l(ea6Var);
            oe6 oe6Var = new oe6(b);
            oe6Var.f26659b = atomicReference;
            oe6Var.f26660c = mg6Var;
            VarHandle.storeStoreFence();
            dn6Var.m4603c0((String) ea6Var.m5034E(atomicReference, 15000L, "String test flag value", oe6Var), qx5Var);
            return;
        }
        byte b2 = 0;
        if (i == 1) {
            dn6 dn6Var2 = this.f16259a.f26517i;
            oa6.m9014j(dn6Var2);
            mg6 mg6Var2 = this.f16259a.f26521m;
            oa6.m9015k(mg6Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            ea6 ea6Var2 = ((oa6) mg6Var2.f36084a).f26515g;
            oa6.m9016l(ea6Var2);
            bf6 bf6Var = new bf6(b2);
            bf6Var.f15246b = atomicReference2;
            bf6Var.f15247c = mg6Var2;
            VarHandle.storeStoreFence();
            dn6Var2.m4604d0(qx5Var, ((Long) ea6Var2.m5034E(atomicReference2, 15000L, "long test flag value", bf6Var)).longValue());
            return;
        }
        byte b3 = 2;
        if (i == 2) {
            dn6 dn6Var3 = this.f16259a.f26517i;
            oa6.m9014j(dn6Var3);
            mg6 mg6Var3 = this.f16259a.f26521m;
            oa6.m9015k(mg6Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            ea6 ea6Var3 = ((oa6) mg6Var3.f36084a).f26515g;
            oa6.m9016l(ea6Var3);
            bf6 bf6Var2 = new bf6(b);
            bf6Var2.f15246b = atomicReference3;
            bf6Var2.f15247c = mg6Var3;
            VarHandle.storeStoreFence();
            double dDoubleValue = ((Double) ea6Var3.m5034E(atomicReference3, 15000L, "double test flag value", bf6Var2)).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                qx5Var.mo7338h(bundle);
                return;
            } catch (RemoteException e) {
                d76 d76Var = ((oa6) dn6Var3.f36084a).f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16838m.m12505b(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            dn6 dn6Var4 = this.f16259a.f26517i;
            oa6.m9014j(dn6Var4);
            mg6 mg6Var4 = this.f16259a.f26521m;
            oa6.m9015k(mg6Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            ea6 ea6Var4 = ((oa6) mg6Var4.f36084a).f26515g;
            oa6.m9016l(ea6Var4);
            oe6 oe6Var2 = new oe6(b3);
            oe6Var2.f26659b = atomicReference4;
            oe6Var2.f26660c = mg6Var4;
            VarHandle.storeStoreFence();
            dn6Var4.m4605e0(qx5Var, ((Integer) ea6Var4.m5034E(atomicReference4, 15000L, "int test flag value", oe6Var2)).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        dn6 dn6Var5 = this.f16259a.f26517i;
        oa6.m9014j(dn6Var5);
        mg6 mg6Var5 = this.f16259a.f26521m;
        oa6.m9015k(mg6Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        ea6 ea6Var5 = ((oa6) mg6Var5.f36084a).f26515g;
        oa6.m9016l(ea6Var5);
        oe6 oe6Var3 = new oe6(b2);
        oe6Var3.f26659b = atomicReference5;
        oe6Var3.f26660c = mg6Var5;
        VarHandle.storeStoreFence();
        dn6Var5.m4607g0(qx5Var, ((Boolean) ea6Var5.m5034E(atomicReference5, 15000L, "boolean test flag value", oe6Var3)).booleanValue());
    }

    @Override // p000.gx5
    public void getUserProperties(String str, String str2, boolean z, qx5 qx5Var) {
        m4068F();
        ea6 ea6Var = this.f16259a.f26515g;
        oa6.m9016l(ea6Var);
        fe6 fe6Var = new fe6((byte) 0);
        fe6Var.f18935e = qx5Var;
        fe6Var.f18932b = str;
        fe6Var.f18933c = str2;
        fe6Var.f18934d = z;
        fe6Var.f18936f = this;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(fe6Var);
    }

    @Override // p000.gx5
    public void initForTests(Map map) {
        m4068F();
    }

    @Override // p000.gx5
    public void initialize(a02 a02Var, mz5 mz5Var, long j) {
        oa6 oa6Var = this.f16259a;
        if (oa6Var == null) {
            Context context = (Context) v23.m11710J(a02Var);
            y42.m12854a0(context);
            this.f16259a = oa6.m9017q(context, mz5Var, Long.valueOf(j));
        } else {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12504a("Attempting to initialize multiple times");
        }
    }

    @Override // p000.gx5
    public void isDataCollectionEnabled(qx5 qx5Var) {
        m4068F();
        ea6 ea6Var = this.f16259a.f26515g;
        oa6.m9016l(ea6Var);
        ja6 ja6Var = new ja6((byte) 1);
        ja6Var.f22141b = qx5Var;
        ja6Var.f22142c = this;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(ja6Var);
    }

    @Override // p000.gx5
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        mg6Var.m8321z(str, str2, bundle, z, z2, j);
    }

    @Override // p000.gx5
    public void logEventAndBundle(String str, String str2, Bundle bundle, qx5 qx5Var, long j) {
        m4068F();
        y42.m12851X(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        ys5 ys5Var = new ys5(str2, new os5(bundle), "app", j);
        ea6 ea6Var = this.f16259a.f26515g;
        oa6.m9016l(ea6Var);
        yb6 yb6Var = new yb6((byte) 1);
        yb6Var.f35105c = qx5Var;
        yb6Var.f35106d = ys5Var;
        yb6Var.f35104b = str;
        yb6Var.f35107e = this;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(yb6Var);
    }

    @Override // p000.gx5
    public void logHealthData(int i, String str, a02 a02Var, a02 a02Var2, a02 a02Var3) {
        m4068F();
        Object objM11710J = a02Var == null ? null : v23.m11710J(a02Var);
        Object objM11710J2 = a02Var2 == null ? null : v23.m11710J(a02Var2);
        Object objM11710J3 = a02Var3 != null ? v23.m11710J(a02Var3) : null;
        d76 d76Var = this.f16259a.f26514f;
        oa6.m9016l(d76Var);
        d76Var.m4403z(i, true, false, str, objM11710J, objM11710J2, objM11710J3);
    }

    @Override // p000.gx5
    public void onActivityCreated(a02 a02Var, Bundle bundle, long j) {
        m4068F();
        Activity activity = (Activity) v23.m11710J(a02Var);
        y42.m12854a0(activity);
        onActivityCreatedByScionActivityInfo(pz5.m9692a(activity), bundle, j);
    }

    @Override // p000.gx5
    public void onActivityCreatedByScionActivityInfo(pz5 pz5Var, Bundle bundle, long j) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        zs5 zs5Var = mg6Var.f24898g;
        if (zs5Var != null) {
            mg6 mg6Var2 = this.f16259a.f26521m;
            oa6.m9015k(mg6Var2);
            mg6Var2.m8313N();
            zs5Var.m13743g(pz5Var, bundle);
        }
    }

    @Override // p000.gx5
    public void onActivityDestroyed(a02 a02Var, long j) {
        m4068F();
        Activity activity = (Activity) v23.m11710J(a02Var);
        y42.m12854a0(activity);
        onActivityDestroyedByScionActivityInfo(pz5.m9692a(activity), j);
    }

    @Override // p000.gx5
    public void onActivityDestroyedByScionActivityInfo(pz5 pz5Var, long j) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        zs5 zs5Var = mg6Var.f24898g;
        if (zs5Var != null) {
            mg6 mg6Var2 = this.f16259a.f26521m;
            oa6.m9015k(mg6Var2);
            mg6Var2.m8313N();
            zs5Var.m13744h(pz5Var);
        }
    }

    @Override // p000.gx5
    public void onActivityPaused(a02 a02Var, long j) {
        m4068F();
        Activity activity = (Activity) v23.m11710J(a02Var);
        y42.m12854a0(activity);
        onActivityPausedByScionActivityInfo(pz5.m9692a(activity), j);
    }

    @Override // p000.gx5
    public void onActivityPausedByScionActivityInfo(pz5 pz5Var, long j) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        zs5 zs5Var = mg6Var.f24898g;
        if (zs5Var != null) {
            mg6 mg6Var2 = this.f16259a.f26521m;
            oa6.m9015k(mg6Var2);
            mg6Var2.m8313N();
            zs5Var.m13745i(pz5Var);
        }
    }

    @Override // p000.gx5
    public void onActivityResumed(a02 a02Var, long j) {
        m4068F();
        Activity activity = (Activity) v23.m11710J(a02Var);
        y42.m12854a0(activity);
        onActivityResumedByScionActivityInfo(pz5.m9692a(activity), j);
    }

    @Override // p000.gx5
    public void onActivityResumedByScionActivityInfo(pz5 pz5Var, long j) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        zs5 zs5Var = mg6Var.f24898g;
        if (zs5Var != null) {
            mg6 mg6Var2 = this.f16259a.f26521m;
            oa6.m9015k(mg6Var2);
            mg6Var2.m8313N();
            zs5Var.m13746j(pz5Var);
        }
    }

    @Override // p000.gx5
    public void onActivitySaveInstanceState(a02 a02Var, qx5 qx5Var, long j) {
        m4068F();
        Activity activity = (Activity) v23.m11710J(a02Var);
        y42.m12854a0(activity);
        onActivitySaveInstanceStateByScionActivityInfo(pz5.m9692a(activity), qx5Var, j);
    }

    @Override // p000.gx5
    public void onActivitySaveInstanceStateByScionActivityInfo(pz5 pz5Var, qx5 qx5Var, long j) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        zs5 zs5Var = mg6Var.f24898g;
        Bundle bundle = new Bundle();
        if (zs5Var != null) {
            mg6 mg6Var2 = this.f16259a.f26521m;
            oa6.m9015k(mg6Var2);
            mg6Var2.m8313N();
            zs5Var.m13747k(pz5Var, bundle);
        }
        try {
            qx5Var.mo7338h(bundle);
        } catch (RemoteException e) {
            d76 d76Var = this.f16259a.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12505b(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // p000.gx5
    public void onActivityStarted(a02 a02Var, long j) {
        m4068F();
        Activity activity = (Activity) v23.m11710J(a02Var);
        y42.m12854a0(activity);
        onActivityStartedByScionActivityInfo(pz5.m9692a(activity), j);
    }

    @Override // p000.gx5
    public void onActivityStartedByScionActivityInfo(pz5 pz5Var, long j) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        if (mg6Var.f24898g != null) {
            mg6 mg6Var2 = this.f16259a.f26521m;
            oa6.m9015k(mg6Var2);
            mg6Var2.m8313N();
        }
    }

    @Override // p000.gx5
    public void onActivityStopped(a02 a02Var, long j) {
        m4068F();
        Activity activity = (Activity) v23.m11710J(a02Var);
        y42.m12854a0(activity);
        onActivityStoppedByScionActivityInfo(pz5.m9692a(activity), j);
    }

    @Override // p000.gx5
    public void onActivityStoppedByScionActivityInfo(pz5 pz5Var, long j) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        if (mg6Var.f24898g != null) {
            mg6 mg6Var2 = this.f16259a.f26521m;
            oa6.m9015k(mg6Var2);
            mg6Var2.m8313N();
        }
    }

    @Override // p000.gx5
    public void performAction(Bundle bundle, qx5 qx5Var, long j) {
        m4068F();
        qx5Var.mo7338h(null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.gx5
    public void registerOnMeasurementEventListener(az5 az5Var) {
        Object obj;
        m4068F();
        C0805jo c0805jo = this.f16260b;
        synchronized (c0805jo) {
            try {
                gd6 gd6Var = (gd6) c0805jo.get(Integer.valueOf(az5Var.mo3376l()));
                obj = gd6Var;
                if (gd6Var == null) {
                    rn6 rn6Var = new rn6();
                    rn6Var.f29468b = this;
                    rn6Var.f29467a = az5Var;
                    VarHandle.storeStoreFence();
                    c0805jo.put(Integer.valueOf(az5Var.mo3376l()), rn6Var);
                    obj = rn6Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        mg6Var.m9741u();
        if (mg6Var.f24900i.add(obj)) {
            return;
        }
        d76 d76Var = ((oa6) mg6Var.f36084a).f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16838m.m12504a("OnEventListener already registered");
    }

    @Override // p000.gx5
    public void resetAnalyticsData(long j) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        mg6Var.f24902k.set(null);
        ea6 ea6Var = ((oa6) mg6Var.f36084a).f26515g;
        oa6.m9016l(ea6Var);
        yd6 yd6Var = new yd6((byte) 1);
        yd6Var.f35147b = j;
        yd6Var.f35148c = mg6Var;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(yd6Var);
    }

    @Override // p000.gx5
    public void retrieveAndUploadBatches(dy5 dy5Var) {
        int i;
        bh6 bh6Var;
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        mg6Var.m9741u();
        oa6 oa6Var = (oa6) mg6Var.f36084a;
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        if (ea6Var.m5030A()) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        ea6 ea6Var2 = oa6Var.f26515g;
        oa6.m9016l(ea6Var2);
        if (Thread.currentThread() == ea6Var2.f17932h) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12504a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean zM13150b = yj5.m13150b();
        d76 d76Var3 = oa6Var.f26514f;
        if (zM13150b) {
            oa6.m9016l(d76Var3);
            d76Var3.f16835j.m12504a("Cannot retrieve and upload batches from main thread");
            return;
        }
        oa6.m9016l(d76Var3);
        d76Var3.f16831L.m12504a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (!z) {
            d76 d76Var4 = oa6Var.f26514f;
            oa6.m9016l(d76Var4);
            d76Var4.f16831L.m12504a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            ea6 ea6Var3 = oa6Var.f26515g;
            oa6.m9016l(ea6Var3);
            bf6 bf6Var = new bf6((byte) 2);
            bf6Var.f15247c = mg6Var;
            bf6Var.f15246b = atomicReference;
            VarHandle.storeStoreFence();
            ea6Var3.m5034E(atomicReference, 10000L, "[sgtm] Getting upload batches", bf6Var);
            ol6 ol6Var = (ol6) atomicReference.get();
            if (ol6Var == null) {
                break;
            }
            List list = ol6Var.f26869d;
            if (list.isEmpty()) {
                break;
            }
            d76 d76Var5 = oa6Var.f26514f;
            oa6.m9016l(d76Var5);
            d76Var5.f16831L.m12505b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            int size = i2 + list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = size;
                    z = false;
                    break;
                }
                jl6 jl6Var = (jl6) it.next();
                try {
                    URL url = new URI(jl6Var.f22408f).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    e66 e66VarM9029p = ((oa6) mg6Var.f36084a).m9029p();
                    e66VarM9029p.m9741u();
                    y42.m12854a0(e66VarM9029p.f17854k);
                    String str = e66VarM9029p.f17854k;
                    oa6 oa6Var2 = (oa6) mg6Var.f36084a;
                    d76 d76Var6 = oa6Var2.f26514f;
                    oa6.m9016l(d76Var6);
                    x66 x66Var = d76Var6.f16831L;
                    Long lValueOf = Long.valueOf(jl6Var.f22406d);
                    x66Var.m12507d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, jl6Var.f22408f, Integer.valueOf(jl6Var.f22407e.length));
                    if (!TextUtils.isEmpty(jl6Var.f22412j)) {
                        d76 d76Var7 = oa6Var2.f26514f;
                        oa6.m9016l(d76Var7);
                        d76Var7.f16831L.m12506c("[sgtm] Uploading data from app. row_id", lValueOf, jl6Var.f22412j);
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = jl6Var.f22409g;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    wg6 wg6Var = oa6Var2.f26523o;
                    oa6.m9016l(wg6Var);
                    byte[] bArr = jl6Var.f22407e;
                    i = size;
                    tt2 tt2Var = new tt2((byte) 28, false);
                    tt2Var.f31428b = mg6Var;
                    tt2Var.f31429c = atomicReference2;
                    tt2Var.f31430d = jl6Var;
                    VarHandle.storeStoreFence();
                    wg6Var.m7955v();
                    y42.m12854a0(url);
                    y42.m12854a0(bArr);
                    ea6 ea6Var4 = ((oa6) wg6Var.f36084a).f26515g;
                    oa6.m9016l(ea6Var4);
                    ea6Var4.m5036G(new tq5(wg6Var, str, url, bArr, map, tt2Var));
                    try {
                        dn6 dn6Var = oa6Var2.f26517i;
                        oa6.m9014j(dn6Var);
                        oa6 oa6Var3 = (oa6) dn6Var.f36084a;
                        oa6Var3.f26519k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    oa6Var3.f26519k.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        d76 d76Var8 = ((oa6) mg6Var.f36084a).f26514f;
                        oa6.m9016l(d76Var8);
                        d76Var8.f16838m.m12504a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    bh6Var = atomicReference2.get() == null ? bh6.f15277b : (bh6) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    i = size;
                    d76 d76Var9 = ((oa6) mg6Var.f36084a).f26514f;
                    oa6.m9016l(d76Var9);
                    d76Var9.f16835j.m12507d("[sgtm] Bad upload url for row_id", jl6Var.f22408f, Long.valueOf(jl6Var.f22406d), e);
                    bh6Var = bh6.f15279d;
                }
                if (bh6Var != bh6.f15278c) {
                    if (bh6Var == bh6.f15280e) {
                        z = true;
                        break;
                    }
                } else {
                    i3++;
                }
                size = i;
            }
            i2 = i;
        }
        d76 d76Var10 = oa6Var.f26514f;
        oa6.m9016l(d76Var10);
        d76Var10.f16831L.m12506c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i2), Integer.valueOf(i3));
        try {
            dy5Var.mo4801a();
        } catch (RemoteException e2) {
            oa6 oa6Var4 = this.f16259a;
            y42.m12854a0(oa6Var4);
            d76 d76Var11 = oa6Var4.f26514f;
            oa6.m9016l(d76Var11);
            d76Var11.f16838m.m12505b(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // p000.gx5
    public void setConditionalUserProperty(Bundle bundle, long j) {
        m4068F();
        oa6 oa6Var = this.f16259a;
        if (bundle == null) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Conditional user property must not be null");
        } else {
            mg6 mg6Var = oa6Var.f26521m;
            oa6.m9015k(mg6Var);
            mg6Var.m8308I(bundle, j);
        }
    }

    @Override // p000.gx5
    public void setConsentThirdParty(Bundle bundle, long j) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        mg6Var.m8314O(bundle, -20, j);
    }

    @Override // p000.gx5
    public void setCurrentScreen(a02 a02Var, String str, String str2, long j) {
        m4068F();
        Activity activity = (Activity) v23.m11710J(a02Var);
        y42.m12854a0(activity);
        setCurrentScreenByScionActivityInfo(pz5.m9692a(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r2 <= 500) goto L31;
     */
    @Override // p000.gx5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreenByScionActivityInfo(pz5 pz5Var, String str, String str2, long j) {
        m4068F();
        uh6 uh6Var = this.f16259a.f26520l;
        oa6.m9015k(uh6Var);
        oa6 oa6Var = (oa6) uh6Var.f36084a;
        if (!oa6Var.f26512d.m9229I()) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16840o.m12504a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        eh6 eh6Var = uh6Var.f31880g;
        if (eh6Var == null) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16840o.m12504a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = uh6Var.f31883j;
        Integer numValueOf = Integer.valueOf(pz5Var.f28109d);
        if (concurrentHashMap.get(numValueOf) == null) {
            d76 d76Var3 = oa6Var.f26514f;
            oa6.m9016l(d76Var3);
            d76Var3.f16840o.m12504a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = uh6Var.m11554B(pz5Var.f28110e);
        }
        String str3 = eh6Var.f18106b;
        String str4 = eh6Var.f18105a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            d76 d76Var4 = oa6Var.f26514f;
            oa6.m9016l(d76Var4);
            d76Var4.f16840o.m12504a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                oa6Var.f26512d.getClass();
            }
            d76 d76Var5 = oa6Var.f26514f;
            oa6.m9016l(d76Var5);
            d76Var5.f16840o.m12505b(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2.length() > 0) {
            int length2 = str2.length();
            oa6Var.f26512d.getClass();
            if (length2 <= 500) {
                d76 d76Var6 = oa6Var.f26514f;
                oa6.m9016l(d76Var6);
                d76Var6.f16831L.m12506c("Setting current screen to name, class", str == null ? "null" : str, str2);
                dn6 dn6Var = oa6Var.f26517i;
                oa6.m9014j(dn6Var);
                eh6 eh6Var2 = new eh6(str, str2, dn6Var.m4613r0());
                concurrentHashMap.put(numValueOf, eh6Var2);
                uh6Var.m11556D(pz5Var.f28110e, eh6Var2, true);
                return;
            }
        }
        d76 d76Var7 = oa6Var.f26514f;
        oa6.m9016l(d76Var7);
        d76Var7.f16840o.m12505b(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
    }

    @Override // p000.gx5
    public void setDataCollectionEnabled(boolean z) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        mg6Var.m9741u();
        ea6 ea6Var = ((oa6) mg6Var.f36084a).f26515g;
        oa6.m9016l(ea6Var);
        td6 td6Var = new td6();
        td6Var.f31094a = z;
        td6Var.f31095b = mg6Var;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(td6Var);
    }

    @Override // p000.gx5
    public void setDefaultEventParameters(Bundle bundle) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        ea6 ea6Var = ((oa6) mg6Var.f36084a).f26515g;
        oa6.m9016l(ea6Var);
        se6 se6Var = new se6((byte) 1);
        se6Var.f30220b = mg6Var;
        se6Var.f30221c = bundle2;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(se6Var);
    }

    @Override // p000.gx5
    public void setEventInterceptor(az5 az5Var) {
        m4068F();
        pq3 pq3Var = new pq3((byte) 18);
        pq3Var.f27897c = this;
        pq3Var.f27896b = az5Var;
        VarHandle.storeStoreFence();
        ea6 ea6Var = this.f16259a.f26515g;
        oa6.m9016l(ea6Var);
        boolean zM5030A = ea6Var.m5030A();
        oa6 oa6Var = this.f16259a;
        if (!zM5030A) {
            ea6 ea6Var2 = oa6Var.f26515g;
            oa6.m9016l(ea6Var2);
            oz5 oz5Var = new oz5((byte) 25);
            oz5Var.f27249b = pq3Var;
            oz5Var.f27250c = this;
            VarHandle.storeStoreFence();
            ea6Var2.m5033D(oz5Var);
            return;
        }
        mg6 mg6Var = oa6Var.f26521m;
        oa6.m9015k(mg6Var);
        mg6Var.mo5038t();
        mg6Var.m9741u();
        dd6 dd6Var = mg6Var.f24899h;
        if (pq3Var != dd6Var) {
            y42.m12856c0("EventInterceptor already set.", dd6Var == null);
        }
        mg6Var.f24899h = pq3Var;
    }

    @Override // p000.gx5
    public void setInstanceIdProvider(iz5 iz5Var) {
        m4068F();
    }

    @Override // p000.gx5
    public void setMeasurementEnabled(boolean z, long j) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        Boolean boolValueOf = Boolean.valueOf(z);
        mg6Var.m9741u();
        ea6 ea6Var = ((oa6) mg6Var.f36084a).f26515g;
        oa6.m9016l(ea6Var);
        ar1 ar1Var = new ar1((byte) 22);
        ar1Var.f14798b = boolValueOf;
        ar1Var.f14799c = mg6Var;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(ar1Var);
    }

    @Override // p000.gx5
    public void setMinimumSessionDuration(long j) {
        m4068F();
    }

    @Override // p000.gx5
    public void setSessionTimeoutDuration(long j) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        ea6 ea6Var = ((oa6) mg6Var.f36084a).f26515g;
        oa6.m9016l(ea6Var);
        yd6 yd6Var = new yd6((byte) 0);
        yd6Var.f35147b = j;
        yd6Var.f35148c = mg6Var;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(yd6Var);
    }

    @Override // p000.gx5
    public void setSgtmDebugInfo(Intent intent) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        oa6 oa6Var = (oa6) mg6Var.f36084a;
        Uri data = intent.getData();
        if (data == null) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16841p.m12504a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16841p.m12504a("[sgtm] Preview Mode was not enabled.");
            oa6Var.f26512d.f26943g = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        d76 d76Var3 = oa6Var.f26514f;
        oa6.m9016l(d76Var3);
        d76Var3.f16841p.m12505b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        oa6Var.f26512d.f26943g = queryParameter2;
    }

    @Override // p000.gx5
    public void setUserId(String str, long j) {
        m4068F();
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        oa6 oa6Var = (oa6) mg6Var.f36084a;
        if (str != null && TextUtils.isEmpty(str)) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12504a("User ID must be non-empty or null");
            return;
        }
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        ar1 ar1Var = new ar1((byte) 24);
        ar1Var.f14798b = mg6Var;
        ar1Var.f14799c = str;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(ar1Var);
        mg6Var.m8304E(null, "_id", str, true, j);
    }

    @Override // p000.gx5
    public void setUserProperty(String str, String str2, a02 a02Var, boolean z, long j) {
        m4068F();
        Object objM11710J = v23.m11710J(a02Var);
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        mg6Var.m8304E(str, str2, objM11710J, z, j);
    }

    @Override // p000.gx5
    public void unregisterOnMeasurementEventListener(az5 az5Var) {
        gd6 gd6Var;
        Object obj;
        m4068F();
        C0805jo c0805jo = this.f16260b;
        synchronized (c0805jo) {
            gd6Var = (gd6) c0805jo.remove(Integer.valueOf(az5Var.mo3376l()));
            obj = gd6Var;
        }
        if (gd6Var == null) {
            rn6 rn6Var = new rn6();
            rn6Var.f29468b = this;
            rn6Var.f29467a = az5Var;
            VarHandle.storeStoreFence();
            obj = rn6Var;
        }
        mg6 mg6Var = this.f16259a.f26521m;
        oa6.m9015k(mg6Var);
        mg6Var.m9741u();
        if (mg6Var.f24900i.remove(obj)) {
            return;
        }
        d76 d76Var = ((oa6) mg6Var.f36084a).f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16838m.m12504a("OnEventListener had not been registered");
    }

    @Override // p000.gx5
    public void setConsent(Bundle bundle, long j) {
    }
}
