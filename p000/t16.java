package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t16 extends h26 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f30724e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ x36 f30725f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t16(x36 x36Var, boolean z) {
        super(x36Var, true);
        this.f30724e = z;
        Objects.requireNonNull(x36Var);
        this.f30725f = x36Var;
    }

    @Override // p000.h26
    /* JADX INFO: renamed from: a */
    public final void mo3419a() {
        gx5 gx5Var = this.f30725f.f33967g;
        y42.m12854a0(gx5Var);
        gx5Var.setDataCollectionEnabled(this.f30724e);
    }
}
