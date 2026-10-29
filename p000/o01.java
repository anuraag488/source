package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o01 {

    /* JADX INFO: renamed from: a */
    public final n01 f26232a;

    static {
        new o01(0, "", 0);
    }

    public o01(int i, String str, int i2) {
        n01 n01Var = new n01();
        n01Var.f25355a = str;
        n01Var.f25356b = i;
        n01Var.f25357c = i2;
        VarHandle.storeStoreFence();
        this.f26232a = n01Var;
    }

    /* JADX INFO: renamed from: a */
    public static o01 m8913a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String string;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            StringBuilder sbM13624x = zi4.m13624x("M0,", i8, " A", i7, ",");
            sbM13624x.append(i8);
            sbM13624x.append(" 0 1,1 ");
            sbM13624x.append(i);
            sbM13624x.append(",");
            sbM13624x.append(i8);
            sbM13624x.append(" A");
            sbM13624x.append(i7);
            sbM13624x.append(",");
            sbM13624x.append(i8);
            sbM13624x.append(" 0 1,1 0,");
            sbM13624x.append(i8);
            sbM13624x.append(" Z");
            string = sbM13624x.toString();
        } else {
            StringBuilder sb = new StringBuilder("M ");
            int iMin = Math.min(i / 2, i2 / 2);
            int iMin2 = Math.min(iMin, i3);
            int iMin3 = Math.min(iMin, i4);
            int iMin4 = Math.min(iMin, i5);
            int iMin5 = Math.min(iMin, i6);
            sb.append(iMin2);
            sb.append(",0 L ");
            sb.append(i - iMin3);
            sb.append(",0");
            if (iMin3 > 0) {
                sb.append(" A ");
                sb.append(iMin3);
                sb.append(",");
                sb.append(iMin3);
                sb.append(" 0 0,1 ");
                sb.append(i);
                sb.append(",");
                sb.append(iMin3);
            }
            sb.append(" L ");
            sb.append(i);
            sb.append(",");
            sb.append(i2 - iMin4);
            if (iMin4 > 0) {
                sb.append(" A ");
                sb.append(iMin4);
                sb.append(",");
                sb.append(iMin4);
                sb.append(" 0 0,1 ");
                sb.append(i - iMin4);
                sb.append(",");
                sb.append(i2);
            }
            sb.append(" L ");
            sb.append(iMin5);
            sb.append(",");
            sb.append(i2);
            if (iMin5 > 0) {
                sb.append(" A ");
                sb.append(iMin5);
                sb.append(",");
                sb.append(iMin5);
                sb.append(" 0 0,1 0,");
                sb.append(i2 - iMin5);
            }
            if (iMin2 > 0) {
                sb.append(" L 0,");
                sb.append(iMin2);
                sb.append(" A ");
                sb.append(iMin2);
                sb.append(",");
                sb.append(iMin2);
                sb.append(" 0 0,1 ");
                sb.append(iMin2);
                sb.append(",0");
            }
            sb.append(" Z");
            string = sb.toString();
        }
        return new o01(i, string, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o01) {
            return this.f26232a.equals(((o01) obj).f26232a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26232a.hashCode();
    }

    public final String toString() {
        return this.f26232a.toString();
    }
}
