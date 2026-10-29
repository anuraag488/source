package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class r14 {

    /* JADX INFO: renamed from: a */
    public static final Comparator[] f28956a;

    /* JADX INFO: renamed from: b */
    public static final n14 f28957b;

    static {
        byte b = 2;
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            vl1 vl1Var = i == 0 ? vl1.f32718e : vl1.f32716c;
            uc1 uc1Var = new uc1((byte) 3);
            uc1Var.f31781b = vl1Var;
            VarHandle.storeStoreFence();
            uc1 uc1Var2 = new uc1((byte) 4);
            uc1Var2.f31781b = uc1Var;
            VarHandle.storeStoreFence();
            comparatorArr[i] = uc1Var2;
            i++;
        }
        f28956a = comparatorArr;
        f28957b = new n14(b);
    }

    /* JADX INFO: renamed from: a */
    public static final void m10179a(i14 i14Var, ArrayList arrayList, C1127s c1127s, C1127s c1127s2, lv2 lv2Var) {
        e14 e14Var = i14Var.f21012d;
        Object objM8132g = e14Var.f17631a.m8132g(m14.f24565n);
        if (objM8132g == null) {
            objM8132g = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objM8132g).booleanValue();
        if ((zBooleanValue || ((Boolean) c1127s2.invoke(i14Var)).booleanValue()) && ((Boolean) c1127s.invoke(i14Var)).booleanValue()) {
            arrayList.add(i14Var);
        }
        if (zBooleanValue) {
            lv2Var.m8121h(i14Var.f21014f, m10180b(i14Var, c1127s, c1127s2, i14Var.m6548i((4 & 1) != 0 ? !i14Var.f21010b : false, (4 & 2) == 0)));
            return;
        }
        List listM6548i = i14Var.m6548i((4 & 1) != 0 ? !i14Var.f21010b : false, (4 & 2) == 0);
        int size = listM6548i.size();
        for (int i = 0; i < size; i++) {
            m10179a((i14) listM6548i.get(i), arrayList, c1127s, c1127s2, lv2Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d3  */
    /* JADX INFO: renamed from: b */
    public static final ArrayList m10180b(i14 i14Var, C1127s c1127s, C1127s c1127s2, List list) {
        lv2 lv2Var = n52.f25469a;
        lv2 lv2Var2 = new lv2();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m10179a((i14) list.get(i), arrayList, c1127s, c1127s2, lv2Var2);
        }
        char c = i14Var.f21011c.f33293A == df2.f17012b ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int iM7689T = kx5.m7689T(arrayList);
        if (iM7689T >= 0) {
            int i2 = 0;
            while (true) {
                i14 i14Var2 = (i14) arrayList.get(i2);
                if (i2 == 0) {
                    arrayList2.add(new l73(i14Var2.m6547h(), kx5.m7699b0(i14Var2)));
                    break;
                }
                float f = i14Var2.m6547h().f22397b;
                float f2 = i14Var2.m6547h().f22399d;
                boolean z = f >= f2;
                int iM7689T2 = kx5.m7689T(arrayList2);
                if (iM7689T2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        jl3 jl3Var = (jl3) ((l73) arrayList2.get(i3)).f23833a;
                        float f3 = jl3Var.f22397b;
                        float f4 = jl3Var.f22399d;
                        boolean z2 = f3 >= f4;
                        if (!z && !z2 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i3, new l73(new jl3(Math.max(jl3Var.f22396a, 0.0f), Math.max(jl3Var.f22397b, f), Math.min(jl3Var.f22398c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((l73) arrayList2.get(i3)).f23834b));
                            ((List) ((l73) arrayList2.get(i3)).f23834b).add(i14Var2);
                            break;
                        }
                        if (i3 != iM7689T2) {
                            i3++;
                        }
                    }
                }
                arrayList2.add(new l73(i14Var2.m6547h(), kx5.m7699b0(i14Var2)));
                break;
                if (i2 == iM7689T) {
                    break;
                }
                i2++;
            }
        }
        lb0.m7891z0(arrayList2, vl1.f32719f);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f28956a[c ^ 1];
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            l73 l73Var = (l73) arrayList2.get(i4);
            lb0.m7891z0((List) l73Var.f23834b, comparator);
            arrayList3.addAll((Collection) l73Var.f23834b);
        }
        C1254vf c1254vf = new C1254vf((byte) 9);
        VarHandle.storeStoreFence();
        lb0.m7891z0(arrayList3, c1254vf);
        int size3 = 0;
        while (size3 <= kx5.m7689T(arrayList3)) {
            List list2 = (List) lv2Var2.m8197b(((i14) arrayList3.get(size3)).f21014f);
            if (list2 != null) {
                if (((Boolean) c1127s2.invoke(arrayList3.get(size3))).booleanValue()) {
                    size3++;
                } else {
                    arrayList3.remove(size3);
                }
                arrayList3.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList3;
    }
}
