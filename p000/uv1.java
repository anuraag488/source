package p000;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uv1 implements Iterable, cc2 {

    /* JADX INFO: renamed from: a */
    public final String[] f32204a;

    public uv1(String[] strArr) {
        this.f32204a = strArr;
    }

    /* JADX INFO: renamed from: a */
    public final String m11657a(String str) {
        String[] strArr = this.f32204a;
        int length = strArr.length - 2;
        int iM7619t = ks5.m7619t(length, 0, -2);
        if (iM7619t > length) {
            return null;
        }
        while (!od4.m9039T(str, strArr[length], true)) {
            if (length == iM7619t) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    /* JADX INFO: renamed from: b */
    public final String m11658b(int i) {
        return this.f32204a[i * 2];
    }

    /* JADX INFO: renamed from: c */
    public final tv1 m11659c() {
        tv1 tv1Var = new tv1((byte) 0);
        tv1Var.f31466a.addAll(Arrays.asList(this.f32204a));
        return tv1Var;
    }

    /* JADX INFO: renamed from: d */
    public final String m11660d(int i) {
        return this.f32204a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uv1) {
            return Arrays.equals(this.f32204a, ((uv1) obj).f32204a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f32204a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        l73[] l73VarArr = new l73[size];
        for (int i = 0; i < size; i++) {
            l73VarArr[i] = new l73(m11658b(i), m11660d(i));
        }
        return y70.m13010K(l73VarArr);
    }

    public final int size() {
        return this.f32204a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM11658b = m11658b(i);
            String strM11660d = m11660d(i);
            sb.append(strM11658b);
            sb.append(": ");
            if (zv4.m13820o(strM11658b)) {
                strM11660d = "██";
            }
            sb.append(strM11660d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
