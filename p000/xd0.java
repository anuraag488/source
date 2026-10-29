package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xd0 implements a71 {

    /* JADX INFO: renamed from: a */
    public final C0875lk f34166a;

    /* JADX INFO: renamed from: b */
    public final int f34167b;

    public xd0(String str, int i) {
        this(new C0875lk(str), i);
    }

    @Override // p000.a71
    /* JADX INFO: renamed from: a */
    public final void mo117a(c71 c71Var) {
        int i = c71Var.f15853d;
        C0875lk c0875lk = this.f34166a;
        if (i != -1) {
            c71Var.m3860d(i, c0875lk.f24092b, c71Var.f15854e);
        } else {
            c71Var.m3860d(c71Var.f15851b, c0875lk.f24092b, c71Var.f15852c);
        }
        int i2 = c71Var.f15851b;
        int i3 = c71Var.f15852c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.f34167b;
        int iM10675p = sc6.m10675p(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - c0875lk.f24092b.length(), 0, c71Var.f15850a.m8598b());
        c71Var.m3862f(iM10675p, iM10675p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd0)) {
            return false;
        }
        xd0 xd0Var = (xd0) obj;
        return z62.m13387o(this.f34166a.f24092b, xd0Var.f34166a.f24092b) && this.f34167b == xd0Var.f34167b;
    }

    public final int hashCode() {
        return (this.f34166a.f24092b.hashCode() * 31) + this.f34167b;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + this.f34166a.f24092b + "', newCursorPosition=" + this.f34167b + ")";
    }

    public xd0(C0875lk c0875lk, int i) {
        this.f34166a = c0875lk;
        this.f34167b = i;
    }
}
