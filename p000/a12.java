package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a12 {

    /* JADX INFO: renamed from: a */
    public Context f37a;

    /* JADX INFO: renamed from: b */
    public nw0 f38b = AbstractC0632f.f18620a;

    /* JADX INFO: renamed from: c */
    public Object f39c = null;

    /* JADX INFO: renamed from: d */
    public ar3 f40d = null;

    /* JADX INFO: renamed from: e */
    public gd3 f41e = null;

    /* JADX INFO: renamed from: f */
    public List f42f = v71.f32439a;

    /* JADX INFO: renamed from: g */
    public tv1 f43g = null;

    /* JADX INFO: renamed from: h */
    public LinkedHashMap f44h = null;

    /* JADX INFO: renamed from: i */
    public boolean f45i = true;

    /* JADX INFO: renamed from: j */
    public boolean f46j = true;

    /* JADX INFO: renamed from: k */
    public cp2 f47k = null;

    /* JADX INFO: renamed from: l */
    public p74 f48l = null;

    /* JADX INFO: renamed from: m */
    public qv3 f49m = null;

    /* JADX INFO: renamed from: n */
    public gk2 f50n = null;

    /* JADX INFO: renamed from: o */
    public p74 f51o = null;

    /* JADX INFO: renamed from: p */
    public qv3 f52p = null;

    public a12(Context context) {
        this.f37a = context;
    }

    /* JADX INFO: renamed from: a */
    public final b12 m16a() {
        p74 p74Var;
        p74 p74Var2;
        gk2 lifecycle;
        Context context = this.f37a;
        Object obj = this.f39c;
        if (obj == null) {
            obj = ig1.f21401y;
        }
        ar3 ar3Var = this.f40d;
        nw0 nw0Var = this.f38b;
        Bitmap.Config config = nw0Var.f26134g;
        gd3 gd3Var = this.f41e;
        if (gd3Var == null) {
            gd3Var = nw0Var.f26133f;
        }
        List list = this.f42f;
        q13 q13Var = nw0Var.f26132e;
        tv1 tv1Var = this.f43g;
        uv1 uv1VarM11167c = tv1Var != null ? tv1Var.m11167c() : null;
        if (uv1VarM11167c == null) {
            uv1VarM11167c = AbstractC0707h.f20233c;
        } else {
            Bitmap.Config[] configArr = AbstractC0707h.f20231a;
        }
        LinkedHashMap linkedHashMap = this.f44h;
        uh4 uh4Var = linkedHashMap != null ? new uh4(AbstractC1356y5.m12902K(linkedHashMap)) : null;
        if (uh4Var == null) {
            uh4Var = uh4.f31878b;
        }
        boolean z = this.f45i;
        nw0 nw0Var2 = this.f38b;
        boolean z2 = nw0Var2.f26135h;
        boolean z3 = nw0Var2.f26136i;
        boolean z4 = this.f46j;
        a60 a60Var = nw0Var2.f26140m;
        a60 a60Var2 = nw0Var2.f26141n;
        a60 a60Var3 = nw0Var2.f26142o;
        so0 so0Var = nw0Var2.f26128a;
        so0 so0Var2 = nw0Var2.f26129b;
        so0 so0Var3 = nw0Var2.f26130c;
        so0 so0Var4 = nw0Var2.f26131d;
        gk2 gk2Var = this.f50n;
        if (gk2Var == null) {
            Object baseContext = context;
            while (true) {
                if (baseContext instanceof lk2) {
                    lifecycle = ((lk2) baseContext).getLifecycle();
                    break;
                }
                if (!(baseContext instanceof ContextWrapper)) {
                    lifecycle = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (lifecycle == null) {
                lifecycle = ls1.f24330a;
            }
            gk2Var = lifecycle;
        }
        p74 p74Var3 = this.f48l;
        gk2 gk2Var2 = gk2Var;
        if (p74Var3 == null) {
            p74 p74Var4 = this.f51o;
            if (p74Var4 == null) {
                p74Var2 = p74Var4;
                p01 p01Var = new p01();
                p01Var.f27256a = context;
                VarHandle.storeStoreFence();
                p74Var2 = p01Var;
            }
            p74Var2 = p74Var4;
            p74Var = p74Var2;
        } else {
            p74Var = p74Var3;
        }
        qv3 qv3Var = this.f49m;
        if (qv3Var == null && (qv3Var = this.f52p) == null) {
            if ((p74Var3 instanceof qy4 ? (qy4) p74Var3 : null) != null) {
                throw null;
            }
            qv3Var = qv3.f28833b;
        }
        cp2 cp2Var = this.f47k;
        qv3 qv3Var2 = qv3Var;
        u73 u73Var = cp2Var != null ? new u73(AbstractC1356y5.m12902K(cp2Var.f16332a)) : null;
        if (u73Var == null) {
            u73Var = u73.f31697b;
        }
        u73 u73Var2 = u73Var;
        p74 p74Var5 = this.f48l;
        qv3 qv3Var3 = this.f49m;
        gd3 gd3Var2 = this.f41e;
        lx0 lx0Var = new lx0();
        lx0Var.f24429a = p74Var5;
        lx0Var.f24430b = qv3Var3;
        lx0Var.f24431c = gd3Var2;
        VarHandle.storeStoreFence();
        nw0 nw0Var3 = this.f38b;
        b12 b12Var = new b12();
        b12Var.f14996a = context;
        b12Var.f14997b = obj;
        b12Var.f14998c = ar3Var;
        b12Var.f14999d = config;
        b12Var.f15000e = gd3Var;
        b12Var.f15001f = list;
        b12Var.f15002g = q13Var;
        b12Var.f15003h = uv1VarM11167c;
        b12Var.f15004i = uh4Var;
        b12Var.f15005j = z;
        b12Var.f15006k = z2;
        b12Var.f15007l = z3;
        b12Var.f15008m = z4;
        b12Var.f15009n = a60Var;
        b12Var.f15010o = a60Var2;
        b12Var.f15011p = a60Var3;
        b12Var.f15012q = so0Var;
        b12Var.f15013r = so0Var2;
        b12Var.f15014s = so0Var3;
        b12Var.f15015t = so0Var4;
        b12Var.f15016u = gk2Var2;
        b12Var.f15017v = p74Var;
        b12Var.f15018w = qv3Var2;
        b12Var.f15019x = u73Var2;
        b12Var.f15020y = lx0Var;
        b12Var.f15021z = nw0Var3;
        VarHandle.storeStoreFence();
        return b12Var;
    }
}
