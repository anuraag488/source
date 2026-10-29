package p000;

import ads_mobile_sdk.AbstractC0054bv;
import ads_mobile_sdk.v53;
import java.lang.invoke.VarHandle;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: h0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0708h0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f20234t;

    /* JADX INFO: renamed from: u */
    public byte f20235u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ long f20236v;

    /* JADX INFO: renamed from: w */
    public Object f20237w;

    /* JADX INFO: renamed from: x */
    public Object f20238x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f20239y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0708h0(ij4 ij4Var, long j, mj4 mj4Var, hj4 hj4Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f20234t = (byte) 2;
        this.f20237w = ij4Var;
        this.f20236v = j;
        this.f20238x = mj4Var;
        this.f20239y = hj4Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f20234t;
        Object obj2 = this.f20239y;
        switch (b) {
            case 0:
                return new C0708h0((t82) this.f20238x, this.f20236v, (nv2) obj2, wm0Var);
            case 1:
                return new C0708h0((fh2) this.f20238x, (ag1) obj2, this.f20236v, wm0Var);
            case 2:
                return new C0708h0((ij4) this.f20237w, this.f20236v, (mj4) this.f20238x, (hj4) obj2, wm0Var);
            case 3:
                return new C0708h0((byte) 3, this.f20236v, wm0Var, obj2);
            default:
                return new C0708h0((byte) 4, this.f20236v, wm0Var, obj2);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20234t;
        Object obj3 = this.f20239y;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C0708h0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C0708h0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C0708h0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                return new C0708h0((byte) 3, this.f20236v, (wm0) obj2, obj3).invokeSuspend(ju4Var);
            default:
                return new C0708h0((byte) 4, this.f20236v, (wm0) obj2, obj3).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0169, code lost:
    
        if (p000.C0910mi.m8325a(r0, r1, r5, r7, r14, 4) == r11) goto L86;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        gf3 gf3Var;
        ag1 ag1Var;
        v53 v53Var;
        gx2 gx2Var;
        AbstractC0054bv abstractC0054bv;
        gx2 gx2Var2;
        byte b = this.f20234t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f20239y;
        long j = this.f20236v;
        byte b2 = 2;
        switch (b) {
            case 0:
                nv2 nv2Var = (nv2) obj2;
                ap0 ap0Var = ap0.f14763a;
                byte b3 = this.f20235u;
                if (b3 == 0) {
                    k43.m7376J(obj);
                    t82 t82Var = (t82) this.f20238x;
                    this.f20235u = (byte) 1;
                    if (t82Var.mo5005t(this) != ap0Var) {
                    }
                    return ap0Var;
                }
                if (b3 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b3 != 2) {
                        if (b3 == 3) {
                            k43.m7376J(obj);
                            return ju4Var;
                        }
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gf3Var = (gf3) this.f20237w;
                    k43.m7376J(obj);
                }
                this.f20237w = null;
                this.f20235u = (byte) 3;
                if (nv2Var.m8860a(gf3Var, this) != ap0Var) {
                    return ju4Var;
                }
                return ap0Var;
                ff3 ff3Var = new ff3(j);
                gf3Var = new gf3(ff3Var);
                this.f20237w = gf3Var;
                this.f20235u = (byte) 2;
                if (nv2Var.m8860a(ff3Var, this) != ap0Var) {
                    this.f20237w = null;
                    this.f20235u = (byte) 3;
                    if (nv2Var.m8860a(gf3Var, this) != ap0Var) {
                        return ju4Var;
                    }
                }
                return ap0Var;
            case 1:
                fh2 fh2Var = (fh2) this.f20238x;
                C0910mi c0910mi = fh2Var.f18997p;
                ap0 ap0Var2 = ap0.f14763a;
                byte b4 = this.f20235u;
                try {
                    if (b4 != 0) {
                        if (b4 == 1) {
                            ag1Var = (ag1) this.f20237w;
                            k43.m7376J(obj);
                        } else {
                            if (b4 != 2) {
                                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            k43.m7376J(obj);
                        }
                        fh2Var.f18989h.setValue(Boolean.FALSE);
                        fh2Var.f18988g = false;
                        return ju4Var;
                    }
                    k43.m7376J(obj);
                    ag1Var = (ag1) obj2;
                    if (c0910mi.m8329e()) {
                        ag1Var = ag1Var instanceof db4 ? (db4) ag1Var : gh2.f19793a;
                    }
                    if (c0910mi.m8329e()) {
                        long jM8957d = o52.m8957d(((o52) c0910mi.m8328d()).f26352a, j);
                        C0910mi c0910mi2 = fh2Var.f18997p;
                        ag1 ag1Var2 = ag1Var;
                        o52 o52VarM8954a = o52.m8954a(jM8957d);
                        r25 r25Var = new r25(b2);
                        r25Var.f28976c = fh2Var;
                        r25Var.f28975b = jM8957d;
                        VarHandle.storeStoreFence();
                        this.f20237w = null;
                        this.f20235u = (byte) 2;
                        break;
                    } else {
                        o52 o52VarM8954a2 = o52.m8954a(j);
                        this.f20237w = ag1Var;
                        this.f20235u = (byte) 1;
                        if (c0910mi.m8330f(this, o52VarM8954a2) == ap0Var2) {
                        }
                    }
                    return ap0Var2;
                    fh2Var.f18984c.invoke();
                    long jM8957d2 = o52.m8957d(((o52) c0910mi.m8328d()).f26352a, j);
                    C0910mi c0910mi3 = fh2Var.f18997p;
                    ag1 ag1Var3 = ag1Var;
                    o52 o52VarM8954a3 = o52.m8954a(jM8957d2);
                    r25 r25Var2 = new r25(b2);
                    r25Var2.f28976c = fh2Var;
                    r25Var2.f28975b = jM8957d2;
                    VarHandle.storeStoreFence();
                    this.f20237w = null;
                    this.f20235u = (byte) 2;
                } catch (CancellationException unused) {
                    return ju4Var;
                }
                break;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                byte b5 = this.f20235u;
                if (b5 == 0) {
                    k43.m7376J(obj);
                    mn3 mn3Var = ((ij4) this.f20237w).f21497q;
                    if (mn3Var != null) {
                        b33 b33VarM3423a = b33.m3423a(j);
                        this.f20235u = (byte) 1;
                        if (mn3Var.invoke(b33VarM3423a, this) != ap0Var3) {
                        }
                    }
                    return ap0Var3;
                }
                if (b5 != 1) {
                    if (b5 == 2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                this.f20235u = (byte) 2;
                if (((mj4) this.f20238x).mo5708a((hj4) obj2, this) != ap0Var3) {
                    return ju4Var;
                }
                return ap0Var3;
            case 3:
                ap0 ap0Var4 = ap0.f14763a;
                byte b6 = this.f20235u;
                if (b6 == 0) {
                    k43.m7376J(obj);
                    this.f20235u = (byte) 1;
                    if (d24.m4318s(j, this) != ap0Var4) {
                    }
                    return ap0Var4;
                }
                if (b6 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b6 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v53Var = (v53) this.f20238x;
                    gx2Var = (gx2) this.f20237w;
                    k43.m7376J(obj);
                }
                try {
                    v82 v82Var = v53Var.f12616h;
                    gx2Var.m6193g(null);
                    v82Var.m11767h0();
                    return ju4Var;
                } catch (Throwable th) {
                    gx2Var.m6193g(null);
                    throw th;
                }
                v53 v53Var2 = (v53) obj2;
                gx2 gx2Var3 = v53Var2.f12613e;
                this.f20237w = gx2Var3;
                this.f20238x = v53Var2;
                this.f20235u = (byte) 2;
                if (gx2Var3.m6191e(this) != ap0Var4) {
                    v53Var = v53Var2;
                    gx2Var = gx2Var3;
                    v82 v82Var2 = v53Var.f12616h;
                    gx2Var.m6193g(null);
                    v82Var2.m11767h0();
                    return ju4Var;
                }
                return ap0Var4;
            default:
                ap0 ap0Var5 = ap0.f14763a;
                byte b7 = this.f20235u;
                if (b7 == 0) {
                    k43.m7376J(obj);
                    this.f20235u = (byte) 1;
                    if (d24.m4318s(j, this) != ap0Var5) {
                    }
                    return ap0Var5;
                }
                if (b7 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b7 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    abstractC0054bv = (AbstractC0054bv) this.f20238x;
                    gx2Var2 = (gx2) this.f20237w;
                    k43.m7376J(obj);
                }
                try {
                    abstractC0054bv.f1504k = null;
                    abstractC0054bv.f1503j = abstractC0054bv.m526f();
                    return ju4Var;
                } finally {
                    gx2Var2.m6193g(null);
                }
                AbstractC0054bv abstractC0054bv2 = (AbstractC0054bv) obj2;
                gx2 gx2Var4 = abstractC0054bv2.f1501h;
                this.f20237w = gx2Var4;
                this.f20238x = abstractC0054bv2;
                this.f20235u = (byte) 2;
                if (gx2Var4.m6191e(this) != ap0Var5) {
                    abstractC0054bv = abstractC0054bv2;
                    gx2Var2 = gx2Var4;
                    abstractC0054bv.f1504k = null;
                    abstractC0054bv.f1503j = abstractC0054bv.m526f();
                    return ju4Var;
                }
                return ap0Var5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0708h0(t82 t82Var, long j, nv2 nv2Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f20234t = (byte) 0;
        this.f20238x = t82Var;
        this.f20236v = j;
        this.f20239y = nv2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0708h0(fh2 fh2Var, ag1 ag1Var, long j, wm0 wm0Var) {
        super(2, wm0Var);
        this.f20234t = (byte) 1;
        this.f20238x = fh2Var;
        this.f20239y = ag1Var;
        this.f20236v = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0708h0(byte b, long j, wm0 wm0Var, Object obj) {
        super(2, wm0Var);
        this.f20234t = b;
        this.f20236v = j;
        this.f20239y = obj;
    }
}
