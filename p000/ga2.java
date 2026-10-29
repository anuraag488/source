package p000;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ga2 extends uq4 {

    /* JADX INFO: renamed from: a */
    public static final ga2 f19689a = new ga2();

    private ga2() {
    }

    /* JADX INFO: renamed from: d */
    public static ba2 m5943d(int i, kb2 kb2Var) throws IOException {
        int iM4376u = d55.m4376u(i);
        if (iM4376u == 5) {
            return new gb2(kb2Var.mo7479P());
        }
        if (iM4376u == 6) {
            ng2 ng2Var = new ng2(kb2Var.mo7479P());
            gb2 gb2Var = new gb2();
            gb2Var.f19705a = ng2Var;
            return gb2Var;
        }
        if (iM4376u == 7) {
            Boolean boolValueOf = Boolean.valueOf(kb2Var.mo7471C());
            gb2 gb2Var2 = new gb2();
            gb2Var2.f19705a = boolValueOf;
            return gb2Var2;
        }
        if (iM4376u == 8) {
            kb2Var.mo7477N();
            return sa2.f30035a;
        }
        C1077qn.m9989o("Unexpected token: ".concat(d55.m4377v(i)));
        return null;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        ba2 o92Var;
        ba2 o92Var2;
        if (kb2Var instanceof ub2) {
            ub2 ub2Var = (ub2) kb2Var;
            int iMo7481R = ub2Var.mo7481R();
            if (iMo7481R != 5 && iMo7481R != 2 && iMo7481R != 4 && iMo7481R != 10) {
                ba2 ba2Var = (ba2) ub2Var.m11527f0();
                ub2Var.mo7488Y();
                return ba2Var;
            }
            throw new IllegalStateException("Unexpected " + d55.m4377v(iMo7481R) + " when reading a JsonElement.");
        }
        int iMo7481R2 = kb2Var.mo7481R();
        int iM4376u = d55.m4376u(iMo7481R2);
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
            return m5943d(iMo7481R2, kb2Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (kb2Var.mo7501v()) {
                String strMo7475L = o92Var instanceof wa2 ? kb2Var.mo7475L() : null;
                int iMo7481R3 = kb2Var.mo7481R();
                int iM4376u2 = d55.m4376u(iMo7481R3);
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
                    o92Var2 = m5943d(iMo7481R3, kb2Var);
                }
                if (o92Var instanceof o92) {
                    ((o92) o92Var).m9006t(o92Var2);
                } else {
                    ((wa2) o92Var).m12180t(strMo7475L, o92Var2);
                }
                if (z) {
                    arrayDeque.addLast(o92Var);
                    o92Var = o92Var2;
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

    @Override // p000.uq4
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void mo167c(ba2 ba2Var, yb2 yb2Var) throws IOException {
        if (ba2Var == null || (ba2Var instanceof sa2)) {
            yb2Var.mo12211t();
            return;
        }
        if (ba2Var instanceof gb2) {
            gb2 gb2VarM3529m = ba2Var.m3529m();
            Serializable serializable = gb2VarM3529m.f19705a;
            if (serializable instanceof Number) {
                yb2Var.mo12201K(gb2VarM3529m.mo3531r());
                return;
            } else if (serializable instanceof Boolean) {
                yb2Var.mo12203M(gb2VarM3529m.mo3523b());
                return;
            } else {
                yb2Var.mo12202L(gb2VarM3529m.mo3532s());
                return;
            }
        }
        if (ba2Var instanceof o92) {
            yb2Var.mo12206b();
            ArrayList arrayList = ba2Var.m3527g().f26491a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                mo167c((ba2) obj, yb2Var);
            }
            yb2Var.mo12208j();
            return;
        }
        if (!(ba2Var instanceof wa2)) {
            xy4.m12781j(ba2Var.getClass(), "Couldn't write ");
            return;
        }
        yb2Var.mo12207e();
        Iterator it = ((nl2) ba2Var.m3528l().f33192a.entrySet()).iterator();
        while (((ml2) it).hasNext()) {
            ol2 ol2VarM8344a = ((ml2) it).m8344a();
            yb2Var.mo12210l((String) ol2VarM8344a.getKey());
            mo167c((ba2) ol2VarM8344a.getValue(), yb2Var);
        }
        yb2Var.mo12209k();
    }
}
