package p000;

import android.net.ConnectivityManager;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cu2 {

    /* JADX INFO: renamed from: a */
    public ArrayList f16495a;

    public cu2(ir3 ir3Var, ir3 ir3Var2) throws Throwable {
        float f;
        Throwable th;
        float f2;
        List listM7694Y;
        Iterator it;
        float f3;
        int i;
        int i2;
        float fM12945M;
        int i3;
        l73 l73VarM3126a;
        l73 l73VarM3126a2;
        float fM10692E;
        byte b = 12;
        br2 br2VarM13355N = z62.m13355N(new i50(b), ir3Var);
        br2 br2VarM13355N2 = z62.m13355N(new i50(b), ir3Var2);
        List list = br2VarM13355N.f15523c;
        List list2 = br2VarM13355N2.f15523c;
        List list3 = gd1.f19744a;
        sl2 sl2VarM7680G = kx5.m7680G();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((fh3) list.get(i4)).f19001b instanceof cd1) {
                sl2VarM7680G.add(list.get(i4));
            }
        }
        sl2 sl2VarM7740w = kx5.m7740w(sl2VarM7680G);
        sl2 sl2VarM7680G2 = kx5.m7680G();
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            if (((fh3) list2.get(i5)).f19001b instanceof cd1) {
                sl2VarM7680G2.add(list2.get(i5));
            }
        }
        sl2 sl2VarM7740w2 = kx5.m7740w(sl2VarM7680G2);
        sl2 sl2VarM7680G3 = kx5.m7680G();
        ListIterator listIterator = sl2VarM7740w.listIterator(0);
        while (true) {
            ow1 ow1Var = (ow1) listIterator;
            if (!ow1Var.hasNext()) {
                break;
            }
            fh3 fh3Var = (fh3) ow1Var.next();
            ListIterator listIterator2 = sl2VarM7740w2.listIterator(0);
            while (true) {
                ow1 ow1Var2 = (ow1) listIterator2;
                if (ow1Var2.hasNext()) {
                    fh3 fh3Var2 = (fh3) ow1Var2.next();
                    fd1 fd1Var = fh3Var.f19001b;
                    fd1 fd1Var2 = fh3Var2.f19001b;
                    if ((fd1Var instanceof cd1) && (fd1Var2 instanceof cd1) && ((cd1) fd1Var).f15938b != ((cd1) fd1Var2).f15938b) {
                        fM10692E = Float.MAX_VALUE;
                    } else {
                        long jM10700M = se0.m10700M(gd1.m5972a(fd1Var), gd1.m5972a(fd1Var2));
                        fM10692E = (se0.m10692E(jM10700M) * se0.m10692E(jM10700M)) + (se0.m10691D(jM10700M) * se0.m10691D(jM10700M));
                    }
                    if (fM10692E != Float.MAX_VALUE) {
                        a11 a11Var = new a11();
                        a11Var.f34a = fM10692E;
                        a11Var.f35b = fh3Var;
                        a11Var.f36c = fh3Var2;
                        VarHandle.storeStoreFence();
                        sl2VarM7680G3.add(a11Var);
                    }
                }
            }
        }
        List listM6315a1 = hb0.m6315a1(kx5.m7740w(sl2VarM7680G3), new vl1((byte) 13));
        float f4 = 1.0f;
        int i6 = 1;
        if (!listM6315a1.isEmpty()) {
            if (listM6315a1.size() == 1) {
                a11 a11Var2 = (a11) hb0.m6299K0(listM6315a1);
                float f5 = a11Var2.f35b.f19000a;
                float f6 = a11Var2.f36c.f19000a;
                listM7694Y = kx5.m7694Y(new l73(Float.valueOf(f5), Float.valueOf(f6)), new l73(Float.valueOf((f5 + 0.5f) % 1.0f), Float.valueOf((f6 + 0.5f) % 1.0f)));
            } else {
                ArrayList arrayList = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it2 = listM6315a1.iterator();
                while (it2.hasNext()) {
                    a11 a11Var3 = (a11) it2.next();
                    fh3 fh3Var3 = a11Var3.f35b;
                    fh3 fh3Var4 = a11Var3.f36c;
                    float f7 = fh3Var3.f19000a;
                    float f8 = fh3Var4.f19000a;
                    if (linkedHashSet.contains(fh3Var3) || linkedHashSet2.contains(fh3Var4)) {
                        it = it2;
                        f3 = f4;
                    } else {
                        Float fValueOf = Float.valueOf(f7);
                        int size3 = arrayList.size();
                        f3 = f4;
                        C1183ti c1183ti = new C1183ti(fValueOf, (byte) 6);
                        kx5.m7715j0(arrayList.size(), size3);
                        int i7 = size3 - i6;
                        int i8 = 0;
                        while (true) {
                            if (i8 > i7) {
                                i = i6;
                                i2 = -(i8 + 1);
                                break;
                            }
                            i2 = (i8 + i7) >>> i6;
                            i = i6;
                            int iIntValue = ((Number) c1183ti.invoke(arrayList.get(i2))).intValue();
                            if (iIntValue < 0) {
                                i8 = i2 + 1;
                            } else if (iIntValue <= 0) {
                                break;
                            } else {
                                i7 = i2 - 1;
                            }
                            i6 = i;
                        }
                        if (i2 >= 0) {
                            C1077qn.m9987m("There can't be two features with the same progress");
                            throw null;
                        }
                        int i9 = (-i2) - 1;
                        int size4 = arrayList.size();
                        int i10 = i;
                        if (size4 >= i10) {
                            l73 l73Var = (l73) arrayList.get(((i9 + size4) - i10) % size4);
                            float fFloatValue = ((Number) l73Var.f23833a).floatValue();
                            float fFloatValue2 = ((Number) l73Var.f23834b).floatValue();
                            l73 l73Var2 = (l73) arrayList.get(i9 % size4);
                            it = it2;
                            float fFloatValue3 = ((Number) l73Var2.f23833a).floatValue();
                            float fFloatValue4 = ((Number) l73Var2.f23834b).floatValue();
                            if (y62.m12951S(f7, fFloatValue) >= 1.0E-4f && y62.m12951S(f7, fFloatValue3) >= 1.0E-4f && y62.m12951S(f8, fFloatValue2) >= 1.0E-4f && y62.m12951S(f8, fFloatValue4) >= 1.0E-4f) {
                                if (size4 > 1) {
                                    if (fFloatValue4 >= fFloatValue2) {
                                        if (fFloatValue2 > f8 || f8 > fFloatValue4) {
                                        }
                                    } else if (f8 >= fFloatValue2 || f8 <= fFloatValue4) {
                                    }
                                }
                            }
                        } else {
                            it = it2;
                        }
                        arrayList.add(i9, new l73(Float.valueOf(f7), Float.valueOf(f8)));
                        linkedHashSet.add(fh3Var3);
                        linkedHashSet2.add(fh3Var4);
                    }
                    f4 = f3;
                    it2 = it;
                    i6 = 1;
                }
                f = f4;
                th = null;
                f2 = 1.0E-4f;
                listM7694Y = arrayList;
            }
            l73[] l73VarArr = (l73[]) listM7694Y.toArray(new l73[0]);
            l11 l11Var = new l11((l73[]) Arrays.copyOf(l73VarArr, l73VarArr.length));
            iv2 iv2Var = l11Var.f23694a;
            iv2 iv2Var2 = l11Var.f23695b;
            fM12945M = y62.m12945M(iv2Var, iv2Var2, 0.0f);
            ArrayList arrayList2 = br2VarM13355N2.f15522b;
            if (0.0f <= fM12945M || fM12945M > f) {
                C1077qn.m9987m("Cutting point is expected to be between 0 and 1");
                throw th;
            }
            if (fM12945M < f2) {
                i3 = 1;
            } else {
                int size5 = arrayList2.size();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 >= size5) {
                        i11 = -1;
                        break;
                    }
                    Object obj = arrayList2.get(i12);
                    i12++;
                    ar2 ar2Var = (ar2) obj;
                    float f9 = ar2Var.f14802c;
                    if (fM12945M <= ar2Var.f14803d && f9 <= fM12945M) {
                        break;
                    } else {
                        i11++;
                    }
                }
                l73 l73VarM3126a3 = ((ar2) arrayList2.get(i11)).m3126a(fM12945M);
                ar2 ar2Var2 = (ar2) l73VarM3126a3.f23833a;
                ArrayList arrayListM7699b0 = kx5.m7699b0(((ar2) l73VarM3126a3.f23834b).f14800a);
                int size6 = arrayList2.size();
                for (int i13 = 1; i13 < size6; i13++) {
                    arrayListM7699b0.add(((ar2) arrayList2.get((i13 + i11) % arrayList2.size())).f14800a);
                }
                arrayListM7699b0.add(ar2Var2.f14800a);
                iv2 iv2Var3 = new iv2(arrayList2.size() + 2);
                int size7 = arrayList2.size() + 2;
                int i14 = 0;
                while (i14 < size7) {
                    iv2Var3.m6944a(i14 == 0 ? 0.0f : i14 == arrayList2.size() + 1 ? f : ew4.m5415c(((ar2) arrayList2.get(((i11 + i14) - 1) % arrayList2.size())).f14803d - fM12945M));
                    i14++;
                }
                i3 = 1;
                sl2 sl2VarM7680G4 = kx5.m7680G();
                int size8 = list2.size();
                for (int i15 = 0; i15 < size8; i15++) {
                    sl2VarM7680G4.add(new fh3(ew4.m5415c(((fh3) list2.get(i15)).f19000a - fM12945M), ((fh3) list2.get(i15)).f19001b));
                }
                br2VarM13355N2 = new br2(br2VarM13355N2.f15521a, kx5.m7740w(sl2VarM7680G4), arrayListM7699b0, iv2Var3);
            }
            ArrayList arrayList3 = new ArrayList();
            ar2 ar2Var3 = (ar2) hb0.m6302N0(br2VarM13355N, 0);
            ar2 ar2Var4 = (ar2) hb0.m6302N0(br2VarM13355N2, 0);
            int i16 = i3;
            int i17 = i16;
            while (ar2Var3 != null && ar2Var4 != null) {
                float f10 = i17 == br2VarM13355N.f15522b.size() ? f : ar2Var3.f14803d;
                float fM12945M2 = i16 == br2VarM13355N2.f15522b.size() ? f : y62.m12945M(iv2Var2, iv2Var, ew4.m5415c(ar2Var4.f14803d + fM12945M));
                float fMin = Math.min(f10, fM12945M2);
                float f11 = 1.0E-6f + fMin;
                if (f10 > f11) {
                    l73VarM3126a = ar2Var3.m3126a(fMin);
                } else {
                    l73 l73Var3 = new l73(ar2Var3, hb0.m6302N0(br2VarM13355N, i17));
                    i17++;
                    l73VarM3126a = l73Var3;
                }
                ar2 ar2Var5 = (ar2) l73VarM3126a.f23833a;
                ar2Var3 = (ar2) l73VarM3126a.f23834b;
                if (fM12945M2 > f11) {
                    l73VarM3126a2 = ar2Var4.m3126a(ew4.m5415c(y62.m12945M(iv2Var, iv2Var2, fMin) - fM12945M));
                } else {
                    l73 l73Var4 = new l73(ar2Var4, hb0.m6302N0(br2VarM13355N2, i16));
                    i16++;
                    l73VarM3126a2 = l73Var4;
                }
                ar2 ar2Var6 = (ar2) l73VarM3126a2.f23833a;
                ar2Var4 = (ar2) l73VarM3126a2.f23834b;
                arrayList3.add(new l73(ar2Var5.f14800a, ar2Var6.f14800a));
            }
            if (ar2Var3 == null && ar2Var4 == null) {
                this.f16495a = arrayList3;
                return;
            } else {
                C1077qn.m9987m("Expected both Polygon's Cubic to be fully matched");
                throw th;
            }
        }
        listM7694Y = gd1.f19744a;
        f = 1.0f;
        th = null;
        f2 = 1.0E-4f;
        l73[] l73VarArr2 = (l73[]) listM7694Y.toArray(new l73[0]);
        l11 l11Var2 = new l11((l73[]) Arrays.copyOf(l73VarArr2, l73VarArr2.length));
        iv2 iv2Var4 = l11Var2.f23694a;
        iv2 iv2Var5 = l11Var2.f23695b;
        fM12945M = y62.m12945M(iv2Var4, iv2Var5, 0.0f);
        ArrayList arrayList4 = br2VarM13355N2.f15522b;
        if (0.0f <= fM12945M) {
        }
        C1077qn.m9987m("Cutting point is expected to be between 0 and 1");
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public void m4168a(Object obj) {
        ArrayList arrayList = this.f16495a;
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public cu2(int i) {
        this.f16495a = new ArrayList(i);
    }

    public cu2(ko4 ko4Var) {
        String str = w15.f33035a;
        C0508bz c0508bz = new C0508bz(ko4Var.f23291b, (byte) 0);
        VarHandle.storeStoreFence();
        C0508bz c0508bz2 = new C0508bz(ko4Var.f23292c, (byte) 1);
        VarHandle.storeStoreFence();
        C0508bz c0508bz3 = new C0508bz(ko4Var.f23293d, (byte) 2);
        VarHandle.storeStoreFence();
        ArrayList arrayListM7699b0 = kx5.m7699b0(c0508bz, c0508bz2, c0508bz3);
        ConnectivityManager connectivityManager = (ConnectivityManager) ko4Var.f23290a.getSystemService("connectivity");
        q03 q03Var = new q03();
        q03Var.f28126a = connectivityManager;
        VarHandle.storeStoreFence();
        arrayListM7699b0.add(q03Var);
        this.f16495a = arrayListM7699b0;
    }
}
