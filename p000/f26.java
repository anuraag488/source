package p000;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f26 extends h26 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Long f18688e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f18689f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f18690g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Bundle f18691h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f18692i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f18693j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ x36 f18694k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f26(x36 x36Var, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(x36Var, true);
        this.f18688e = l;
        this.f18689f = str;
        this.f18690g = str2;
        this.f18691h = bundle;
        this.f18692i = z;
        this.f18693j = z2;
        this.f18694k = x36Var;
    }

    @Override // p000.h26
    /* JADX INFO: renamed from: a */
    public final void mo3419a() {
        Long l = this.f18688e;
        long jLongValue = l == null ? this.f20287a : l.longValue();
        gx5 gx5Var = this.f18694k.f33967g;
        y42.m12854a0(gx5Var);
        gx5Var.logEvent(this.f18689f, this.f18690g, this.f18691h, this.f18692i, this.f18693j, jLongValue);
    }
}
