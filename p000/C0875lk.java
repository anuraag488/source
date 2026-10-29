package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lk */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0875lk implements CharSequence {

    /* JADX INFO: renamed from: a */
    public final List f24091a;

    /* JADX INFO: renamed from: b */
    public final String f24092b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f24093c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f24094d;

    static {
        yg3 yg3Var = jv3.f22668a;
    }

    public C0875lk(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f24091a = list;
        this.f24092b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                C0838kk c0838kk = (C0838kk) list.get(i);
                Object obj = c0838kk.f23186a;
                if (obj instanceof pa4) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c0838kk);
                } else if (obj instanceof r73) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c0838kk);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f24093c = arrayList;
        this.f24094d = arrayList2;
        List listM6315a1 = arrayList2 != null ? hb0.m6315a1(arrayList2, new vl1((byte) 5)) : null;
        List list2 = listM6315a1;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i2 = ((C0838kk) hb0.m6299K0(listM6315a1)).f23188c;
        kv2 kv2Var = k52.f22902a;
        kv2 kv2Var2 = new kv2(1);
        kv2Var2.m7633a(i2);
        int size2 = listM6315a1.size();
        for (int i3 = 1; i3 < size2; i3++) {
            C0838kk c0838kk2 = (C0838kk) listM6315a1.get(i3);
            while (kv2Var2.f23538b != 0) {
                int iM7636d = kv2Var2.m7636d();
                if (c0838kk2.f23187b < iM7636d) {
                    int i4 = c0838kk2.f23188c;
                    if (i4 > iM7636d) {
                        r32.m10186a("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + iM7636d);
                        break;
                    }
                    break;
                }
                kv2Var2.m7637e(kv2Var2.f23538b - 1);
            }
            kv2Var2.m7633a(c0838kk2.f23188c);
        }
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0875lk subSequence(int i, int i2) {
        if (!(i <= i2)) {
            r32.m10186a("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.f24092b;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        C0875lk c0875lk = AbstractC0912mk.f24972a;
        if (i > i2) {
            r32.m10186a("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.f24091a;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0838kk c0838kk = (C0838kk) list.get(i3);
                int i4 = c0838kk.f23187b;
                int i5 = c0838kk.f23188c;
                if (AbstractC0912mk.m8336b(i, i2, i4, i5)) {
                    arrayList2.add(new C0838kk(c0838kk.f23186a, Math.max(i, c0838kk.f23187b) - i, Math.min(i2, i5) - i, c0838kk.f23189d));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new C0875lk(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f24092b.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0875lk)) {
            return false;
        }
        C0875lk c0875lk = (C0875lk) obj;
        return z62.m13387o(this.f24092b, c0875lk.f24092b) && z62.m13387o(this.f24091a, c0875lk.f24091a);
    }

    public final int hashCode() {
        int iHashCode = this.f24092b.hashCode() * 31;
        List list = this.f24091a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f24092b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f24092b;
    }

    public /* synthetic */ C0875lk(String str) {
        this(str, v71.f32439a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0875lk(String str, List list) {
        List list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
