package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d53 extends v53 {

    /* JADX INFO: renamed from: c */
    public static final d53 f16788c = new d53(1, 0, 2);

    @Override // p000.v53
    /* JADX INFO: renamed from: a */
    public final void mo90a(xa0 xa0Var, InterfaceC0618en interfaceC0618en, p84 p84Var, om3 om3Var, w53 w53Var) {
        int[] iArr;
        cr1 cr1Var;
        int iM9415c;
        int iM12600e = xa0Var.m12600e(0);
        if (p84Var.f27446n != 0) {
            qi0.m9889a("Cannot move a group while inserting");
        }
        if (iM12600e < 0) {
            qi0.m9889a("Parameter offset is out of bounds");
        }
        if (iM12600e == 0) {
            return;
        }
        int i = p84Var.f27452t;
        int i2 = p84Var.f27454v;
        int i3 = p84Var.f27453u;
        int iM8981b = i;
        while (true) {
            iArr = p84Var.f27434b;
            if (iM12600e <= 0) {
                break;
            }
            iM8981b += o84.m8981b(iArr, p84Var.m9428q(iM8981b));
            if (iM8981b > i3) {
                qi0.m9889a("Parameter offset is out of bounds");
            }
            iM12600e--;
        }
        int iM8981b2 = o84.m8981b(iArr, p84Var.m9428q(iM8981b));
        int iM9418f = p84Var.m9418f(p84Var.f27434b, p84Var.m9428q(p84Var.f27452t));
        int iM9418f2 = p84Var.m9418f(p84Var.f27434b, p84Var.m9428q(iM8981b));
        int i4 = iM8981b + iM8981b2;
        int iM9418f3 = p84Var.m9418f(p84Var.f27434b, p84Var.m9428q(i4));
        int i5 = iM9418f3 - iM9418f2;
        p84Var.m9434w(i5, Math.max(p84Var.f27452t - 1, 0));
        p84Var.m9433v(iM8981b2);
        int[] iArr2 = p84Var.f27434b;
        int iM9428q = p84Var.m9428q(i4) * 5;
        AbstractC0990oo.m9199T(iArr2, iArr2, p84Var.m9428q(i) * 5, iM9428q, (iM8981b2 * 5) + iM9428q);
        if (i5 > 0) {
            Object[] objArr = p84Var.f27435c;
            int iM9419g = p84Var.m9419g(iM9418f2 + i5);
            System.arraycopy(objArr, iM9419g, objArr, iM9418f, p84Var.m9419g(iM9418f3 + i5) - iM9419g);
        }
        int i6 = iM9418f2 + i5;
        int i7 = i6 - iM9418f;
        int i8 = p84Var.f27443k;
        int i9 = p84Var.f27444l;
        int length = p84Var.f27435c.length;
        int i10 = p84Var.f27445m;
        int i11 = i + iM8981b2;
        int i12 = i;
        while (i12 < i11) {
            int iM9428q2 = p84Var.m9428q(i12);
            int i13 = i7;
            int[] iArr3 = iArr2;
            iArr3[(iM9428q2 * 5) + 4] = p84.m9388h(p84.m9388h(p84Var.m9418f(iArr2, iM9428q2) - i13, i10 < iM9428q2 ? 0 : i8, i9, length), p84Var.f27443k, p84Var.f27444l, p84Var.f27435c.length);
            i12++;
            i7 = i13;
            iArr2 = iArr3;
            i8 = i8;
        }
        int i14 = i4 + iM8981b2;
        int iM9426o = p84Var.m9426o();
        int iM8982c = o84.m8982c(p84Var.f27436d, i4, iM9426o);
        ArrayList arrayList = new ArrayList();
        if (iM8982c >= 0) {
            while (iM8982c < p84Var.f27436d.size() && (iM9415c = p84Var.m9415c((cr1Var = (cr1) p84Var.f27436d.get(iM8982c)))) >= i4 && iM9415c < i14) {
                arrayList.add(cr1Var);
            }
        }
        int i15 = i - i4;
        int size = arrayList.size();
        for (int i16 = 0; i16 < size; i16++) {
            cr1 cr1Var2 = (cr1) arrayList.get(i16);
            int iM9415c2 = p84Var.m9415c(cr1Var2) + i15;
            if (iM9415c2 >= p84Var.f27439g) {
                cr1Var2.f16390a = -(iM9426o - iM9415c2);
            } else {
                cr1Var2.f16390a = iM9415c2;
            }
            p84Var.f27436d.add(o84.m8982c(p84Var.f27436d, iM9415c2, iM9426o), cr1Var2);
        }
        if (p84Var.m9399J(i4, iM8981b2)) {
            qi0.m9889a("Unexpectedly removed anchors");
        }
        p84Var.m9423l(i2, p84Var.f27453u, i);
        if (i5 > 0) {
            p84Var.m9400K(i6, i5, i4 - 1);
        }
    }
}
