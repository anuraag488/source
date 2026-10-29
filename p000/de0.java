package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class de0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16998a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f16999b;

    public /* synthetic */ de0(byte b) {
        this.f16998a = b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3 A[LOOP:0: B:29:0x0080->B:40:0x00b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0 A[LOOP:2: B:46:0x00be->B:57:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0048 A[SYNTHETIC] */
    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        String str;
        l73 l73Var;
        String str2;
        Object next2;
        String str3;
        String str4;
        Object objM6313Y0;
        byte b = this.f16998a;
        ju4 ju4Var = ju4.f22634a;
        List list = this.f16999b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                zc6.m13516a(list, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 1:
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        mq1 mq1Var = (mq1) list.get(i);
                        int iHashCode = Long.hashCode(ir1Var.f21683T);
                        bi0.f15310ap.getClass();
                        nh0 nh0Var = ia5.f21213d;
                        if (ir1Var.f21685a == null) {
                            dt0.m4682E();
                            throw null;
                        }
                        ir1Var.m6893h0();
                        if (ir1Var.f21682S) {
                            ir1Var.m6900l(nh0Var);
                        } else {
                            ir1Var.m6911q0();
                        }
                        C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                        mq1Var.invoke(ir1Var, 0);
                        ir1Var.m6912r(true);
                    }
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                List list2 = list;
                if (list2.size() == 1) {
                    List list3 = list2;
                    if (list3 instanceof List) {
                        objM6313Y0 = hb0.m6313Y0(list3);
                    } else {
                        Iterator it = list3.iterator();
                        if (!it.hasNext()) {
                            ds3.m4667k("Collection is empty.");
                            return null;
                        }
                        Object next3 = it.next();
                        if (it.hasNext()) {
                            C1077qn.m9987m("Collection has more than one element.");
                            return null;
                        }
                        objM6313Y0 = next3;
                    }
                    String str5 = (String) objM6313Y0;
                    int iM6343i0 = hd4.m6343i0(charSequence, str5, iIntValue2, false, 4);
                    if (iM6343i0 < 0) {
                        l73Var = null;
                    } else {
                        l73Var = new l73(Integer.valueOf(iM6343i0), str5);
                    }
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    r52 r52Var = new r52(iIntValue2, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i2 = r52Var.f27384c;
                    int i3 = r52Var.f27383b;
                    if (z) {
                        if ((i2 <= 0 || iIntValue2 > i3) && (i2 >= 0 || i3 > iIntValue2)) {
                            l73Var = null;
                        } else {
                            while (true) {
                                Iterator it2 = list2.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        l73Var = new l73(Integer.valueOf(iIntValue2), str3);
                                    } else if (iIntValue2 != i3) {
                                        iIntValue2 += i2;
                                    } else {
                                        l73Var = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence, iIntValue2, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    l73Var = new l73(Integer.valueOf(iIntValue2), str3);
                                } else if (iIntValue2 != i3) {
                                    iIntValue2 += i2;
                                } else {
                                    l73Var = null;
                                }
                            }
                        }
                    } else if ((i2 <= 0 || iIntValue2 > i3) && (i2 >= 0 || i3 > iIntValue2)) {
                        l73Var = null;
                    } else {
                        int i4 = iIntValue2;
                        while (true) {
                            Iterator it3 = list2.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    l73Var = new l73(Integer.valueOf(i4), str);
                                } else if (i4 != i3) {
                                    i4 += i2;
                                } else {
                                    l73Var = null;
                                }
                            } while (!hd4.m6348n0(str2, 0, charSequence, i4, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                l73Var = new l73(Integer.valueOf(i4), str);
                            } else if (i4 != i3) {
                                i4 += i2;
                            } else {
                                l73Var = null;
                            }
                        }
                    }
                }
                if (l73Var != null) {
                    return new l73(l73Var.f23833a, Integer.valueOf(((String) l73Var.f23834b).length()));
                }
                return null;
        }
    }
}
