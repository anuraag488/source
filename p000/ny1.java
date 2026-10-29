package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ny1 extends ii4 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ oy1 f26191e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f26192f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f26193g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny1(String str, oy1 oy1Var, int i, long j) {
        super(str, true);
        this.f26191e = oy1Var;
        this.f26192f = i;
        this.f26193g = j;
    }

    @Override // p000.ii4
    /* JADX INFO: renamed from: a */
    public final long mo6810a() {
        oy1 oy1Var = this.f26191e;
        try {
            oy1Var.f27229w.m12447q(this.f26192f, this.f26193g);
            return -1L;
        } catch (IOException e) {
            oy1Var.m9328a(2, 2, e);
            return -1L;
        }
    }
}
