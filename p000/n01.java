package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n01 {

    /* JADX INFO: renamed from: a */
    public String f25355a;

    /* JADX INFO: renamed from: b */
    public int f25356b;

    /* JADX INFO: renamed from: c */
    public int f25357c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n01)) {
            return false;
        }
        n01 n01Var = (n01) obj;
        return this.f25355a.equals(n01Var.f25355a) && this.f25356b == n01Var.f25356b && this.f25357c == n01Var.f25357c;
    }

    public final int hashCode() {
        String str = this.f25355a;
        Integer numValueOf = Integer.valueOf(this.f25356b);
        Integer numValueOf2 = Integer.valueOf(this.f25357c);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(str, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(Integer.valueOf(this.f25355a.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.f25356b);
        sb.append(" displayHeight=");
        return c75.m3880l(sb, this.f25357c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
    }
}
