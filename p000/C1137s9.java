package p000;

import java.util.Objects;

/* JADX INFO: renamed from: s9 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1137s9 extends AbstractC0640f7 {

    /* JADX INFO: renamed from: a */
    public int f29996a;

    /* JADX INFO: renamed from: b */
    public C0641f8 f29997b;

    /* JADX INFO: renamed from: b */
    public static nh3 m10562b() {
        nh3 nh3Var = new nh3((byte) 2, false);
        nh3Var.f25810b = null;
        nh3Var.f25811c = C0641f8.f18812m;
        return nh3Var;
    }

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f29997b != C0641f8.f18812m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1137s9)) {
            return false;
        }
        C1137s9 c1137s9 = (C1137s9) obj;
        return c1137s9.f29996a == this.f29996a && c1137s9.f29997b == this.f29997b;
    }

    public final int hashCode() {
        return Objects.hash(C1137s9.class, Integer.valueOf(this.f29996a), this.f29997b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.f29997b);
        sb.append(", ");
        return c75.m3880l(sb, this.f29996a, "-byte key)");
    }
}
