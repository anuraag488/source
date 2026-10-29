package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l74 extends pf2 {

    /* JADX INFO: renamed from: o */
    public InterfaceC1407zj f23835o;

    /* JADX INFO: renamed from: p */
    public C0853kz f23836p;

    /* JADX INFO: renamed from: q */
    public long f23837q;

    /* JADX INFO: renamed from: r */
    public long f23838r;

    /* JADX INFO: renamed from: s */
    public boolean f23839s;

    /* JADX INFO: renamed from: t */
    public d83 f23840t;

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        this.f23837q = -9223372034707292160L;
        this.f23839s = false;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: I0 */
    public final void mo6006I0() {
        this.f23840t.setValue(null);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        db3 db3VarMo5826e;
        j74 j74Var;
        long jM8012d;
        j74 j74Var2;
        d83 d83Var = this.f23840t;
        if (zq2Var.mo3587z()) {
            this.f23838r = j;
            this.f23839s = true;
            db3VarMo5826e = sq2Var.mo5826e(j);
        } else {
            db3VarMo5826e = sq2Var.mo5826e(this.f23839s ? this.f23838r : j);
        }
        db3 db3Var = db3VarMo5826e;
        char c = ' ';
        long j2 = (((long) db3Var.f16900b) & 4294967295L) | (((long) db3Var.f16899a) << 32);
        if (zq2Var.mo3587z()) {
            this.f23837q = j2;
            c = ' ';
            jM8012d = j2;
            j2 = jM8012d;
        } else {
            long j3 = !w52.m12108c(this.f23837q, -9223372034707292160L) ? this.f23837q : j2;
            j74 j74Var3 = (j74) d83Var.getValue();
            if (j74Var3 != null) {
                C0910mi c0910mi = j74Var3.f22077a;
                boolean z = (w52.m12108c(j3, ((w52) c0910mi.m8328d()).f33109a) || c0910mi.m8329e()) ? false : true;
                if (!w52.m12108c(j3, ((w52) c0910mi.f24931e.getValue()).f33109a) || z) {
                    j74Var3.f22078b = ((w52) c0910mi.m8328d()).f33109a;
                    j74Var2 = j74Var3;
                    lb5.m7910S(m8391C0(), null, null, new k31((Object) j74Var2, j3, (Object) this, (wm0) null, (byte) 4), 3);
                } else {
                    j74Var2 = j74Var3;
                }
                j74Var = j74Var2;
            } else {
                long j4 = j3;
                C0910mi c0910mi2 = new C0910mi(w52.m12106a(j4), sw4.f30619h, w52.m12106a(4294967297L), 8);
                j74Var = new j74();
                j74Var.f22077a = c0910mi2;
                j74Var.f22078b = j4;
                VarHandle.storeStoreFence();
            }
            d83Var.setValue(j74Var);
            jM8012d = ll0.m8012d(j, ((w52) j74Var.f22077a.m8328d()).f33109a);
        }
        int i = (int) (jM8012d >> c);
        int i2 = (int) (jM8012d & 4294967295L);
        return zq2Var.mo3583l0(i, i2, w71.f33134a, new k74(this, j2, i, i2, zq2Var, db3Var));
    }
}
