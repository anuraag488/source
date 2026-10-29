package p000;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cd6 {

    /* JADX INFO: renamed from: a */
    public Context f15963a;

    /* JADX INFO: renamed from: b */
    public qe4 f15964b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cd6) {
            cd6 cd6Var = (cd6) obj;
            if (this.f15963a.equals(cd6Var.f15963a)) {
                qe4 qe4Var = this.f15964b;
                qe4 qe4Var2 = cd6Var.f15964b;
                if (qe4Var != null ? qe4Var.equals(qe4Var2) : qe4Var2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f15963a.hashCode() ^ 1000003;
        qe4 qe4Var = this.f15964b;
        return (qe4Var == null ? 0 : qe4Var.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.f15963a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f15964b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        zi4.m13599B(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
