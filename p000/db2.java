package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class db2 {

    /* JADX INFO: renamed from: a */
    public short f16894a;

    /* JADX INFO: renamed from: b */
    public boolean f16895b;

    /* JADX INFO: renamed from: c */
    public Object[] f16896c;

    /* JADX INFO: renamed from: d */
    public int[] f16897d;

    /* JADX INFO: renamed from: e */
    public int f16898e;

    /* JADX INFO: renamed from: a */
    public final String m4417a() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f16898e + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.f16896c[i2];
            if (obj instanceof g24) {
                g24 g24Var = (g24) obj;
                boolean zM13387o = z62.m13387o(g24Var.mo4431c(), rd4.f29189k);
                int[] iArr = this.f16897d;
                if (!zM13387o) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(g24Var.mo4433e(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(this.f16897d[i2]);
                    sb.append("]");
                }
            } else if (obj == ia5.f21223n) {
                sb.append("[<debug info disabled>]");
            } else if (obj != gb5.f19716g) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m4418b() {
        int i = this.f16898e * 2;
        this.f16896c = Arrays.copyOf(this.f16896c, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        AbstractC0990oo.m9204Y(this.f16897d, iArr, 0, 0, 14);
        this.f16897d = iArr;
    }

    public final String toString() {
        return m4417a();
    }
}
