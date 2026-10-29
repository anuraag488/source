package p000;

/* JADX INFO: renamed from: gj */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0690gj extends pf2 {

    /* JADX INFO: renamed from: o */
    public yo4 f19807o;

    /* JADX INFO: renamed from: p */
    public sw2 f19808p;

    /* JADX INFO: renamed from: q */
    public C0727hj f19809q;

    /* JADX INFO: renamed from: r */
    public db3 f19810r;

    /* JADX INFO: renamed from: s */
    public db3 f19811s;

    /* JADX INFO: renamed from: t */
    public long f19812t;

    /* JADX INFO: renamed from: u */
    public long f19813u;

    /* JADX INFO: renamed from: v */
    public C0614ej f19814v;

    /* JADX INFO: renamed from: w */
    public C0614ej f19815w;

    /* JADX INFO: renamed from: x */
    public long f19816x;

    @Override // p000.mt2
    /* JADX INFO: renamed from: I0 */
    public final void mo6006I0() {
        this.f19816x = -9223372034707292160L;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        long j2;
        db3 db3VarMo5826e = sq2Var.mo5826e(j);
        if (zq2Var.mo3587z()) {
            j2 = (((long) db3VarMo5826e.f16899a) << 32) | (((long) db3VarMo5826e.f16900b) & 4294967295L);
        } else {
            yo4 yo4Var = this.f19807o;
            int i = db3VarMo5826e.f16899a;
            if (yo4Var == null) {
                j2 = (((long) i) << 32) | (((long) db3VarMo5826e.f16900b) & 4294967295L);
                this.f19816x = j2;
            } else {
                long j3 = (((long) db3VarMo5826e.f16900b) & 4294967295L) | (((long) i) << 32);
                xo4 xo4VarM13208a = yo4Var.m13208a(new C0653fj(this, j3, (byte) 0), null, null, new C0653fj(this, j3, (byte) 1));
                this.f19809q.getClass();
                j2 = ((w52) xo4VarM13208a.getValue()).f33109a;
                this.f19816x = ((w52) xo4VarM13208a.getValue()).f33109a;
            }
        }
        boolean zMo3587z = zq2Var.mo3587z();
        w71 w71Var = w71.f33134a;
        if (zMo3587z) {
            this.f19810r = db3VarMo5826e;
            this.f19812t = j2;
            return zq2Var.mo3583l0((int) (j2 >> 32), (int) (j2 & 4294967295L), w71Var, this.f19814v);
        }
        this.f19811s = db3VarMo5826e;
        this.f19813u = j2;
        return zq2Var.mo3583l0((int) (j2 >> 32), (int) (j2 & 4294967295L), w71Var, this.f19815w);
    }
}
