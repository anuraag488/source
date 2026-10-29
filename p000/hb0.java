package p000;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class hb0 extends mb0 {
    /* JADX INFO: renamed from: F0 */
    public static boolean m6294F0(Iterable iterable, Object obj) {
        int iIndexOf;
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    kx5.m7735t0();
                    throw null;
                }
                if (z62.m13387o(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    /* JADX INFO: renamed from: G0 */
    public static List m6295G0(Iterable iterable, int i) {
        ArrayList arrayList;
        Object objM6306R0;
        if (i < 0) {
            C1077qn.m9988n(c75.m3878j("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return m6319e1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return v71.f32439a;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    objM6306R0 = m6306R0((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        ds3.m4667k("Collection is empty.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    objM6306R0 = next;
                }
                return Collections.singletonList(objM6306R0);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return kx5.m7703d0(arrayList);
    }

    /* JADX INFO: renamed from: H0 */
    public static List m6296H0(List list) {
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return m6316b1(list2, size);
    }

    /* JADX INFO: renamed from: I0 */
    public static ArrayList m6297I0(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J0 */
    public static Object m6298J0(Iterable iterable) {
        if (iterable instanceof List) {
            return m6299K0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        ds3.m4667k("Collection is empty.");
        return null;
    }

    /* JADX INFO: renamed from: K0 */
    public static Object m6299K0(List list) {
        if (!list.isEmpty()) {
            return list.get(0);
        }
        ds3.m4667k("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: L0 */
    public static Object m6300L0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: M0 */
    public static Object m6301M0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: N0 */
    public static Object m6302N0(List list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: O0 */
    public static final void m6303O0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, yp1 yp1Var) {
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                zc6.m13531p(sb, obj, yp1Var);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m6304P0(Iterable iterable, StringBuilder sb, String str, b71 b71Var, int i) {
        if ((i & 64) != 0) {
            b71Var = null;
        }
        m6303O0(iterable, sb, str, "", "", -1, "...", b71Var);
    }

    /* JADX INFO: renamed from: Q0 */
    public static String m6305Q0(Iterable iterable, String str, String str2, String str3, int i, yp1 yp1Var, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i2 & 2) != 0 ? "" : str2;
        String str6 = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        String str7 = (i2 & 16) != 0 ? "..." : "";
        if ((i2 & 32) != 0) {
            yp1Var = null;
        }
        StringBuilder sb = new StringBuilder();
        m6303O0(iterable, sb, str4, str5, str6, i3, str7, yp1Var);
        return sb.toString();
    }

    /* JADX INFO: renamed from: R0 */
    public static Object m6306R0(List list) {
        if (!list.isEmpty()) {
            return list.get(kx5.m7689T(list));
        }
        ds3.m4667k("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: S0 */
    public static Object m6307S0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: T0 */
    public static Comparable m6308T0(Collection collection) {
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: U0 */
    public static ArrayList m6309U0(Iterable iterable, Object obj) {
        ArrayList arrayList = new ArrayList(ib0.m6717y0(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && z62.m13387o(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: V0 */
    public static ArrayList m6310V0(Collection collection, Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            mb0.m8260A0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: W0 */
    public static ArrayList m6311W0(Collection collection, Object obj) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: X0 */
    public static List m6312X0(Iterable iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m6319e1(iterable);
        }
        List listM6320f1 = m6320f1(iterable);
        Collections.reverse(listM6320f1);
        return listM6320f1;
    }

    /* JADX INFO: renamed from: Y0 */
    public static Object m6313Y0(List list) {
        int size = list.size();
        if (size == 0) {
            ds3.m4667k("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        C1077qn.m9987m("List has more than one element.");
        return null;
    }

    /* JADX INFO: renamed from: Z0 */
    public static List m6314Z0(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            List listM6320f1 = m6320f1(iterable);
            if (((ArrayList) listM6320f1).size() > 1) {
                Collections.sort(listM6320f1);
            }
            return listM6320f1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m6319e1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        AbstractC0990oo.m9214i0((Comparable[]) array);
        return Arrays.asList(array);
    }

    /* JADX INFO: renamed from: a1 */
    public static List m6315a1(Iterable iterable, Comparator comparator) {
        if (!(iterable instanceof Collection)) {
            List listM6320f1 = m6320f1(iterable);
            lb0.m7891z0(listM6320f1, comparator);
            return listM6320f1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m6319e1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }

    /* JADX INFO: renamed from: b1 */
    public static List m6316b1(Iterable iterable, int i) {
        if (i < 0) {
            C1077qn.m9988n(c75.m3878j("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return v71.f32439a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return m6319e1(iterable);
            }
            if (i == 1) {
                return Collections.singletonList(m6298J0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return kx5.m7703d0(arrayList);
    }

    /* JADX INFO: renamed from: c1 */
    public static List m6317c1(List list, int i) {
        if (i < 0) {
            C1077qn.m9988n(c75.m3878j("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return v71.f32439a;
        }
        int size = list.size();
        if (i >= size) {
            return m6319e1(list);
        }
        if (i == 1) {
            return Collections.singletonList(m6306R0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d1 */
    public static final void m6318d1(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: e1 */
    public static List m6319e1(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            return kx5.m7703d0(m6320f1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return v71.f32439a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: f1 */
    public static final List m6320f1(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m6318d1(iterable, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: g1 */
    public static Set m6321g1(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m6318d1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: h1 */
    public static Set m6322h1(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(fq2.m5779K(collection.size()));
                m6318d1(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m6318d1(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : Collections.singleton(linkedHashSet2.iterator().next());
            }
        }
        return b81.f15153a;
    }
}
