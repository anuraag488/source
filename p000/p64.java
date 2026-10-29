package p000;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p64 extends us1 {

    /* JADX INFO: renamed from: c */
    public boolean f27403c;

    /* JADX INFO: renamed from: d */
    public C0602e8 f27404d;

    /* JADX INFO: renamed from: e */
    public Bundle f27405e;

    /* JADX INFO: renamed from: f */
    public Integer f27406f;

    @Override // p000.AbstractC1235ux
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = this.f27405e;
        C0602e8 c0602e8 = this.f27404d;
        if (!getContext().getPackageName().equals((String) c0602e8.f17870d)) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c0602e8.f17870d);
        }
        return bundle;
    }

    @Override // p000.AbstractC1235ux, p000.InterfaceC1074qk
    public final boolean requiresSignIn() {
        return this.f27403c;
    }
}
