package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rv2 {

    /* JADX INFO: renamed from: a */
    public long[] f29664a;

    /* JADX INFO: renamed from: b */
    public int f29665b;

    public rv2(int i) {
        this.f29664a = i == 0 ? oo2.f26924a : new long[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m10470a(long j) {
        int i = this.f29665b + 1;
        long[] jArrCopyOf = this.f29664a;
        if (jArrCopyOf.length < i) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i, (jArrCopyOf.length * 3) / 2));
            this.f29664a = jArrCopyOf;
        }
        int i2 = this.f29665b;
        jArrCopyOf[i2] = j;
        this.f29665b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rv2) {
            rv2 rv2Var = (rv2) obj;
            int i = rv2Var.f29665b;
            int i2 = this.f29665b;
            if (i == i2) {
                long[] jArr = this.f29664a;
                long[] jArr2 = rv2Var.f29664a;
                r52 r52VarM10660c0 = sc6.m10660c0(0, i2);
                int i3 = r52VarM10660c0.f27382a;
                int i4 = r52VarM10660c0.f27383b;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f29664a;
        int i = this.f29665b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        long[] jArr = this.f29664a;
        int i = this.f29665b;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(j);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ rv2() {
        this(16);
    }
}
