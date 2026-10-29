package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import java.lang.invoke.VarHandle;
import p000.C0572de;
import p000.C1077qn;
import p000.aj5;
import p000.ct5;
import p000.cw5;
import p000.em6;
import p000.gs5;
import p000.gt5;
import p000.is5;
import p000.li0;
import p000.p56;
import p000.ps5;
import p000.s36;
import p000.tt2;
import p000.vs5;
import p000.w06;
import p000.xx1;
import p000.zs5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class HsdpDeepLinkServiceFactory {
    private static final String HPOA_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hpoa.service.HpoaService";
    private static final String HPOA_SERVICE_CLASS_NAME_FOR_TESTING = "com.google.android.play.core.hsdp.testapp.FakeHpoaService";
    private static final String HSDP_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hsdp.service.HsdpService";

    private HsdpDeepLinkServiceFactory() {
    }

    public static xx1 create(Activity activity, boolean z, boolean z2) {
        return createInternal(activity, z, z2, false, !z2);
    }

    private static Intent createHpoaServiceIntent(Context context, boolean z) {
        return z ? new Intent().setClassName(context.getPackageName(), HPOA_SERVICE_CLASS_NAME_FOR_TESTING) : new Intent().setClassName("com.android.vending", HPOA_SERVICE_CLASS_NAME);
    }

    public static Intent createHsdpServiceIntent() {
        return new Intent().setClassName("com.android.vending", HSDP_SERVICE_CLASS_NAME);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static xx1 createInternal(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        tt2 tt2Var;
        boolean zIsFeatureEnabled;
        if (!z2 && !(context instanceof Activity)) {
            C1077qn.m9987m("Context must be an Activity when using activity-based HSDP.");
            return null;
        }
        if (z && !(context instanceof Activity)) {
            C1077qn.m9987m("Context must be an Activity when enabling loading panel.");
            return null;
        }
        boolean z5 = false;
        byte b = 0;
        byte b2 = z4 && (context instanceof Activity);
        if (z4 && b2 == false) {
            Log.w("HsdpDeepLinkServiceFactory", "HPOA was enabled but Context is not an Activity. Disabling HPOA.");
        }
        boolean z6 = ActivityManager.isRunningInTestHarness() || ActivityManager.isRunningInUserTestHarness();
        li0 li0Var = new li0((byte) 4);
        li0Var.f24044c = context;
        li0Var.f24043b = z6;
        VarHandle.storeStoreFence();
        p56 p56VarM6929b = is5.m6929b(li0Var);
        C0572de c0572de = new C0572de();
        c0572de.f16997a = context;
        VarHandle.storeStoreFence();
        p56 p56VarM6929b2 = is5.m6929b(c0572de);
        boolean z7 = z && (context instanceof Activity);
        boolean z8 = context instanceof Activity;
        if (z8) {
            Activity activity = (Activity) context;
            tt2Var = new tt2((byte) 23, z5);
            tt2Var.f31430d = null;
            tt2Var.f31428b = activity;
            tt2Var.f31429c = (WindowManager) activity.getSystemService("window");
            VarHandle.storeStoreFence();
        } else {
            tt2Var = null;
        }
        gt5 gt5Var = (z3 && z8) ? gt5.f20115e : null;
        gs5 gs5Var = new gs5();
        gs5Var.f20104g = null;
        gs5Var.f20107j = null;
        gs5Var.f20109l = null;
        gs5Var.f20098a = context;
        gs5Var.f20099b = p56VarM6929b;
        gs5Var.f20100c = p56VarM6929b2;
        gs5Var.f20101d = z6;
        gs5Var.f20102e = z2;
        gs5Var.f20105h = z7;
        gs5Var.f20106i = tt2Var;
        gs5Var.f20108k = gt5Var;
        if (b2 != true) {
            zIsFeatureEnabled = false;
        } else if (z2) {
            zIsFeatureEnabled = HsdpFeatureHelper.isFeatureEnabled(context, HsdpFeature.SERVICE_BASED_HSDP_PERSISTENT_OPEN_AFFORDANCE);
        } else {
            zIsFeatureEnabled = z6 ? true : HsdpFeatureHelper.isFeatureEnabled(context, HsdpFeature.HSDP_PERSISTENT_OPEN_AFFORDANCE);
        }
        gs5Var.f20103f = zIsFeatureEnabled;
        if (gt5Var != null) {
            Activity activity2 = (Activity) context;
            Application application = activity2.getApplication();
            if (!gt5Var.f20119d) {
                zs5 zs5Var = new zs5(b == true ? 1 : 0);
                zs5Var.f36348b = gt5Var;
                VarHandle.storeStoreFence();
                application.registerActivityLifecycleCallbacks(zs5Var);
                gt5Var.f20119d = true;
            }
            ct5 ct5Var = (ct5) gt5Var.f20116a.get(activity2);
            if (ct5Var != null && ct5Var.f16474i) {
                View decorView = activity2.getWindow().getDecorView();
                ps5 ps5Var = new ps5();
                ps5Var.f27952a = activity2;
                ps5Var.f27953b = ct5Var;
                ps5Var.f27954c = gs5Var;
                VarHandle.storeStoreFence();
                decorView.addOnAttachStateChangeListener(ps5Var);
            }
            vs5 vs5Var = new vs5();
            vs5Var.f32842a = activity2;
            vs5Var.f32843b = gs5Var;
            vs5Var.f32844c = gt5Var;
            VarHandle.storeStoreFence();
            activity2.registerComponentCallbacks(vs5Var);
            gt5Var.f20118c.put(activity2, vs5Var);
        }
        if (!z3) {
            VarHandle.storeStoreFence();
            return gs5Var;
        }
        if (z8) {
            VarHandle.storeStoreFence();
            return gs5Var;
        }
        Log.w("HsdpDeepLinkServiceImpl", "sdkManagedConfigurationChanges is enabled but context is not an Activity.");
        VarHandle.storeStoreFence();
        return gs5Var;
    }

    public static w06 lambda$createInternal$0(Context context, boolean z) {
        Intent intentCreateHpoaServiceIntent = createHpoaServiceIntent(context, z);
        Activity activity = (Activity) context;
        em6 em6Var = new em6();
        em6Var.f18266b = activity;
        if (s36.m10518a(activity)) {
            em6Var.f18265a = new cw5(activity.getApplicationContext(), "HpoaService", intentCreateHpoaServiceIntent, new aj5((byte) 27));
        } else {
            em6Var.f18265a = null;
        }
        VarHandle.storeStoreFence();
        return em6Var;
    }

    public static xx1 create(Activity activity, boolean z) {
        return create(activity, z, false);
    }

    public static xx1 create(Activity activity) {
        return create(activity, false);
    }

    public static xx1 create(Activity activity, boolean z, boolean z2, boolean z3) {
        return createInternal(activity, z, z2, z3, !z2);
    }

    public static xx1 create(Activity activity, boolean z, boolean z2, boolean z3, boolean z4) {
        return createInternal(activity, z, z2, z3, z4);
    }

    public static xx1 create(Context context) {
        return createInternal(context, false, true, false, false);
    }
}
