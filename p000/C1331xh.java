package p000;

import java.util.List;

/* JADX INFO: renamed from: xh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1331xh extends b05 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gy4 f34276b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1331xh(gy4 gy4Var) {
        super(1);
        this.f34276b = gy4Var;
    }

    @Override // p000.b05
    /* JADX INFO: renamed from: d */
    public final w05 mo3392d(w05 w05Var, List list) {
        return this.f34276b.m3604f(w05Var);
    }

    @Override // p000.b05
    /* JADX INFO: renamed from: e */
    public final yg3 mo3393e(d05 d05Var, yg3 yg3Var) {
        w32 w32Var = (w32) this.f34276b.f15309z.f33299G.f25607d;
        if (w32Var.f33059e0.f25208n) {
            long jM12827F0 = y42.m12827F0(w32Var.mo4005S(0L));
            int i = (int) (jM12827F0 >> 32);
            if (i < 0) {
                i = 0;
            }
            int i2 = (int) (jM12827F0 & 4294967295L);
            if (i2 < 0) {
                i2 = 0;
            }
            long jMo4004R = y42.m12861j0(w32Var).mo4004R();
            int i3 = (int) (jMo4004R >> 32);
            int i4 = (int) (jMo4004R & 4294967295L);
            long j = w32Var.f16901c;
            long jM12827F1 = y42.m12827F0(w32Var.mo4005S((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
            int i5 = i3 - ((int) (jM12827F1 >> 32));
            if (i5 < 0) {
                i5 = 0;
            }
            int i6 = i4 - ((int) (jM12827F1 & 4294967295L));
            int i7 = i6 >= 0 ? i6 : 0;
            if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                g42 g42VarM3596e = AbstractC0492bi.m3596e((g42) yg3Var.f35215b, i, i2, i5, i7);
                g42 g42VarM3596e2 = AbstractC0492bi.m3596e((g42) yg3Var.f35216c, i, i2, i5, i7);
                yg3 yg3Var2 = new yg3((byte) 8);
                yg3Var2.f35215b = g42VarM3596e;
                yg3Var2.f35216c = g42VarM3596e2;
                return yg3Var2;
            }
        }
        return yg3Var;
    }
}
