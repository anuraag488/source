package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class iv2 {

    /* JADX INFO: renamed from: a */
    public float[] f21820a;

    /* JADX INFO: renamed from: b */
    public int f21821b;

    public iv2(int i) {
        this.f21820a = i == 0 ? li1.f24045a : new float[i];
    }

    /* JADX INFO: renamed from: c */
    public static String m6943c(iv2 iv2Var, int i) {
        String str = (i & 2) != 0 ? "" : "[";
        String str2 = (i & 4) == 0 ? "]" : "";
        iv2Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        float[] fArr = iv2Var.f21820a;
        int i2 = iv2Var.f21821b;
        for (int i3 = 0; i3 < i2; i3++) {
            float f = fArr[i3];
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(f);
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m6944a(float f) {
        int i = this.f21821b + 1;
        float[] fArrCopyOf = this.f21820a;
        if (fArrCopyOf.length < i) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, Math.max(i, (fArrCopyOf.length * 3) / 2));
            this.f21820a = fArrCopyOf;
        }
        int i2 = this.f21821b;
        fArrCopyOf[i2] = f;
        this.f21821b = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final float m6945b(int i) {
        if (i >= 0 && i < this.f21821b) {
            return this.f21820a[i];
        }
        kx5.m7733s0("Index must be between 0 and size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iv2) {
            iv2 iv2Var = (iv2) obj;
            int i = iv2Var.f21821b;
            int i2 = this.f21821b;
            if (i == i2) {
                float[] fArr = this.f21820a;
                float[] fArr2 = iv2Var.f21820a;
                r52 r52VarM10660c0 = sc6.m10660c0(0, i2);
                int i3 = r52VarM10660c0.f27382a;
                int i4 = r52VarM10660c0.f27383b;
                if (i3 > i4) {
                    return true;
                }
                while (fArr[i3] == fArr2[i3]) {
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
        float[] fArr = this.f21820a;
        int i = this.f21821b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Float.hashCode(fArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        return m6943c(this, 25);
    }
}
