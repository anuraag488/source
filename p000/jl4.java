package p000;

import android.graphics.RectF;
import android.text.Layout;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jl4 {

    /* JADX INFO: renamed from: a */
    public final il4 f22400a;

    /* JADX INFO: renamed from: b */
    public final yu2 f22401b;

    /* JADX INFO: renamed from: c */
    public final long f22402c;

    /* JADX INFO: renamed from: d */
    public final float f22403d;

    /* JADX INFO: renamed from: e */
    public final float f22404e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f22405f;

    public jl4(il4 il4Var, yu2 yu2Var, long j) {
        this.f22400a = il4Var;
        this.f22401b = yu2Var;
        this.f22402c = j;
        ArrayList arrayList = yu2Var.f35539h;
        float fM6431d = 0.0f;
        this.f22403d = arrayList.isEmpty() ? 0.0f : ((n73) arrayList.get(0)).f25497a.f34185c.m6431d(0) + 0.0f;
        if (!arrayList.isEmpty()) {
            n73 n73Var = (n73) hb0.m6306R0(arrayList);
            hl4 hl4Var = n73Var.f25497a.f34185c;
            fM6431d = hl4Var.m6431d(hl4Var.f20680g - 1) + 0.0f + n73Var.f25502f;
        }
        this.f22404e = fM6431d;
        this.f22405f = yu2Var.f35538g;
    }

    /* JADX INFO: renamed from: a */
    public final oo3 m7175a(int i) {
        yu2 yu2Var = this.f22401b;
        yu2Var.m13251k(i);
        int length = ((C0875lk) yu2Var.f35532a.f29651b).f24092b.length();
        ArrayList arrayList = yu2Var.f35539h;
        n73 n73Var = (n73) arrayList.get(i == length ? kx5.m7689T(arrayList) : ks5.m7613n(arrayList, i));
        return n73Var.f25497a.f34185c.f20679f.isRtlCharAt(n73Var.m8572d(i)) ? oo3.f26926b : oo3.f26925a;
    }

    /* JADX INFO: renamed from: b */
    public final jl3 m7176b(int i) {
        float fM6438k;
        float fM6438k2;
        float fM6437j;
        float fM6437j2;
        yu2 yu2Var = this.f22401b;
        yu2Var.m13250j(i);
        ArrayList arrayList = yu2Var.f35539h;
        n73 n73Var = (n73) arrayList.get(ks5.m7613n(arrayList, i));
        C1328xe c1328xe = n73Var.f25497a;
        int iM8572d = n73Var.m8572d(i);
        CharSequence charSequence = c1328xe.f34186d;
        if (iM8572d < 0 || iM8572d >= charSequence.length()) {
            r32.m10186a("offset(" + iM8572d + ") is out of bounds [0," + charSequence.length() + ")");
        }
        hl4 hl4Var = c1328xe.f34185c;
        int iM6434g = hl4Var.m6434g(iM8572d);
        float fM6436i = hl4Var.m6436i(iM6434g);
        float fM6432e = hl4Var.m6432e(iM6434g);
        Layout layout = hl4Var.f20679f;
        boolean z = layout.getParagraphDirection(iM6434g) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iM8572d);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fM6437j = hl4Var.m6438k(iM8572d, false);
                fM6437j2 = hl4Var.m6438k(iM8572d + 1, true);
            } else if (zIsRtlCharAt) {
                fM6437j = hl4Var.m6437j(iM8572d, false);
                fM6437j2 = hl4Var.m6437j(iM8572d + 1, true);
            } else {
                fM6438k = hl4Var.m6438k(iM8572d, false);
                fM6438k2 = hl4Var.m6438k(iM8572d + 1, true);
            }
            float f = fM6437j;
            fM6438k = fM6437j2;
            fM6438k2 = f;
        } else {
            fM6438k = hl4Var.m6437j(iM8572d, false);
            fM6438k2 = hl4Var.m6437j(iM8572d + 1, true);
        }
        RectF rectF = new RectF(fM6438k, fM6436i, fM6438k2, fM6432e);
        return n73Var.m8569a(new jl3(rectF.left, rectF.top + 0.0f, rectF.right, rectF.bottom + 0.0f));
    }

    /* JADX INFO: renamed from: c */
    public final jl3 m7177c(int i) {
        yu2 yu2Var = this.f22401b;
        yu2Var.m13251k(i);
        int length = ((C0875lk) yu2Var.f35532a.f29651b).f24092b.length();
        ArrayList arrayList = yu2Var.f35539h;
        n73 n73Var = (n73) arrayList.get(i == length ? kx5.m7689T(arrayList) : ks5.m7613n(arrayList, i));
        C1328xe c1328xe = n73Var.f25497a;
        int iM8572d = n73Var.m8572d(i);
        CharSequence charSequence = c1328xe.f34186d;
        hl4 hl4Var = c1328xe.f34185c;
        if (iM8572d < 0 || iM8572d > charSequence.length()) {
            r32.m10186a("offset(" + iM8572d + ") is out of bounds [0," + charSequence.length() + "]");
        }
        float fM6437j = hl4Var.m6437j(iM8572d, false);
        int iM6434g = hl4Var.m6434g(iM8572d);
        return n73Var.m8569a(new jl3(fM6437j, hl4Var.m6436i(iM6434g) + 0.0f, fM6437j, hl4Var.m6432e(iM6434g) + 0.0f));
    }

    /* JADX INFO: renamed from: d */
    public final float m7178d(int i) {
        yu2 yu2Var = this.f22401b;
        yu2Var.m13252l(i);
        ArrayList arrayList = yu2Var.f35539h;
        n73 n73Var = (n73) arrayList.get(ks5.m7614o(arrayList, i));
        C1328xe c1328xe = n73Var.f25497a;
        int i2 = i - n73Var.f25500d;
        hl4 hl4Var = c1328xe.f34185c;
        return hl4Var.f20679f.getLineLeft(i2) + (i2 == hl4Var.f20680g + (-1) ? hl4Var.f20683j : 0.0f);
    }

    /* JADX INFO: renamed from: e */
    public final float m7179e(int i) {
        yu2 yu2Var = this.f22401b;
        yu2Var.m13252l(i);
        ArrayList arrayList = yu2Var.f35539h;
        n73 n73Var = (n73) arrayList.get(ks5.m7614o(arrayList, i));
        C1328xe c1328xe = n73Var.f25497a;
        int i2 = i - n73Var.f25500d;
        hl4 hl4Var = c1328xe.f34185c;
        return hl4Var.f20679f.getLineRight(i2) + (i2 == hl4Var.f20680g + (-1) ? hl4Var.f20684k : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jl4) {
            jl4 jl4Var = (jl4) obj;
            if (z62.m13387o(this.f22400a, jl4Var.f22400a) && this.f22401b == jl4Var.f22401b && w52.m12108c(this.f22402c, jl4Var.f22402c) && this.f22403d == jl4Var.f22403d && this.f22404e == jl4Var.f22404e && z62.m13387o(this.f22405f, jl4Var.f22405f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m7180f(int i) {
        yu2 yu2Var = this.f22401b;
        yu2Var.m13252l(i);
        ArrayList arrayList = yu2Var.f35539h;
        n73 n73Var = (n73) arrayList.get(ks5.m7614o(arrayList, i));
        C1328xe c1328xe = n73Var.f25497a;
        return c1328xe.f34185c.f20679f.getLineStart(i - n73Var.f25500d) + n73Var.f25498b;
    }

    /* JADX INFO: renamed from: g */
    public final oo3 m7181g(int i) {
        yu2 yu2Var = this.f22401b;
        yu2Var.m13251k(i);
        int length = ((C0875lk) yu2Var.f35532a.f29651b).f24092b.length();
        ArrayList arrayList = yu2Var.f35539h;
        n73 n73Var = (n73) arrayList.get(i == length ? kx5.m7689T(arrayList) : ks5.m7613n(arrayList, i));
        C1328xe c1328xe = n73Var.f25497a;
        int iM8572d = n73Var.m8572d(i);
        hl4 hl4Var = c1328xe.f34185c;
        return hl4Var.f20679f.getParagraphDirection(hl4Var.m6434g(iM8572d)) == 1 ? oo3.f26925a : oo3.f26926b;
    }

    /* JADX INFO: renamed from: h */
    public final C0489bf m7182h(int i, int i2) {
        yu2 yu2Var = this.f22401b;
        C0875lk c0875lk = (C0875lk) yu2Var.f35532a.f29651b;
        if (i < 0 || i > i2 || i2 > c0875lk.f24092b.length()) {
            int length = c0875lk.f24092b.length();
            StringBuilder sbM13624x = zi4.m13624x("Start(", i, ") or End(", i2, ") is out of range [0..");
            sbM13624x.append(length);
            sbM13624x.append("), or start > end!");
            r32.m10186a(sbM13624x.toString());
        }
        if (i == i2) {
            return AbstractC0573df.m4495a();
        }
        C0489bf c0489bfM4495a = AbstractC0573df.m4495a();
        ArrayList arrayList = yu2Var.f35539h;
        long jM10657b = sc6.m10657b(i, i2);
        m42 m42Var = new m42((byte) 4);
        m42Var.f24638b = c0489bfM4495a;
        m42Var.f24639c = i;
        m42Var.f24640d = i2;
        VarHandle.storeStoreFence();
        ks5.m7616q(arrayList, jM10657b, m42Var);
        return c0489bfM4495a;
    }

    public final int hashCode() {
        return this.f22405f.hashCode() + c75.m3874f(this.f22404e, c75.m3874f(this.f22403d, zi4.m13612l((this.f22401b.hashCode() + (this.f22400a.hashCode() * 31)) * 31, this.f22402c, 31), 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final long m7183i(int i) {
        int iM8606j;
        int iM8605i;
        int iM8605i2;
        yu2 yu2Var = this.f22401b;
        yu2Var.m13251k(i);
        int length = ((C0875lk) yu2Var.f35532a.f29651b).f24092b.length();
        ArrayList arrayList = yu2Var.f35539h;
        n73 n73Var = (n73) arrayList.get(i == length ? kx5.m7689T(arrayList) : ks5.m7613n(arrayList, i));
        C1328xe c1328xe = n73Var.f25497a;
        int iM8572d = n73Var.m8572d(i);
        n83 n83VarM6439l = c1328xe.f34185c.m6439l();
        if (n83VarM6439l.m8604h(n83VarM6439l.m8606j(iM8572d))) {
            n83VarM6439l.m8597a(iM8572d);
            iM8606j = iM8572d;
            while (iM8606j != -1 && (!n83VarM6439l.m8604h(iM8606j) || n83VarM6439l.m8600d(iM8606j))) {
                iM8606j = n83VarM6439l.m8606j(iM8606j);
            }
        } else {
            n83VarM6439l.m8597a(iM8572d);
            if (n83VarM6439l.m8603g(iM8572d)) {
                iM8606j = (!n83VarM6439l.m8601e(iM8572d) || n83VarM6439l.m8599c(iM8572d)) ? n83VarM6439l.m8606j(iM8572d) : iM8572d;
            } else {
                iM8606j = n83VarM6439l.m8599c(iM8572d) ? n83VarM6439l.m8606j(iM8572d) : -1;
            }
        }
        if (iM8606j == -1) {
            iM8606j = iM8572d;
        }
        if (n83VarM6439l.m8600d(n83VarM6439l.m8605i(iM8572d))) {
            n83VarM6439l.m8597a(iM8572d);
            iM8605i = iM8572d;
            while (iM8605i != -1 && (n83VarM6439l.m8604h(iM8605i) || !n83VarM6439l.m8600d(iM8605i))) {
                iM8605i = n83VarM6439l.m8605i(iM8605i);
            }
        } else {
            n83VarM6439l.m8597a(iM8572d);
            if (n83VarM6439l.m8599c(iM8572d)) {
                if (!n83VarM6439l.m8601e(iM8572d) || n83VarM6439l.m8603g(iM8572d)) {
                    iM8605i2 = n83VarM6439l.m8605i(iM8572d);
                    iM8605i = iM8605i2;
                } else {
                    iM8605i = iM8572d;
                }
            } else if (n83VarM6439l.m8603g(iM8572d)) {
                iM8605i2 = n83VarM6439l.m8605i(iM8572d);
                iM8605i = iM8605i2;
            } else {
                iM8605i = -1;
            }
        }
        if (iM8605i != -1) {
            iM8572d = iM8605i;
        }
        return n73Var.m8570b(sc6.m10657b(iM8606j, iM8572d), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f22400a + ", multiParagraph=" + this.f22401b + ", size=" + w52.m12109d(this.f22402c) + ", firstBaseline=" + this.f22403d + ", lastBaseline=" + this.f22404e + ", placeholderRects=" + this.f22405f + ")";
    }
}
