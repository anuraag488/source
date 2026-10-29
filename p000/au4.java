package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class au4 {

    /* JADX INFO: renamed from: a */
    public yg3 f14881a;

    /* JADX INFO: renamed from: b */
    public yg3 f14882b;

    /* JADX INFO: renamed from: c */
    public int f14883c;

    /* JADX INFO: renamed from: d */
    public Long f14884d;

    /* JADX INFO: renamed from: e */
    public boolean f14885e;

    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX INFO: renamed from: a */
    public final void m3314a(xk4 xk4Var) {
        yg3 yg3Var;
        xk4 xk4Var2;
        this.f14885e = false;
        yg3 yg3Var2 = this.f14881a;
        if (z62.m13387o(xk4Var, yg3Var2 != null ? (xk4) yg3Var2.f35216c : null)) {
            return;
        }
        String str = xk4Var.f34341a.f24092b;
        yg3 yg3Var3 = this.f14881a;
        boolean zM13387o = z62.m13387o(str, (yg3Var3 == null || (xk4Var2 = (xk4) yg3Var3.f35216c) == null) ? null : xk4Var2.f34341a.f24092b);
        yg3 yg3Var4 = this.f14881a;
        if (zM13387o) {
            if (yg3Var4 != null) {
                yg3Var4.f35216c = xk4Var;
                return;
            }
            return;
        }
        this.f14881a = new yg3(yg3Var4, xk4Var, (byte) 7);
        this.f14882b = null;
        int length = xk4Var.f34341a.f24092b.length() + this.f14883c;
        this.f14883c = length;
        if (length > 100000) {
            yg3 yg3Var5 = this.f14881a;
            if ((yg3Var5 != null ? (yg3) yg3Var5.f35215b : null) == null) {
                return;
            }
            while (true) {
                if (yg3Var5 == null) {
                    yg3Var = null;
                } else {
                    yg3 yg3Var6 = (yg3) yg3Var5.f35215b;
                    if (yg3Var6 != null) {
                        yg3Var = (yg3) yg3Var6.f35215b;
                    } else {
                        yg3Var = null;
                    }
                }
                if (yg3Var == null) {
                    break;
                } else {
                    yg3Var5 = (yg3) yg3Var5.f35215b;
                }
            }
            if (yg3Var5 != null) {
                yg3Var5.f35215b = null;
            }
        }
    }
}
