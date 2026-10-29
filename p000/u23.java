package p000;

import java.io.IOException;
import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u23 extends uq4 {

    /* JADX INFO: renamed from: c */
    public static final t23 f31624c;

    /* JADX INFO: renamed from: a */
    public ou1 f31625a;

    /* JADX INFO: renamed from: b */
    public int f31626b;

    static {
        t23 t23Var = new t23();
        t23Var.f30735a = 1;
        VarHandle.storeStoreFence();
        f31624c = t23Var;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iMo7481R = kb2Var.mo7481R();
        int iM4376u = d55.m4376u(iMo7481R);
        if (iM4376u == 0) {
            kb2Var.mo7490a();
            arrayList = new ArrayList();
        } else if (iM4376u != 2) {
            arrayList = null;
        } else {
            kb2Var.mo7492b();
            arrayList = new pl2(true);
        }
        if (arrayList == null) {
            return m11208d(iMo7481R, kb2Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (kb2Var.mo7501v()) {
                String strMo7475L = arrayList instanceof Map ? kb2Var.mo7475L() : null;
                int iMo7481R2 = kb2Var.mo7481R();
                int iM4376u2 = d55.m4376u(iMo7481R2);
                if (iM4376u2 == 0) {
                    kb2Var.mo7490a();
                    arrayList2 = new ArrayList();
                } else if (iM4376u2 != 2) {
                    arrayList2 = null;
                } else {
                    kb2Var.mo7492b();
                    arrayList2 = new pl2(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = m11208d(iMo7481R2, kb2Var);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strMo7475L, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    kb2Var.mo7495j();
                } else {
                    kb2Var.mo7496k();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        if (obj == null) {
            yb2Var.mo12211t();
            return;
        }
        ou1 ou1Var = this.f31625a;
        Class<?> cls = obj.getClass();
        ou1Var.getClass();
        uq4 uq4VarM9271d = ou1Var.m9271d(new cs4(cls));
        if (!(uq4VarM9271d instanceof u23)) {
            uq4VarM9271d.mo167c(yb2Var, obj);
        } else {
            yb2Var.mo12207e();
            yb2Var.mo12209k();
        }
    }

    /* JADX INFO: renamed from: d */
    public final Serializable m11208d(int i, kb2 kb2Var) throws IOException {
        int iM4376u = d55.m4376u(i);
        if (iM4376u == 5) {
            return kb2Var.mo7479P();
        }
        if (iM4376u == 6) {
            return zi4.m13602b(this.f31626b, kb2Var);
        }
        if (iM4376u == 7) {
            return Boolean.valueOf(kb2Var.mo7471C());
        }
        if (iM4376u == 8) {
            kb2Var.mo7477N();
            return null;
        }
        C1077qn.m9989o("Unexpected token: ".concat(d55.m4377v(i)));
        return null;
    }
}
