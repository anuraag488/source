package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ky1 extends ii4 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ oy1 f23610e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f23611f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ w30 f23612g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f23613h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky1(String str, oy1 oy1Var, int i, w30 w30Var, int i2, boolean z) {
        super(str, true);
        this.f23610e = oy1Var;
        this.f23611f = i;
        this.f23612g = w30Var;
        this.f23613h = i2;
    }

    @Override // p000.ii4
    /* JADX INFO: renamed from: a */
    public final long mo6810a() {
        try {
            gb5 gb5Var = this.f23610e.f27217k;
            w30 w30Var = this.f23612g;
            int i = this.f23613h;
            gb5Var.getClass();
            w30Var.m12048D(i);
            this.f23610e.f27229w.m12446l(this.f23611f, 9);
            synchronized (this.f23610e) {
                this.f23610e.f27231y.remove(Integer.valueOf(this.f23611f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
