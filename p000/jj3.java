package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jj3 implements ij3 {

    /* JADX INFO: renamed from: a */
    public final String f22332a;

    /* JADX INFO: renamed from: b */
    public final tz4 f22333b;

    /* JADX INFO: renamed from: c */
    public final hj3 f22334c;

    /* JADX INFO: renamed from: d */
    public final qk5 f22335d;

    /* JADX INFO: renamed from: e */
    public final qk5 f22336e;

    /* JADX INFO: renamed from: f */
    public final qk5 f22337f;

    /* JADX INFO: renamed from: g */
    public final float[] f22338g;

    /* JADX INFO: renamed from: h */
    public final float[] f22339h;

    public jj3(String str, tz4 tz4Var, hj3 hj3Var, qk5 qk5Var, qk5 qk5Var2, qk5 qk5Var3) {
        this.f22332a = str;
        this.f22333b = tz4Var;
        this.f22334c = hj3Var;
        this.f22335d = qk5Var;
        this.f22336e = qk5Var2;
        this.f22337f = qk5Var3;
        mc0.m8272a("RGB");
        qk5 qk5Var4 = lj3.f24070a;
        float f = qk5Var.f28547a;
        float f2 = qk5Var2.f28547a;
        float f3 = qk5Var3.f28547a;
        float f4 = qk5Var.f28548b;
        float f5 = qk5Var2.f28548b;
        float f6 = qk5Var3.f28548b;
        float[] fArr = {f, f2, f3, f4, f5, f6, (1.0f - f) - f4, (1.0f - f2) - f5, (1.0f - f3) - f6};
        qk5 qk5Var5 = tz4Var.f31569b;
        float[] fArrM5358h0 = ev0.m5358h0(fArr);
        float f7 = qk5Var5.f28547a;
        float f8 = qk5Var5.f28549c;
        float f9 = (f7 * f8) / qk5Var5.f28548b;
        float fM9896a = qk5Var5.m9896a();
        float[] fArrM5347W = ev0.m5347W((fArrM5358h0[2] * fM9896a) + (fArrM5358h0[1] * f8) + (fArrM5358h0[0] * f9), (fArrM5358h0[5] * fM9896a) + (fArrM5358h0[4] * f8) + (fArrM5358h0[3] * f9), (fArrM5358h0[8] * fM9896a) + (fArrM5358h0[7] * f8) + (fArrM5358h0[6] * f9), fArr);
        this.f22338g = fArrM5347W;
        this.f22339h = ev0.m5358h0(fArrM5347W);
    }

    @Override // p000.ij3
    /* JADX INFO: renamed from: e */
    public final fj3 mo5129e(float f, float f2, float f3, float f4) {
        fj3 fj3Var = new fj3();
        fj3Var.f19042a = f;
        fj3Var.f19043b = f2;
        fj3Var.f19044c = f3;
        fj3Var.f19045d = f4;
        fj3Var.f19046e = this;
        VarHandle.storeStoreFence();
        return fj3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij3)) {
            return false;
        }
        ij3 ij3Var = (ij3) obj;
        if (!this.f22332a.equals(ij3Var.getName()) || !z62.m13387o(this.f22333b, ij3Var.mo5130f()) || !this.f22334c.equals(ij3Var.mo5132j())) {
            return false;
        }
        if (!(obj instanceof jj3)) {
            return Arrays.equals(this.f22338g, ij3Var.mo5131g()) && Arrays.equals(this.f22339h, ij3Var.mo5133l());
        }
        jj3 jj3Var = (jj3) obj;
        return z62.m13387o(this.f22335d, jj3Var.f22335d) && z62.m13387o(this.f22336e, jj3Var.f22336e) && z62.m13387o(this.f22337f, jj3Var.f22337f);
    }

    @Override // p000.vz4
    /* JADX INFO: renamed from: f */
    public final tz4 mo5130f() {
        return this.f22333b;
    }

    @Override // p000.ij3
    /* JADX INFO: renamed from: g */
    public final float[] mo5131g() {
        return this.f22338g;
    }

    @Override // p000.kc0
    public final String getName() {
        return this.f22332a;
    }

    public final int hashCode() {
        return this.f22337f.hashCode() + ((this.f22336e.hashCode() + ((this.f22335d.hashCode() + ((this.f22334c.hashCode() + ((this.f22333b.hashCode() + (this.f22332a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // p000.ij3
    /* JADX INFO: renamed from: j */
    public final hj3 mo5132j() {
        return this.f22334c;
    }

    @Override // p000.ij3
    /* JADX INFO: renamed from: l */
    public final float[] mo5133l() {
        return this.f22339h;
    }

    public final String toString() {
        return this.f22332a;
    }
}
