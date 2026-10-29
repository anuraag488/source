package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mu3 implements lu3 {

    /* JADX INFO: renamed from: a */
    public yp1 f25222a;

    /* JADX INFO: renamed from: b */
    public lw2 f25223b;

    /* JADX INFO: renamed from: c */
    public lw2 f25224c;

    @Override // p000.lu3
    /* JADX INFO: renamed from: a */
    public final ku3 mo8109a(String str, wp1 wp1Var) {
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            if (!y62.m12944L(str.charAt(i))) {
                lw2 lw2Var = this.f25224c;
                if (lw2Var == null) {
                    long[] jArr = tv3.f31472a;
                    lw2Var = new lw2();
                    this.f25224c = lw2Var;
                }
                Object objM8132g = lw2Var.m8132g(str);
                if (objM8132g == null) {
                    objM8132g = new ArrayList();
                    lw2Var.m8138m(str, objM8132g);
                }
                ((List) objM8132g).add(wp1Var);
                tt2 tt2Var = new tt2((byte) 8, z);
                tt2Var.f31428b = lw2Var;
                tt2Var.f31429c = str;
                tt2Var.f31430d = wp1Var;
                VarHandle.storeStoreFence();
                return tt2Var;
            }
        }
        C1077qn.m9987m("Registered key is empty or blank");
        return null;
    }

    @Override // p000.lu3
    /* JADX INFO: renamed from: b */
    public final boolean mo8110b(Object obj) {
        return ((Boolean) this.f25222a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // p000.lu3
    /* JADX INFO: renamed from: c */
    public final Map mo8111c() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        lw2 lw2Var = this.f25223b;
        if (lw2Var == null && this.f25224c == null) {
            return w71.f33134a;
        }
        int i3 = 0;
        int i4 = lw2Var != null ? lw2Var.f24422e : 0;
        lw2 lw2Var2 = this.f25224c;
        HashMap map = new HashMap(i4 + (lw2Var2 != null ? lw2Var2.f24422e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (lw2Var != null) {
            Object[] objArr = lw2Var.f24419b;
            Object[] objArr2 = lw2Var.f24420c;
            long[] jArr3 = lw2Var.f24418a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        lw2 lw2Var3 = this.f25224c;
        if (lw2Var3 != null) {
            Object[] objArr3 = lw2Var3.f24419b;
            Object[] objArr4 = lw2Var3.f24420c;
            long[] jArr4 = lw2Var3.f24418a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((wp1) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!mo8110b(objInvoke)) {
                                            xy4.m12780h(dt0.m4680B(objInvoke));
                                            return null;
                                        }
                                        map.put(str, kx5.m7730r(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((wp1) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !mo8110b(objInvoke2)) {
                                            xy4.m12780h(dt0.m4680B(objInvoke2));
                                            return null;
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // p000.lu3
    /* JADX INFO: renamed from: d */
    public final Object mo8112d(String str) {
        lw2 lw2Var = this.f25223b;
        List list = lw2Var != null ? (List) lw2Var.m8136k(str) : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && lw2Var != null) {
            List listSubList = list.subList(1, list.size());
            int iM8131f = lw2Var.m8131f(str);
            if (iM8131f < 0) {
                iM8131f = ~iM8131f;
            }
            Object[] objArr = lw2Var.f24420c;
            Object obj = objArr[iM8131f];
            lw2Var.f24419b[iM8131f] = str;
            objArr[iM8131f] = listSubList;
        }
        return list.get(0);
    }
}
