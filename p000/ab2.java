package p000;

import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ab2 extends uq4 {
    private ab2() {
    }

    /* JADX INFO: renamed from: e */
    public static ba2 m165e(int i, kb2 kb2Var) throws IOException {
        int iM4376u = d55.m4376u(i);
        if (iM4376u == 5) {
            String strMo7479P = kb2Var.mo7479P();
            if (!cb2.m3940a(strMo7479P)) {
                wb1.m12191j("illegal characters in string");
                return null;
            }
            gb2 gb2Var = new gb2();
            gb2Var.f19705a = strMo7479P;
            return gb2Var;
        }
        if (iM4376u == 6) {
            String strMo7479P2 = kb2Var.mo7479P();
            bb2 bb2Var = new bb2();
            bb2Var.f15197a = strMo7479P2;
            VarHandle.storeStoreFence();
            gb2 gb2Var2 = new gb2();
            gb2Var2.f19705a = bb2Var;
            return gb2Var2;
        }
        if (iM4376u == 7) {
            Boolean boolValueOf = Boolean.valueOf(kb2Var.mo7471C());
            gb2 gb2Var3 = new gb2();
            gb2Var3.f19705a = boolValueOf;
            return gb2Var3;
        }
        if (iM4376u == 8) {
            kb2Var.mo7477N();
            return sa2.f30035a;
        }
        C1077qn.m9989o("Unexpected token: ".concat(d55.m4377v(i)));
        return null;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) {
        throw new UnsupportedOperationException("write is not supported");
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ba2 mo166b(kb2 kb2Var) throws IOException {
        ba2 o92Var;
        String strMo7475L;
        ba2 o92Var2;
        int iMo7481R = kb2Var.mo7481R();
        int iM4376u = d55.m4376u(iMo7481R);
        if (iM4376u == 0) {
            kb2Var.mo7490a();
            o92Var = new o92();
        } else if (iM4376u != 2) {
            o92Var = null;
        } else {
            kb2Var.mo7492b();
            o92Var = new wa2();
        }
        if (o92Var == null) {
            return m165e(iMo7481R, kb2Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (kb2Var.mo7501v()) {
                if (o92Var instanceof wa2) {
                    strMo7475L = kb2Var.mo7475L();
                    if (!cb2.m3940a(strMo7475L)) {
                        wb1.m12191j("illegal characters in string");
                        return null;
                    }
                } else {
                    strMo7475L = null;
                }
                int iMo7481R2 = kb2Var.mo7481R();
                int iM4376u2 = d55.m4376u(iMo7481R2);
                if (iM4376u2 == 0) {
                    kb2Var.mo7490a();
                    o92Var2 = new o92();
                } else if (iM4376u2 != 2) {
                    o92Var2 = null;
                } else {
                    kb2Var.mo7492b();
                    o92Var2 = new wa2();
                }
                boolean z = o92Var2 != null;
                if (o92Var2 == null) {
                    o92Var2 = m165e(iMo7481R2, kb2Var);
                }
                if (o92Var instanceof o92) {
                    ((o92) o92Var).m9006t(o92Var2);
                } else {
                    wa2 wa2Var = (wa2) o92Var;
                    if (wa2Var.f33192a.containsKey(strMo7475L)) {
                        wb1.m12191j(zi4.m13620t("duplicate key: ", strMo7475L));
                        return null;
                    }
                    wa2Var.m12180t(strMo7475L, o92Var2);
                }
                if (z) {
                    arrayDeque.addLast(o92Var);
                    if (arrayDeque.size() > 100) {
                        wb1.m12191j("too many recursions");
                        return null;
                    }
                    o92Var = o92Var2;
                } else {
                    continue;
                }
            } else {
                if (o92Var instanceof o92) {
                    kb2Var.mo7495j();
                } else {
                    kb2Var.mo7496k();
                }
                if (arrayDeque.isEmpty()) {
                    return o92Var;
                }
                o92Var = (ba2) arrayDeque.removeLast();
            }
        }
    }

    public /* synthetic */ ab2(int i) {
        this();
    }
}
