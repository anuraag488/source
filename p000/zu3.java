package p000;

import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zu3 {

    /* JADX INFO: renamed from: a */
    public av3 f36384a;

    /* JADX INFO: renamed from: b */
    public g32 f36385b;

    /* JADX INFO: renamed from: c */
    public r50 f36386c;

    /* JADX INFO: renamed from: d */
    public LinkedHashMap f36387d;

    /* JADX INFO: renamed from: e */
    public boolean f36388e;

    /* JADX INFO: renamed from: f */
    public Bundle f36389f;

    /* JADX INFO: renamed from: g */
    public boolean f36390g;

    /* JADX INFO: renamed from: h */
    public boolean f36391h;

    /* JADX INFO: renamed from: a */
    public final void m13795a() {
        av3 av3Var = this.f36384a;
        if (av3Var.getLifecycle().mo6016b() != fk2.f19055b) {
            C1077qn.m9989o("Restarter must be created only during owner's initialization stage");
            return;
        }
        if (this.f36388e) {
            C1077qn.m9989o("SavedStateRegistry was already attached.");
            return;
        }
        this.f36385b.invoke();
        gk2 lifecycle = av3Var.getLifecycle();
        C0749i4 c0749i4 = new C0749i4((byte) 2);
        c0749i4.f21112b = this;
        VarHandle.storeStoreFence();
        lifecycle.mo6015a(c0749i4);
        this.f36388e = true;
    }
}
