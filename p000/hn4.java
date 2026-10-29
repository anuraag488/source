package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hn4 {

    /* JADX INFO: renamed from: a */
    public d83 f20725a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ xn2 f20726b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ z93 f20727c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ dz0 f20728d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ C1354y3 f20729e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ yp1 f20730f;

    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6455a(ym0 ym0Var) {
        en4 en4Var;
        if (ym0Var instanceof en4) {
            en4Var = (en4) ym0Var;
            int i = en4Var.f18277v;
            if ((i & Integer.MIN_VALUE) != 0) {
                en4Var.f18277v = i - Integer.MIN_VALUE;
            } else {
                en4Var = new en4(this, ym0Var);
            }
        } else {
            en4Var = new en4(this, ym0Var);
        }
        Object objMo11771c = en4Var.f18275t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = en4Var.f18277v;
        if (i2 != 0) {
            if (i2 == 1) {
                k43.m7376J(objMo11771c);
            } else {
                if (i2 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(objMo11771c);
            }
            Boolean bool = (Boolean) objMo11771c;
            if (bool.booleanValue()) {
                m6457c(null);
            }
            boolean z = bool.booleanValue();
            return Boolean.valueOf(z);
        }
        k43.m7376J(objMo11771c);
        xn2 xn2Var = this.f20726b;
        if (xn2Var != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, "close panels", null);
            }
        }
        z93 z93Var = this.f20727c;
        en4Var.f18277v = 1;
        objMo11771c = z93Var.mo11771c(en4Var);
        if (objMo11771c != ap0Var) {
        }
        return ap0Var;
        if (((Boolean) objMo11771c).booleanValue()) {
            yp1 yp1Var = this.f20730f;
            en4Var.f18277v = 2;
            objMo11771c = yp1Var.invoke(en4Var);
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if (r12 == r1) goto L39;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6456b(oh4 oh4Var, ym0 ym0Var) {
        fn4 fn4Var;
        Object objM12816b;
        if (ym0Var instanceof fn4) {
            fn4Var = (fn4) ym0Var;
            int i = fn4Var.f19144w;
            if ((i & Integer.MIN_VALUE) != 0) {
                fn4Var.f19144w = i - Integer.MIN_VALUE;
            } else {
                fn4Var = new fn4(this, ym0Var);
            }
        } else {
            fn4Var = new fn4(this, ym0Var);
        }
        Object objMo11771c = fn4Var.f19142u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = fn4Var.f19144w;
        if (i2 == 0) {
            k43.m7376J(objMo11771c);
            xn2 xn2Var = this.f20726b;
            if (xn2Var != null) {
                String strM12721a = xn2Var.m12721a();
                k44 k44Var = k44.f22883b;
                if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                    xn2Var.m12722b(k44Var, strM12721a, "open panel " + oh4Var, null);
                }
            }
            z93 z93Var = this.f20727c;
            fn4Var.f19141t = oh4Var;
            fn4Var.f19144w = 1;
            objMo11771c = z93Var.mo11771c(fn4Var);
            if (objMo11771c != ap0Var) {
            }
            return ap0Var;
        }
        if (i2 == 1) {
            oh4Var = fn4Var.f19141t;
            k43.m7376J(objMo11771c);
        } else if (i2 == 2) {
            oh4Var = fn4Var.f19141t;
            k43.m7376J(objMo11771c);
            if (!((Boolean) objMo11771c).booleanValue()) {
                return Boolean.FALSE;
            }
            C1354y3 c1354y3 = this.f20729e;
            byte b = oh4Var.f26706b;
            fn4Var.f19141t = oh4Var;
            fn4Var.f19144w = 3;
            objM12816b = c1354y3.m12816b(b);
        } else {
            if (i2 != 3) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oh4Var = fn4Var.f19141t;
            k43.m7376J(objMo11771c);
            objM12816b = ((ep3) objMo11771c).f18355a;
        }
        qq2.m10007B(objM12816b);
        if (objM12816b instanceof yc1) {
            objM12816b = Boolean.FALSE;
        }
        if (((Boolean) objM12816b).booleanValue()) {
            m6457c(oh4Var);
        }
        return objM12816b;
        if (!((Boolean) objMo11771c).booleanValue()) {
            return Boolean.FALSE;
        }
        dz0 dz0Var = this.f20728d;
        fn4Var.f19141t = oh4Var;
        fn4Var.f19144w = 2;
        objMo11771c = dz0Var.m4803b(true, fn4Var);
        if (objMo11771c != ap0Var) {
            if (!((Boolean) objMo11771c).booleanValue()) {
                return Boolean.FALSE;
            }
            C1354y3 c1354y4 = this.f20729e;
            byte b2 = oh4Var.f26706b;
            fn4Var.f19141t = oh4Var;
            fn4Var.f19144w = 3;
            objM12816b = c1354y4.m12816b(b2);
        }
        return ap0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m6457c(oh4 oh4Var) {
        this.f20725a.setValue(oh4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m6458d(oh4 oh4Var, ym0 ym0Var) {
        gn4 gn4Var;
        if (ym0Var instanceof gn4) {
            gn4Var = (gn4) ym0Var;
            int i = gn4Var.f19981w;
            if ((i & Integer.MIN_VALUE) != 0) {
                gn4Var.f19981w = i - Integer.MIN_VALUE;
            } else {
                gn4Var = new gn4(this, ym0Var);
            }
        } else {
            gn4Var = new gn4(this, ym0Var);
        }
        Object objMo11771c = gn4Var.f19979u;
        Object obj = ap0.f14763a;
        int i2 = gn4Var.f19981w;
        if (i2 == 0) {
            k43.m7376J(objMo11771c);
            xn2 xn2Var = this.f20726b;
            if (xn2Var != null) {
                String strM12721a = xn2Var.m12721a();
                k44 k44Var = k44.f22883b;
                if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                    xn2Var.m12722b(k44Var, strM12721a, "toggle panel " + oh4Var, null);
                }
            }
            z93 z93Var = this.f20727c;
            gn4Var.f19978t = oh4Var;
            gn4Var.f19981w = 1;
            objMo11771c = z93Var.mo11771c(gn4Var);
            if (objMo11771c != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                k43.m7376J(objMo11771c);
                return objMo11771c;
            }
            if (i2 == 3) {
                k43.m7376J(objMo11771c);
                return objMo11771c;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oh4Var = gn4Var.f19978t;
        k43.m7376J(objMo11771c);
        if (!((Boolean) objMo11771c).booleanValue()) {
            return Boolean.FALSE;
        }
        if (((oh4) this.f20725a.getValue()) == oh4Var) {
            gn4Var.f19978t = null;
            gn4Var.f19981w = 2;
            Object objM6455a = m6455a(gn4Var);
            if (objM6455a != obj) {
                return objM6455a;
            }
        } else {
            gn4Var.f19978t = null;
            gn4Var.f19981w = 3;
            Object objM6456b = m6456b(oh4Var, gn4Var);
            if (objM6456b != obj) {
                return objM6456b;
            }
        }
        return obj;
    }
}
