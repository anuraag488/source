package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class id4 extends zc6 {
    /* JADX INFO: renamed from: M */
    public static String m6766M(String str) {
        nb0 nb0Var = new nb0((byte) 3);
        nb0Var.f25616b = str;
        VarHandle.storeStoreFence();
        C1051py c1051py = new C1051py((byte) 6);
        c1051py.f28076b = "    ";
        VarHandle.storeStoreFence();
        xr1 xr1Var = new xr1();
        xr1Var.f34562c = nb0Var;
        xr1Var.f34561b = c1051py;
        VarHandle.storeStoreFence();
        return c24.m3832O(xr1Var, "\n");
    }

    /* JADX INFO: renamed from: N */
    public static String m6767N(String str) {
        List listSingletonList;
        gl2 gl2Var = new gl2();
        gl2Var.f19853a = str;
        VarHandle.storeStoreFence();
        if (gl2Var.hasNext()) {
            Object next = gl2Var.next();
            if (gl2Var.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (gl2Var.hasNext()) {
                    arrayList.add(gl2Var.next());
                }
                listSingletonList = arrayList;
            } else {
                listSingletonList = Collections.singletonList(next);
            }
        } else {
            listSingletonList = v71.f32439a;
        }
        List list = listSingletonList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!hd4.m6345k0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(ib0.m6717y0(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!y62.m12944L(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList3.add(Integer.valueOf(length2));
        }
        Integer num = (Integer) hb0.m6308T0(arrayList3);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listSingletonList.size();
        int iM7689T = kx5.m7689T(listSingletonList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length3);
                hb0.m6304P0(arrayList4, sb, "\n", null, 124);
                return sb.toString();
            }
            Object next2 = it.next();
            int i3 = i + 1;
            if (i < 0) {
                kx5.m7735t0();
                throw null;
            }
            String str3 = (String) next2;
            String strM6337c0 = ((i == 0 || i == iM7689T) && hd4.m6345k0(str3)) ? null : hd4.m6337c0(iIntValue, str3);
            if (strM6337c0 != null) {
                arrayList4.add(strM6337c0);
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: O */
    public static String m6768O(String str) {
        List listSingletonList;
        if (hd4.m6345k0("|")) {
            C1077qn.m9987m("marginPrefix must be non-blank string.");
            return null;
        }
        gl2 gl2Var = new gl2();
        gl2Var.f19853a = str;
        VarHandle.storeStoreFence();
        if (gl2Var.hasNext()) {
            Object next = gl2Var.next();
            if (gl2Var.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (gl2Var.hasNext()) {
                    arrayList.add(gl2Var.next());
                }
                listSingletonList = arrayList;
            } else {
                listSingletonList = Collections.singletonList(next);
            }
        } else {
            listSingletonList = v71.f32439a;
        }
        int length = str.length();
        listSingletonList.size();
        int iM7689T = kx5.m7689T(listSingletonList);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : listSingletonList) {
            int i2 = i + 1;
            if (i < 0) {
                kx5.m7735t0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == iM7689T) && hd4.m6345k0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!y62.m12944L(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        hb0.m6304P0(arrayList2, sb, "\n", null, 124);
        return sb.toString();
    }
}
