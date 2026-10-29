package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xk4 {

    /* JADX INFO: renamed from: a */
    public final C0875lk f34341a;

    /* JADX INFO: renamed from: b */
    public final long f34342b;

    /* JADX INFO: renamed from: c */
    public final ql4 f34343c;

    static {
        ev3.m5407a(new n14((byte) 11), new r54((byte) 24));
    }

    public xk4(C0875lk c0875lk, long j, ql4 ql4Var) {
        ql4 ql4VarM9897a;
        this.f34341a = c0875lk;
        this.f34342b = sc6.m10679t(c0875lk.f24092b.length(), j);
        if (ql4Var != null) {
            ql4VarM9897a = ql4.m9897a(sc6.m10679t(c0875lk.f24092b.length(), ql4Var.f28558a));
        } else {
            ql4VarM9897a = null;
        }
        this.f34343c = ql4VarM9897a;
    }

    /* JADX INFO: renamed from: a */
    public static xk4 m12702a(xk4 xk4Var, C0875lk c0875lk, long j, int i) {
        if ((i & 1) != 0) {
            c0875lk = xk4Var.f34341a;
        }
        if ((i & 2) != 0) {
            j = xk4Var.f34342b;
        }
        ql4 ql4Var = (i & 4) != 0 ? xk4Var.f34343c : null;
        xk4Var.getClass();
        return new xk4(c0875lk, j, ql4Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk4)) {
            return false;
        }
        xk4 xk4Var = (xk4) obj;
        return ql4.m9899c(this.f34342b, xk4Var.f34342b) && z62.m13387o(this.f34343c, xk4Var.f34343c) && z62.m13387o(this.f34341a, xk4Var.f34341a);
    }

    public final int hashCode() {
        int iHashCode = this.f34341a.hashCode() * 31;
        int i = ql4.f28557c;
        int iM13612l = zi4.m13612l(iHashCode, this.f34342b, 31);
        ql4 ql4Var = this.f34343c;
        return iM13612l + (ql4Var != null ? Long.hashCode(ql4Var.f28558a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f34341a) + "', selection=" + ql4.m9905i(this.f34342b) + ", composition=" + this.f34343c + ")";
    }

    public xk4(int i, long j, String str) {
        this(new C0875lk((i & 1) != 0 ? "" : str), (i & 2) != 0 ? ql4.f28556b : j, (ql4) null);
    }
}
