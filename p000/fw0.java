package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fw0 implements sq2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19350a;

    /* JADX INFO: renamed from: b */
    public final sq2 f19351b;

    /* JADX INFO: renamed from: c */
    public final Enum f19352c;

    /* JADX INFO: renamed from: d */
    public final Enum f19353d;

    public /* synthetic */ fw0(sq2 sq2Var, Enum r2, Enum r3, byte b) {
        this.f19350a = b;
        this.f19351b = sq2Var;
        this.f19352c = r2;
        this.f19353d = r3;
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: W */
    public final int mo5823W(int i) {
        switch (this.f19350a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f19351b.mo5823W(i);
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: Z */
    public final int mo5824Z(int i) {
        switch (this.f19350a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f19351b.mo5824Z(i);
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: b0 */
    public final int mo5825b0(int i) {
        switch (this.f19350a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f19351b.mo5825b0(i);
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: e */
    public final db3 mo5826e(long j) {
        byte b = this.f19350a;
        Enum r1 = this.f19352c;
        Enum r2 = this.f19353d;
        sq2 sq2Var = this.f19351b;
        switch (b) {
            case 0:
                t62 t62Var = (t62) r1;
                if (((w62) r2) == w62.f33120a) {
                    return new qh1(t62Var == t62.f30798b ? sq2Var.mo5824Z(kl0.m7538h(j)) : sq2Var.mo5823W(kl0.m7538h(j)), kl0.m7534d(j) ? kl0.m7538h(j) : 32767, (byte) 0);
                }
                return new qh1(kl0.m7535e(j) ? kl0.m7539i(j) : 32767, t62Var == t62.f30798b ? sq2Var.mo5827h(kl0.m7539i(j)) : sq2Var.mo5825b0(kl0.m7539i(j)), (byte) 0);
            case 1:
                ir2 ir2Var = (ir2) r1;
                if (((jr2) r2) == jr2.f22540a) {
                    return new qh1(ir2Var == ir2.f21712b ? sq2Var.mo5824Z(kl0.m7538h(j)) : sq2Var.mo5823W(kl0.m7538h(j)), kl0.m7534d(j) ? kl0.m7538h(j) : 32767, (byte) 1);
                }
                return new qh1(kl0.m7535e(j) ? kl0.m7539i(j) : 32767, ir2Var == ir2.f21712b ? sq2Var.mo5827h(kl0.m7539i(j)) : sq2Var.mo5825b0(kl0.m7539i(j)), (byte) 1);
            default:
                h13 h13Var = (h13) r1;
                if (((i13) r2) == i13.f21006a) {
                    return new qh1(h13Var == h13.f20265b ? sq2Var.mo5824Z(kl0.m7538h(j)) : sq2Var.mo5823W(kl0.m7538h(j)), kl0.m7534d(j) ? kl0.m7538h(j) : 32767, (byte) 2);
                }
                return new qh1(kl0.m7535e(j) ? kl0.m7539i(j) : 32767, h13Var == h13.f20265b ? sq2Var.mo5827h(kl0.m7539i(j)) : sq2Var.mo5825b0(kl0.m7539i(j)), (byte) 2);
        }
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: h */
    public final int mo5827h(int i) {
        switch (this.f19350a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f19351b.mo5827h(i);
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: m */
    public final Object mo4423m() {
        switch (this.f19350a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f19351b.mo4423m();
    }
}
