package p000;

import android.view.autofill.AutofillValue;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mo0 extends qx0 implements g14 {

    /* JADX INFO: renamed from: q */
    public uo4 f25072q;

    /* JADX INFO: renamed from: r */
    public xk4 f25073r;

    /* JADX INFO: renamed from: s */
    public uj2 f25074s;

    /* JADX INFO: renamed from: t */
    public boolean f25075t;

    /* JADX INFO: renamed from: u */
    public vi3 f25076u;

    /* JADX INFO: renamed from: v */
    public pk4 f25077v;

    /* JADX INFO: renamed from: w */
    public l12 f25078w;

    /* JADX INFO: renamed from: x */
    public jl1 f25079x;

    /* JADX INFO: renamed from: R0 */
    public static void m8365R0(uj2 uj2Var, String str, boolean z) {
        if (z) {
            el4 el4Var = uj2Var.f31916e;
            zn0 zn0Var = uj2Var.f31933v;
            if (el4Var == null) {
                int length = str.length();
                zn0Var.invoke(new xk4(4, sc6.m10657b(length, length), str));
            } else {
                xk4 xk4VarM8747e = uj2Var.f31915d.m8747e(kx5.m7694Y(new dy0(), new xd0(str, 1)));
                el4Var.m5192a(null, xk4VarM8747e);
                zn0Var.invoke(xk4VarM8747e);
            }
        }
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: i0 */
    public final void mo4513i0(q14 q14Var) {
        C0875lk c0875lk = this.f25073r.f34341a;
        ic2[] ic2VarArr = o14.f26289a;
        p14 p14Var = m14.f24538E;
        ic2[] ic2VarArr2 = o14.f26289a;
        ic2 ic2Var = ic2VarArr2[18];
        p14Var.getClass();
        q14Var.mo4898a(p14Var, c0875lk);
        C0875lk c0875lk2 = this.f25072q.f32033a;
        p14 p14Var2 = m14.f24539F;
        ic2 ic2Var2 = ic2VarArr2[19];
        p14Var2.getClass();
        q14Var.mo4898a(p14Var2, c0875lk2);
        long j = this.f25073r.f34342b;
        p14 p14Var3 = m14.f24540G;
        ic2 ic2Var3 = ic2VarArr2[20];
        ql4 ql4VarM9897a = ql4.m9897a(j);
        p14Var3.getClass();
        q14Var.mo4898a(p14Var3, ql4VarM9897a);
        bm0.f15408a.getClass();
        C0794jd c0794jd = am0.f14624c;
        p14 p14Var4 = m14.f24570s;
        ic2 ic2Var4 = ic2VarArr2[9];
        p14Var4.getClass();
        q14Var.mo4898a(p14Var4, c0794jd);
        C1401zd c1401zd = new C1401zd(AutofillValue.forText(zc6.m13513J(this.f25073r.f34341a)));
        p14 p14Var5 = m14.f24571t;
        ic2 ic2Var5 = ic2VarArr2[10];
        p14Var5.getClass();
        q14Var.mo4898a(p14Var5, c1401zd);
        lo0 lo0Var = new lo0((byte) 0);
        lo0Var.f24221b = this;
        VarHandle.storeStoreFence();
        q14Var.mo4898a(d14.f16711h, new C1353y2(null, lo0Var));
        int i = this.f25078w.f23699c;
        if (i == 6) {
            mm0.f25019a.getClass();
            o14.m8922c(q14Var, lm0.f24150c);
        } else if (i == 7 || i == 8) {
            mm0.f25019a.getClass();
            o14.m8922c(q14Var, lm0.f24149b);
        } else if (i == 4) {
            mm0.f25019a.getClass();
            o14.m8922c(q14Var, lm0.f24151d);
        }
        if (!this.f25075t) {
            q14Var.mo4898a(m14.f24561j, ju4.f22634a);
        }
        boolean z = this.f25075t;
        p14 p14Var6 = m14.f24549P;
        ic2 ic2Var6 = ic2VarArr2[28];
        Boolean boolValueOf = Boolean.valueOf(z);
        p14Var6.getClass();
        q14Var.mo4898a(p14Var6, boolValueOf);
        lo0 lo0Var2 = new lo0((byte) 1);
        lo0Var2.f24221b = this;
        VarHandle.storeStoreFence();
        o14.m8920a(q14Var, lo0Var2);
        byte b = 3;
        byte b2 = 2;
        if (z) {
            lo0 lo0Var3 = new lo0(b2);
            lo0Var3.f24221b = this;
            VarHandle.storeStoreFence();
            q14Var.mo4898a(d14.f16714k, new C1353y2(null, lo0Var3));
            lo0 lo0Var4 = new lo0(b);
            lo0Var4.f24221b = this;
            VarHandle.storeStoreFence();
            q14Var.mo4898a(d14.f16718o, new C1353y2(null, lo0Var4));
        }
        C0928n c0928n = new C0928n((byte) 5);
        c0928n.f25353b = this;
        VarHandle.storeStoreFence();
        q14Var.mo4898a(d14.f16713j, new C1353y2(null, c0928n));
        int i2 = this.f25078w.f23700d;
        ko0 ko0Var = new ko0((byte) 6);
        ko0Var.f23270b = this;
        VarHandle.storeStoreFence();
        q14Var.mo4898a(m14.f24542I, k12.m7357a(i2));
        q14Var.mo4898a(d14.f16719p, new C1353y2(null, ko0Var));
        ko0 ko0Var2 = new ko0((byte) 7);
        ko0Var2.f23270b = this;
        VarHandle.storeStoreFence();
        q14Var.mo4898a(d14.f16705b, new C1353y2(null, ko0Var2));
        ko0 ko0Var3 = new ko0((byte) 1);
        ko0Var3.f23270b = this;
        VarHandle.storeStoreFence();
        q14Var.mo4898a(d14.f16706c, new C1353y2(null, ko0Var3));
        if (!ql4.m9900d(this.f25073r.f34342b)) {
            ko0 ko0Var4 = new ko0((byte) 2);
            ko0Var4.f23270b = this;
            VarHandle.storeStoreFence();
            q14Var.mo4898a(d14.f16720q, new C1353y2(null, ko0Var4));
            if (this.f25075t) {
                ko0 ko0Var5 = new ko0((byte) 3);
                ko0Var5.f23270b = this;
                VarHandle.storeStoreFence();
                q14Var.mo4898a(d14.f16721r, new C1353y2(null, ko0Var5));
            }
        }
        if (this.f25075t) {
            ko0 ko0Var6 = new ko0((byte) 5);
            ko0Var6.f23270b = this;
            VarHandle.storeStoreFence();
            q14Var.mo4898a(d14.f16722s, new C1353y2(null, ko0Var6));
        }
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: n0 */
    public final boolean mo5883n0() {
        return true;
    }
}
