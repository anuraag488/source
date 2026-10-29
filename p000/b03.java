package p000;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b03 extends rw2 {

    /* JADX INFO: renamed from: o */
    public rw2 f14981o;

    /* JADX INFO: renamed from: p */
    public boolean f14982p;

    @Override // p000.rw2, p000.e94
    /* JADX INFO: renamed from: c */
    public final void mo3384c() {
        if (this.f17914c) {
            return;
        }
        super.mo3384c();
        if (this.f14982p) {
            return;
        }
        this.f14982p = true;
        this.f14981o.mo5020l();
    }

    @Override // p000.rw2
    /* JADX INFO: renamed from: w */
    public final y42 mo3385w() {
        b03 b03Var;
        rw2 rw2Var = this.f14981o;
        if (rw2Var.f29686m || rw2Var.f17914c) {
            return new f94(this);
        }
        mw2 mw2Var = this.f29681h;
        long j = this.f17913b;
        HashMap mapM7456m = mw2Var != null ? k94.m7456m(rw2Var.mo5015g(), this, this.f14981o.mo5014d()) : null;
        Object obj = k94.f23012c;
        synchronized (obj) {
            try {
                k94.m7465v(this);
                if (mw2Var == null || mw2Var.f25260d == 0) {
                    b03Var = this;
                    b03Var.m5012a();
                } else {
                    b03Var = this;
                    y42 y42VarM10477z = b03Var.m10477z(this.f14981o.mo5015g(), mw2Var, mapM7456m, this.f14981o.mo5014d());
                    if (!y42VarM10477z.equals(g94.f19676k)) {
                        return y42VarM10477z;
                    }
                    mw2 mw2VarMo6059x = b03Var.f14981o.mo6059x();
                    if (mw2VarMo6059x != null) {
                        mw2VarMo6059x.m8418j(mw2Var);
                    } else {
                        b03Var.f14981o.mo6056B(mw2Var);
                        b03Var.f29681h = null;
                    }
                }
                if (z62.m13394v(b03Var.f14981o.mo5015g(), j) < 0) {
                    b03Var.f14981o.m10476v();
                }
                rw2 rw2Var2 = b03Var.f14981o;
                rw2Var2.mo5025r(rw2Var2.mo5014d().m6701b(j).m6700a(b03Var.f29683j));
                b03Var.f14981o.m10475A(j);
                rw2 rw2Var3 = b03Var.f14981o;
                int i = b03Var.f17915d;
                b03Var.f17915d = -1;
                if (i >= 0) {
                    int[] iArr = rw2Var3.f29684k;
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    rw2Var3.f29684k = iArrCopyOf;
                } else {
                    rw2Var3.getClass();
                }
                rw2 rw2Var4 = b03Var.f14981o;
                i94 i94Var = b03Var.f29683j;
                rw2Var4.getClass();
                synchronized (obj) {
                    rw2Var4.f29683j = rw2Var4.f29683j.m6703d(i94Var);
                    rw2 rw2Var5 = b03Var.f14981o;
                    int[] iArr2 = b03Var.f29684k;
                    rw2Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = rw2Var5.f29684k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        rw2Var5.f29684k = iArr2;
                    }
                }
                b03Var.f29686m = true;
                if (!b03Var.f14982p) {
                    b03Var.f14982p = true;
                    b03Var.f14981o.mo5020l();
                }
                return g94.f19676k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
