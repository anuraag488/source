package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c71 {

    /* JADX INFO: renamed from: a */
    public final n83 f15850a;

    /* JADX INFO: renamed from: b */
    public int f15851b;

    /* JADX INFO: renamed from: c */
    public int f15852c;

    /* JADX INFO: renamed from: d */
    public int f15853d;

    /* JADX INFO: renamed from: e */
    public int f15854e;

    public c71(C0875lk c0875lk, long j) {
        String str = c0875lk.f24092b;
        n83 n83Var = new n83((byte) 0);
        n83Var.f25534d = str;
        n83Var.f25532b = -1;
        n83Var.f25533c = -1;
        this.f15850a = n83Var;
        this.f15851b = ql4.m9903g(j);
        this.f15852c = ql4.m9902f(j);
        this.f15853d = -1;
        this.f15854e = -1;
        int iM9903g = ql4.m9903g(j);
        int iM9902f = ql4.m9902f(j);
        if (iM9903g < 0 || iM9903g > str.length()) {
            xy4.m12792u(zi4.m13618r(iM9903g, str.length(), "start (", ") offset is outside of text region "));
            throw null;
        }
        if (iM9902f < 0 || iM9902f > str.length()) {
            xy4.m12792u(zi4.m13618r(iM9902f, str.length(), "end (", ") offset is outside of text region "));
            throw null;
        }
        if (iM9903g <= iM9902f) {
            return;
        }
        C1077qn.m9987m(zi4.m13618r(iM9903g, iM9902f, "Do not set reversed range: ", " > "));
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m3857a(int i, int i2) {
        long jM10657b = sc6.m10657b(i, i2);
        this.f15850a.m8607k(i, "", i2);
        long jM13766L = zt5.m13766L(sc6.m10657b(this.f15851b, this.f15852c), jM10657b);
        m3864h(ql4.m9903g(jM13766L));
        m3863g(ql4.m9902f(jM13766L));
        int i3 = this.f15853d;
        if (i3 != -1) {
            long jM13766L2 = zt5.m13766L(sc6.m10657b(i3, this.f15854e), jM10657b);
            if (ql4.m9900d(jM13766L2)) {
                this.f15853d = -1;
                this.f15854e = -1;
            } else {
                this.f15853d = ql4.m9903g(jM13766L2);
                this.f15854e = ql4.m9902f(jM13766L2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final char m3858b(int i) {
        n83 n83Var = this.f15850a;
        xa0 xa0Var = (xa0) n83Var.f25535e;
        if (xa0Var == null) {
            return ((String) n83Var.f25534d).charAt(i);
        }
        if (i < n83Var.f25532b) {
            return ((String) n83Var.f25534d).charAt(i);
        }
        int iM12596c = xa0Var.f34092b - xa0Var.m12596c();
        int i2 = n83Var.f25532b;
        if (i >= iM12596c + i2) {
            return ((String) n83Var.f25534d).charAt(i - ((iM12596c - n83Var.f25533c) + i2));
        }
        int i3 = i - i2;
        int i4 = xa0Var.f34093c;
        char[] cArr = (char[]) xa0Var.f34095e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + xa0Var.f34094d];
    }

    /* JADX INFO: renamed from: c */
    public final ql4 m3859c() {
        int i = this.f15853d;
        if (i != -1) {
            return ql4.m9897a(sc6.m10657b(i, this.f15854e));
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m3860d(int i, String str, int i2) {
        n83 n83Var = this.f15850a;
        if (i < 0 || i > n83Var.m8598b()) {
            xy4.m12792u(zi4.m13618r(i, n83Var.m8598b(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > n83Var.m8598b()) {
            xy4.m12792u(zi4.m13618r(i2, n83Var.m8598b(), "end (", ") offset is outside of text region "));
            return;
        }
        if (i > i2) {
            C1077qn.m9987m(zi4.m13618r(i, i2, "Do not set reversed range: ", " > "));
            return;
        }
        n83Var.m8607k(i, str, i2);
        m3864h(str.length() + i);
        m3863g(str.length() + i);
        this.f15853d = -1;
        this.f15854e = -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m3861e(int i, int i2) {
        n83 n83Var = this.f15850a;
        if (i < 0 || i > n83Var.m8598b()) {
            xy4.m12792u(zi4.m13618r(i, n83Var.m8598b(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > n83Var.m8598b()) {
            xy4.m12792u(zi4.m13618r(i2, n83Var.m8598b(), "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            C1077qn.m9987m(zi4.m13618r(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.f15853d = i;
            this.f15854e = i2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3862f(int i, int i2) {
        n83 n83Var = this.f15850a;
        if (i < 0 || i > n83Var.m8598b()) {
            xy4.m12792u(zi4.m13618r(i, n83Var.m8598b(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > n83Var.m8598b()) {
            xy4.m12792u(zi4.m13618r(i2, n83Var.m8598b(), "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            C1077qn.m9987m(zi4.m13618r(i, i2, "Do not set reversed range: ", " > "));
        } else {
            m3864h(i);
            m3863g(i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3863g(int i) {
        if (!(i >= 0)) {
            r32.m10186a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.f15852c = i;
    }

    /* JADX INFO: renamed from: h */
    public final void m3864h(int i) {
        if (!(i >= 0)) {
            r32.m10186a("Cannot set selectionStart to a negative value: " + i);
        }
        this.f15851b = i;
    }

    public final String toString() {
        return this.f15850a.toString();
    }
}
