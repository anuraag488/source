package p000;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class hr2 {

    /* JADX INFO: renamed from: a */
    public MeasurementManager f20806a;

    /* JADX INFO: renamed from: b */
    public static Object m6477b(hr2 hr2Var, gy0 gy0Var, wm0 wm0Var) {
        new b70(1, C0006a5.m86x(wm0Var)).m3497u();
        MeasurementManager measurementManager = hr2Var.f20806a;
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static Object m6478d(hr2 hr2Var, wm0 wm0Var) {
        b70 b70Var = new b70(1, C0006a5.m86x(wm0Var));
        b70Var.m3497u();
        MeasurementManager measurementManager = hr2Var.f20806a;
        ExecutorC0952nn executorC0952nn = new ExecutorC0952nn((byte) 1);
        zm0 zm0Var = new zm0(false);
        zm0Var.f36175a = b70Var;
        VarHandle.storeStoreFence();
        measurementManager.getMeasurementApiStatus(executorC0952nn, zm0Var);
        Object objM3495r = b70Var.m3495r();
        ap0 ap0Var = ap0.f14763a;
        return objM3495r;
    }

    /* JADX INFO: renamed from: g */
    public static Object m6479g(hr2 hr2Var, na4 na4Var, wm0 wm0Var) {
        Object objM13685q = zp0.m13685q(new C1260vl((Object) hr2Var, (wm0) null, (byte) 9), wm0Var);
        return objM13685q == ap0.f14763a ? objM13685q : ju4.f22634a;
    }

    /* JADX INFO: renamed from: h */
    public static Object m6480h(hr2 hr2Var, Uri uri, InputEvent inputEvent, wm0 wm0Var) {
        b70 b70Var = new b70(1, C0006a5.m86x(wm0Var));
        b70Var.m3497u();
        MeasurementManager measurementManager = hr2Var.f20806a;
        ExecutorC0952nn executorC0952nn = new ExecutorC0952nn((byte) 1);
        zm0 zm0Var = new zm0(false);
        zm0Var.f36175a = b70Var;
        VarHandle.storeStoreFence();
        measurementManager.registerSource(uri, inputEvent, executorC0952nn, zm0Var);
        Object objM3495r = b70Var.m3495r();
        return objM3495r == ap0.f14763a ? objM3495r : ju4.f22634a;
    }

    /* JADX INFO: renamed from: j */
    public static Object m6481j(hr2 hr2Var, Uri uri, wm0 wm0Var) {
        b70 b70Var = new b70(1, C0006a5.m86x(wm0Var));
        b70Var.m3497u();
        MeasurementManager measurementManager = hr2Var.f20806a;
        ExecutorC0952nn executorC0952nn = new ExecutorC0952nn((byte) 1);
        zm0 zm0Var = new zm0(false);
        zm0Var.f36175a = b70Var;
        VarHandle.storeStoreFence();
        measurementManager.registerTrigger(uri, executorC0952nn, zm0Var);
        Object objM3495r = b70Var.m3495r();
        return objM3495r == ap0.f14763a ? objM3495r : ju4.f22634a;
    }

    /* JADX INFO: renamed from: l */
    public static Object m6482l(hr2 hr2Var, gz4 gz4Var, wm0 wm0Var) {
        new b70(1, C0006a5.m86x(wm0Var)).m3497u();
        MeasurementManager measurementManager = hr2Var.f20806a;
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public static Object m6483n(hr2 hr2Var, hz4 hz4Var, wm0 wm0Var) {
        new b70(1, C0006a5.m86x(wm0Var)).m3497u();
        MeasurementManager measurementManager = hr2Var.f20806a;
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public Object m6484a(gy0 gy0Var, wm0 wm0Var) {
        return m6477b(this, gy0Var, wm0Var);
    }

    /* JADX INFO: renamed from: c */
    public Object m6485c(wm0 wm0Var) {
        return m6478d(this, wm0Var);
    }

    /* JADX INFO: renamed from: e */
    public Object m6486e(na4 na4Var, wm0 wm0Var) {
        return m6479g(this, na4Var, wm0Var);
    }

    /* JADX INFO: renamed from: f */
    public Object m6487f(Uri uri, InputEvent inputEvent, wm0 wm0Var) {
        return m6480h(this, uri, inputEvent, wm0Var);
    }

    /* JADX INFO: renamed from: i */
    public Object m6488i(Uri uri, wm0 wm0Var) {
        return m6481j(this, uri, wm0Var);
    }

    /* JADX INFO: renamed from: k */
    public Object m6489k(gz4 gz4Var, wm0 wm0Var) {
        return m6482l(this, gz4Var, wm0Var);
    }

    /* JADX INFO: renamed from: m */
    public Object m6490m(hz4 hz4Var, wm0 wm0Var) {
        return m6483n(this, hz4Var, wm0Var);
    }
}
