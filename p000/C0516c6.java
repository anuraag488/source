package p000;

import android.content.Context;
import android.util.TypedValue;
import java.util.Objects;

/* JADX INFO: renamed from: c6 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0516c6 {

    /* JADX INFO: renamed from: g */
    public static final C0516c6 f15819g = new C0516c6(320, 50, 56, "320x50_mb");

    /* JADX INFO: renamed from: h */
    public static final C0516c6 f15820h;

    /* JADX INFO: renamed from: i */
    public static final C0516c6 f15821i;

    /* JADX INFO: renamed from: a */
    public final int f15822a;

    /* JADX INFO: renamed from: b */
    public final int f15823b;

    /* JADX INFO: renamed from: c */
    public final boolean f15824c;

    /* JADX INFO: renamed from: d */
    public final boolean f15825d;

    /* JADX INFO: renamed from: e */
    public final boolean f15826e;

    /* JADX INFO: renamed from: f */
    public final String f15827f;

    static {
        new C0516c6(468, 60);
        f15820h = new C0516c6(320, 100);
        new C0516c6(728, 90);
        new C0516c6(300, 250);
        f15821i = new C0516c6(-3, -4, 56, "320x50_mb");
    }

    public C0516c6(int i, int i2, int i3, String str) {
        str = (i3 & 4) != 0 ? null : str;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        this.f15822a = i;
        this.f15823b = i2;
        this.f15824c = z;
        this.f15825d = z2;
        this.f15826e = z3;
        if (str == null) {
            str = i + "x" + i2 + "_as";
        }
        this.f15827f = str;
        if (i < 0 && i != -3) {
            C1077qn.m9988n(c75.m3877i(i, "Invalid width for AdSize: "));
            throw null;
        }
        if (i2 < 0 && i2 != -4) {
            C1077qn.m9988n(c75.m3877i(i2, "Invalid height for AdSize: "));
            throw null;
        }
        if (z2 && z) {
            C1077qn.m9987m("AdSize cannot be both inline and anchored adaptive");
            throw null;
        }
        if (z2 && z3) {
            C1077qn.m9987m("AdSize cannot be both inline and large anchored adaptive");
            throw null;
        }
        if (z && z3) {
            C1077qn.m9987m("AdSize cannot be both anchored and large anchored adaptive");
            throw null;
        }
        if (!z2 || i2 >= 1) {
            return;
        }
        C1077qn.m9987m("An inline AdSize must have a positive height");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public static int m3850a(Context context, int i) {
        if (i == -4 || i == -3) {
            return -1;
        }
        return (int) Math.ceil(TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics()));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3851b() {
        return this.f15822a == -3 && this.f15823b == -4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0516c6)) {
            return false;
        }
        C0516c6 c0516c6 = (C0516c6) obj;
        return this.f15822a == c0516c6.f15822a && this.f15823b == c0516c6.f15823b && z62.m13387o(this.f15827f, c0516c6.f15827f);
    }

    public final int hashCode() {
        return Objects.hash(this.f15827f, Boolean.valueOf(m3851b()));
    }

    public final String toString() {
        return this.f15827f + " " + (m3851b() ? "fluid" : "");
    }

    public C0516c6(int i, int i2) {
        this(i, i2, 56, null);
    }
}
