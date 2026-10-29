package p000;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class mb0 extends lb0 {
    /* JADX INFO: renamed from: A0 */
    public static void m8260A0(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static void m8261B0(List list, yp1 yp1Var) {
        int iM7689T;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof cc2) && !(list instanceof dc2)) {
                as4.m3236O(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Boolean) yp1Var.invoke(it.next())).booleanValue()) {
                        it.remove();
                    }
                }
                return;
            } catch (ClassCastException e) {
                z62.m13362U(as4.class.getName(), e);
                throw e;
            }
        }
        int iM7689T2 = kx5.m7689T(list);
        int i = 0;
        if (iM7689T2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) yp1Var.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iM7689T2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (iM7689T = kx5.m7689T(list))) {
            return;
        }
        while (true) {
            list.remove(iM7689T);
            if (iM7689T == i) {
                return;
            } else {
                iM7689T--;
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    public static void m8262C0(C0461ao c0461ao) {
        if (c0461ao.isEmpty()) {
            ds3.m4667k("List is empty.");
        } else {
            c0461ao.mo3089b(0);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static Object m8263D0(AbstractList abstractList) {
        if (!abstractList.isEmpty()) {
            return abstractList.remove(kx5.m7689T(abstractList));
        }
        ds3.m4667k("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: E0 */
    public static Object m8264E0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(kx5.m7689T(list));
    }
}
