package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: r6 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class C1097r6 implements wq1, Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f29031a;

    /* JADX INFO: renamed from: b */
    public final Class f29032b;

    /* JADX INFO: renamed from: c */
    public final String f29033c;

    /* JADX INFO: renamed from: d */
    public final String f29034d;

    /* JADX INFO: renamed from: e */
    public final boolean f29035e = false;

    /* JADX INFO: renamed from: f */
    public final byte f29036f;

    /* JADX INFO: renamed from: g */
    public final int f29037g;

    /* JADX WARN: Multi-variable type inference failed */
    public C1097r6(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.f29031a = obj;
        this.f29032b = cls;
        this.f29033c = str;
        this.f29034d = str2;
        this.f29036f = i;
        this.f29037g = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1097r6)) {
            return false;
        }
        C1097r6 c1097r6 = (C1097r6) obj;
        return this.f29035e == c1097r6.f29035e && this.f29036f == c1097r6.f29036f && this.f29037g == c1097r6.f29037g && z62.m13387o(this.f29031a, c1097r6.f29031a) && this.f29032b.equals(c1097r6.f29032b) && this.f29033c.equals(c1097r6.f29033c) && this.f29034d.equals(c1097r6.f29034d);
    }

    @Override // p000.wq1
    public final int getArity() {
        return this.f29036f;
    }

    public final int hashCode() {
        Object obj = this.f29031a;
        return ((((zi4.m13613m(zi4.m13613m((this.f29032b.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, this.f29033c, 31), this.f29034d, 31) + (this.f29035e ? 1231 : 1237)) * 31) + this.f29036f) * 31) + this.f29037g;
    }

    public final String toString() {
        rl3.f29396a.getClass();
        return sl3.m10870a(this);
    }
}
