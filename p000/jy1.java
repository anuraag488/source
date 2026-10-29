package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jy1 extends ii4 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f22741e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ oy1 f22742f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22743g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f22744h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jy1(String str, oy1 oy1Var, int i, int i2, byte b) {
        super(str, true);
        this.f22741e = b;
        this.f22742f = oy1Var;
        this.f22743g = i;
        this.f22744h = i2;
    }

    @Override // p000.ii4
    /* JADX INFO: renamed from: a */
    public final long mo6810a() {
        byte b = this.f22741e;
        int i = this.f22744h;
        int i2 = this.f22743g;
        oy1 oy1Var = this.f22742f;
        switch (b) {
            case 0:
                try {
                    oy1Var.f27229w.m12445k(i2, i, true);
                } catch (IOException e) {
                    oy1Var.m9328a(2, 2, e);
                }
                break;
            default:
                try {
                    oy1Var.f27229w.m12446l(i2, i);
                } catch (IOException e2) {
                    oy1Var.m9328a(2, 2, e2);
                }
                break;
        }
        return -1L;
        return -1L;
    }
}
