package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jj2 extends AbstractC0640f7 {

    /* JADX INFO: renamed from: a */
    public String f22330a;

    /* JADX INFO: renamed from: b */
    public C0973o7 f22331b;

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f22331b != C0973o7.f26398x;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jj2) {
            jj2 jj2Var = (jj2) obj;
            return jj2Var.f22330a.equals(this.f22330a) && jj2Var.f22331b == this.f22331b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(jj2.class, this.f22330a, this.f22331b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f22330a + ", variant: " + this.f22331b + ")";
    }
}
