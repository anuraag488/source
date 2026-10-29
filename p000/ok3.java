package p000;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ok3 {

    /* JADX INFO: renamed from: a */
    public final b12 f26812a;

    /* JADX INFO: renamed from: b */
    public final List f26813b;

    /* JADX INFO: renamed from: c */
    public final int f26814c;

    /* JADX INFO: renamed from: d */
    public final b12 f26815d;

    /* JADX INFO: renamed from: e */
    public final g74 f26816e;

    /* JADX INFO: renamed from: f */
    public final za1 f26817f;

    /* JADX INFO: renamed from: g */
    public final boolean f26818g;

    public ok3(b12 b12Var, List list, int i, b12 b12Var2, g74 g74Var, za1 za1Var, boolean z) {
        this.f26812a = b12Var;
        this.f26813b = list;
        this.f26814c = i;
        this.f26815d = b12Var2;
        this.f26816e = g74Var;
        this.f26817f = za1Var;
        this.f26818g = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m9158a(b12 b12Var, v81 v81Var) {
        Context context = b12Var.f14996a;
        b12 b12Var2 = this.f26812a;
        if (context != b12Var2.f14996a) {
            nm0.m8796h("Interceptor '", v81Var, "' cannot modify the request's context.");
            return;
        }
        if (b12Var.f14997b == ig1.f21401y) {
            nm0.m8796h("Interceptor '", v81Var, "' cannot set the request's data to null.");
            return;
        }
        if (b12Var.f14998c != b12Var2.f14998c) {
            nm0.m8796h("Interceptor '", v81Var, "' cannot modify the request's target.");
        } else if (b12Var.f15016u != b12Var2.f15016u) {
            nm0.m8796h("Interceptor '", v81Var, "' cannot modify the request's lifecycle.");
        } else {
            if (b12Var.f15017v == b12Var2.f15017v) {
                return;
            }
            nm0.m8796h("Interceptor '", v81Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m9159b(b12 b12Var, ym0 ym0Var) {
        mk3 mk3Var;
        v81 v81Var;
        Object objM11766d;
        if (ym0Var instanceof mk3) {
            mk3Var = (mk3) ym0Var;
            int i = mk3Var.f24981x;
            if ((i & Integer.MIN_VALUE) != 0) {
                mk3Var.f24981x = i - Integer.MIN_VALUE;
            } else {
                mk3Var = new mk3(this, ym0Var);
            }
        } else {
            mk3Var = new mk3(this, ym0Var);
        }
        Object obj = mk3Var.f24979v;
        ap0 ap0Var = ap0.f14763a;
        int i2 = mk3Var.f24981x;
        if (i2 == 0) {
            k43.m7376J(obj);
            List list = this.f26813b;
            int i3 = this.f26814c;
            if (i3 > 0) {
                m9158a(b12Var, (v81) list.get(i3 - 1));
            }
            v81Var = (v81) list.get(i3);
            ok3 ok3Var = new ok3(this.f26812a, this.f26813b, i3 + 1, b12Var, this.f26816e, this.f26817f, this.f26818g);
            mk3Var.f24977t = this;
            mk3Var.f24978u = v81Var;
            mk3Var.f24981x = 1;
            objM11766d = v81Var.m11766d(ok3Var, mk3Var);
            if (objM11766d == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v81 v81Var2 = mk3Var.f24978u;
            ok3 ok3Var2 = mk3Var.f24977t;
            k43.m7376J(obj);
            v81Var = v81Var2;
            this = ok3Var2;
            objM11766d = obj;
        }
        c12 c12Var = (c12) objM11766d;
        this.m9158a(c12Var.mo3789a(), v81Var);
        return c12Var;
    }
}
