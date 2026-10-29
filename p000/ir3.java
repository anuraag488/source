package p000;

import java.lang.invoke.VarHandle;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ir3 {

    /* JADX INFO: renamed from: a */
    public final List f21714a;

    /* JADX INFO: renamed from: b */
    public final long f21715b;

    /* JADX INFO: renamed from: c */
    public final sl2 f21716c;

    /* JADX WARN: Multi-variable type inference failed */
    public ir3(AbstractList abstractList, long j) {
        ArrayList arrayListM7699b0;
        ArrayList arrayListM7699b1;
        char c;
        char c2;
        as0 as0Var;
        as0 as0Var2;
        List list;
        char c3;
        char c4;
        this.f21714a = abstractList;
        this.f21715b = j;
        sl2 sl2VarM7680G = kx5.m7680G();
        char c5 = 3;
        char c6 = 2;
        if (abstractList.size() <= 0 || ((fd1) abstractList.get(0)).f18921a.size() != 3) {
            arrayListM7699b0 = null;
            arrayListM7699b1 = null;
        } else {
            l73 l73VarM3218d = ((as0) ((fd1) abstractList.get(0)).f18921a.get(1)).m3218d(0.5f);
            as0 as0Var3 = (as0) l73VarM3218d.f23833a;
            as0 as0Var4 = (as0) l73VarM3218d.f23834b;
            arrayListM7699b1 = kx5.m7699b0(((fd1) abstractList.get(0)).f18921a.get(0), as0Var3);
            arrayListM7699b0 = kx5.m7699b0(as0Var4, ((fd1) abstractList.get(0)).f18921a.get(2));
        }
        int size = abstractList.size();
        if (size >= 0) {
            int i = 0;
            as0Var = null;
            as0Var2 = null;
            while (true) {
                if (i == 0 && arrayListM7699b0 != null) {
                    list = arrayListM7699b0;
                } else if (i != this.f21714a.size()) {
                    list = ((fd1) this.f21714a.get(i)).f18921a;
                } else {
                    if (arrayListM7699b1 == null) {
                        c = c5;
                        c2 = c6;
                        break;
                    }
                    list = arrayListM7699b1;
                }
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    as0 as0Var5 = (as0) list.get(i2);
                    if (as0Var5.m3220f()) {
                        c3 = c5;
                        if (as0Var2 != null) {
                            float[] fArr = as0Var2.f14841a;
                            c4 = c6;
                            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
                            as0 as0Var6 = new as0(fArrCopyOf);
                            fArrCopyOf[6] = as0Var5.m3215a();
                            fArrCopyOf[7] = as0Var5.m3216b();
                            as0Var2 = as0Var6;
                        } else {
                            c4 = c6;
                        }
                    } else {
                        if (as0Var2 != null) {
                            sl2VarM7680G.add(as0Var2);
                        }
                        c3 = c5;
                        c4 = c6;
                        if (as0Var == null) {
                            as0Var = as0Var5;
                            as0Var2 = as0Var;
                        } else {
                            as0Var2 = as0Var5;
                        }
                    }
                    i2++;
                    c5 = c3;
                    c6 = c4;
                }
                c = c5;
                c2 = c6;
                if (i == size) {
                    break;
                }
                i++;
                c5 = c;
                c6 = c2;
            }
        } else {
            c = 3;
            c2 = 2;
            as0Var = null;
            as0Var2 = null;
        }
        if (as0Var2 == null || as0Var == null) {
            sl2VarM7680G.add(y62.m12969g(se0.m10691D(this.f21715b), se0.m10692E(this.f21715b), se0.m10691D(this.f21715b), se0.m10692E(this.f21715b), se0.m10691D(this.f21715b), se0.m10692E(this.f21715b), se0.m10691D(this.f21715b), se0.m10692E(this.f21715b)));
        } else {
            float[] fArr2 = as0Var2.f14841a;
            float f = fArr2[0];
            float f2 = fArr2[1];
            float f3 = fArr2[c2];
            float f4 = fArr2[c];
            float f5 = fArr2[4];
            float f6 = fArr2[5];
            float[] fArr3 = as0Var.f14841a;
            sl2VarM7680G.add(y62.m12969g(f, f2, f3, f4, f5, f6, fArr3[0], fArr3[1]));
        }
        sl2 sl2VarM7740w = kx5.m7740w(sl2VarM7680G);
        this.f21716c = sl2VarM7740w;
        Object obj = sl2VarM7740w.get(sl2VarM7740w.mo3088a() - 1);
        int size3 = sl2VarM7740w.size();
        int i3 = 0;
        while (i3 < size3) {
            as0 as0Var7 = (as0) this.f21716c.get(i3);
            as0 as0Var8 = (as0) obj;
            if (Math.abs(as0Var7.f14841a[0] - as0Var8.m3215a()) > 1.0E-4f || Math.abs(as0Var7.f14841a[1] - as0Var8.m3216b()) > 1.0E-4f) {
                C1077qn.m9987m("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
                throw null;
            }
            i3++;
            obj = as0Var7;
        }
    }

    /* JADX INFO: renamed from: a */
    public final ir3 m6921a() {
        int i;
        char c;
        char c2;
        char c3;
        char c4 = 4;
        float[] fArr = new float[4];
        sl2 sl2Var = this.f21716c;
        int iMo3088a = sl2Var.mo3088a();
        float fMax = Float.MIN_VALUE;
        int i2 = 0;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        int i3 = 0;
        float fMax2 = Float.MIN_VALUE;
        while (i3 < iMo3088a) {
            as0 as0Var = (as0) sl2Var.get(i3);
            boolean zM3220f = as0Var.m3220f();
            char c5 = c4;
            float[] fArr2 = as0Var.f14841a;
            if (zM3220f) {
                fArr[i2] = fArr2[i2];
                fArr[1] = fArr2[1];
                fArr[2] = fArr2[i2];
                fArr[3] = fArr2[1];
                i = i2;
                c = 2;
                c2 = 1;
                c3 = 3;
            } else {
                i = i2;
                float fMin3 = Math.min(fArr2[i2], as0Var.m3215a());
                c = 2;
                float fMin4 = Math.min(fArr2[1], as0Var.m3216b());
                c2 = 1;
                float fMax3 = Math.max(fArr2[i], as0Var.m3215a());
                float fMax4 = Math.max(fArr2[1], as0Var.m3216b());
                c3 = 3;
                fArr[i] = Math.min(fMin3, Math.min(fArr2[2], fArr2[c5]));
                fArr[1] = Math.min(fMin4, Math.min(fArr2[3], fArr2[5]));
                fArr[2] = Math.max(fMax3, Math.max(fArr2[2], fArr2[c5]));
                fArr[3] = Math.max(fMax4, Math.max(fArr2[3], fArr2[5]));
            }
            fMin = Math.min(fMin, fArr[i]);
            fMin2 = Math.min(fMin2, fArr[c2]);
            fMax = Math.max(fMax, fArr[c]);
            fMax2 = Math.max(fMax2, fArr[c3]);
            i3++;
            c4 = c5;
            i2 = i;
        }
        int i4 = i2;
        fArr[i4] = fMin;
        fArr[1] = fMin2;
        fArr[2] = fMax;
        fArr[3] = fMax2;
        float f = fMax - fMin;
        float f2 = fMax2 - fMin2;
        float fMax5 = Math.max(f, f2);
        float f3 = ((fMax5 - f) / 2.0f) - fArr[i4];
        float f4 = ((fMax5 - f2) / 2.0f) - fArr[1];
        hr3 hr3Var = new hr3();
        hr3Var.f20807a = f3;
        hr3Var.f20808b = fMax5;
        hr3Var.f20809c = f4;
        VarHandle.storeStoreFence();
        long j = this.f21715b;
        long jM7130a = ji1.m7130a((se0.m10691D(j) + f3) / fMax5, (se0.m10692E(j) + f4) / fMax5);
        long jM7130a2 = ji1.m7130a(Float.intBitsToFloat((int) (jM7130a >> 32)), Float.intBitsToFloat((int) (jM7130a & 4294967295L)));
        sl2 sl2VarM7680G = kx5.m7680G();
        List list = this.f21714a;
        int size = list.size();
        for (int i5 = i4; i5 < size; i5++) {
            sl2VarM7680G.add(((fd1) list.get(i5)).mo3974a(hr3Var));
        }
        return new ir3(kx5.m7740w(sl2VarM7680G), jM7130a2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir3)) {
            return false;
        }
        return this.f21714a.equals(((ir3) obj).f21714a);
    }

    public final int hashCode() {
        return this.f21714a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[RoundedPolygon. Cubics = ");
        sb.append(hb0.m6305Q0(this.f21716c, null, null, null, 0, null, 63));
        sb.append(" || Features = ");
        sb.append(hb0.m6305Q0(this.f21714a, null, null, null, 0, null, 63));
        sb.append(" || Center = (");
        long j = this.f21715b;
        sb.append(se0.m10691D(j));
        sb.append(", ");
        sb.append(se0.m10692E(j));
        sb.append(")]");
        return sb.toString();
    }
}
