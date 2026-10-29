package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uv0 {

    /* JADX INFO: renamed from: a */
    public final List f32201a;

    /* JADX INFO: renamed from: b */
    public final float[] f32202b;

    /* JADX INFO: renamed from: c */
    public final int f32203c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [v71] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public uv0(List list, float[] fArr) {
        Object objSingletonList;
        this.f32201a = list;
        this.f32202b = fArr;
        if (list.size() != fArr.length) {
            int length = fArr.length;
            if (length != 0) {
                if (length != 1) {
                    objSingletonList = new ArrayList(fArr.length);
                    for (float f : fArr) {
                        objSingletonList.add(Float.valueOf(f));
                    }
                } else {
                    objSingletonList = Collections.singletonList(Float.valueOf(fArr[0]));
                }
            } else {
                objSingletonList = v71.f32439a;
            }
            t32.m10968a("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + objSingletonList);
        }
        this.f32203c = this.f32202b.length;
    }

    /* JADX INFO: renamed from: a */
    public final Object m11651a(float f) {
        float[] fArr = this.f32202b;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs <= f2) {
                i2 = i3;
                f2 = fAbs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.f32201a.get(i2);
    }

    /* JADX INFO: renamed from: b */
    public final Object m11652b(float f, boolean z) {
        float[] fArr = this.f32202b;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f3 = fArr[i];
            int i4 = i3 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < 0.0f) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i2 = i3;
                f2 = f4;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.f32201a.get(i2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11653c(Object obj) {
        return this.f32201a.indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final float m11654d() {
        float[] fArr = this.f32202b;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMax = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMax = Math.max(fMax, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return fMax;
    }

    /* JADX INFO: renamed from: e */
    public final float m11655e() {
        float[] fArr = this.f32202b;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMin = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMin = Math.min(fMin, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return fMin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv0)) {
            return false;
        }
        uv0 uv0Var = (uv0) obj;
        return z62.m13387o(this.f32201a, uv0Var.f32201a) && Arrays.equals(this.f32202b, uv0Var.f32202b) && this.f32203c == uv0Var.f32203c;
    }

    /* JADX INFO: renamed from: f */
    public final float m11656f(Object obj) {
        int iIndexOf = this.f32201a.indexOf(obj);
        C0891m c0891m = AbstractC0485bb.f15193b;
        if (iIndexOf >= 0) {
            float[] fArr = this.f32202b;
            if (iIndexOf < fArr.length) {
                return fArr[iIndexOf];
            }
        }
        c0891m.invoke(Integer.valueOf(iIndexOf));
        return Float.NaN;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f32202b) + (this.f32201a.hashCode() * 31)) * 31) + this.f32203c;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    public final String toString() {
        float f;
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i2 = this.f32203c;
            if (i >= i2) {
                sb.append("})");
                return sb.toString();
            }
            Object objM6302N0 = hb0.m6302N0(this.f32201a, i);
            C0891m c0891m = AbstractC0485bb.f15193b;
            if (i >= 0) {
                float[] fArr = this.f32202b;
                if (i < fArr.length) {
                    f = fArr[i];
                } else {
                    c0891m.invoke(Integer.valueOf(i));
                    f = Float.NaN;
                }
            } else {
                c0891m.invoke(Integer.valueOf(i));
                f = Float.NaN;
            }
            sb.append(objM6302N0 + "=" + f);
            if (i < i2 - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
