package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xq5 implements wx1 {

    /* JADX INFO: renamed from: a */
    public final wx1 f34536a;

    /* JADX INFO: renamed from: b */
    public boolean f34537b;

    /* JADX INFO: renamed from: c */
    public boolean f34538c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gs5 f34539d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f34540e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Activity f34541f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ wx1 f34542g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f34543h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f34544i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Map f34545j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ gs5 f34546k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xq5(gs5 gs5Var, wx1 wx1Var, wx1 wx1Var2, Activity activity, String str, String str2, Map map) {
        this(gs5Var, wx1Var);
        this.f34540e = (byte) 0;
        this.f34542g = wx1Var2;
        this.f34541f = activity;
        this.f34543h = str;
        this.f34544i = str2;
        this.f34545j = map;
        this.f34546k = gs5Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m12747a() {
        wx1 wx1Var;
        if (Log.isLoggable("HsdpDeepLinkServiceImpl", 4)) {
            Log.i("HsdpDeepLinkServiceImpl", "onAffordanceEnded: isForwardingStopped=" + this.f34538c);
        }
        if (this.f34538c || (wx1Var = this.f34536a) == null) {
            return;
        }
        wx1Var.onAffordanceEnded();
    }

    /* JADX INFO: renamed from: b */
    public final void m12748b() {
        wx1 wx1Var;
        if (this.f34538c || (wx1Var = this.f34536a) == null) {
            return;
        }
        wx1Var.onAffordanceStarted();
    }

    /* JADX INFO: renamed from: c */
    public final void m12749c(Bundle bundle) {
        gs5 gs5Var = this.f34539d;
        boolean z = gs5Var.f20103f;
        if (Log.isLoggable("HsdpDeepLinkServiceImpl", 4)) {
            Log.i("HsdpDeepLinkServiceImpl", "onDismissed: isForwardingStopped=" + this.f34538c + ", hasBeenShown=" + this.f34537b + ", isHpoaSupported=" + z);
        }
        if (this.f34538c) {
            return;
        }
        if (!this.f34537b) {
            Log.i("HsdpDeepLinkServiceImpl", "Ignoring onDismissed callback received before onShown (likely late callback from previous session).");
            return;
        }
        boolean zM6155f = gs5.m6155f(gs5Var);
        Context context = gs5Var.f20098a;
        gt5 gt5Var = gs5Var.f20108k;
        if (zM6155f) {
            return;
        }
        if (gt5Var != null) {
            Log.i("HsdpDeepLinkServiceImpl", "Removing session from activeSessions onDismissed");
            gt5Var.m6164a((Activity) context);
        }
        wx1 wx1Var = this.f34536a;
        if (wx1Var != null) {
            wx1Var.onDismissed(bundle);
        }
        String str = gs5Var.f20104g;
        if (!z || str == null) {
            return;
        }
        Activity activity = (Activity) context;
        yn3 yn3Var = new yn3((byte) 3);
        yn3Var.f35360b = this;
        yn3Var.f35361c = str;
        yn3Var.f35362d = activity;
        VarHandle.storeStoreFence();
        activity.runOnUiThread(yn3Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m12750d(Bundle bundle) {
        if (Log.isLoggable("HsdpDeepLinkServiceImpl", 4)) {
            Log.i("HsdpDeepLinkServiceImpl", "onError: isForwardingStopped=" + this.f34538c + ", event=" + String.valueOf(bundle));
        }
        if (this.f34538c) {
            return;
        }
        gs5 gs5Var = this.f34539d;
        boolean zM6155f = gs5.m6155f(gs5Var);
        gt5 gt5Var = gs5Var.f20108k;
        if (zM6155f) {
            return;
        }
        if (gt5Var != null) {
            Log.i("HsdpDeepLinkServiceImpl", "Removing session from activeSessions onError");
            gt5Var.m6164a((Activity) gs5Var.f20098a);
        }
        wx1 wx1Var = this.f34536a;
        if (wx1Var != null) {
            wx1Var.onError(bundle);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12751e(Bundle bundle) {
        if (this.f34538c) {
            return;
        }
        this.f34537b = true;
        wx1 wx1Var = this.f34536a;
        if (wx1Var != null) {
            wx1Var.onShown(bundle);
        }
    }

    @Override // p000.wx1
    public final void onAffordanceEnded() {
        byte b = this.f34540e;
        gs5 gs5Var = this.f34546k;
        switch (b) {
            case 0:
                if (!gs5Var.f20103f) {
                    qm5.m9919j("HPOA service should not be called in service based HSDP.");
                } else {
                    m12747a();
                }
                break;
            default:
                if (!gs5Var.f20103f) {
                    qm5.m9919j("HPOA service should not be called in service based HSDP.");
                } else {
                    m12747a();
                }
                break;
        }
    }

    @Override // p000.wx1
    public final void onAffordanceStarted() {
        byte b = this.f34540e;
        gs5 gs5Var = this.f34546k;
        switch (b) {
            case 0:
                if (!gs5Var.f20103f) {
                    qm5.m9919j("HPOA service should not be called in service based HSDP.");
                } else {
                    m12748b();
                }
                break;
            default:
                if (!gs5Var.f20103f) {
                    qm5.m9919j("HPOA service should not be called in service based HSDP.");
                } else {
                    m12748b();
                }
                break;
        }
    }

    @Override // p000.wx1
    public final void onDeepLinkStarted() {
        switch (this.f34540e) {
            case 0:
                throw new UnsupportedOperationException("HSDP Activity should not be started in service based HSDP.");
            default:
                throw new UnsupportedOperationException("HSDP Activity should not be started in service based HSDP.");
        }
    }

    @Override // p000.wx1
    public void onDismissed(Bundle bundle) {
        switch (this.f34540e) {
            case 1:
                if (!gs5.m6155f(this.f34546k)) {
                    br5 br5Var = new br5((byte) 0);
                    br5Var.f15530b = this;
                    VarHandle.storeStoreFence();
                    this.f34541f.runOnUiThread(br5Var);
                    m12749c(bundle);
                    break;
                }
                break;
            default:
                m12749c(bundle);
                break;
        }
    }

    @Override // p000.wx1
    public final void onError(Bundle bundle) {
        byte b = this.f34540e;
        Map map = this.f34545j;
        String str = this.f34544i;
        String str2 = this.f34543h;
        wx1 wx1Var = this.f34542g;
        gs5 gs5Var = this.f34546k;
        Activity activity = this.f34541f;
        switch (b) {
            case 0:
                if (!gs5.m6155f(gs5Var)) {
                    if (bundle.getInt("errorCode", 6) != 8) {
                        if (wx1Var != null) {
                            tq5 tq5Var = new tq5((byte) 0);
                            tq5Var.f31346g = this;
                            tq5Var.f31342c = activity;
                            tq5Var.f31343d = str2;
                            tq5Var.f31344e = str;
                            tq5Var.f31341b = wx1Var;
                            tq5Var.f31345f = map;
                            VarHandle.storeStoreFence();
                            activity.runOnUiThread(tq5Var);
                        }
                        m12750d(bundle);
                    } else {
                        m12750d(bundle);
                    }
                    break;
                }
                break;
            default:
                if (!gs5.m6155f(gs5Var)) {
                    byte b2 = 1;
                    if (bundle.getInt("errorCode", 6) != 8) {
                        tq5 tq5Var2 = new tq5(b2);
                        tq5Var2.f31346g = this;
                        tq5Var2.f31341b = wx1Var;
                        tq5Var2.f31342c = activity;
                        tq5Var2.f31343d = str2;
                        tq5Var2.f31344e = str;
                        tq5Var2.f31345f = map;
                        VarHandle.storeStoreFence();
                        activity.runOnUiThread(tq5Var2);
                        m12750d(bundle);
                    } else {
                        br5 br5Var = new br5(b2);
                        br5Var.f15530b = this;
                        VarHandle.storeStoreFence();
                        activity.runOnUiThread(br5Var);
                        m12750d(bundle);
                    }
                    break;
                }
                break;
        }
    }

    @Override // p000.wx1
    public void onShown(Bundle bundle) {
        switch (this.f34540e) {
            case 1:
                br5 br5Var = new br5((byte) 2);
                br5Var.f15530b = this;
                VarHandle.storeStoreFence();
                this.f34541f.runOnUiThread(br5Var);
                m12751e(bundle);
                break;
            default:
                m12751e(bundle);
                break;
        }
    }

    public xq5(gs5 gs5Var, wx1 wx1Var) {
        this.f34539d = gs5Var;
        this.f34537b = false;
        this.f34538c = false;
        this.f34536a = wx1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xq5(gs5 gs5Var, wx1 wx1Var, Activity activity, wx1 wx1Var2, String str, String str2, Map map) {
        this(gs5Var, wx1Var);
        this.f34540e = (byte) 1;
        this.f34541f = activity;
        this.f34542g = wx1Var2;
        this.f34543h = str;
        this.f34544i = str2;
        this.f34545j = map;
        this.f34546k = gs5Var;
    }
}
