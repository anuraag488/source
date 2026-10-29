package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v34 implements a71 {

    /* JADX INFO: renamed from: a */
    public final C0875lk f32359a;

    /* JADX INFO: renamed from: b */
    public final int f32360b;

    public v34(String str, int i) {
        this.f32359a = new C0875lk(str);
        this.f32360b = i;
    }

    @Override // p000.a71
    /* JADX INFO: renamed from: a */
    public final void mo117a(c71 c71Var) {
        String str = this.f32359a.f24092b;
        int i = c71Var.f15853d;
        if (i != -1) {
            c71Var.m3860d(i, str, c71Var.f15854e);
            if (str.length() > 0) {
                c71Var.m3861e(i, str.length() + i);
            }
        } else {
            int i2 = c71Var.f15851b;
            c71Var.m3860d(i2, str, c71Var.f15852c);
            if (str.length() > 0) {
                c71Var.m3861e(i2, str.length() + i2);
            }
        }
        int i3 = c71Var.f15851b;
        int i4 = c71Var.f15852c;
        int i5 = i3 == i4 ? i4 : -1;
        int i6 = this.f32360b;
        int iM10675p = sc6.m10675p(i6 > 0 ? (i5 + i6) - 1 : (i5 + i6) - str.length(), 0, c71Var.f15850a.m8598b());
        c71Var.m3862f(iM10675p, iM10675p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v34)) {
            return false;
        }
        v34 v34Var = (v34) obj;
        return z62.m13387o(this.f32359a.f24092b, v34Var.f32359a.f24092b) && this.f32360b == v34Var.f32360b;
    }

    public final int hashCode() {
        return (this.f32359a.f24092b.hashCode() * 31) + this.f32360b;
    }

    public final String toString() {
        return "SetComposingTextCommand(text='" + this.f32359a.f24092b + "', newCursorPosition=" + this.f32360b + ")";
    }
}
