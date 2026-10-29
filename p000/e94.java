package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class e94 {

    /* JADX INFO: renamed from: a */
    public i94 f17912a;

    /* JADX INFO: renamed from: b */
    public long f17913b;

    /* JADX INFO: renamed from: c */
    public boolean f17914c;

    /* JADX INFO: renamed from: d */
    public int f17915d;

    public e94(long j, i94 i94Var) {
        int iM10764a;
        int iNumberOfTrailingZeros;
        this.f17912a = i94Var;
        this.f17913b = j;
        r54 r54Var = k94.f23010a;
        if (j != 0) {
            i94 i94VarMo5014d = mo5014d();
            long j2 = i94VarMo5014d.f21194c;
            long[] jArr = i94VarMo5014d.f21195d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = i94VarMo5014d.f21193b;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = i94VarMo5014d.f21192a;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (k94.f23012c) {
                iM10764a = k94.f23015f.m10764a(j);
            }
        } else {
            iM10764a = -1;
        }
        this.f17915d = iM10764a;
    }

    /* JADX INFO: renamed from: q */
    public static void m5011q(e94 e94Var) {
        k94.f23011b.m11143B(e94Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m5012a() {
        synchronized (k94.f23012c) {
            mo5013b();
            mo5024p();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo5013b() {
        k94.f23013d = k94.f23013d.m6701b(mo5015g());
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo3384c();

    /* JADX INFO: renamed from: d */
    public i94 mo5014d() {
        return this.f17912a;
    }

    /* JADX INFO: renamed from: e */
    public abstract yp1 mo3783e();

    /* JADX INFO: renamed from: f */
    public boolean mo3784f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public long mo5015g() {
        return this.f17913b;
    }

    /* JADX INFO: renamed from: h */
    public int mo5016h() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public yp1 mo5017i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final e94 m5018j() {
        tt2 tt2Var = k94.f23011b;
        e94 e94Var = (e94) tt2Var.get();
        tt2Var.m11143B(this);
        return e94Var;
    }

    /* JADX INFO: renamed from: k */
    public void mo5019k() {
        kx5.m7741w0();
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public void mo5020l() {
        kx5.m7741w0();
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public void mo5022n(hc4 hc4Var) {
        r54 r54Var = k94.f23010a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: renamed from: o */
    public final void m5023o() {
        int i = this.f17915d;
        if (i >= 0) {
            k94.m7463t(i);
            this.f17915d = -1;
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo5024p() {
        m5023o();
    }

    /* JADX INFO: renamed from: r */
    public void mo5025r(i94 i94Var) {
        this.f17912a = i94Var;
    }

    /* JADX INFO: renamed from: s */
    public void mo5026s(long j) {
        this.f17913b = j;
    }

    /* JADX INFO: renamed from: t */
    public void mo5027t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* JADX INFO: renamed from: u */
    public abstract e94 mo3785u(yp1 yp1Var);

    /* JADX INFO: renamed from: m */
    public void mo5021m() {
    }
}
