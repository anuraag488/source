package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ps */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1045ps extends xp0 {

    /* JADX INFO: renamed from: a */
    public String f27927a;

    /* JADX INFO: renamed from: b */
    public byte[] f27928b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xp0) {
            xp0 xp0Var = (xp0) obj;
            C1045ps c1045ps = (C1045ps) xp0Var;
            if (this.f27927a.equals(c1045ps.f27927a)) {
                if (Arrays.equals(this.f27928b, xp0Var instanceof C1045ps ? ((C1045ps) xp0Var).f27928b : c1045ps.f27928b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27928b) ^ ((this.f27927a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.f27927a + ", contents=" + Arrays.toString(this.f27928b) + "}";
    }
}
