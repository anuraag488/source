package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j00 {

    /* JADX INFO: renamed from: a */
    public d12 f21919a;

    /* JADX INFO: renamed from: b */
    public b63 f21920b;

    /* JADX INFO: renamed from: c */
    public v14 f21921c;

    /* JADX INFO: renamed from: d */
    public ic1 f21922d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m6976a(ym0 ym0Var) throws Throwable {
        i00 i00Var;
        v14 v14Var;
        Throwable th;
        v14 v14Var2;
        if (ym0Var instanceof i00) {
            i00Var = (i00) ym0Var;
            int i = i00Var.f20970x;
            if ((i & Integer.MIN_VALUE) != 0) {
                i00Var.f20970x = i - Integer.MIN_VALUE;
            } else {
                i00Var = new i00(this, ym0Var);
            }
        } else {
            i00Var = new i00(this, ym0Var);
        }
        Object obj = i00Var.f20968v;
        ap0 ap0Var = ap0.f14763a;
        int i2 = i00Var.f20970x;
        wm0 wm0Var = null;
        try {
            if (i2 == 0) {
                k43.m7376J(obj);
                v14Var = this.f21921c;
                i00Var.f20966t = this;
                i00Var.f20967u = v14Var;
                i00Var.f20970x = 1;
                if (v14Var.m11203a(i00Var) != ap0Var) {
                }
                return ap0Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v14Var2 = (v14) i00Var.f20966t;
                try {
                    k43.m7376J(obj);
                    hv0 hv0Var = (hv0) obj;
                    v14Var2.m11205c();
                    return hv0Var;
                } catch (Throwable th2) {
                    th = th2;
                    v14Var2.m11205c();
                    throw th;
                }
            }
            v14 v14Var3 = i00Var.f20967u;
            j00 j00Var = (j00) i00Var.f20966t;
            k43.m7376J(obj);
            v14Var = v14Var3;
            this = j00Var;
            C1053q c1053q = new C1053q((byte) 11);
            c1053q.f28113b = this;
            VarHandle.storeStoreFence();
            i00Var.f20966t = v14Var;
            i00Var.f20967u = null;
            i00Var.f20970x = 2;
            Object objM7921b0 = lb5.m7921b0(r71.f29063a, new C1260vl((Object) c1053q, wm0Var, (byte) 8), i00Var);
            if (objM7921b0 != ap0Var) {
                v14 v14Var4 = v14Var;
                obj = objM7921b0;
                v14Var2 = v14Var4;
                hv0 hv0Var2 = (hv0) obj;
                v14Var2.m11205c();
                return hv0Var2;
            }
            return ap0Var;
        } catch (Throwable th3) {
            v14 v14Var5 = v14Var;
            th = th3;
            v14Var2 = v14Var5;
            v14Var2.m11205c();
            throw th;
        }
    }
}
